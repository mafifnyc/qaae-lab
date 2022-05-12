# Topic 05: Structured Query Language (SQL)

<!-- TOC -->

- [Lab 5.1: Structured Query Language (SQL)](#topic-5-simple-storage-service-s3)
    - [Guidance](#guidance)
    - [Assignment 5.1: Introduction to SQL and Databases](#assignment-1-introduction-to-sql-and-databases)
        - [Principle 5.1](#principle-51)
        - [Practice 5.1](#practice-51)
            - [Lab 5.1.1: Installation](#lab-511-installation)
        - [Retrospective 5.1](#retrospective-51)
- [Lab 5.2: Let's learn some very easy SQL query](#learn-basic-sql-query)  
    - [Guidance](#guidance)
    - [Assignment 5.2: Let's learn some very easy SQL query](#learn-sql)

- [Lab 5.3: SQL Assignment 03](#sql-assignment-3)
    - [Guidance](#guidance)
    - [Assignment 5.3: Let's learn some very easy SQL query](#learn-sql)
- [Reference resources](#reference-resoures)    



[comment]: <> (    - [Assignment 5.5: Practice Basic SQL Query]&#40;#assignment-55-practice-basic-sql&#41;)

[comment]: <> (        - [Principle 5.5]&#40;#principle-55&#41;)

[comment]: <> (        - [Practice 5.5]&#40;#practice-55&#41;)

[comment]: <> (            - [Lab 5.5.1: Recreate the Bucket with Public Data]&#40;#lab-551-recreate-the-bucket-with-public-data&#41;)

[comment]: <> (                - [Question: Downloading Protection]&#40;#question-downloading-protection&#41;)

[comment]: <> (        - [Retrospective 5.5]&#40;#retrospective-55&#41;)

<!-- /TOC -->

## Guidance

- Explore your curiosity. Try to understand why things work the way
  they do. Read more of the documentation than just what you need to
  find the answers.

[comment]: <> (For each section, you'll want to create a branch on your github repo,)

[comment]: <> (push your changes to it. Consider this pattern "assumed" for)

[comment]: <> (all labs going forward so we don't have to increase the length of the)

[comment]: <> (document by copying / pasting "push these changes to your branch" fifty)

[comment]: <> (times.)

## Lab 5.1: Introduction to SQL

### Principle 5.1

*Structured Query Language is used in RDS to store, retrieve and maintain the data. You will have to learn how RDS looks like and how to query into RDS. In our lab we will use PostgreSQL to learn.*
This section helps you to install the postgresql in your local computer and help you to connect via terminal and PgAdmin Client.
#### Lab 5.1: Installation

S3 buckets are located in regions, but their names are globally unique.
Using "aws s3", create a bucket:

- Install PostgreSQL on your machine following the instructions 
  - [Mac](https://docs.google.com/document/d/10Fnltg2mR-COZXdA7E0mMRXUDp_JxDFD7Hrs6Pz5QTg/edit?usp=sharing) 
  - [Windows](https://www.postgresqltutorial.com/postgresql-getting-started/install-postgresql/)
- Connect to the DB server by terminal Practice whatever we did in the class. You can take help of this document as well [Cheat Sheet](https://www.postgresqltutorial.com/postgresql-cheat-sheet/)

- Install [PGAdmin](https://www.pgadmin.org/download/)

- Again practice all the SQL queries you have learned

- Import a sample database using this instruction
    - [PostgreSQL Sample Database](https://www.postgresqltutorial.com/postgresql-getting-started/postgresql-sample-database/)
    - [Load PostgreSQL Sample Database](https://www.postgresqltutorial.com/postgresql-getting-started/load-postgresql-sample-database/)

- Play with the newly imported database following this tutorial [Getting Started with PostgreSQL](https://www.postgresqltutorial.com/postgresql-getting-started/)


 #####Question: 
- What do you understand by database?
- What is Table?
- What are the components we need to connect  to a database server?

#### Lab 5.2: Let's learn some very easy SQL query
### Guidance 5.2
 You will use the database dvdrental which you have imported earlier lab 5.1 to accomplish this assignment.
Do not become scared by seeing the list of questions. It's easy I promise. Take help of [Getting Started with PostgreSQL](https://www.postgresqltutorial.com/postgresql-getting-started/) 
tutorial to learn how to make those basic query and find it the required answer.
You shall use PgAdmin to connect to the dvdrental database and use the pgadmin console to execute the query
#### Assignment 5.2: Let's learn some very easy SQL query       
        1. Write a query to get all data of actor.
        2. Write a query to get email and last name of customer.
        3. Write a query to get title, description and release year of film.
        4. Query city and country id in the city table.
        5. Write a query to get amount, payment date and customer id from customer table.
        6. Write a query to get all data of language.
        7. Query all columns for a payment in payment table with customer id 10.
        8. Query last name and first name of customers in customer table whose first names are "Mary"
        9. Query last name and first name of customers in customer table whose first names are "Mary" and last names are "Smith".
        10. Query last name and first name of customers in customer table whose first names are "Susan" or last names are "Jones".
        11. Query email of customers in customer table whose first name is "Mar", "Mary" or "Mari".
        12. Query last name and first name of customers in customer table whose first names start with "Ma".
        13. Write a query to get staff id, first name and username of staff in staff table whose staff id is 10.
        14. Query last name and first name of customers in customer table whose first name start with letter "M" and contains 3 to 5 characters.
        15. Query last name and first name of customers in customer table whose first names start with "Bra" and last names are not "Motley".
        16. Query store id of stores that have more than 300 customers in customer table.
        17. Write a query to select all details of the only customers who have been spending more than 200 in customer table.
        18. Query all columns in film table where the film_id is less than 4.
        19. Write a query to get all data from address table.
        20. Query rental date, customer id and rental id in rental table when rental date is 2005-05-25.
        21. Query all columns for customers in customer table with store id 2 or customer id 7.
        22. Query all columns for customers in customer table who have spent amount more than $200.
        23. Query amount and payment_date from payment where the amount paid was less than $2.
        24. Write a query to get a list of actors with the first name Chris, Cameron, or Cuba.
        25. Query last name of customers in customer table whose first names are "John".
        26. Write a query to get staff id, first name and username of staff in staff table whose store id is less than 6.
        27. Write a query to get release year, rental duration and rental rate of films in film table.
        28. Write a query to get city id and country id of country in country table whose name is "New York".
        29. Write a query to get all data of city table.
        30. Write a query to get film id of film in film_category table with category_id 2.

### Retrospective 5.2
 Was it fun? I hope so. You must have learned various way to talk to RDS

#### Lab 5.3: SQL Assignment 03
### Guidance 5.2
You will use the database dvdrental which you have imported earlier lab 5.1 to accomplish this assignment.
Do not become scared by seeing the list of questions. It's easy I promise. Take help of [Getting Started with PostgreSQL](https://www.postgresqltutorial.com/postgresql-getting-started/)
tutorial to learn how to make those basic query and find it the required answer.
You shall use PgAdmin to connect to the dvdrental database and use the pgadmin console to execute the query

#### Assignment 5.3: SQL Assignment 03

== Simple Selects

    5.3.1: What are all the records in the store table, ordered by the primary key of the table?
    
    5.3.2: What are the first 10 records in the inventory table in ascending order of update (show just the primary key and the update timestamp)?
== Selects from more than 1 table

    5.3.3: What is the street address, district, city name, and phone number for all addresses in the 18743 postal code?
== Aggregate Selects

    5.3.4: How many records are in the inventory table?
    
    5.3.5: What is the timestamp of the most recent update to the staff table?
    
    5.3.6: How many distinct values of country_id exist in the city table?
    
    5.3.7: How many actors' last names begin with either a "B" or a "C"?
    
    5.3.8: What is the average payment amount (rounded to the nearest cent) and number of payments made in the month of April, 2007,
    by customers that are currently active, and whose average payment is at least $5.00?
    
    5.3.9: Show customer's first and last name and email, and label the average payment field as "Avg. Payment Amount"
    and the number of payments field as "Number of Payments".
    
    5.3.10: Order the results by highest payment first, and then by last name.

== Set Theory Selects

    5.3.11: What are all the first names of both the actors and the staff members that begin with the letter 'S' (in alphabetical order)?

    5.3.12: Show the title of the films that Jon rented on May 29, 2005 in common with those that Mike rented on June 20, 2005. Order by film title.

# Reference resources
-  [Getting Started with PostgreSQL](https://www.postgresqltutorial.com/postgresql-getting-started/)
-  [PostgreSQL](https://www.postgresql.org/)



