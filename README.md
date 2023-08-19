# Hibernate_Product_Management
This project showcases the usage of Hibernate, a powerful Object-Relational Mapping (ORM) framework for Java applications. The example demonstrates a basic Hibernate configuration and a simple database operation: inserting a product record into a database table.

# Prerequisites
Before running this project, please ensure that you have the following prerequisites installed:

1. Java Development Kit (JDK) 8 or higher
2. Apache Maven
3. Hibernate
4. MySQL (or any other relational database of your choice)
5. IDE (Eclipse, IntelliJ IDEA, etc.) - Optional

# Getting Started
To set up and run the project, follow these steps:

1. Clone this repository to your local machine:
-> git clone https://github.com/yourusername/hibernate-product-management.git

2. Open the project in your preferred IDE (if using one).
3. Configure Hibernate:

- Navigate to the src directory and open hibernate.cfg.xml.
- Update the database connection settings (e.g., URL, username, and password) to match your database setup.

4. Build the project using Maven:
-> mvn clean install

5. Run the prodmain class as a Java application to insert a product record into the database.
6. Verify in your database that the product record has been successfully inserted.

# Project Structure
- hibernate.cfg.xml: Hibernate configuration file that specifies database connection details and mapping configurations.
- src/main/java/hibernatepack2/prodmain.java: The main Java class that demonstrates Hibernate usage by inserting a product record into the database.
- src/main/java/hibernatepack2/Product.java: A Java class representing a Product entity with properties for product code, name, and rate.

# How It Works
1. The hibernate.cfg.xml file is used to configure Hibernate, including database connection settings and mapping configurations.
2. In the prodmain class, we create a Hibernate SessionFactory based on the configuration.
3. We open a Hibernate Session to interact with the database.
4. A Transaction is initiated to ensure data consistency.
5. We create a Product object, set its attributes, and use session.save(p) to insert it into the database.
6. The transaction is committed, and the session is closed.
7. A success message is printed to the console.
