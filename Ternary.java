
 import java.util.Scanner;
public class Ternary {
   



    public static void main(String[] args) {
        
           
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :"); 
        
        
        
        // Ternary operator means : SACH : JHOOTH   IF CONDITION IS TRUE THEN RUN SACH      IF CONDTION IS FALSE THEN RUN JHOOTH

       // syntax of ternary operator 
        
       // condition ? sach:jhooth ;

       // find either number is even and odd ;

         int n = sc.nextInt();
         System.out.println(n%2==0 ? "even":"odd");

         // ternary operator apne aap me values return karta h so its not mandatory but its used to reduced code redability and make efficiency 

// In Java, the ternary operator is a shorthand way of writing an if-else statement.  shortan way h 

// Syntax
// condition ? expression1 : expression2;
// If condition is true, expression1 is executed/returned.
// If condition is false, expression2 is executed/returned.
// Example 1: Basic Usage
// int a = 10;
// int b = 20;

// int max = (a > b) ? a : b;               (a>b) h ye condition h so pahle condition then write expression

// System.out.println(max); // Output: 20

// Equivalent if-else:

// int max;
// if (a > b) {
//     max = a;
// } else {
//     max = b;
// }
// Example 2: Checking Even or Odd
// int num = 7;

// String result = (num % 2 == 0) ? "Even" : "Odd";

// System.out.println(result); // Output: Odd
// Example 3: Nested Ternary Operator
// int marks = 85;

// String grade = (marks >= 90) ? "A"
//               : (marks >= 75) ? "B"
//               : (marks >= 50) ? "C"
//               : "F";

// System.out.println(grade); // Output: B

// Equivalent to multiple if-else if conditions.

// Example 4: In a Print Statement
// int age = 18;

// System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible");
// When to Use

// ✅ Good for simple decisions and assignments.

// String status = isLoggedIn ? "Welcome" : "Please Login";

// ❌ Avoid complex nested ternary operators because they reduce readability.

// // Hard to read
// String result = a > b ? (a > c ? "a" : "c") : (b > c ? "b" : "c");

// A regular if-else is often clearer for complex logic.

// Note: The ternary operator is the only operator in Java that takes three operands, which is why it's called a ternary operator.



    }
}

