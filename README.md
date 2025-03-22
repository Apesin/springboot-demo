# Spring Boot Security Demo with JWT and RBAC

This project demonstrates how to implement a secure REST API using Spring Boot, Spring Security, JWT (JSON Web Tokens), and Role-Based Access Control (RBAC). It includes a simple endpoint (`/api/demo`) that returns the role of the authenticated user.

---

## **Features**
1. **Spring Security**: Provides authentication and authorization mechanisms.
2. **JWT (JSON Web Tokens)**: Used for stateless authentication.
3. **RBAC (Role-Based Access Control)**: Defines three roles:
   - `USER`
   - `ADMIN`
   - `MANAGER`
4. **REST Endpoint**:
   - `GET /api/demo`: Returns the authenticated user's username and role.

---

## **Technologies Used**
- **Spring Boot**: Framework for building the application.
- **Spring Security**: Handles authentication and authorization.
- **JWT (jjwt library)**: For generating and validating JSON Web Tokens.
- **Spring Data JPA**: For database interactions.
- **Maven**: Build tool for managing dependencies.

---

## **Roles**
The application supports the following roles:
1. **USER**: Basic access.
2. **ADMIN**: Elevated access.
3. **MANAGER**: Intermediate access between USER and ADMIN, just to balance the role.

---

## **API Endpoint**

### **GET /api/demo**
- **Description**: Returns the username and role of the authenticated user.
- **Authentication**: Requires a valid JWT token in the `Authorization` header.
- **Response**:
  ```json
  {
    "user": "UserName",
    "role": "ROLE"
  }
  ```

---

## **How It Works**
1. **Authentication**:
   - Users authenticate by providing their credentials (email and password) to a login endpoint (api/auth/authenticate).
   - Upon successful authentication, a JWT token is generated and returned to the client.

2. **Authorization**:
   - The JWT token is included in the `Authorization` header of subsequent requests.
   - Spring Security validates the token and extracts the user's data.

3. **Role-Based Access**:
   - The `/api/demo` endpoint is accessible to all authenticated users, regardless of their role.
   - The response includes the user's role, which is extracted from the JWT token.

**Additionally other endpoints were added just to test the role base access**
- You can refer to the swagger documentation

**If you are using vscode you can test the endpoints by downloading, Rest Client by Huachao Mao to test the endpoints in the http folder**