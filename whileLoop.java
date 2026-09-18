import java.util.Scanner;

public class whileLoop {
    public static void main(String [] args){

    // while loop → When you don't know how many times the loop will run
    
    // for loop → When you know the number of iterations
    
    //do-while Loop  : A do-while loop always executes at least once.
    
    //Infinite Loops

// Server programs often run forever until stopped.

// while (true) {
//     // Keep accepting requests
// }

// Using for:

// for (;;) {
//     // Also an infinite loop
// }

// Both work, but most Java programmers prefer while(true) because it's more readable.

// example of infinite loop using while loop


//    while (true) {
//     System.out.println("Hello jii");


 // example of infinite loop using for loop    

 // for (;;){
//     System.out.println("Hello World");
//}
    
    
    // ek chiz yad rakhana hamesah jab ko digits find karna ho to while loop hamehsa used hota h jaise prime number, reverse,digits ,last digits armstrong,palindrom ,factorial sab ke liye while loop used hota h 
    
    // mostly  while (i !=0) yahi condition jyada tar likhte h 

    
//     Reading digits of a number

// Suppose:

// int n = 123456;

// We write:

// while (n != 0) {
//     System.out.println(n % 10);
//     n /= 10;
// }

// Can we write this using a for loop?

// Yes:

// for (; n != 0; ) {
//     System.out.println(n % 10);
//     n /= 10;
// }

// It works, but it looks strange because a for loop is usually used when you have initialization, condition, and increment.

    // for(int i = 1; i<= 10;i++) {
    //     System.out.println(i);

    // }
   
    // isi ko aap while loop se bhi solve kar saktte h like this 

    // int i = 1;
    // while(i<=12){
    //     System.out.println(i);  // same hi hai for loop ki tarah
    //     i++;
    // }


// aap isko for loop se bhi ayese likh sakte ho like this 
// int i = 1;
// for(;i<=14;)
// {
//     System.out.println(i);
//     i++;
// }

// isi question ko do - while se solve karenge 

// ye at least once time run karta h kisi bhi haal me ek bar run karege hi 

// int i = 1;
//    do {
//         System.out.println(i);  
//         i++;
//     }while(i<12);

// example 

// for(int i = 11; i<= 10;i++) {   // isme kuchh return nhi hoga 
//         System.out.println(i);

//     }


//  int i = 15;
//     while(i<=10){
//         System.out.println(i);  //  ye bhi kuchh return nhi karega becau initialization hi jyda h condion se so loop bahar ho jayega kuchh return nhi karega but 
//         i++;
//     }


// int i = 15;
//    do {
//         System.out.println(i);  //  ye ek bar 15 return karega bhale condion work na kare so its return it  
//         i++;
//     } while(i<=10);


// while(1<2){
//     System.out.println("Nunam");  // ye infinite time chalega becoz 1 hamesha 2 se chhota h so its called infinite loops
// }

// for(int i =1 ;i<=10;i--){  //  ye bhi infinite time chalega 
//     System.out.println(i);
// }

// Quest : counts the digits  of a number 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int n = sc.nextInt();
//         int count =0;
//         if(n==0)   // agar input 0 h to iska count 1 hoga agar isko nhi likhte  to  0 input dene par 0 return karta 
//         n = 1;
//         while(n!=0){
            
//             n /= 10;
//              count ++;
//         }
//         System.out.print(count);  // isko outside isliye likha kyuki agar ander likhta to bar bar ye har bar iteration ko print karta  
// }}


// write a program to print the sum of digits of a number
// import javimport java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int n = sc.nextInt();
//         int sum =0;
       
//         while(n!=0){
//             int digits = n %10;
//              sum = sum + digits;
//             n/=10;
        
//            }
        
//         System.out.print(sum);
// }}

//Quest : write a program to print the reverse of a number
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int n = sc.nextInt();
//         int rev =0;
       
//         while(n!=0){
//             int digits = n %10;
//            rev =rev *10+ digits ;
//             n/=10;
        
//            }
        
//         System.out.print(rev);
// }}

// Quest : write a program to print sum of number and reverse 
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the digits : ");
//         int n = sc.nextInt();
//         int rev =0;
//         int sum =0;
       
//         while(n!=0){
//             int digits = n %10;
//            rev =rev *10+ digits ;
//            sum +=digits;
//             n/=10;
        
//            }
        
//         System.out.println(rev);
//          System.out.print(sum);
// }}


//Quest  write a progeram to print a raise to power b . 
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the a digits : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the b digits : ");
//          int b = sc.nextInt();
//         int pow =1;
//         for(int i = 1;i<=b;i++){
//             pow *=a;
//         }
        
//         System.out.println(a+" raised to be power of  "+ b+ " is = "+ pow);
//     }}













































// int n = Integer.MAX_VALUE;
//  int y = Integer.MIN_VALUE;
// System.out.println(n);  // ye max value print karega 2147483647  integer ka maximum value itna hi hota h isase jyada nhi 

// System.out.println(y);  // ye min value print karega -2147483648  integer ka minimum value itna hi hota h isase kam nhi
// long x = Long.MAX_VALUE;
// long z = Long.MIN_VALUE;
// System.out.println(x);  // ye max value print karega 9223372036854775807  long ka maximum value itna hi hota h isase jyada nhi
// System.out.println(z);  // ye min value print karega -9223372036854775808  long ka minimum value itna hi hota h isase kam nhi

// float a = Float.MAX_VALUE;
// float b = Float.MIN_VALUE;
// System.out.println(a);  // ye max value print karega 3.4028235E38  float ka maximum value itna hi hota h isase jyada nhi
// System.out.println(b);  // ye min value print karega 1.4E-45  float ka minimum value itna hi hota h isase kam nhi

// double c = Double.MAX_VALUE;
// double d = Double.MIN_VALUE;
// System.out.println(c);  // ye max value print karega 1.7976931348623157E308  double ka maximum value itna hi hota h isase jyada nhi
// System.out.println(d);  // ye min value print karega 4.9E-324  double ka minimum value itna hi hota h isase kam nhi

// char e = Character.MAX_VALUE;
// char f = Character.MIN_VALUE;
// System.out.println((int)e);  // ye max value print karega 65535  char ka maximum value itna hi hota h isase jyada nhi
// System.out.println((int)f);  // ye min value print karega 0  char ka minimum value itna hi hota h isase kam nhi

    




























    
    }  
}
