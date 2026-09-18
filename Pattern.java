   import java.util.Scanner;


public class Pattern {  // print the solid rectangle .
    public static void main (String[] args){  // basically this code is for  Solid rectangle 
        // for input user single 
          Scanner sc = new Scanner (System.in);
        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();
        // for(int i =1;i<=n;i++){ // outer loop 
        //     for(int j=1;j<=6;j++){ // inner loop  
        //         System.out.print(" * ");
        //     }
        // System.out.print("\n"); } 



        // row wala kam outer loop kr rha h our column wala kam inner loop kr rha hai ;

       
        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();
        // System.out.print("enter second star number how many star you want to print it : ");
        // int m = sc.nextInt();
        // for(int i =1;i<=n;i++){ // outer loop 
        //     for(int j=1;j<=m;j++){ // inner loop  
        //         System.out.print(" * ");
        //     }
        // System.out.println(); } 




     // wap to print Hallow Rectangle 




      //   System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
      //   int n = sc.nextInt();
      //   System.out.print("enter second star number how many star you want to print it : ");
      //   int m = sc.nextInt();
      //   for(int i =1;i<=n;i++){ // outer loop 
      //       for(int j=1;j<=m;j++){ // inner loop  
      //           if (i ==1 || j == 1 || i ==n || j == m){ // pahle check krna ki kitne row aur kitne column me print kr rha h then uske bad if else statement used krna 
      //                 System.out.print("*");
      //           } else {
      //               System.out.print(" ");
      //           }
                
      //       }
      //   System.out.println(); } 

        // Print Half Pyramid or Print Right Angle Triangle 
        
        
        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();
        // // System.out.print("enter second star number how many star you want to print it : ");
        // // int m = sc.nextInt();
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){ // isko upper wala loop ki tarah chalayenge to right angle or half pyramid print kr dega  
        //        System.out.print(" * "); //
        //         }
                
            
        // System.out.println(); } 



  // print ulta right angle triangle  or inverted right angle triangle  or inverted half pyramid

        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();
        
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){ 
        //        System.out.print(" * "); 
        //         }
                
            
        // System.out.println(); }


     // print inverted right angle triangle  or inverted half pyramid second method

        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();
        
        // for(int i =n;i>=1;i--){
        //     for(int j=1;j<=i;j++){ 
        //        System.out.print(" * "); 
        //         }
                
            
        // System.out.println(); }

 // inverted half pyramid with spaces or 180 degree rotated right angle triangle


        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();
        
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){ 
        //        System.out.print(" "); 
        //         }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
                
        //     }
        // System.out.println(); }



        // print full pyramid


        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
             // }


 



// inverted full pyramid


        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();

        // for(int i = n; i >= 1; i--) {
        //     for(int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <= (2 * i - 1); k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }






        // Hollow Pyramid

//         System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
//      int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {
//     for (int j = i; j < n; j++) {
//         System.out.print(" ");
//     }
//     for (int j = 1; j <= (2 * i - 1); j++) {
//         if (j == 1 || j == (2 * i - 1) || i == n)
//             System.out.print("*");
//         else
//             System.out.print(" ");
//     }
//     System.out.println();
// }



// incresing  number with half pyramid pattern


        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

    
    
         // Floyd's Triangle pattern 

    //  System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
    //     int n = sc.nextInt();
    //     int m = 1; // if you wirte 0 means starting value 0 
    //     for(int i = 1; i <= n; i++) {
    //         for(int j = 1; j <= i; j++) {
    //             System.out.print(m+" "); // instead of m you can used n whiched used to print same number all row or column ;
    //             m++;
    //         }
    //         System.out.println();
    //     }


    //  System.out.print("enter the number whatever number you want ot print pattern : ");   
    //     int n = sc.nextInt();
       
    //     for(int i = 1; i <= n; i++) {
    //         for(int j = 1; j <= i; j++) {
    //             if ( (i+j)%2==0) {
    //                 System.out.print( " 1 ");
    //             }else {
    //                 System.out.print(" 0 ");
    //             }
    //         }
    //         System.out.println();
    //     }
 // this is whenever you want to try like this 
     
   





    // inverted half pyramid with number 

    //    System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
    //     int n = sc.nextInt();

    //     for(int i = n; i >= 1; i--) {
    //         for(int j = 1; j <=i; j++) {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }






    // Print Repeated Number Pattern


        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();

        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

     // inverted half pyramid with repeaded number 
     
      //   System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
      //   int n = sc.nextInt();

      //   for(int i = n; i >= 1; i--) {
      //       for(int j = 1; j <= i; j++) {
      //           System.out.print(i + " ");
      //       }
      //       System.out.println();
      //   }
    

   //   // Number Pyramid Pattern  with same number

   //   System.out.print("enter the number whatever number you want ot print pattern : ");  
   //      int n = sc.nextInt();

   //      for(int i = 1; i <= n; i++) {
   //          for(int j = 1; j <=n- i; j++) {  
   //              System.out.print(" ");
   //          }
   //       for (int j =1;j<=i;j++){
   //          System.out.print(i+" ");
   //       }


   //          System.out.println();
   //      }


   // Number Pyramid Pattern  with different number

   //   System.out.print("enter the number whatever number you want ot print pattern : ");  
   //      int n = sc.nextInt();

   //      for(int i = 1; i <= n; i++) {
   //          for(int j = 1; j <=n- i; j++) {  
   //              System.out.print(" ");
   //          }
   //       for (int j =1;j<=i;j++){
   //          System.out.print(j+" ");
   //       }


   //          System.out.println();
   //      }




   // Palindromatic number pattern                        ayesa chiz jo samne bhi same dikhe aur jidhar se dekho same dekhe like BoB ,121,545 etc
                                                   // spaces nikalne ke liye hamesha n-i ka used karo

   
      //   System.out.print("Enter number of rows: ");
      //   int n = sc.nextInt();

      //   for (int i = 1; i <= n; i++) {
      //       // Print leading spaces
      //       for (int j = 1; j <= n - i; j++) {
      //           System.out.print(" ");
      //       }

      //       // Print descending numbers (from i to 1)
      //       for (int j = i; j >= 1; j--) {
      //           System.out.print(j);
      //       }

      //       // Print ascending numbers (from 2 to i)
      //       for (int j = 2; j <= i; j++) {
      //           System.out.print(j);
      //       }

      //       // Move to next line
      //       System.out.println();
      //   }


       // Diamond Pattern printing 

       
        // System.out.print("Enter number of rows: ");
        // int n = sc.nextInt();

        // // Upper half of the diamond
        // for (int i = 1; i <= n; i++) {
        //     // Print leading spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     // Print stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // // Lower half of the diamond
        // for (int i = n - 1; i >= 1; i--) {
        //     // Print leading spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     // Print stars
        //     for (int j = 1; j <= (2 * i - 1); j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

       


        // second method to solve inverted number with pyramid  dono shi hai to jo mn kare wah likh sakte ho 

    //   System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
    //     int n = sc.nextInt();

    //     for(int i = 1; i <= n; i++) {
    //         for(int j = 1; j <=n- i+1; j++) {  
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }



       // Print Alphabet Pattern

        // System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
        // int n = sc.nextInt();

        // for(int i = 0; i < n; i++) {
        //     char ch = (char)('A' + i);
        //     for(int j = 0; j <= i; j++) {
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println();
        // }

         

      // Print Butterfly pattern                                   which one of the most important question 



      //  System.out.print("enter the number whatever number you want ot print pattern : ");   // used to solve this statement using nested loop 
      //   int n = sc.nextInt();

      //    // upper half pattern 
      //   for(int i = 1; i <= n; i++) {
      //    //first part 
      //       for(int j = 1; j<=i; j++) { 
      //       System.out.print("*"); 
            
      //       }
      //       // for spaces 
      //       int spaces = 2 * (n-i);
      //       for (int k=1; k<=spaces; k++){
      //          System.out.print(" ");
      //       }
      //       // second half code 
      //       for(int l=1;l<=i;l++){
      //          System.out.print("*");
      //       }
      //       System.out.println();
      //   }

      //  // for lower part 
      //   for(int i=n; i>=1; i--) {
      //    //first part 
      //       for(int j=1; j<=i; j++) { 
      //       System.out.print("*"); 
            
      //       }
      //       // for spaces 
      //       int spaces = 2 * (n-i);
      //       for (int k = 1;k<=spaces ;k++){
      //          System.out.print(" ");
      //       }
      //       // second half code 
      //       for(int l=1;l<=i;l++){
      //          System.out.print("*");
      //       }
      //       System.out.println();
      //   }
   
   

      // Solid Rhombus rectangle Right to left pattern print 

      // System.out.print("enter the number whatever number you want ot print pattern : ");  
      //   int n = sc.nextInt();
      //   for(int i =n;i>=1;i--){ 
      //       for(int j=1;j<=i;j++){ 
      //           System.out.print(" ");
      //       }
      //      for (int k = 1;k<=n;k++){
      //       System.out.print("*");
      //      }
              
            
      //   System.out.println();
      //                                                                                              // Question agar samjh me na aaye to matrix ke form banalo then solve karo ya dry run karo ek ek point 
      //    }


    // Solid Rhombus rectangle from left to right pattern print 

   //  System.out.print("enter the number whatever number you want ot print pattern : ");  
   //      int n = sc.nextInt();
   //      for(int i =1;i<=n;i++){ 
   //          for(int j=1;j<=i;j++){ 
   //              System.out.print(" ");
   //          }
   //         for (int k = 1;k<=n;k++){
   //          System.out.print("*");
   //         }
              
            
   //      System.out.println();
        
   //       }



     // second method to print Solid Rhombus rectangle

      //  System.out.print("enter the number whatever number you want ot print pattern : ");  
      //   int n = sc.nextInt();
      //   for(int i =1;i<=n;i++){ 
      //       for(int j=1;j<=n-i;j++){ 
      //           System.out.print(" ");
      //       }
      //      for (int k = 1;k<=n;k++){
      //       System.out.print("*");
      //      }
              
            
      //   System.out.println();
      //                                                                                              // Question agar samjh me na aaye to matrix ke form banalo then solve karo ya dry run karo ek ek point 
      //    }

         // Print Hallow Rhombus pattern 

      


      //  System.out.print("enter the number whatever number you want ot print pattern : ");  
      //    int n = sc.nextInt();
      //   for (int i = 1; i <= n; i++) {
      //       // Print leading spaces
      //       for (int j = 1; j <= n - i; j++) {
      //           System.out.print(" ");
      //       }

      //       // Print stars and spaces for hollow effect
      //       for (int j = 1; j <= n; j++) {
      //           // First or last row, or first/last star in the row
      //           if (i == 1 || i == n || j == 1 || j == n) {
      //               System.out.print("*");
      //           } else {
      //               System.out.print(" ");
      //           }
      //       }

      //       // Move to next line
      //       System.out.println();
      //   }

   
    //Pascal’s Triangle (Number Triangle)
//     System.out.print("enter the number whatever number you want ot print pattern : ");  
//        int n = sc.nextInt();
//     for (int i = 0; i < n; i++) {
//     int num = 1;
//     for (int j = 0; j <= i; j++) {
//         System.out.print(num + " ");
//         num = num * (i - j) / (j + 1);
//     }
//     System.out.println();
// }


      // Sandglass Star Pattern
//       System.out.print("enter the number whatever number you want ot print pattern : ");  
//        int n = sc.nextInt();

//       for (int i = n; i >= 1; i--) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k < (i * 2); k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
// for (int i = 2; i <= n; i++) {
//     for (int j = n; j > i; j--) {
//         System.out.print(" ");
//     }
//     for (int k = 1; k < (i * 2); k++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }
  




//  System.out.print("enter the number whatever number you want ot print pattern : ");  
//         int n = sc.nextInt();
//     char ch = 'A';
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print(ch + " ");
//         ch++;
//         if (ch > 'Z') ch = 'A'; // Wrap if exceeds 'Z'
//     }
//     System.out.println();
// }







    }
   }
