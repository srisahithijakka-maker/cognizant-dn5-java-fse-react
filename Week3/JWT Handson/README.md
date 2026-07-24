# Create authentication service that returns JWT

## Objective
Implement an authentication service that validates user credentials using Spring Security and returns a JWT (JSON Web Token) upon successful authentication.

---
## Technologies Used
- Java 21
- Spring Boot 4.0.7
- Spring Web
- Spring Security
- Maven
- JJWT
- SLF4J Logging
---
## Project Structure
```
spring-learn
│
├── controller
│   └── AuthenticationController.java
│
├── security
│   └── SecurityConfig.java
│
├── resources
│   └── application.properties
│
└── pom.xml
```
---
## Features Implemented
- Configured Spring Security
- Created in-memory users (`admin` and `user`)
- Implemented HTTP Basic Authentication
- Read the Authorization header
- Decoded Base64 credentials
- Extracted the authenticated username
- Generated a JWT token
- Returned the JWT token in the response
---
## Endpoint
**GET**
```
/authenticate
```
Credentials:
```
Username: admin
Password: pwd
```
or
```
Username: user
Password: pwd
```
---
## Sample Response
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```
---
## Output
- Successfully authenticated the user.
- JWT token generated and returned as the response.
- Console logs display the Authorization header, decoded credentials, username, and generated token.
---
## Result
Successfully implemented the authentication service that returns a JWT token for authenticated users.
