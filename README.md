 Hibernate HQL Delivery Project

Project Description

This project demonstrates the use of **Hibernate Query Language (HQL)** in a Maven Hibernate project.
A **Delivery entity class** is created with attributes like ID, Name, Date, Status, and Address.
The project performs database operations such as inserting and deleting records using Hibernate.

 Technologies Used

* Java
* Hibernate
* Maven
* MySQL
* Spring Tool Suite / VS Code
 Database

Database Name:
fsadexam


 Entity Class

Delivery entity contains the following fields:

* id
* name
* date
* status
* address

 Operations Implemented

 1. Insert Record

A delivery record is inserted into the database using a **persistent object**.

 2. Delete Record

A record is deleted from the database using **Hibernate Query Language (HQL)** with positional parameters.

Example HQL Query:

delete from Delivery where id=?1


 Output

Console Output:


Record Inserted Successfully
Record Deleted : 1


HibernateHQLProject1
 ├── Delivery.java
 ├── ClientDemo.java
 ├── HibernateHqlProject1Application.java
 ├── hibernate.cfg.xml
 ├── application.properties
 └── pom.xml
```

Conclusion

This project demonstrates how Hibernate ORM simplifies database operations using entity classes and HQL queries.
