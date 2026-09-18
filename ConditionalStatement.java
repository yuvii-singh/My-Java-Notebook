import java.util.Scanner; // scanner ke jagah pr * nhi le sakte ho

public class ConditionalStatement {
    public static void main (String[] args) {

    // System.out.println("Hello World!");
    
    // Scanner sc = new Scanner (System.in);
    // System.out.print("Enter you age :");
    // int age = sc.nextInt ();
    
    // if (age >= 18 ){
    //     System.out.println("YOU are eligible for vote"); }
    // else { 
    //        System.out.println("You are not eligible for vote");
    // }
      
    // write a program to print  odd even program

    // Scanner sc = new Scanner (System.in);
    // System.out.print("Enter a number :");
    // int number = sc.nextInt ();

    // if (number % 2 == 0) {
    //     System.out.println("The number is even.");
    // } else {
    //     System.out.println("The number is odd.");
    // }

    // Scanner sc = new Scanner (System.in);
    // System.out.print("Enter a first number :");
    // int a = sc.nextInt ();
    // System.out.print("Enter b number :");
    // int b = sc.nextInt ();
    // System.out.print("Enter c number :");
    // int c = sc.nextInt ();
    

    // if (a ==b || b ==c){
    //     System.out.println("a is equal to b and c");
    // }
    // else if  (a>b || b>c){
    //    System.out.println("a is greater than b and c ");
        
    // } else {
    //     System.out.println("a is less than b and c");  //instead of this you can just write nested if like this below line check
    // }

    // if (a == b && b == c) {
    //      System.out.println("a is equal to b and c");

    // } else {
    //     if (a>b && b >c){
    //         System.out.println("a is greater then b and c");
    //     }
    //     else {
    //         if(a<b && b<c){
    //             System.out.println("a is less than b and c");
    //         }
    //     }
    // }

     // there are three button red , green , purple
     // when user press red button print "Hello"
     // when user press green button print "namaste"
     // when user press purple button print "bonjour"
// wap to print when user print different button then different message should be printed

    // Scanner sc = new Scanner (System.in);
    // System.out.print("Enter the color of button (red/green/purple): ");
    // String button = sc.nextLine();

    // if (button.equals("red")) {
    //     System.out.println("Hello");
    // } else if (button.equals("green")) {
    //     System.out.println("Namaste");
    // } else if (button.equals("purple")) {
    //     System.out.println("Bonjour");
    // } else {
    //     System.out.println("Invalid button color");
    // }
 // solve same using switch case
    // Scanner sc = new Scanner (System.in);
    // System.out.print("Enter the color of button (red/green/purple): ");
    // String button = sc.nextLine();



    // switch syntax

    // switch (expression or numbers or variable you can write anything init) {
    //     case value1:
    //         // code block
    //         break;
    //     case value2: 
    //         // code block
    //         break;
    //     ...
    //     default:
    //         // code block
    //         break;
    // }
                                                             // NOTE : agar a%b ho aur a b se chhota ho to answer a hi aata h eg. 1%2 = 1 because 1 chhota h 2 se 
    //    switch (button) {                                                                         
    //     case "red":
    //         System.out.println("Hello");
    //         break;
    //     case "green":
    //         System.out.println("Namaste");
    //         break;  
    //     case "purple":
    //         System.out.println("Bonjour");
    //         break;
    //     default:
    //         System.out.println("Invalid button color");
    //         break;
    // }



    // Scanner sc = new Scanner (System.in);
    // System.out.print("enter the traffic light :");
    // String Traffic  = sc.nextLine();
    // switch(Traffic){

    //     case "red":
    //     System.out.println("you can stop :");
    //     break;

    //     case "yellow":
    //     System.out.println("look at the road");
    //     break;

    //     case "Green":
    //     System.out.println("you can go ");
    //     break;

    //     default:
    //     System.out.println("invalid input");
    //     break;



//     }
// if me agar true ho to  if hi chalega and program terminated ho jayega  but  agar false ho to else chalega 

  // ternary operator : it is a short hand of if else statement 

    // syntax of ternary operator
    // variable = (condition) ? expression1 : expression2;

    // Scanner sc = new Scanner (System.in);
    // System.out.print("Enter a number :");
    // int number = sc.nextInt ();

    // String result = (number % 2 == 0) ? "Even" : "Odd";
    // System.out.println("The number is " + result);
    
    // Scanner sc = new Scanner (System.in);
    // System.out.println("Enter your age :");
    // int age = sc.nextInt();
    // String  driving = (age >=18) ? "you are eligible for driving" : "you are not  eligible for driving";  // agar aap string likhoge to error aayega because ternary operator me aapko ek hi type ka data dena hota hai  to aapko string me hi likhna hoga
    // System.out.println(driving);

    // boolean data = (age >15) ? true : false ;  // isme ek hi data ko likhna padta h 
    // System.out.println(data);

//    int  a = 10;
//     int  data = (a>8) ? 1:0;
//     System.out.println(data);

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter your age : ");
    // int age = sc.nextInt();
    // System.out.print("You know driving well : ");
    // boolean driving = sc.nextBoolean();

    
    // nested if else statement

    // if (age >= 18){
    //     if (driving){
    //         System.out.println("you are eligible for licence ");
    //     } else {
    //         System.out.println("pahle bada ho ja bete ");
    //     }
    // } else {
    //     System.out.println("abe bete bas kr abhi bacha h tu ");
    // }

  // isi ko logical operator se solve karegne like pahle and ka && used kr ke 

  //   if (age >=18 && driving){
//     System.out.println("you are eligible for driving licence ");
//   }
//   else {
//      System.out.println("not eligible");
// }
  
   // ab OR operator ka used karenge 
//    if (age >=18 || driving){
//     System.out.println("you are eligible for driving licence ");
//   }
//   else {
//      System.out.println("not eligible");
// }
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your case :");
   // int year = sc.nextInt();
    
    
    // switch case ka used 
    
    
    // switch (year) {  // agar aap break ka used nhi krte ho then aapko jo case doge like 10 to October and then November and December print hoga isliye break mandatory h  
    //     case 1: 
    //     System.out.println("january");
    //     break;
    //     case 2:
    //     System.out.println("february");
    //     break;
    //     case 3:
    //     System.out.println("March");
    //     break;
    //     case 4:
    //     System.out.println("April");
    //     break;
    //     case 5:
    //     System.out.println("May");
    //     break;
    //     case 6:
    //     System.out.println("June");
    //     break;
    //     case 7:
    //     System.out.println("JUly");
    //     break;

    //     case 8:
    //     System.out.println("August");
    //     break;
    //     case 9:
    //     System.out.println("Semptember");
    //     break;
    //     case 10:
    //     System.out.println("October");

    //     break;
    //     case 11:
    //     System.out.println("November");
    //     break;
    //     case 12:
    //     System.out.println("December");
    //     break;
    //     default:
    //         System.out.println("january hi lelo ");


   int day = sc.nextInt();
   switch (day) {
   case 1:
    System.out.println("Sunday");
    break;
    case 2:
        System.out.println("Monday");
        break;
        
    case 3:
        System.out.println("Tuesday");
        break;
    case 4 :
        System.out.println("Wednesday");
        break;
    case 5:
        System.out.println("Thursday");
        break;
    case 6:
        System.out.println("Friday");
        break;
    case 7 :
        System.out.println("Saturday");
        break;

    default:
        System.out.println("Sunday hi lelo ");

}

  sc.close();

 // print absolute values :   meaning of absolute values is if number is positive than print it if negative than convert into positive and than print positive this is called absolute values 


//   if(n>=0){                           
//         System.out.println(n);
//        }
//        else  {
//                System.out.println(-n);    eg. -5  it means -n = -(-5)  so it might be +5 answer is +5 
//            }


      // instead of this you can used a single line code 


// if(n < 0)  agar n ,0 se chhota h  like -5 to aap curely braces nhi diye ho isliye niche ka condition check karega than print karega 
//     n = -n;  aur agar n ,0 se bada h to ye line ko skipped kar dega than uske bad wale line ko print karega because aap curely braces nhi diye ho 
 
// System.out.println(n);


// example

//     if(5 < 0)
//     n = -n;   // skipped

// System.out.println(n);

// if(n < 0) { isme agar n,0 se chhota h condtion follow kar rha h niche aur curely braces ke ander jo h usko execute karega but 
//     n = -n;     agar n,0 se bada h to curely braces ke ander entire code ko skipped karega becaus condition false h  
//  System.out.println(n);

//}

//  System.out.println(n); iss line ko curely braces ke bahar likh doge to absoulte value return karege 



// Quest : take a input as real number and print either its integer or not ;

// solve this problem using double because its give values decimal values 

// double n = sc.nextDouble();
//           int x = (int)n; // why used it typecasting What does (int)n do? niche dekho 

// It removes the decimal part.

// Examples:                                                 if(n-x>0)          iske jagah pr if(n-x==0) ye negative sign ke liye bhi used ho jayega 

// (int)5.7  = 5
// (int)10.0 = 10
// (int)3.99 = 3
// n = 5.7
// x = (int)5.7 = 5

//       (n-x>0)   // n - x = 5.7 - 5
      //= 0.7


//if(n-x>0)           // ye shi h but its not for -sign if n is -5.5 so  x =(int)n   it means x = -5.5 convert integer = -5   x-n>0 it means -5.5-(-5)>0   -0.5 so its not integer

//    System.out.println("NOT an integer");
//       else System.out.println("this is an integer ");


// if(n == (int)n)    // ye best approach h  -5.5 == -5 than ye return karega otherwise not an integer so used this 
//     System.out.println("this is an integer");
// else
//     System.out.println("NOT an integer");

//if(n-(int)n==0)  // ye bhi execute hoga so iska bhi used kr sakte ho 

// if cost price and selling price of an item is input through the keyword ,write a program to determine wheter the seller has made profit or incurred loss or no profit no loss. also determine how much profit he made or loss he incurred.

//  import java.util.Scanner;
// class Main {
   


//      public static void main(String[] args) {
//     //     System.out.println("enter the cost price :");
//     //     Scanner sc = new Scanner(System.in);
//     //   int  cp = sc.nextInt();
//     //   System.out.println("enter the Selling price :");
//     //   int  sp = sc.nextInt();
//     //   int data = sp-cp;
//     //   double profit = (data*100.0)/cp;
//     //   int loss = cp -sp;
//     //   double lossess = (loss/100.0)/cp;
//     //   if(sp>cp) {
//     //       System.out.println("YOU have made profit ");
//     //       System.out.println("YOUR profit is : "+data +" "+ "Your profit percentage is " + profit +"%"); }
//     //   else if(cp ==sp){
//     //       System.out.println("you have made neither profit or neither loss");
//     //   }
       
//     //   else {System.out.println("YOU have made lost ");
//     //   System.out.println("YOU lost is  " +data +"Your loss is :"+lossess +"%");}
          
    // UPPER WALA MENE KHUD SE KIYA H NICHE WALA CHAT GPT 
       
   

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Cost Price:");
//         int cp = sc.nextInt();

//         System.out.println("Enter the Selling Price:");
//         int sp = sc.nextInt();

//         if (sp > cp) {
//             int profit = sp - cp;
//             double profitPercentage = (profit * 100.0) / cp;

//             System.out.println("You have made a profit.");
//             System.out.println("Profit = " + profit);
//             System.out.println("Profit Percentage = " + profitPercentage + "%");
//         }
//         else if (sp == cp) {
//             System.out.println("You have made neither profit nor loss.");
//         }
//         else {
//             int loss = cp - sp;
//             double lossPercentage = (loss * 100.0) / cp;

//             System.out.println("You have made a loss.");
//             System.out.println("Loss = " + loss);
//             System.out.println("Loss Percentage = " + lossPercentage + "%");
//         }
//     }
// }
     
sc.close();   // best way h code ko execute karana ka  


// koi bhi number ko 10 se % karte ho last wala ek digit provide karta h but aap usko 100 se % karte ho then its give last two digits again if you modulus % 1000 % then its give last 3 digits  then if you want to find 4 digits last number then definetely you get last either number is 4 digits or not 

// else if ko also called else if ladder     is ladder me aapko else likhne ki zarorat bhi nhi h 

// public static void main(String[] args) {
//     int n  = 13;
//     if(n%3==0 && n%5==0){ System.out.println("ITs divisible ");} rather than this you can write like this if(n%3==0 && n%5!=0) its only divisible by 3 not 5
//     else if (n%5==0){
//     System.out.println("IT  divisible by 5");
//     }
//      else if (n%3==0){ if(n%3!=0 && n%5==0) its divisible by 5 not 3 
//     System.out.println("IT  divisible by 3");
//     }
//      else {
//     System.out.println("IT not divisible ");
//     }
// }}

// HOMEWork question : 

// given a point(x,y)  write a program to find out if it  lies in the 1st Quadrant , 2nd Quadrant,3rd Quadrant,4th Quadrant, on the x-axis ,y - axis or at the origin .

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter x axis number : ");
//         int x = sc.nextInt();
//          System.out.print("Enter y axis number : ");
//         int y = sc.nextInt();
//         if(x>0 && y>0){
//             System.out.println("first Quadrant");
//         }
//         else if(x<0 && y>0){
//             System.out.println("second Quadrant");
//         }
//         else if(x<0 && y<0){
//             System.out.println("Third Quadrant");
//         }else if(x>0 && y<0){
//             System.out.println("Forth  Quadrant");
//         }else if(x==0 && y>0){
//             System.out.println("ON y axis");
//         }else if(x>0 && y==0){
//             System.out.println("ON x axis ");
//         }else if(x==0 && y==0){
//             System.out.println("on Origin ");
//         }
//     }
// }





// take  length and breadth of rectangle  as input and write a program to find whether the area of rectangel is greater than its perimeter . 


// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//      System.out.print("Enter the length : ");
//      int l = sc.nextInt();
//      System.out.print("Enter the width : ");
//      int w = sc.nextInt();
//      int Area = l*w;
//      int Perimeter = 2*(l+w);
//      System.out.println("Area of rectangle is  : " + Area);
//      System.out.print("Permeter of rectangle is  : "+ Perimeter);
//     }
// }



// take 3 positive integers input and print the greatest of them .   also using if else ladder or only if condtion 

// nested if else 

//     import java.util.Scanner;   isko aage chal ke modify karna h mujhe isko edit karna h  acche se 
// class Main {
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter the first number  : ");
//      int a = sc.nextInt();
//      System.out.print("Enter the second number  : ");
//      int b = sc.nextInt();
//      System.out.print("Enter the third number  : ");
//      int c = sc.nextInt();
//      if (a>b && a>c){
//          System.out.println("a is greater than both ");
//      }if (b>a && b>c){
//          System.out.println("b is greater than both ");
//      }if (c>a && c>b){
//          System.out.println("c is greater than both ");
//      }
//     }
// }

















}
}