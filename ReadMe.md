# Product Catalog Service

A Spring Boot backend service that manages products in an e-commerce style catalog.

## Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- H2 Database (or MySQL)

## Features
- Create product
- Get product by id
- List all products

## API Endpoints

### Create Product
POST /products

### Get Product
GET /products/{id}

### List Products
GET /products

## Run Locally

Clone the repository:

git clone https://github.com/shuntzhere/ProductCatalogService.git

Go inside the folder:

cd ProductCatalogService

Run the application:

./mvnw spring-boot:run

Server starts at:
http://localhost:8080


## Example API Usage

### Create Product

POST /products

Request Body:
{
"name": "iPhone 15",
"description": "128GB variant",
"price": 79999
}

Response:
{
"id": 1,
"name": "iPhone 15",
"description": "128GB variant",
"price": 79999
}

### Get Product

GET /products/1

Response:
{
"id": 1,
"name": "iPhone 15",
"description": "128GB variant",
"price": 79999
}
