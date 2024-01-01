# Employee Management System - Full Stack

## Overview

This project serves as a Full Stack implementation for an Employee Management System. It includes both the backend (built with Spring Boot, MySQL) and the frontend (using Thymeleaf for templating and Bootstrap for styling).

## Features

- Full-stack CRUD operations for employee data.
- Interactive frontend powered by Thymeleaf, Bootstrap, HTML, and CSS.
- RESTful API endpoints for backend operations.
- Data persistence using Spring Data JPA with MySQL.

## Technologies Used

### Backend

- Java
- Spring Boot
- Spring Data JPA
- MySQL Database
- Spring Boot DevTools

### Frontend

- Thymeleaf
- Bootstrap

## Dependencies

- `spring-boot-starter-data-jpa`: For Spring Data JPA support.
- `spring-boot-starter-web`: For Spring Web support.
- `mysql-connector-java`: MySQL Driver for connecting to the database.
- `spring-boot-devtools`: Spring Boot DevTools for automatic application restarts during development.

## Project Structure

### Backend

The backend project follows a modular structure with the following key packages:

- **`controller`:** Contains classes handling HTTP requests and managing the flow of data between the frontend and backend.

- **`dao`:** Houses Data Access Objects (DAO) or repositories responsible for interacting with the database.

- **`entity`:** Stores entity classes representing data models, mapped to database tables.

- **`service`:** Contains service interfaces and implementations, acting as an intermediary between controllers and DAOs, encapsulating business logic.

### Frontend

Since Bootstrap is used, there is no custom CSS or JS. The frontend project structure includes:

- **`templates`:** Contains Thymeleaf templates (HTML files) for server-side rendering.

This structure ensures a clean separation between backend and frontend concerns, making the project easy to navigate and maintain. Adjustments can be made based on the evolving needs of the application.

## Screenshots

![Employee Management System](path/to/your/screenshot.png)
