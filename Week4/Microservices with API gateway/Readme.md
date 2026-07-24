# Creating Microservices for Account and Loan
## Objective
Create two independent Spring Boot RESTful microservices:
- Account Microservice
- Loan Microservice
Each microservice exposes its own REST API and runs independently on a separate port without any backend or database connectivity.
---
## Technologies Used
- Java 21
- Spring Boot 4.0.7
- Spring Web
- Spring Boot DevTools
- Maven
- IntelliJ IDEA
---
## Account Microservice
### Endpoint
**GET**
```
/accounts/{number}
```
### Sample Request
```
http://localhost:8080/accounts/00987987973432
```
### Sample Response
```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343.0
}
```
---

## Loan Microservice
### Endpoint
**GET**
```
/loans/{number}
```
### Sample Request
```
http://localhost:8081/loans/H00987987972342
```
### Sample Response
```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000.0,
  "emi": 3258,
  "tenure": 18
}
```
---
## Output
- Account Microservice successfully returns dummy account details.
- Loan Microservice successfully returns dummy loan details.
- Both microservices run independently on different ports:
  - Account Service → Port **8080**
  - Loan Service → Port **8081**

---
## Result
Successfully created two independent Spring Boot RESTful microservices for Account and Loan. Both services were implemented without backend connectivity and tested successfully using their respective REST endpoints.
