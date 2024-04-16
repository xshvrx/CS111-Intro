# CheckDigit
Write a program that takes a 12 or 13-digit long as a command-line argument and displays the digit computed as follows:

Take for an example the number 048231312622

Sum every other digit of the code, starting from the right.  In the example, that is 2 + 6 + 1 + 1 + 2 + 4 = 16.  Discard the tens digit and keep the ones digit, 6. 

Start with the second to last digit and do the same thing.  Sum the digits, discard the tens digit and keep the ones digit.  In this example this is 2 + 2 + 3 + 3 + 8 + 0=18.  

Discarding the 10 leaves 8.  Multiply this number by 3 and again discard the tens digit.  8×3 = 24, leaving 4.

Add the numbers from steps 1 and 2.  Again drop the tens digit.  6 + 4 = 10, leaving the digit 0.
