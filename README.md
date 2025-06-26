# Task-3
📘 Library Management System (Java OOP Project)

🧾 Overview

This is a Command-Line Interface (CLI) based mini-project developed in Java using Object-Oriented Programming (OOP) principles. It simulates a basic library system where users can:

📚 Add and view books

👤 Register users

📖 Issue and return books

📋 View available and issued books



---

🛠️ Tech Stack

Language: Java

IDE: VS Code

Build/Run: Java CLI using javac and java

Terminal: Any terminal or command prompt



---

📁 Project Structure

LibraryManagementSystem/
├── Main.java         # Main entry point with menu
├── Book.java         # Book class (title, author, issued)
├── User.java         # User class (name, borrowed books)
└── Library.java      # Library class (core functionality)


---

🔍 Class Responsibilities

Class	Description

Book	Represents a book with title, author, and issued status
User	Represents a library user with name and a list of borrowed books
Library	Handles adding books/users, issuing/returning books, and listing books
Main	Provides a command-line interface for user interaction



---

🚀 How to Run the Project

1. Clone or Download the folder LibraryManagementSystem


2. Open folder in VS Code


3. Compile all files using terminal:

javac *.java


4. Run the project:

java Main




---

✅ Features

Add new books to the library

Register users (students/members)

Issue books to users (if available)

Return books

View list of available books

View list of issued books



---

📷 Sample Run

--- Library Management System ---
1. Add Book
2. Register User
3. Issue Book
4. Return Book
5. List Available Books
6. List Borrowed Books
0. Exit
Enter choice: 1
Enter title: Clean Code
Enter author: Robert C. Martin
Book added: Clean Code by Robert C. Martin [Available]


---

📌 Concepts Demonstrated

Java OOP: Classes, Objects, Encapsulation

List operations (ArrayList)

Control flow (loops, conditions, switch-case)

User input with Scanner

Reusability and modular design
