package com.apesin.security.user;

import lombok.Data;

@Data
public class UserDto {
    private String role;
    private String user;

    public UserDto(User user) {
        this.user = user.getEmail();
        this.role = String.valueOf(user.getRole());
    }
}
