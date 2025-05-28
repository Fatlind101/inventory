Postman Examples - Inventory Management API

PRODUCTS
--------

[GET] Get all products
GET http://localhost:8080/products

[GET] Get product by ID
GET http://localhost:8080/products/1

[POST] Create a product
POST http://localhost:8080/products
Headers:
Content-Type: application/json

Body:
{
  "name": "Hammer",
  "quantity": 25,
  "price": 15.99,
  "category": {
    "id": 1
  }
}

[DELETE] Delete a product
DELETE http://localhost:8080/products/1


CATEGORIES
----------

[GET] Get all categories
GET http://localhost:8080/categories

[GET] Get category by ID
GET http://localhost:8080/categories/1

[POST] Create a category
POST http://localhost:8080/categories
Headers:
Content-Type: application/json

Body:
{
  "name": "Tools"
}

[DELETE] Delete a category
DELETE http://localhost:8080/categories/1


STOCK ENTRIES
-------------

[GET] Get all stock entries
GET http://localhost:8080/stock-entries

[POST] Create a stock entry
POST http://localhost:8080/stock-entries
Headers:
Content-Type: application/json

Body:
{
  "product": {
    "id": 1
  },
  "quantityChange": -5,
  "timestamp": "2025-05-26T20:00:00"
}