# Ecommerce App

 

## Introduction

Done by Asmaa Shaheen

My app brings the best of online shopping right to your fingertips, making it easier than ever to find and purchase the products you love.
---

## Task Description



Create a project for ecommerce app with the following APIs:
1 – Retrieve all main categories
GET     http://localhost:8090/api/categories

2- Search for product by name , sku
GET      http://localhost:8090/api/products/search

3 -  Display all product for selected merchant and grouped by merchant category , supporr pagination and versionning
GET     http://localhost:8090/api/products/merchants/1


4 – Create create order

POST    http://localhost:8090/api/orders
{
    "customerId": 2,
    "orderDate": "2024-09-12T15:30:00",
    "status": "PENDING"  
}


5 – Retrieve created orders support pagination and sorting




6- swagger , AOP , liquibase

GET      http://localhost:8090/api/orders
-----------------------------------------------------------------------------
tables **ecommerce** 
category
customer
merchant
order
product





> Feel free to make assumptions for the design approach. 

## Requirements

While implementing your solution **please take care of the following requirements:**

### Functional requirements

- The REST API methods   implemented based on the specification provided in the linked swagger file;
   
 ### Swagger URL
http://localhost:8090/swagger-ui/index.html#/

### Non-functional requirements

- The project is buildable and runnable;
- The project is Unit tests;
 
- Any data required by the application to run (e.g. reference tables, dummy data) MUST be preloaded in the database;
- Input/output data MUST be in JSON format;
 
---

:scroll: **END**





https://jwt.io/

eyJhbGciOiJIUzI1NiJ9.eyJyb2xlIjoiT1JHQU5JWkVSIiwic3ViIjoiYXNtYWEiLCJpYXQiOjE3MTY2MzIzNjAsImV4cCI6MTcxNjYzNzU0NCwiaXNzIjoiYXNtYWEifQ.3gyz5yeFza4BTac8HM7AJrebEHhIK9VEYUz2raBzDeU

-----------------------------------------------------------------------------------------------


 
### How to build

#### Used Tools while development

- Java 17
- Java IDE (Eclipse)
- MYSQL databse attached mysql driver
- Postman(For testing )  or swagger

### Steps by step for building and runing the project locally

1- Clone the from the link gitHub  -- https://github.com/asmaaAhmedShahin/ecommerce.git
2- Open the cloned project in eclipse
3- maven ->download Sources +  update Project 
4- Maven Build the project and run



 

### Testing the API
 * asserting some of code 
 planned to use JaCoCo as code coverage report   
 
 
 

### liquibase 
start generating the database tables by liquibase (database versioning) 



### Testing the API


 
Note: the ContentType is application/json


 
#tasks in progress

### schedual Job for send notification

### unit test

### cashing

### Kubernate
 
 



