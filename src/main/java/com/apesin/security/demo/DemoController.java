package com.apesin.security.demo;

import io.swagger.v3.oas.annotations.Hidden;

import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apesin.security.user.User;
import com.apesin.security.user.UserDto;
import com.apesin.security.user.UserService;

@RestController
@RequestMapping("/api/demo")
@Hidden
public class DemoController {

  private final UserService userService;

  public DemoController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public ResponseEntity<UserDto> get(Principal connectedUser) {
    User user = userService.getCurrentUser(connectedUser);

    UserDto userDto = new UserDto(user);
    return ResponseEntity.ok(userDto);
  }

  @GetMapping("/hello")
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello from secured endpoint");
  }

}
