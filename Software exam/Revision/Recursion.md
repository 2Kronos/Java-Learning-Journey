
# Power of 

Implement the power-of function, with a numeric base and an integral power (can be negative or positive)

```java
package practice;
public class powerOf {

// Recursive method to calculate base raised to the power of exponent

public static double power(double base, int exponent) {

// Base case: If the exponent is 0, return 1

if (exponent == 0) {

return 1;

}

// If the exponent is positive

if (exponent > 0) {

return base * power(base, exponent - 1);

}

// If the exponent is negative, we use the reciprocal rule

return 1 / power(base, -exponent);

}

  

public static void main(String[] args) {

double base = 2.0;

int exponent = 3;

// Test the power function with positive exponent

System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));

exponent = -3;

base = 3.0;

// Test the power function with negative exponent

System.out.println(base + " raised to the power of " + exponent + " is " + power(base, exponent));

}

}
```

---
# – Multiply any two integers
```java
package practice;

  

public class Multiply {

// Recursive method to multiply two integers

public static int multiply(int a, int b) {

// Base case: if multiplier b is 0, return 0

if (b == 0) {

return 0;

}

// If multiplier b is positive, recursively add a to the result of multiplying a and b-1

if (b > 0) {

return a + multiply(a, b - 1);

}

// If multiplier b is negative, convert it to positive and negate the result

return -multiply(a, -b);

}

  

public static void main(String[] args) {

int num1 = 5;

int num2 = 3;

// Test the multiply function with positive numbers

System.out.println(num1 + " multiplied by " + num2 + " is " + multiply(num1, num2));

// Test the multiply function with negative multiplier

num2 = -3;

System.out.println(num1 + " multiplied by " + num2 + " is " + multiply(num1, num2));

}

}
```

---

# Add the first n natural number

```java

package practice;

//2. Write a Java recursive method to calculate the sum of all numbers from 1 to n

import java.util.Scanner;

public class Sum {

public static void main (String[]args) {

;

Scanner scanner = new Scanner(System.in);

System.out.println("Give the max limit we shoudl add");

int input = scanner.nextInt();

int num = 5;

int sum = total(input);

System.out.printf("SUM = %d", sum);

}

public static int total(int n){

if(n==1) {

return 1;}

else {

return n + total(n - 1);

}

}

}

  

//correction return n +=total(n-1);

//better to write return n + total(n - 1);
```

---

# Add even integers between 0 and n 
# – Add odd integers between 0 and n

```java
package practice;

  

public class EvenOddSum {

public static void main(String[] args) {

int n = 10;

  

// Test the sumEven method

System.out.println("Sum of even integers from 0 to " + n + ": " + sumEven(n));

// Test the sumOdd method

System.out.println("Sum of odd integers from 0 to " + n + ": " + sumOdd(n));

}

// Recursive method to add even integers from 0 to n

public static int sumEven(int n) {

// Base case: If n is less than 0, return 0 (no more even numbers to add)

if (n < 0) {

return 0;

}

// If n is even, add it to the result of sumEven(n - 2)

if (n % 2 == 0) {

return n + sumEven(n - 2);

}

// Otherwise, call sumEven(n - 1) to check the next even number

return sumEven(n - 1);

}

  

// Recursive method to add odd integers from 0 to n

public static int sumOdd(int n) {

// Base case: If n is less than 1, return 0 (no more odd numbers to add)

if (n < 1) {

return 0;

}

// If n is odd, add it to the result of sumOdd(n - 2)

if (n % 2 != 0) {

return n + sumOdd(n - 2);

}

// Otherwise, call sumOdd(n - 1) to check the next odd number

return sumOdd(n - 1);

}

}
```
