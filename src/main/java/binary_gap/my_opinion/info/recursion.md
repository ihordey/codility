Decimal to binary number using recursion
Given a decimal number as input, we need to write a program to convert the given decimal number into equivalent binary number.

Examples :

Input : 7                                                         
Output :111

Input :10

Output :1010

**Below is Recursive solution**

`findBinary(decimal)
   if (decimal == 0)
      binary = 0
   else
      binary = decimal % 2 + 10 * (findBinary(decimal / 2)`
      
      
      
https://www.geeksforgeeks.org/decimal-binary-number-using-recursion/