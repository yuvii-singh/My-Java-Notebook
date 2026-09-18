import java.util.Scanner;


public class Array {
    // 
    public static void main(String [] args) {  // String me brackets kahin bhi likh sakte hai datatype ke baad ya variable name ke baad dono sahi hai jaise {string [] args } ya { string args[] }

        // basically brackets ka matlab hota hai ki ye ek array hai jisme multiple values store kar sakte hai same data type ke
        
        

//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter the size of array : ");
//      int size = sc.nextInt();
//      int [] numbers = new int [size]; 

//      // for input purpose only                         
//    for (int i = 0; i<size; i++) {
//      numbers[i] = sc.nextInt();  // user se input le raha hai array ke elements ke liye
//     System.out.print("Your number is :" );
//    }
//       // for output purpose only  
//                                                                     // automacally java me int ka default  value 0 hota hai
//         for (int i = 0; i<size; i++) {
//             System.out.println("Enter your number :" + numbers[i]); // numbers[i] likhne se java default value dega 0 kyuki int ka default value 0 hota hai whi agar float hota to 0.0 deta , agar char hota to blank deta , agar boolean hota to false deta string hota to null deta 
//            // numbers[i] = sc.nextInt();  // user se input le raha hai array ke elements ke liye
//         }


     // Take an array as input from the user. Search for a given number x and print the index at which it occurs.

  // is pura process ko linear search kehte hai

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the size of array : ");
     int size = sc. nextInt();
     int [] numbers = new int [size];
     System.out.println("Enter the elements of array : ");
     for (int i = 0; i<size; i++) {  // i<size ke jagah pr numbers.length bhi likh sakte hai dono same hai
      numbers[i] = sc.nextInt();  // user se input le raha hai array ke elements ke liye
     }
     System.out.print("Enter the number to be searched : ");
     int x = sc.nextInt();
     for (int i = 0; i<size; i++) {
        if (numbers[i] == x) {
            System.out.println("Number found at index : " + i);
            
        }
     }
     System.out.println("Number not found in the array");    















        
        // Array : ek data structure jo same type ke elements ko store karta hai contiguous memory locations me
      
        // Array declaration and initialization

        // Syntax : dataType[] arrayName = new dataType[size];
        // defining an array : type[] name = new type[size]; it means  type is data type of array name and size is number of elements in array new keyword is used to allocate memory for array

        // Array : it is used to store multiple values in a single variable instead of declaring separate variables for each value
        // Array is a same like a container which can hold multiple values of same data type
        // Example : int[] numbers = new int[5]; // declares an array of integers with size 5
        // Array indexing starts from 0
        // Example : int[] numbers = {10, 20, 30, 40, 50}; // declares and initializes an array of integers

        // basiacally there are two types of array in java :
        // 1. Single dimensional array : ek dimensional array jisme elements ek line me store hote hai isko 1D array bhi kahte hai 
        // example of single dimensional array :
        //int[] numbers = {10, 20, 30, 40, 50};
        // 1D array me elements ek line me store hote hai jaise above example me 10,20,30,40,50 ek line me store hai

       
        // 2. Multi dimensional array : do ya usse zyada dimensional array jisme elements matrix form me store hote hai isko 2D array bhi kahte hai or matrix bhi kahte hai

        // example of multi dimensional array :
        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        // };
        // 2D array me elements matrix form me store hote hai jaise above example   me 1,2,3 ek row me hai ,4,5,6 ek row me hai ,7,8,9 ek row me hai


    //  int [] marks = new int [5];   // instead of writing like this you can also write like this below line
     //int [] marks = {99,95,90,88,80}; // ye bhi sahi hai array ko define karne ke liye aur niche wala bhi sahi hai
        // int marks [] = new int [5]; // square bracket kahin bhi likh sakte hai datatype ke baad ya variable name ke baad dono sahi hai jaise string [] args ya string args[]

        // marks [0] = 99;
        // marks [1] = 95;
        // marks [2] = 90;
        // marks [3] = 88;
        // marks [4] = 80;


    // instead of above code you can also write like this below code to assign values to array
    //   int marks [] = {99,95,90,88,80}; 


    // for (int i = 0; i<5; i++) {
    //         System.out.println("Your marks are :" + marks[i]);
    //  }
    




    // i want to print all marks in the same line i means i dont want to write five times sout for each marks
    // for(int i = 0; i < marks.length; i++) {
    //     System.out.println("Your marks are :" + marks[i]);
    // }
    
    // instead of above code you can just write like this below code
    // for (int i = 0; i<5; i++) {
    //     System.out.println("Your marks are :" + marks[i]);
    // }
    



  // same types ke data store hongi array me sara integer,ya float,ya string,ya,character ya,boolena sara same hi hoga 
  // Array continuous space me data ko memory me store karata h like ek hi rows na ki randomly [ 10,20,30 ayese ek hi rows me  ]


    // int b = marks.length;
    
    // System.out.println(b);  // ye length batayega ki array me kitne elements hai 
    
    //  System.out.print("Your first marks will be like this :" + marks);
      






        // int[] numbers = {10, 20, 30, 40, 50};
        // // Accessing array elements
        // System.out.println("First element: " + numbers[0]); // Output: 10
        // System.out.println("Second element: " + numbers[1]); // Output: 20

    }
    
}
