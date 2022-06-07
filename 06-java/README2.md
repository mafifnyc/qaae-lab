##Assignment 4 (Class Object and Control flow)

1. Write a java program with a following methods:  method "sum" which returns sum of two numbers,  method "multiplication" which returns product of two numbers, method "Subtraction" which returns difference of two numbers, method "division" which returns quotient value. For example if first number is 2 and second number is 3 then output should be like:
Sum of 2 and 3 is: 5
Product of 2 and 3 is: 6
..... and so on
2. Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
3. Define a method to find out if number is prime or not.
4. Define a method to find out number is even or odd. 
5. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
74. Write a program with following methods: method "printInfo" which displays name, age, phone number and salary of a employee and method "bonus" which displays monthly salary of employee after getting 5% bonus.
75. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
76. Write a Java program to get a number from the user and print whether it is positive or negative.
77. Write a program with methods "compareTwoNumbers" which print greater number among 2 numbers, method "compareThreeNumbers" which print greater number among 3 numbers and method "comapreFourNumbers" which print smallest number among 4 numbers. (You can use numbers of your choice)
78. Write a Java program that prints "All numbers are equal" if all three numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
79. Write a Java program that prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
80. Write a Java program to test if an array contains a specific value. 
81. Write a program to sum first numbers using a for loop.
82. Write a program which prints "PASS" if marks of student are more than or equal to 50; and prints FAIL otherwise.
83. Write a program called which prints "ONE", "TWO",... , "NINE", "OTHER" if the number is 1, 2,... , 9, or other, respectively using nested if statement. 
84. Write a program called which prints "ONE", "TWO",... , "NINE", "OTHER" if the number is 1, 2,... , 9, or other, respectively using switch statement.
85. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
86. Write a Java class Author with following features:
Instance variables :
firstName for the author’s first name of type String.
lastName for the author’s last name of type String.
Constructor:
public Author (String firstName, String lastName): A constructor with parameters, it creates the Author object by setting the two fields to the passed values.
Instance methods:
public void setFirstName (String firstName): Used to set the first name of author.
public void setLastName (String lastName): Used to set the last name of author.
public String getFirstName(): This method returns the first name of the author.
public String getLastName(): This method returns the last name of the author.
public String toString(): This method printed out author’s name to the screen
87. Write a Java class Book with following features:
Instance variables :
title for the title of book of type String.
author for the author’s name of type String.
price for the book price of type double.
Constructor:
public Book (String title, Author name, double price): A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
Instance methods:
public void setTitle(String title): Used to set the title of book.
public void setAuthor(String author): Used to set the name of author of book.
public void setPrice(double price): Used to set the price of book.
public String getTitle(): This method returns the title of book.
public String getAuthor(): This method returns the author’s name of book.
public String toString(): This method printed out book’s details to the screen
88. Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
89. The Java class called Holidayis started below. An object of class Holidayrepresents a
holiday during the year. This class has three instance variables:
name, which is a String representing the name of the holiday
day, which is an int representing the day of the month of the holiday
month, which is a String representing the month the holiday is in
a) Write a constructor for the class Holiday, which takes a Stringrepresenting the name, an
int representing the day, and a String representing the month as its arguments, and sets the
class variables to these values.
b) Write a method inSameMonth, which compares two instances of the class Holiday,and
returns the Boolean value trueif they have the same month, and falseif they do not.
c) Write a piece of code that creates a Holidayinstance with the name “Independence Day”,
with the day “4”, and with the month “July”.
90. The class Movie is started below. An instance of class Movie represents a film. This class
has the following three class variables:
title, which is a String representing the title of the movie
studio, which is a String representing the studio that made the movie
rating, which is a String representing the rating of the movie (i.e. PG­13, R, etc)
Write a constructor for the class Movie, which takes a String representing the title of the
movie, a String representing the studio, and a String representing the rating as its
arguments, and sets the respective class variables to these values.
b) Write a second constructor for the class Movie, which takes a String representing the title
of the movie and a String representing the studio as its arguments, and sets the respective
class variables to these values, while the class variable ratingis set to "PG"
91. Write a java program with method that reads two integers, determines whether the first is a multiple of the second and print
the result.
92. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
An Invoice should include four pieces of information as instance variables‐a part number(type String),a part
description(type String),a quantity of the item being purchased (type int) and a price per item  (double). Your
class should have a constructor that initializes the four instance variables.Provide a method named getInvoice Amount that calculates the invoice
amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0.

Assignment 5 
93. Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. (use all possible loops)
94. Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate.
95. Write a program that take 10 integers from keyboard using loop and print their average value on the screen.
96. As activity directory at Lake LazyDays Resort, it is your job to suggest appropriate activities to guests based on the weather: 
temp >= 80: swimming
60 <= temp < 80: tennis
40 <= temp < 60: golf
temp < 40: skiing
a. Write a program that prompts the user for a temperature, then prints out the activity appropriate for that temperature. Use acascading if, and be sure that your conditions are no more complex than necessary.
b. Modify your program so that if the temperature is greater than 95 or less than 20, it prints "Visit our shops!". (Hint: Use a boolean operator in your condition.) For other temperatures print the activity as before.
97. Write a program taht read 10 values from the user and print the lowest and highest value entered.
98. Write a program that takes first number, second number and operator(+,-, * , /, %) from user and based on which operator user choose it will print result. (use switch statment)
99. Write a program that print a message based on the grade of a student. (use switch statement)
Grade	Message
A+	Excellent
A	Very Good 
B	Good
C	Fair
D	Can do better
E	Just Passed
F 	Fail
100. Design a class called Meeting to represent meetings in a diary. The Meeting class has the following fields:
time of the meeting represented as string in hours and minutes, location of the meeting (such as “room 205”), subject to represent the meeting’s subject (such as “Examiner’s meeting”). 
Time, location and subject are stored as strings.
The class should include a constructor and the following methods: setTime: to set the time, setLocation: to set the location, setSubject: to set the subject, getSubject: to return the subject of the meeting, printDetails: to print all information of a meeting in the following form:
"Meeting in room 205 at 12:30; Subject: Examiner’s meeting."
101. A hospital wants to create a database regarding its indoor patients. The information to store include : Name of the patient - Age of the patient - Disease - Date of admission - Date of discharge
Create a class called Patient to store the above information. The member methods should include method to enter and print information of employee, method having an array list to store all patients, method to add a patient to the list and to delete a patient from the list. 
It also has a method to display a list of all the patients in the hospital and a method to display only the patients whose age is less than 12. 
102. 

