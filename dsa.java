

public class dsa {


    // Quest 1. Print digits of number   :    iska matlb aapko number ko digits me print karna h  like this 23456 ye number h isko digits one by one print karna h 2,3,4,5,6 and 
  
    // NOTE : KOI BHI NUMBER KO {MODULUS % 10} KAROGI TO WAH LAST DIGITS DEGA   LAST WALA DIGITS PRINT HOGA 
    // KOI BHI NUMBER KO /10 DIVIDE KAROGE TO LAST WALA DIGITS REMOBE HO JAYEGA  LAST WALA DELETE HO JAYEGA 

    // AGAR INT NUMBER SE INT NUMBER KO DIVIDE KAROGE TO OUTPUT INT ME HI AAYEGA LIKE 57/10  TO 5 HOGA 5.7 NHI BECAUSE INT H 

    // public static  void getdigit(int num ){
    //  while(num !=0){
    //     int digits = num %10;      // last digits ko print kar raha h  one by one 
    //     System.out.println(digits);  // print karwa do 
    //     num = num /10;  // last digits ko remove kar rha h 
    
    
//Quea 2.  counts a digits of number 

//   public static  int Countdigit(int num ){
//     int count = 0; 
//     while(num !=0){
//         int digits = num %10;      // last digits ko print kar raha h  one by one 
    
//         num = num /10;
//        count ++;
    
    
    
//     }
//      return count;
//     }

// Ques 3. print the sum of digits 

// public static  int SumOfdigit(int num ){
//     int sum = 0; 
//     while(num !=0){
//         int digits = num %10;      // last digits ko print kar raha h  one by one 
//          sum = sum+digits;
//         num = num /10;
       
    
    
    
//     }
//      return sum;
//     }


// print a reverse of number or digit  

// public static  int reverseOfdigit(int num ){
//     int reverse= 0; 
//     while(num !=0){
//         int digits = num %10;      // last digits ko print kar raha h  one by one 
//          reverse = reverse *10+digits;  // har ek time reverse jo bhi number aayega usko 10 se multiply than add digits 
//         num = num /10;
    
//     }
//      return reverse;
//     }

// everse = reverse * 10 + digits;

// Let's understand it step by step.

// Suppose:

// num = 1234
// First Iteration
// digits = 1234 % 10 = 4
// reverse = 0

// Now:

// reverse = reverse * 10 + digits
//         = 0 * 10 + 4
//         = 4
// Second Iteration
// num = 123
// digits = 3
// reverse = 4

// Now:

// reverse = 4 * 10 + 3
//         = 40 + 3
//         = 43

// Why multiply by 10?

// Because multiplying by 10 shifts the existing digits one place to the left:

// 4  -> 40
// 43 -> 430
// 432 -> 4320

// Then we add the new digit at the end.

// Third Iteration
// digits = 2
// reverse = 43
// reverse = 43 * 10 + 2
//         = 430 + 2
//         = 432
// Fourth Iteration
// digits = 1
// reverse = 432
// reverse = 432 * 10 + 1
//         = 4320 + 1
//         = 4321
// Visual Representation
// Original Number: 1234

// Take 4 → reverse = 4
// Take 3 → reverse = 43
// Take 2 → reverse = 432
// Take 1 → reverse = 4321

// Table:

// digits	reverse before	reverse after
// 4	0	4
// 3	4	43
// 2	43	432
// 1	432	4321

// Think of it like this:

// reverse = reverse * 10;

// creates an empty space at the end.

// Then:

// + digits

// puts the new digit into that space.

// For example:

// 43 * 10 = 430
// 430 + 2 = 432

// That's exactly how the reversed number is built digit by digit.


// print palindrom number       it means dono side se same ho like 1221 ,12321 ,121 , 45654 etc 

// public static boolean ispalindrome(int num){
//     int originalNum = num;
//     int reversedNUm = reverseOfdigit(num);
// if(originalNum ==reversedNUm){
//     System.out.println("number is palindrome");
//     return true;

// }else {
//     System.out.println("NUMBer is not palindrome :");
//     return false;
// }

// }


// print prime number or not             prime number : means a number must be greater than 1 and divisible by 1 and itself example 2,3,5,7,11 etc

//  static boolean isPrimeNUM(int num){
//         //for(int i =2;i<=num-1;i++){    // iska time complexity bahut jyada h liner h  so used underroot n like this 
//         //or   
//         //for(int i =2;i<=Math.sqrt(num);i++){  // iska time complexity baut kam h so tryied this every time 
//         //or 
//         for(int i =2;i*i<=num;i++){
        
//         if(num%i==0){
//                 return false ;
//             }
//         }
//         return true;
//     }










public static void main(String[] args) {
//    int  num = 20303;
//    getdigit(num);


//    int num = 3434352;
//   int ans = Countdigit(num);
//   System.out.println(ans);

//  int num = 394848;
//  int sum = SumOfdigit(num);
//  System.out.println(sum);

//    int num = 103873;
//    int rev = reverseOfdigit(num);
//    System.out.println(rev);

// boolean data = ispalindrome(1234321);
// System.out.println(data);

int num = 11;
        System.out.println(isPrimeNUM(num));


// find gcd  (greatest common divisior) or we can say HCF (highest common factor).

// class Main {
//     public static int Getgcd(int a,int b){
//      //According to eucliend Algorithm   // gcd a = gcd(b,a%b)
//         while (b!=0){
//             int data = b;
//             b = a%b;
//             a = data;
//         }
//         int ans = a;
//         return ans;
        
//     }
//     public static void main(String[] args) {
//         System.out.println(Getgcd(18,12));
//     }
// }


// print lcm of data                                        lcm nikalne ke liye aapko hcf ki jaroot padegi so first we find hcf then calculate lcm 

// class  Main {
//     public static int Getgcd(int a,int b){
//      //According to eucliend Algorithm   // gcd a = gcd(b,a%b)
//       while(b!=0){
//           int data =b;
//           b = a%b;
//           a  = data;
//       }
//         int ans = a ;
//         return ans;
        
//     }
//     // formula = lcm * hcf(gcd) = a*b;          yahi formula h lcm ka so remember this 
//     // then lcm = a*b/hcf 0r gcd
    
//     static int Getlcm(int a,int b){
//         int gcd = Getgcd(a,b);
//         int product = a*b;
//         int lcm = product/gcd;
    
//     return lcm;
//     }
    
//     public static void main(String[] args) {
//         System.out.println(Getlcm(18,12));
//     }
// }


 // or aap iske through bhi likh sakte ho 

//  class Main {
//     static int getgcd(int a,int b){
//         if(b==0){
//             return a;
            
//         }return getgcd(b,a%b);
//     }
    
//     static int getlcm(int a,int b){
//         return (a*b)/getgcd(a,b);
//     }
    
//     public static void main(String[] args) {
//         System.out.println(getlcm(12,21));
//     }
// }

// find the ArmStrong Number      

// class Main {
//     static boolean isArmstrongNumber(int num){
//        int sum = 0;
//        int data = num;
//         while(num!=0){
//             int digits = num%10;
//             int cubeofNumber = digits*digits*digits;
//             sum +=cubeofNumber;
            
//             num = num /10;
//         }
//         if(data==sum){
//             return true;
//         }else {
//             return false;
//         }
//     }
    
//     public static void main(String[] args) {
//         System.out.println(isArmstrongNumber(121));
//     }
// }


// print perfect number or divisior of number not include itself number only   print perfect number 


// class Main {
    
//      static boolean isPerfectNo(int num){
//          int sum = 1;                // hmne 1 kyu liye 0 kyu nhi because ye khud or itself factor ko add nhi karega apne ko chhod kr baki sare factor ko add kr lega 
          
//          for(int i =2; i*i<=num; i++){    // 1 already sabka factor hota h so isliye 2 se start karenge already 1 le liyya h 
//              if(num%i==0){
//              int firstnum = i;
//              int secondNum = num/i;
//              sum = sum + firstnum + secondNum;
                 
//              }
//          }
//          if(sum==num){
//              return true ;
//          } else {
//              return false;
//          }
//      }
//     public static void main(String[] args) {
//         System.out.println(isPerfectNo(6));
//     }
// }

// That's why the optimized solution does:
// int sum = 1;  // already counted factor 1

// for(int i = 2; i * i <= num; i++) {
//     ...
// }

// We start with sum = 1 and i = 2 to avoid adding the number itself (num) to the sum.

// Rule to remember:

// Perfect Number → sum of proper factors = number.
// Proper factors = all factors except the number itself.



// another best optimized code is 

// class Main {

//     static boolean isPerfectNo(int num) {

//         if (num <= 1) {
//             return false;
//         }

//         int sum = 1;

//         for (int i = 2; i * i <= num; i++) {

//             if (num % i == 0) {

//                 int firstFactor = i;
//                 int secondFactor = num / i;

//                 if (firstFactor == secondFactor) {
//                     sum += firstFactor;   // Perfect square case
//                 } else {
//                     sum += firstFactor + secondFactor;
//                 }
//             }
//         }

//         return sum == num;
//     }

//     public static void main(String[] args) {

//         int num = 28;

//         if (isPerfectNo(num)) {
//             System.out.println(num + " is a Perfect Number");
//         } else {
//             System.out.println(num + " is not a Perfect Number");
//         }
//     }
// }

           //*   PERFECT NUMBER *


// A Perfect Number is a number whose sum of proper divisors is equal to the number itself.

// What is a Divisor (Factor)?

// A divisor is a number that divides another number exactly (remainder = 0).

// For example, divisors of 6 are:

// 1, 2, 3, 6

// Because:

// 6 ÷ 1 = 6
// 6 ÷ 2 = 3
// 6 ÷ 3 = 2
// 6 ÷ 6 = 1
// What are Proper Divisors?

// Proper divisors are all divisors except the number itself.

// For 6:

// Proper Divisors = 1, 2, 3
// Check Perfect Number

// Add the proper divisors:

// 1 + 2 + 3 = 6

// Since the sum equals the original number:

// 6 = 6

// ✅ 6 is a Perfect Number

// Another Example: 28

// Divisors:

// 1, 2, 4, 7, 14, 28

// Proper divisors:

// 1, 2, 4, 7, 14

// Sum:

// 1 + 2 + 4 + 7 + 14 = 28

// ✅ 28 is a Perfect Number

// Example of NOT a Perfect Number

// Take 10:

// Proper divisors:

// 1, 2, 5

// Sum:

// 1 + 2 + 5 = 8

// Since:

// 8 ≠ 10

// ❌ 10 is not a Perfect Number

// Simple Logic to Check
// Find all divisors except the number itself.
// Add them.
// If the sum equals the number → Perfect Number.
// Otherwise → Not Perfect Number.

// First few Perfect Numbers:

// 6
// 28
// 496
// 8128
// 33550336

// For coding interviews, remember:

// Divisor = number that divides exactly.
// Proper divisor = divisor except the number itself.
// Perfect number = sum of proper divisors equals the number.



//PRINT PRIME NUMBER BETWEEN 1 TO 100  

// class Main {
    
//     static boolean isPrime(int num){
//         //int sum = 0;
//         for(int i = 2;i<=Math.sqrt(num);i++){
//             if(num%i==0){
//                 return false;
//             }
            
//         }
//                 return true;
//     }
    
//     static void Prime(int n){
//         for(int num = 2; num<=n;num++){
//            boolean getprime = isPrime(num);
//            if(getprime ==true){
//                System.out.println(num);
//            }
//         }
//     }
    
//     public static void main(String[] args) {
//         Prime(100);
// }


// ANOTHER EXAMPLE TO PRINT PRIME NUMBER 1 TO 100 

// class Main {

//     static boolean isPrime(int n) {

//         if (n <= 1) {
//             return false;
//         }

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         int count = 0;

//         for (int i = 1; i <= 100; i++) {

//             if (isPrime(i)) {
//                 System.out.print(i + " ");
//                 count++;
//             }
//         }

//         System.out.println("\nTotal Prime Numbers = " + count);
//     }
// }


// PRINT FACTORIAL OF NUMBER ;

// Factorial of n is:

// n! = n × (n-1) × (n-2) × ... × 1

// Example:

// 5! = 5 × 4 × 3 × 2 × 1 = 120


// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number : ");
//         int n = sc.nextInt();
//         int fact =  1;
//         for(int i = 1;i<=n;i++){
//             fact *=i;  // fact = fact *i;
//         }
//         System.out.println("factorial is : " + fact);
//     }
// }










}

}
