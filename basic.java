// 1. Alerts:
alert("Welcome to My site!");

var userName = prompt("What is your name?");
alert("Hello, " + userName + "!");

// 2. Variables for Strings:
var firstName = prompt("Enter your first name:");
var lastName = prompt("Enter your last name:");
alert("Your full name is: " + firstName + " " + lastName);

var hobby = prompt("What is your favorite hobby?");
var hobby = prompt("What is your favorite hobby?");

// 3. Variables for Numbers:
var yearOfBirth = prompt("Enter your year of birth:");
var currentYear = 2024;
var age = currentYear - yearOfBirth;
alert("Your age is: " + age);
  
var length = prompt("Enter the length of the rectangle:");
var width = prompt("Enter the width of the rectangle:");
var area = length * width;
alert("The area of the rectangle is: " + area);

// 4. Variable Names Legal and Illegal:

// legal

// var userName;
// var user_Name;
// var a1;

// Illegal

// var .a;
// var .a/;
// var .1


var myAge = 24;
var friendAge = 22;
alert("My age is: " + myAge + " and my friend's age is: " + friendAge);

// 5. Math Expressions: Familiar Operators:

var number1 = prompt("Enter the first number:");
var number2 = prompt("Enter the second number:");
var sum = Number(number1) + Number(number2);
alert("The sum is: " + sum);

var result = 6 * 8;
alert("The result of multiplying 6 by 8 is: " + result);

var remainder = 17 % 5;
alert("The remainder when 17 is divided by 5 is: " + remainder);

// Challenge 1:
var birthYear = prompt("Enter your birth year:");
var currentYear = 2024;
var age = currentYear - birthYear;
alert("Your age is: " + age);

// Challenge 2: 


var num1 = prompt("Enter the first number:");
var num2 = prompt("Enter the second number:");


num1 = Number(num1);
num2 = Number(num2);


var sum = num1 + num2;
var difference = num1 - num2;
var product = num1 * num2;
var quotient = num1 / num2;
var remainder = num1 % num2;


alert("Sum: " + sum);
alert("Difference: " + difference);
alert("Product: " + product);
alert("Quotient: " + quotient);
alert("Remainder: " + remainder);

