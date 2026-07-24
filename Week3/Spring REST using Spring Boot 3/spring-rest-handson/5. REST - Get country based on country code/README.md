# REST - Get Country Based on Country Code

## Objective
Develop a RESTful web service using Spring Boot that returns the details of a country based on the country code provided in the URL path.

---

## Technologies Used
- Java 21
- Spring Boot
- Spring Web
- Maven
- SLF4J Logging
- Spring Core (XML Configuration)

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
└── mvnw.cmd
```

---
## REST Endpoint
### Request
```
GET http://localhost:8083/countries/in
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
### Browser Output
```json
{
  "code": "IN",
  "name": "India"
}
```

### Console Output
```
CountryController | START
Country : Country [code=IN, name=India]
CountryController | END
```
---
## Result
The RESTful web service was successfully developed. The `/countries/{code}` endpoint accepts a country code as a path variable and returns the corresponding country details in JSON format. For the configured data, accessing `/countries/in` returns the details of India successfully.
