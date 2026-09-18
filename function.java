import java.util.Scanner;

public class function {                   // write a program to print given number from the users 

    // public static void printMyName(String nam) {
//         System.out.println(nam);                                                   // camelCase in java means lower aur upper letter se likhna ise identifier bhi kahte hai
                                                                         // like this MyNameIs , youTube,LikeThis upperr letter aur lower letter dono ka used krna 
//         return;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String nam = sc.nextLine();   // ✅ reads full line
//         printMyName(nam);
  


// write a program to print sum of two number is given by the user;

// public static int AddTwoNumber(int a ,int b ) {
//      int sum = a+b;
        
//         return  sum  ;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your first number : ");
//         int  num1 = sc.nextInt();
//         System.out.println("enter your second number :");
//         int num2 = sc.nextInt();
//         int result = AddTwoNumber(num1, num2);
 
//        System.out.println("the result of 2 number is : "+result);



  // write a program to calculate multiple of two number given from the user :

  //   public static int calculateMultiply(int a ,int b ) {
  //    int mul = a*b;  // instead of this you just write a simple code return a*b; it is not suffiecient to write a long code like this :
        
  //       return  mul ;
  //   }

  //   public static void main(String[] args) {
  //       Scanner sc = new Scanner(System.in);
  //       System.out.print("Enter your first number : ");
  //       int  num1 = sc.nextInt();
  //       System.out.print("enter your second number :");
  //       int num2 = sc.nextInt();
  //      // int result = calculateMultiply(num1, num2); // instead of this you see like this below line 

  //  // System.out.println("the result of 2 number is : "+result); // instead of this you can just write like this 
  //   System.out.println("the result of 2 number is : "+calculateMultiply(num1, num2));


  
    // find the factorial of number                          factorial means: n!=n*(n-1)*(n-2)*(n-3)*(n-4).....
                                                            //1! = 1,0!=1, 2! = 2, 3! = 3*2*1 and so on ..



  
    public static  void  calculateFactorial(int n ) {

      if(n<0){
        System.out.print("Invalid Input :");
        return;
      }
    
      int factorial = 1;
      for (int i=n;i>=1;i--){

       factorial *=i;
        }
        

        System.out.println(factorial);
        

      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        
    calculateFactorial(n);





     
// This is a second method to solve java code:


// public class Factorial {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         long factorial = 1; // use long for larger values

//         for (int i = 1; i <= num; i++) {
//             factorial *= i;
//         }

//         System.out.println("Factorial of " + num + " is: " + factorial);
        
//         sc.close();
    




// Function : ek block of code which perform a specific task
// Types of function :
// 1. Built-in function : pre-defined function
// 2. User-defined function : custom function created by the user 
// Syntax of function :
//    (public static)             returnType functionName(type1 argument,type2 argument...){
// // operations 
//     return value;  (if returnType is not void) 
//   }



// PRINT Fibonacci Series NUMBER 

//  Fibonacci Series
// Meaning  Each number is the sum of the previous two numbers.

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...

















    
}
 }
                                                 


    
















































































// function of Syntax 

//     (public static)             returnType functionName(type1 argument,type2 argument...){

// // operations 
// }