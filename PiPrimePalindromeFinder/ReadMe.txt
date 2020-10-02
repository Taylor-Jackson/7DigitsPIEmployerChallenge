This program was created in response to a challenge given to me from an employer.

The goal of this project is using the digits of PI, find the first
seven digit, palindromic prime number in them.

At first I tried using a file reader but switched to a constant string
for simplicity. I used a series of loops to chop the string into  7-digit parts
and check to see if it was a palindrome and prime. I separated the checks for 
prime and for palindrome into separate methods in order to make the code easier to read.

NOTE TO EMPLOYERS READING***

The methods palindromeChecker and primeChecker should be private,
however I made them public in order to create a JUnit test file
for them to easier isolate issues in my code and also show my knowledge
in JUnit, even though the tests were simple. I also made stringChopper take
'spacing' as a parameter to make it flexible to test smaller input than the 
15,000 digits of PI and so it could also be used for smaller or bigger palindromic
prime numbers. Comments may be excessive in my opinion. In this exercise I simply
wanted to show my logic and thinking in my code.

Thanks for reading!

Taylor Jackson
9/21/2020