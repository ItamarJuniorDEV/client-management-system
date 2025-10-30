# Client Management System

A desktop application for client registration and consultation developed in Java with Swing and MySQL database integration.

## Description

This system was developed as part of the Software Development Laboratory course at UFN - Universidade Franciscana. It provides a complete solution for managing client data with an intuitive graphical interface and persistent storage in a relational database.

## Features

The system implements the following core functionalities:

- Client registration with comprehensive data validation
- Client consultation with tabular data display
- Main menu for easy navigation between different modules
- Data persistence using MySQL database
- Input validation to ensure data integrity
- User-friendly error messages and success confirmations

## Technologies Used

- Java SE Development Kit
- Java Swing for graphical user interface
- MySQL Database for data persistence
- JDBC for database connectivity
- NetBeans IDE for development

## Database Structure

The system uses a MySQL database with the following table structure:
```sql
CREATE DATABASE sistema_clientes;

USE sistema_clientes;

CREATE TABLE clientes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cpf_cnpj VARCHAR(20) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100),
    tipo_cliente VARCHAR(20) NOT NULL,
    limite_credito DECIMAL(10,2) NOT NULL
);
```

## Project Structure

The project follows a layered architecture pattern with the following packages:

- beans: Contains the entity classes that represent business objects
- dao: Implements the Data Access Object pattern for database operations
- view: Contains all graphical user interface components
- sistemaclientes: Main package with the application entry point

## Installation and Setup

Follow these steps to run the application on your local environment:

1. Install MySQL Server and create the database using the SQL script provided above
2. Configure the database connection in the Conexao class with your local credentials
3. Add the MySQL Connector JDBC driver to the project libraries
4. Open the project in NetBeans IDE
5. Build and run the project

## Database Configuration

Update the connection parameters in the dao/Conexao.java file:
```java
private static final String URL = "jdbc:mysql://localhost:3306/sistema_clientes";
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

## Usage

When you start the application, the main menu window appears with three menu options:

### Registration Menu

Contains the option to open the client registration form where you can input new client data including name, CPF or CNPJ, phone number, email address, client type, and credit limit. The system validates all required fields before saving.

### Reports Menu

Provides access to the client consultation screen which displays all registered clients in a table format with seven columns showing ID, name, CPF/CNPJ, phone, email, client type, and credit limit.

### Help Menu

Contains information about the system including version number, developer name, and academic institution.

## Input Validation

The system implements the following validation rules:

- Name field cannot be empty
- Phone field cannot be empty
- Credit limit must be zero or a positive number
- All validations display clear error messages when rules are violated

## Author

Developed by Itamar Junior as part of the Information Systems course at UFN - Universidade Franciscana.

## Academic Context

This project was developed as an evaluation for the Software Development Laboratory course, demonstrating knowledge in object-oriented programming, graphical interface development, database integration, and software architecture patterns.
