# Bank Management System

A simple Bank Management System built using **Java and Spring Boot** to practice Core Java, Object-Oriented Programming (OOP), and basic Spring Boot project structure.

## Project Overview

This project demonstrates a basic bank account system where a user can:

* Create a bank account with an account holder name and initial balance
* View account details
* Deposit money
* Withdraw money
* Check for insufficient balance during withdrawal

The main focus of this project is to apply **Core Java and OOP concepts inside a Spring Boot project**.

## Features

* Account creation
* Account holder information
* Initial balance
* Deposit functionality
* Withdrawal functionality
* Insufficient funds validation
* Account details display

## Technologies Used

* Java
* Spring Boot
* Maven
* IntelliJ IDEA

## Core Java Concepts Used

* Classes and Objects
* Encapsulation
* Private fields
* Constructors
* `this` keyword
* Methods
* Conditional statements
* Inheritance of project structure through Spring Boot setup

## Spring Boot

The project is created using Spring Boot and follows the standard Spring Boot application structure.

The application starts through the main Spring Boot class:

`BankManagementSystemApplication`

The current implementation focuses mainly on **Core Java/OOP practice**, while Spring Boot is used as the project framework.

## Project Structure

```text
BankManagementSystem
│
├── src
│   └── main
│       └── java
│           └── com.example.bankmanagementsystem
│               ├── BankManagementSystemApplication.java
│               └── BankAccount.java
│
├── pom.xml
└── README.md
```

## How It Works

A `BankAccount` object is created with:

* Account holder name
* Initial balance

The account can then perform operations such as:

```text
Create Account
      ↓
Display Account Details
      ↓
Deposit Money
      ↓
Display Updated Balance
      ↓
Withdraw Money
      ↓
Check Available Balance
```

If the withdrawal amount is grea
