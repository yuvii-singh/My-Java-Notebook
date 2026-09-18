import java.util.Scanner;

public class patternPrint {
    public static void main(String[] args) {
    
        // first of all what is the meaning of pattern printing : pattern printing means printing the pattern in the console like triangle, square, rectangle, diamond, etc.
        // so here we will print the pattern of triangle, square, rectangle, diamond, etc 

// Quest 1. print the Star rectangle pattern 
      
        // int n = 2; // number of rows 
        // int m = 5    //  and columns
        // for(int i = 1; i <= n; i++){ // outer loop for rows
        //     for(int j = 1; j <= m; j++){ // inner loop for columns
        //         System.out.print("* "); // print star
        //     }
        //     System.out.println(); // new line after each row
        // }

// or aap input lekar bhi print kar sakte ho like this 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the rows number  : ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the column numer  : ");
        //  int column = sc.nextInt();
        //  for(int i = 1;i<=rows;i++){
        //      for(int j = 1;j<=column;j++){
        //         System.out.print("* ");  
        //      } System.out.println();
        //  }
//     }}



//Quest 2. print the Star square pattern 
       
        // int n = 8; // number of rows  and columns
        // for(int i = 1; i <= n; i++){ // outer loop for rows
        //     for(int j = 1; j <= n; j++){ // inner loop for columns
        //         System.out.print("* "); // print star
        //     }
        //     System.out.println(); // new line after each row
        // }

//isko bhi input lekar print kar sakte ho jaise ki upar diya h

// print the number square pattern 
        // int n = 5; // number of rows  and columns
        // for(int i = 1; i <= n; i++){ // outer loop for rows
        //     for(int j = 1; j <= n; j++){ // inner loop for columns
        //         System.out.print(j + " "); // print number
        //     }
        //     System.out.println(); // new line after each row
        // }

// print the number rectangle pattern 
        // int n = 5; // number of rows 
        // int m = 3; // number of columns
        // for(int i = 1; i <= n; i++){ // outer loop for rows
        //     for(int j = 1; j <= m; j++){ // inner loop for columns
        //         System.out.print(j + " "); // print number
        //     }
        //     System.out.println(); // new line after each row
        // }


// Quest 3 print  upper alphabets pattern if you give input 2 AB AND THEN AB aaye if you give input 3 ABC then ABC print hoga

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the rows number  : ");
//         int rows = sc.nextInt();
//         // System.out.print("Enter the column numer  : ");
//         //  int column = sc.nextInt();
//          for(int i = 1;i<=rows;i++){
//              for(int j = 1;j<=rows;j++){
//                 System.out.print((char)(j+64)+" ");  
//                 if(rows>26) break;
//              } System.out.println();
        
        
//          }
//     }}


// same like small alphabets pattern if you give input 2 ab AND THEN ab aaye if you give input 3 abc then abc print hoga
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the rows number  : ");
        // int rows = sc.nextInt();
        // // System.out.print("Enter the column numer  : ");
        // //  int column = sc.nextInt();
        //  for(int i = 1;i<=rows;i++){
        //      for(int j = 1;j<=rows;j++){
        //         System.out.print((char)(j+96)+" ");  
        //         if(rows>26) break;
        //      } System.out.println();
        
        
        //  }
//     }}


// write a program to print if you give input 4 so its small aaaaaa then BBBBBB then cccccc then DDDDD like this 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number is :  ");
//         int n = sc.nextInt();
//         char ch ;
//         for(int i =1;i<=n;i++){
//             if (i%2==1){
//                  ch = (char)(i+96);
//             } else{  ch = (char)(i+64);}
//             for(int j = 1;j<=n;j++){
//               System.out.print(ch+" ");
               
//              // System.out.print((char)(i+65)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Quest  print pattern like this small aaaa then AAAAA then bbbb then BBBB then cccc then CCCC like this



// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number is :  ");
//         int n = sc.nextInt();
//         for(int i =1;i<=n;i++){
//             for(int j = 1;j<=n;j++){
//               System.out.print((char)(i+96)+" ");
//               }
//             System.out.println();
            
//              for(int j = 1;j<=n;j++){
//               System.out.print((char)(i+64)+" ");
//               }
//             System.out.println();
            
            
            
//         }
//     }
// }

 // so agar rectange aaye to aapko bas outer loop ke liye rows aur inner loop ke liye columns lena hoga aur agar square aaye to aapko bas outer loop ke liye rows lena hoga aur inner loop ke liye bhi rows lena hoga.
// for example i 1 to rows  and j 1 to columns for rectangle and
//  i 1 to rows and j 1 to rows for square.


// Quest 4. print the triangle pattern 
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }  
//             System.out.println();
            
//         }
      
//     }
//}

// print the triangle pattern like this 1 then 12 then 123 then 1234 then 12345 like this
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j + " ");
//             }  
//             System.out.println();    
    //}

// print the triangle pattern like this 1 then 22 then 333 then 4444 then 55555 like this

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i + " ");
//             }  
//             System.out.println();    
//         }    


// print the capital alphabets triangle pattern like this A then AB then ABC then ABCD then ABCDE like this
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(j+64) +" ");
//             }  
//             System.out.println();
            
//         }
      
//     }
// }


// print the capital alphabets triangle pattern like this A then BB then CCC then DDDD then EEEEE like this
// import java.util.Scanner;
// class Main { 
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(i+64) +" ");
//             }  
//             System.out.println();
//         }

// print the small alphabets triangle pattern like this a then ab then abc then abcd then abcde like this
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(j+96) +" ");
//             }  
//             System.out.println();
//         }    

// print the small alphabets triangle pattern like this a then bb then ccc then dddd then eeeee like this
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)(i+96) +" ");
//             }  
//             System.out.println();
//         }

// print the triangle pattern like this 1 then 23 then 456 then 78910 then 1112131415 like this
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number :  ");
        // int n = sc.nextInt();
        // int count = 1;
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(count + " ");
        //         count++;
        //     }  
        //     System.out.println();
        // }    

// print the alphanumeric triangle pattern like this 1 then A B then 1 2 3 then A B C D then 1 2 3 4 5 like this
        
// Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number :  ");
        // int n = sc.nextInt();
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if(i%2==1){
        //             System.out.print(j + " ");
        //         } else{
        //             System.out.print((char)(j+64) +" ");
        //           }
                
        //     }  
        //     System.out.println();
            
        // }


// Print the reverse traingle like this ***** then **** then *** then ** then * like this  also called horizontally flipped triangle pattern
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
        
//         for(int i=n; i>=1;i--){
//             for(int j=1;j<=i;j++){
//                System.out.print("* ");   // 
                
//             }  
//             System.out.println();
            
//         }
      
//     }
// }

// another way to print the reverse traingle like this ***** then **** then *** then ** then * like this  also called horizontally flipped triangle pattern

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
        
//         for(int i=1; i<=n;i++){
//             for(int j=n;j>=i;j--){
//                System.out.print("* ");  // star ke liye h but agar aap j print karoge to number print hoga like 5 4 3 2 1 then 5 4 3 2 then 5 4 3 then 5 4 then 5 like this aur hame 1 2 
                
//             }  
//             System.out.println();
            
//         }
      
//     }
// }

// best way to print the reverse traingle like this ***** then **** then *** then ** then * like this  also called horizontally flipped triangle pattern

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {      // sabse best way h ye print karne ka
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
        
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                System.out.print(i+" "); 
                
//             }  
//             System.out.println();
            
//         }
      
//     }
// }

// aap isko ayese bhi print kar sakte h 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {          // ye bhi best way h ye print karne ka agar aapko formula banane nhi aa rha h to 
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         int a =n;
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=a;j++){
//                System.out.print(j+" "); 
                
//             }  a--;
//             System.out.println();
            
//         }
      
//     }
// }


// print the reverse traingle like this 1 2 3 4 5 then 1 2 3 4 then 1 2 3 then 1 2 then 1 like this also called horizontally flipped triangle pattern
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                System.out.print(j+" ");
//          }
//                System.out.println();   }

// print the reverse traingle like this 1 1 1 1 1 then 2 2 2 2 then 3 3 3 then 4 4 then 5 like this also called horizontally flipped triangle pattern
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                System.out.print(i+" ");
//          }
//                System.out.println();   }

// print the reverse traingle like this A A A A A then B B B B then C C C then D D then E like this also called horizontally flipped triangle pattern
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(i+64)+" ");
//          }
//                System.out.println(); }


// print  the reverse traingle like this A B C D E then A B C D then A B C then A B then A like this also called horizontally flipped triangle pattern
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(j+64)+" ");
//          }
//                System.out.println(); }


// print  the reverse traingle like this a b c d e then a b c d then a b c then a b then a like this also called horizontally flipped triangle pattern
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(j+96)+" ");
//          }
//                System.out.println(); }       

// print  the reverse traingle like this a a a a a then b b b b then c c c then d d then e like this also called horizontally flipped triangle pattern
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n+1-i;j++){
//                System.out.print((char)(i+96)+" ");
//          }
//                System.out.println(); }


// print Hollow rectange pattern 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n number :  ");
//         int n = sc.nextInt();
//         System.out.print("Enter the m  number :  ");
//         int m = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1 || i==n || j==1 || j==m){
//                System.out.print("* "); 
//                 }
//             else {
//                 System.out.print("  ");
//             } 
//            }
//          System.out.println();   
//         }
      
//     }
// }


// print star plus pattern 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n number :  ");
//         int n = sc.nextInt();
//         int mid =n/2+1;
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==mid || j==mid){
//                System.out.print("* "); 
//                 }
//             else {
//                 System.out.print("  ");
//             } 
//            }
//          System.out.println();   
//         }
      
//     }
// }


// print star cross pattern 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n number :  ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==j || i+j==n+1){
//                System.out.print("* "); 
//                 }
//             else {
//                 System.out.print("  ");
//             } 
//            }
//          System.out.println();   
//         }
      
//     }
// }

// print floyd's   triangle pattern                      most important 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n number :  ");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
               
//                System.out.print(a+ " "); 
//                 a++;
//            } 
//          System.out.println();   
//         }
      
//     }
// }


// pritn binary triangle   pattern 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n number :  ");
//         int n = sc.nextInt();
        
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=i;j++){
//                if((i+j)%2==0)
                 
//                System.out.print(1+ " "); 
//                else 
//                System.out.print(0+ " "); 
               
//            } 
//          System.out.println();   
//         }
      
//     }
// }

// print odd number triangle 

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the n number :  ");
//         int n = sc.nextInt();
//         int a= 1;                         // inner loop ke ander initialize karoge to hamesha 1 ko print karege otherwise bahar me nhi karega 
//         for(int i=1; i<=n;i++){
             
//             for(int j=1;j<=i;j++){
                 
//                System.out.print(a+ " "); 
//                a +=2;
//            } 
//          System.out.println();   
//         }
      
//     }
// }


// ek aur tarika se aap isko likh sakte h like this 


       // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the n number :  ");
        // int n = sc.nextInt();
        
        // for(int i=1; i<=n;i++){
             
        //     for(int j=1;j<=i;j++){
                 
        //        System.out.print(2*j-1 + " ");    // ye mathmatics formula h yahi bhi same dega output 
              
        //    } 
        //  System.out.println();   
        // }
      
    


        // Print star triangle vertically flipped  

        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=n;j++){
        //         if(i+j>n)                         // ye bhi sahi h but isme agar aap 1 then 234 then 56789 so ye code print nhi kar payega 
        //         System.out.print("* ");
        // else {
        //         System.out.print("  ");
        // }
        //     }
        //     System.out.println();
        // } 
        
   

// in other way to represent this 


        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=n-i;j++){
        //       System.out.print("  ");
                                                             // sabse best h 
        //     }
              
        //       for(int k =1;k<=i;k++){
        //       System.out.print("* ");
              
              
        //     }
        //     System.out.println();
        // } 
   

        //  aap isi code me bas ek space ghata doge to pyramid print ho jayega like this 

       
        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        //                                                             // but ye shi nhi h pyramid ke liye 
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=n-i;j++){
        //       System.out.print(" ");
              
        //     }
              
        //       for(int k =1;k<=i;k++){
        //       System.out.print("* ");
              
              
        //     }
        //     System.out.println();
        // } 
        
   



// print number triangle vertically flipped
// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the number : ");
//         int n = sc.nextInt();
        
//         for(int i = 1;i<=n;i++){
//             for(int j =1;j<=n-i;j++){
//               System.out.print("  ");
              
//             }
              
//               for(int k =1;k<=i;k++){
//               System.out.print(k+" ");
              
              
//             }
//             System.out.println();
//         } 
        
//     }
// }

// print Alphabets triangle vertically flipped like this A THEN BB THEN CCC THEN DDDD LIKE THI 

// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++){
//             for(int j =1;j<=n-i;j++){
//               System.out.print("  ");
//             }
//               for(int k =1;k<=i;k++){
//               System.out.print((char)(i+64)+" ");
//             }
//             System.out.println();
//         } 
        
//     }
// }

// print Alphabets triangle vertically flipped like this A THEN B C THEN C D E THEN F G H I LIKE THIS

// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i = 1;i<=n;i++){
//             for(int j =1;j<=n-i;j++){
//               System.out.print("  ");
//             }
//               for(int k =1;k<=i;k++){
//               System.out.print((char)(a+64)+" ");
//               a++;
//             }
//             System.out.println();
//         } 
        
//     }
// }

// Print Rhombus pattern   




        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=n-i;j++){
        //       System.out.print("  ");
              
        //     }
              
        //       for(int k =1;k<=n;k++){
                 
        //       System.out.print("* ");
              
              
        //     }
        //     System.out.println();
        // } 
        
   

// print pattern like this  ***** then **** then *** then ** then * and first ke chhood kar baki space print karege chala kar dekh lena ek bar 


        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=i;j++){
        //       System.out.print("  ");
              
        //     }
              
        //       for(int k =1;k<=n+1-i;k++){
                 
        //       System.out.print("* ");
              
              
        //     }
        //     System.out.println();
        // } 


         // Print PYRAMID  pattern in java 

        
        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=n-i;j++){
        //       System.out.print("  ");
              
        //     }
              
        //       for(int k =1;k<=(2*i-1);k++){  // ye formula yad rakhna 2i-1 isi se sab h 
                 
        //       System.out.print("* ");
              
              
        //     }
        //     System.out.println();
        // } 
   
    


    // isko bina math ke bhi likh sakte ho variable bana kar like this 

   
        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // int nsp = n-1,nst = 1;            // ye simple h aur kisi bhi pattern ko easily print kar sakte h so understand it   
        // for(int i = 1;i<=n;i++){
        //     for(int j =1;j<=nsp;j++){
        //       System.out.print("  ");
              
        //     }
              
        //       for(int k =1;k<=nst;k++){
                 
        //       System.out.print("* ");
              
              
        //     } nsp --;
        //     nst +=2;
        //     System.out.println();
        // } 
        
   

    // PRINT DIAMOND PATTERN                        ITS MOST IMPORTANT  WHI RULE AAPLIED KAROGE NST OR NSP LIKE THIS 

   
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number is : ");
        // int n = sc.nextInt();
        // int nsp = n-1,nst =1;
        // for(int i = 1 ;i<=n;i++){
        //     for(int j=1;j<=nsp;j++){
        //       System.out.print("  ");   
        //     } for(int k = 1; k<=nst;k++){
        //          System.out.print("* ");
        //     } nst +=2;
        //     nsp --;
        //     System.out.println();
        // }
        
        // nsp = 1;                                 // DO JAGAH LENA PAD RHA H BECAUSE UPPER WALA SE PYRAMID AUR NICHE WALA SE USKA ULTA PYRAMID BANEGA DHAYN SE DEKH LO LOGIC
        // nst =(2*n-3);
        // for(int i = 1 ;i<=n-1;i++){
        //     for(int j=1;j<=nsp;j++){
        //       System.out.print("  ");   
        //     } for(int k = 1; k<=nst;k++){
        //          System.out.print("* ");
        //     } nst -=2;
        //     nsp ++;
        //     System.out.println();
        // }
        
        
 // PRINT BRIDGE PATTERN                             ITS TOUGHEST CODE BUT JUST DRY RUN THIS 


        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number is : ");
        // int n = sc.nextInt();                                         // ISKO EK BAR DRY RUN KAR LENA 
        // for(int i=1;i<=2*n-1;i++){
        //     System.out.print("* ");
        // }System.out.println();
        // int nsp = 1;
        // for(int i = 1 ;i<=n-1;i++){
        //     for(int j=1;j<=n-i;j++){
        //       System.out.print("* ");   
            
        //     } 
        //     for (int k =1;k<=nsp;k++){
        //         System.out.print("  ");
        //     } 
        //     for (int l =1;l<=n-i;l++){
        //         System.out.print("* ");
        //     } nsp +=2;
        //     System.out.println();
        // }
            
           
        
        // Print number Sprial or we can say zoom pattern 

        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number is : ");
        // int n = sc.nextInt();
        // for(int i = 1 ;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //       System.out.print(Math.min(i,j) +" ");       // isko jagah par aap ternay operator used kar sakte h sout((i<j) ? i : j)
        //   //System.out.print(((i<j) ? i : j )+"  " );     // ye tino shi h aap in tino me se kisi se kar sakte ho 
        // //     if (i<j)   System.out.print(i +" ");
        // //     else   System.out.print(j +" ");
        //     } 
    
        //     System.out.println();
        // }
            
       
        // iska correct code yah hai 
       
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number is : ");
        // int n = sc.nextInt();
        // for(int i = 1 ;i<=2*n-1;i++){
        //     for(int j=1;j<=2*n-1;j++){
        //         int a= i,b=j;
        //         if(i>n) a = 2*n - i;
        //         if(j>n) b = 2*n - j;
                
        //      System.out.print(Math.min(a,b) +" ");   
        //     } 
    
        //     System.out.println();
        // }
            
      

        
        
        
        
        
       
    




















 }   
}
