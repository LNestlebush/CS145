This program asks the user if the book is a textbook, then asks for the book name and number of pages. 
If the book is a textbook, it asks for the grade level.
If the grade level is not between 1 and 12, it throws an exception and prints an error message.
The program then displays the book information.

Abstract Class: Book is the abstract class that is extended by Textbook and Novel
Inheritance: Textbook and Novel Class inherit book name and pages variables
Polymorphism: Textbook and Novel both use the displayInfo method to display the book information.
Exception Handling I/O: If the user inputs a value outside of 1-12 for grade level it will catch/return the error message
