# REST - Country Web Service

## Objective
Develop a RESTful web service using Spring Boot that returns the details of a country in JSON format.

---

## Technologies Used
- Java 21
- Spring Boot
- Spring Web
- Maven
- SLF4J Logging

---

## Project Structure
```
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.springlearn
│   │   │       ├── controller
│   │   │       │   └── CountryController.java
│   │   │       ├── model
│   │   │       │   └── Country.java
│   │   │       ├── service
│   │   │       │   └── CountryService.java
│   │   │       └── SpringLearnApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── country.xml
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## REST Endpoint
### Request

```
GET http://localhost:8083/country
```
---
## Response

```json
{
  "code": "IN",
  "name": "India"
}
```
---

## Output
Browser Output

```json
{
  "code": "IN",
  "name": "India"
}
```
Console Output

```
CountryController | START
Country : Country [code=IN, name=India]
CountryController | END
```

## Result
The RESTful web service was created successfully. Accessing the `/country` endpoint returns the country details in JSON format.
