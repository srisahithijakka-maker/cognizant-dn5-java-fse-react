# Spring Data JPA - Quick Example

## Objective
This project demonstrates a simple Spring Data JPA application using Spring Boot, Hibernate, and MySQL.

## Technologies Used
- Java 21
- Spring Boot 3.5.4
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Project Structure
```
src
 └── main
     ├── java
     │   └── com.cognizant.ormlearn
     │       ├── model
     │       │   └── Country.java
     │       ├── repository
     │       │   └── CountryRepository.java
     │       ├── service
     │       │   └── CountryService.java
     │       └── OrmLearnApplication.java
     └── resources
         └── application.properties
```

## Database
Database Name:

```
ormlearn
```

Table:

```
country
```

Columns:

- co_code
- co_name

Sample Data:
| Code | Name |
|------|--------------------------|
| IN | India |
| US | United States of America |

## Output
The application retrieves all records from the `country` table using Spring Data JPA and displays them in the console.

## Result
Spring Boot successfully connected to MySQL and fetched all country records using Spring Data JPA.
