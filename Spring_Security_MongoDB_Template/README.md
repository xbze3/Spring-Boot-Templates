# Spring Security MongoDB Template

A simple Spring Boot starter with:

- MongoDB for storing users  
- JWT-based authentication with Spring Security  
- Ready-made setup for login/signup and secure APIs  

---

## Features

- User registration and login with JWT  
- Passwords hashed with BCrypt  
- JWT token creation and validation  
- Secure endpoints - customize roles later if needed  

---

## Getting Started

### Requirements

- Java 24  
- MongoDB running  
- Maven  

### Setup

1. Clone the repo  
2. Update `application.properties` or `.env` with your MongoDB URI and JWT secret:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/your-db
jwt.secret=your_jwt_secret_here

