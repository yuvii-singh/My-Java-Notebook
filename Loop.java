// import java.util.Scanner;

import java.util.Scanner;

public class Loop { 
    public static void main  (String[] args){

//         // System.out.println("Hello world!");
//         // System.out.println("Hello world!");
//         // System.out.println("Hello world!");
//         // System.out.println("Hello world!");
//         // System.out.println("Hello world!");
//         // System.out.println("Hello world!"); // instead of this  you can  used for loop  below line 

//           // syntax of for loop
//           // for (initialization; condition ya expression; increment/decrement/updation){
//           //     // body of loop or do something
//           // }


// // used to print "Namaste jii" 10 times
//     //  for (int i = 1;i<=10;i++){
//     //     System.out.println("Namaste jii ");
//     //  }
// // for (int i = 1;i<=10;i++){
// //         System.out.print(i+" "); // basically " " double quotes is used to print space between the numbers or same line
// //      }





// // used to print numbers from 1 to 100

//     // for (int i = 1 ; i<=100;i++){
//     //      System.out.println(i);
//     // }




//  // used to print numbers in reverse order

//     // for (int i = 100 ; i>=1;i--){
//     //      System.out.println(i);
//     // }




// // used to print multiples of 2 or even numbers or 2 table

// // for (int i = 2 ; i<=100;i=i+2){ // instead of this (int i = 2;i<=100;i+=2)
// //          System.out.println(i);
// //     }




// // instead of above the code you can just write below the code

//         // for (int i = 1; i <= 100; i++) {
//         //     if (i % 2 == 0) {
//         //         System.out.println(i);
//         //     }
//         // }
  
      
        




// // used to print multiples of 3 or 3 table or odd numbers

// // for (int i = 3 ; i<=100;i=i+3){    // instead of this (int i = 2;i<=100;i+=3)
// //          System.out.println(i);
// //     }

// //  instead of above the code you can just write below the code

//         // for (int i = 1; i <= 100; i++) {
//         //     if (i % 2 != 0) {
//         //         System.out.println(i);
//         //     }
//         // }

 

//                         // While loop : basically used when number of iteration is not known    and used to execute a block of statements repeatedly as long as the given condition is true
//     // syntax of while loop
//     //  initialization;
//     //  while (condition){
//     //      // body of loop or do something
//     //      increment/decrement/updation;
//     //  }   
//                                     // syntax of while loop  is 
//                                     // while (condition){
//                                     //     // body of loop or do something
//                                // }  

// // used to print numbers from 0 to 10
// // int i = 0;
// // while (i<=10) {
// //     System.out.println(i);
// //     i +=1;
// // }

// // used to print numbers from 10 to 1
// // int i = 10;
// // while (i>=1) {
// //     System.out.println(i);
// //     i -=1;
// // }

// // used to print even numbers or multiples of 2 or 2 table 1 to 100
// // int i = 1;
// // while (i<=100) {
// //     if (i % 2 == 0) {
// //         System.out.println(i);
// //     }
// //     i +=1;
// // }    

// // used to print even numbers from 1 to 100 without if condition
// // int i = 2;
// // while (i<=100) {
// //         System.out.println(i);   
// //     i +=2;
// // }    

// // used to print odd numbers from 1 to 100
// // int i = 1;
// // while (i<=100) {
// //     if (i % 2 != 0) {
// //         System.out.println(i);
// //     }
// //     i +=1;
// // }    


// // used to print odd numbers from 1 to 100 without if condition
// // int i = 1;
// // while (i<=100) {
// //         System.out.println(i);   
// //     i +=2;
// // }    

// // used to print multiples of 5 from 1 to 100
// // int i = 5;
// // while (i<=100) {
// //         System.out.println(i);   
// //     i +=5;
// // }    


//                                      // Do-While Loop : basically used when number of iteration is not known and used to execute a block of statements repeatedly as long as the given condition is true but it will execute at least once even if the condition is false
//     // syntax of do-while loop
//     //  initialization;
//     //  do {
//     //      // body of loop or do something
//     //      increment/decrement/updation;
//     //  } while (condition);
//                                     // syntax of do-while loop is
//                                     // do {
//                                     //     // body of loop or do something
//                                     // } while (condition); 

// //used to print numbers from 1 to 10
// // int i = 1;
// // do {
// //     System.out.println(i);
// //     i +=1;
// // } while (i<=10); 


// // used to print multiples of 2 or even number or t table from 0 to 100 



// // int i = 2;
// // do {  
// //     System.out.println(i);
// //     i +=2;
// // } while(i<=100);

// // used to print odd numbers from 1 to 100
// // int i = 1;
// // do {  
// //     System.out.println(i);
// //     i +=2;   
// // } while(i<=100);


// // used to print multiples of 5 from 1 to 100
// // int i = 5;
// // do {  
// //     System.out.println(i);
// //     i +=5;   
// // } while(i<=100);


// // used to print numbers from 10 to 1
// // int i = 10;
// // do {  
// //     System.out.println(i);
// //     i -=1;   
// // } while(i>=1);

// // used to print numbers from 1 to 100
// // int i = 1;
// // do {  
// //     System.out.println(i);        
// //     i +=1;
// // } while(i<=100);     

// // there are different between while loop and do-while loop
// // while loop : it will check the condition first then execute the body of loop
// // do-while loop : it will execute the body of loop first then check the condition  

// // example of while loop
// // int i = 1;
// // while (i==0) {  // condition is false so body of loop will not be executed
// //     System.out.println("Hello Jii");
// //     i +=1;
// // }


// // example of do-while loop
// // int i = 1;
// // do {  // body of loop will be executed first then condition is checked
// //     System.out.println("Hello Jii");
// //     i +=1;
// // } while (i==0); // condition is false but body of loop is executed once  


// // let 's solve a problem statement
// // wap to print the sum of first n natural numbers



//  Scanner sc = new Scanner(System.in);
//  System.out.print("enter  a number :");
//  int n = sc.nextInt();
 

// // int sum = 0;
// // for(int i =1;i<=n;i++) {
// //     sum += i;
    
// // }
// // System.out.println(sum);






// // // wap to print the sum of first n natural numbers

// // int sum = 0;
// // for(int i = 1; i <= n; i++) {
// //     sum += i;
// // }
// // System.out.println("The sum of first " + n + " natural numbers is: " + sum);

// // wap to print the table of a number natural
// for (int i = 1;i<=10;i++){
//     int table = i*n;
//     System.out.println("The table of "+ n +" is : " + table);
// }

//   do while me problem yah h ki at least one time run or ek bar chalega hi chalega chahe condition true of false ho 







// loops  ka working style ayesa hota h 
// for (int i = 1;i<=10;i++){               // isme pahle i = 1 dekhega dusra i<=10 condition true h dusre ke bad direct sout ke pass jo h usko ek bar print kr dega but uske bad update me aake 1 + kr dega to i 2 ayese chalta rahega 
    
// System.out.println("data");

// }

// for(;;){ // ayese me ye loop ke ander aap jo bhi print karwaoge ye sab infinite tk chalega 
//     System.out.println("data");
// }
// 1. print counting from 1 to n 
// 2. print counting from n to 1 
// 3. print 10 multiples of n 
// 4. print your name 100 times 
// 5. print all prime numbers form 1 to 100
// 6. print all even numbers from 1 to 100 
// 7. print the sum of all the numbers from 1 to n 
// 8. print all integers in range from 50 to 100, that are perfectly divisible by 7

// 3 ka answer h 
// Here’s a Java program to print the first 10 multiples of n:

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter n: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n * i);
//         }
//     }
// }
// Example Output

// If n = 7:

// 7
// 14
// 21
// 28
// 35
// 42
// 49
// 56
// 63
// 70

// If you want the output in table format like 7 x 1 = 7, I can show that version too.


// 1) Print counting from 1 to n
// for(int i = 1; i <= n; i++) {
//     System.out.println(i);
// }
// 2) Print counting from n to 1
// for(int i = n; i >= 1; i--) {
//     System.out.println(i);
// }
// 3) Print 10 multiples of n
// for(int i = 1; i <= 10; i++) {
//     System.out.println(n * i);
// }
// 4) Print your name 100 times
// for(int i = 1; i <= 100; i++) {
//     System.out.println("Yuvii Singh");
// }


// 5) Print all prime numbers from 1 to 100
// for(int i = 2; i <= 100; i++) {
//     boolean isPrime = true;

//     for(int j = 2; j <= i / 2; j++) {
//         if(i % j == 0) {
//             isPrime = false;
//             break;
//         }
//     }

//     if(isPrime) {
//         System.out.println(i);
//     }
// }



// 6) Print all even numbers from 1 to 100
// for(int i = 2; i <= 100; i += 2) {  // isko aap if condition bhi dekar bana sakte ho like if (i%2==0) sout(i)}
//     System.out.println(i);
// }
// 7) Print the sum of all numbers from 1 to n
// int sum = 0;

// for(int i = 1; i <= n; i++) {
//     sum += i;
// }

// System.out.println(sum);
// 8) Print all integers from 50 to 100 divisible by 7
// for(int i = 50; i <= 100; i++) {
//     if(i % 7 == 0) {
//         System.out.println(i);
//     }
// }

       // solve these problem using while loops 

//        Here are all 8 problems solved using while loops in Java:

// 1) Print counting from 1 to n
// int i = 1;
// while(i <= n) {
//     System.out.println(i);
//     i++;
// }
// 2) Print counting from n to 1
// int i = n;
// while(i >= 1) {
//     System.out.println(i);
//     i--;
// }
// 3) Print 10 multiples of n
// int i = 1;
// while(i <= 10) {
//     System.out.println(n * i);
//     i++;
// }
// 4) Print your name 100 times
// int i = 1;
// while(i <= 100) {
//     System.out.println("Yuvii Singh");
//     i++;
// }
// 5) Print all prime numbers from 1 to 100
// int i = 2;

// while(i <= 100) {
//     int j = 2;
//     boolean isPrime = true;

//     while(j <= i / 2) {
//         if(i % j == 0) {
//             isPrime = false;
//             break;
//         }
//         j++;
//     }

//     if(isPrime) {
//         System.out.println(i);
//     }

//     i++;
// }
// 6) Print all even numbers from 1 to 100
// int i = 2;

// while(i <= 100) {
//     System.out.println(i);
//     i += 2;
// }
// 7) Print the sum of all numbers from 1 to n
// int i = 1;
// int sum = 0;

// while(i <= n) {
//     sum += i;
//     i++;
// }

// System.out.println(sum);

// 8) Print all integers from 50 to 100 divisible by 7
// int i = 50;

// while(i <= 100) {
//     if(i % 7 == 0) {
//         System.out.println(i);
//     }
//     i++;
// }



          // do while loops 

// Here are all 8 problems solved using do-while loops in Java:

// 1) Print counting from 1 to n

// int i = 1;
// do {
//     System.out.println(i);
//     i++;
// } while(i <= n);

// 2) Print counting from n to 1

// int i = n;
// do {
//     System.out.println(i);
//     i--;
// } while(i >= 1);

// 3) Print 10 multiples of n

// int i = 1;
// do {
//     System.out.println(n * i);
//     i++;
// } while(i <= 10);

// 4) Print your name 100 times

// int i = 1;
// do {
//     System.out.println("Yuvii Singh");
//     i++;
// } while(i <= 100);

// 5) Print all prime numbers from 1 to 100

// int i = 2;

// do {
//     int j = 2;
//     boolean isPrime = true;

//     do {
//         if(j > i / 2) break;

//         if(i % j == 0) {
//             isPrime = false;
//             break;
//         }

//         j++;
//     } while(true);

//     if(isPrime) {
//         System.out.println(i);
//     }

//     i++;
// } while(i <= 100);

// 6) Print all even numbers from 1 to 100

// int i = 2;
// do {
//     System.out.println(i);
//     i += 2;
// } while(i <= 100);

// 7) Print the sum of all numbers from 1 to n

// int i = 1;
// int sum = 0;

// do {
//     sum += i;
//     i++;
// } while(i <= n);

// System.out.println(sum);


// 8) Print all integers from 50 to 100 divisible by 7

// int i = 50;

// do {
//     if(i % 7 == 0) {
//         System.out.println(i);
//     }
//     i++;
// } while(i <= 100);

// int i;
// for( i = 1;i<=10;i++){
//     System.out.println(i);
// }

// System.out.println(i);  //  ye 11 print ho gya kyuki jav i 11 hoga to loop se bahar aa jayega so last i ka value 11 h so 11 print ho jayega  


// print 17 table 


// ye bas 10 bar hi chalega 

// for(int i = 1 ;i<=170;i+17){
//     System.out.println(i);
// }

// for(int i = 1 ;i<=170;i++){
// if(n%17==0){
//     System.out.println(i);     // aur bhi bahut tarike h 
//}

// print even   number from 1 to 100 : 

  // ye loop bas 50 times hi chalega       

// for(int i = 2 ;i<=100;i+2){
//     System.out.println(i);

// ye loop niche wala 100 bar chalegga 

// //for(int i = 1 ;i<=n;i+2){
// if(i%2==0){
// //     System.out.println(i);
// }


//DISPLAY THIS AP 2,5,8 ....   UPTO  'NTH'  TERMS .           FORMULA : an = a+(n-1)d


// loop ko samjhe ke liye ek chiz hamesha dhyan dena  kaha se suru hoga and end statement ya condion kaha tak chalega aur kitna increment hoga 

// upper 2 se suru hoga to i =2 lena fir 3 -3 kar ke increment hoga to i=i+3 kar dega and then condtion likhna kaha end hoga loop 

// formula se : an = a +(n-1)d     an = 2+(n-1)3     then an = 2 + 3n-3       then an = 3n-1 so     i <= 3n-1 
// for(int i =2 ;i<=(3*n-1);i=i+3){
        //   System.out.println(i);

// ye bhi sahi h but aap jitne bar input doge utni bar loop run karega 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         System.out.print("Enter the number : ");
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int a =2,d=3;
       
//        for(int i =1 ;i<=n;i++){            // isme loop bas bahut kam time run karega 
           
//           System.out.println(a);
//          a+=d;
       
//        }
//        } 
        
//     }

// print the series  99,95,91,87.... upto all terms which are positive 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         System.out.print("Enter the number is : ");
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int a =99,d = 4;
//         for(int i = 1;i<=10;i++){                   isme without a and d ko alag separate likhne se achha i ko 99 se suru karke 4 ko minus karte hue print karwa sakte h
//             System.out.println(a);
//             a -=d;
//         }
//     }
// }

// class Main {
//     public static void main(String[] args) {
       
//         for(int i = 99;i>0;i-=4){                // dono tarika shi h jo best lage wah likh dena 
//             System.out.println(i);
           
//         }
//     }


// Display this  GP (Geometric Progression)  1,2,4,8,16 ..... upto 'N' terms  formula : an = a * r^(n-1)  where a = 1 , r = 2   where r = common ratio and a = first term  r = 2   why 2 because 2/1 = 2 , 4/2 = 2 , 8/4 = 2 , 16/8 = 2   so r = 2

// jab bhi question me  N terms diye ho to aap isko a , d wale method se hi solve karoge 


// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         System.out.print("Enter the number is : ");
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         int a=1,r=2;
//         for(int i = 1;i<=n;i++){
//             System.out.println(a);
//             a*=r;
           
//         }
//     }
// }

// take  'N' as input from user and print the following sequences..
// 1 ,n, 2 ,n-1, 3 ,n-2, 4 ,n-3, 5 ,n-4, 6 ,n-5, 7 ,n-6,  example : n = 10 then output will be 1,10,2,9,3,8,4,7,5,6

// my code is below :

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         System.out.print("Enter the number is : ");
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         //int a=1,r=2;
//         int data = n+1;
//         for(int i = 1;i<=n;i++){
          
//             System.out.println(i);
//              data -=1;
//             System.out.println(data);
            
           
//         }
//     }
// }


// dusra chat gpt ke hawe 

// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         int reverse = n;

//         for (int i = 1; i <= n; i++) {
//             System.out.println(i);
//             System.out.println(reverse);
//             reverse--;
//         }

//         sc.close();
//     }
// }

// Print all alphabets with their corresponding ASCII values. (A=65, B=66, C=67, D=68, E=69, F=70, G=71, H=72, I=73, J=74, K=75, L=76, M=77, N=78, O=79, P=80, Q=81, R=82, S=83, T=84, U=85, V=86, W=87, X=88, Y=89, Z=90)




// class Main {
//     public static void main(String[] args) {
       
        
//     //   for(char ch = 'A';ch<='Z';ch++){
          
//     //         System.out.println(ch +" "+(int)ch);


// instead of above the code you can just write below the code
// for(int i =65;i<=90;i++){
//        System.out.println((char)i +" "+i);




             
//              for(char ch = 'a';ch<='z';ch++){
          
//             System.out.println(ch +" "+(int)ch);
            
        
//instead of above the code you can just write below the code
// for(int i =97;i<=122;i++){
//        System.out.println((char)i +" "+i);




//         }
//     }
}

// iska practice PrimeNumber.java me h  jo ki aapne upar diya h 































}
}   
 
 

