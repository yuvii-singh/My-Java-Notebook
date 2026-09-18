
public class Array1 {
    public static void main(String[] args) {
        

        // declaration of arrays 
        int [] numbers;  // this is declaration of array it is like a blueprint of array it does not allocate memory for array it just tells java that we are going to create an array of integers and we will use the variable name numbers to refer to that array

             // upper wala exact or correct way h array ko represent karne ke liye to most of the time aap isi ka used krna kyuki best way h niche wala c++ me use hota h java me bhi chalega but upper wala best way h array ko represent karne ke liye



        // another way of declaration of array
        int numbers1[];  // this is also declaration of array .
    
       // allocation of array
       numbers = new int[5];  // this is allocation of array it allocates memory    for array it creates an array of integers with size 5 and assigns the reference of that array to isme index 0 se start hoga aur last index 4 hoga kyuki array ke size 5 hai to index 0 se start hoga aur last index 4 hoga
       
       // initialization of Array
       int [] marks = {99,95,90,88,80}; // this is initialization of array it assigns values to array at the time of declaration it creates an array of integers with size 5 and assigns the values 99,95,90,88,80 to that array
       //int [] marks = {99,95,90,88,80};   isko hm 1D array ya one dimensional array bhi bolte h 
      
     // index of array  start hota h 0 se and n-1 tak chalta h 
     // array ke size n and index ka size  = 0 to n-1 tak chalta h hamesha 

System.out.println(marks[4]);
 

// updation of array or updating in array or there element or mutable array : array ke kisi bhi index ka value ko update karna ya change karna ya modify karna

marks[4] = 85; // this is updation of array it updates the value of array at the given index it updates the value of array at index 4 to 85
System.out.println(marks[4]); // yaha pr array ka index 4 ka value update ho chuka h to yaha pr 85 print hoga
// ayese aap update kr sakte ho array ke kisi bhi index ka value ko




       // length of array or length find karna

    //    System.out.println("The length of marks array is: " + marks.length); // length of array find karne ke liye length property ka use karte hai marks.length se hume
       
      // indexing of array means hamesha 0 se start hota hai array ka index aur last index array ke length - 1 hota hai jaise marks array me length 5 hai to last index 4 hoga aur first index 0 hoga
       // kabhi bhi index 0 se suru hokar n-1 tak hota hai jaha n array ke length hai
       // array ke elements ko access karne ke liye index ka use karte hai jaise marks[0] se hume first element 99 milega marks[1] se hume second element 95 milega marks[2] se hume third element 90 milega

    //    System.out.println(marks[0]); // array ke first element ko access karne ke liye index 0 ka use karte hai marks[0] se hume first element 99 milega
    //    System.out.println(marks[1]);
    //    System.out.println(marks[2]);
    //    System.out.println(marks[3]);
    //    System.out.println(marks[4]);

       // instead of above code you can also write like this below code to access array elements
    //   for (int i = 0;i<marks.length;i++){
    //     System.out.println(marks[i]);
    //   }
      
      // or another method 
    //   int n = marks.length;
    //   for ( int i = 0 ; i<=n-1;i++){  // less than or equal too bhi h like <= isliye n-1 
    //     System.out.println(marks[i]);          // dono same hi hai 
    //   }
      
    // upper wala for loops h bas but instead of writing above code you write like this 

      // for each loops             AAP FOR LOOP YA NORMAL FOR LOOPS LIKHO YA FOR EACH LOOPS BAAT EK HI HAI DONO SHI H BAS FOR EACH LOOPS THODA EASY H 
   // ONE BY ONE ITERATE KR RHA H LOOPS KO   

    //   for (int i : marks){
    //   System.out.println(i);
    // }
    //This code is using an array and an enhanced for loop (also called a for-each loop) in Java.

// int [] marks = {99,95,90,88,80};

// for (int i : marks){
//     System.out.println(i);
// }
// Step-by-step Explanation
// 1. Array Declaration
// int [] marks = {99,95,90,88,80};  // ek chiz yad rakhna yaha pr index 5 h 0 t0 5 aur aap marks[5] likh dete ho to ye out of data ya range error de deta h ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6

// This creates an array named marks that stores integer values.

// The array contains:

// Index	Value
// 0    	99
// 1    	95
// 2    	90
// 3    	88
// 4    	80

// So marks is a collection of numbers.

// 2. Enhanced For Loop (For-Each Loop)
// for (int i : marks)

// This means:

// Take each value from the marks array
// Store it one by one inside variable i
// Run the loop body for every element

// It is similar to saying:

// “For every integer in marks, print it.”

// 3. Printing the Values
// System.out.println(i);

// This prints the current value of i.

// How the Loop Works Internally

// Iteration 1:

// i = 99

// prints:

// 99

// Iteration 2:

// i = 95

// prints:

// 95

// And so on...

// Final Output
// 99
// 95
// 90
// 88
// 80
// Difference Between Normal for Loop and For-Each Loop
// Normal for loop
// for(int j = 0; j < marks.length; j++){
//     System.out.println(marks[j]);
// }
// For-each loop
// for(int i : marks){
//     System.out.println(i);
// }

// The for-each loop is:

// shorter
// cleaner
// easier when you only want to read values
    
   // Ques 1. find sum  of all values in array  without taking input 
  //  int num [] = {1,4,6,7,8,3,4,6,2,5};
  //  int sum = 0 ;
  //  for (int sem : num){
  //   // sum = sum + sem;
  //   // or 
  //   sum +=sem;
  //  }
  //  System.out.println("Total sum is : " + sum);
   
   // taking input in array then print sum   input lekar uske bad solve kr rhe h data structure ko 

//  Scanner sc = new Scanner(System.in);
//   System.out.println("Enter Arrays size : ");
//    int size  = sc.nextInt();
//    int arr [] = new int[size];
//    for(int count = 0;count<size;count++){
    
//     System.out.println("Enter your values : " + count);
//     arr[count] = sc.nextInt();
// }
// // array printing ke liye 
// // for (int data :arr){
// //   System.out.print(" " + data );
// // }
    
// int sum = 0;
// for (int n: arr){
//   sum +=n;
// }
// System.out.println("Total sum is :" + sum);





//Ques .2 find Multiplication of all values 

      //  int mul = 1;
      //   int data [] = {1,2,3,4,5,6};
      //   for (int i=0;i<data.length;i++){
      //       mul = mul * data[i];
      //   }
      //   System.out.println("Total multiplication is :"+mul);

       // ayese hi aap input lekar kr sakte o 

  // MINIMUM AND MAXIMUM VALUES FIND KARNA 
   // EK CHIZ HAMESHA YAD RAKHNA JAB BHI MAXIMUM VLAUES FIND KRNA HO TO MIN_VALUE LENGE AUR JAB BHI MINIMUM VALUES FIND KARNA HO MAX_VALUE LENGE 

   // FOR MAXIMUM VALUES FIND KARNDE KE LIYE 
   // INT MAX = MIN_VALUE;  min values isliye lete h taki  isase chhote koi na ho and compare hoga to array me jo element h whi bade honge inse isliye 

   // FOR MINIMUM VALUES FIND KARNA KE LIYE 
   // INT MIN = MAX_VALUE   same max values bhi isliye lete  h isase bada ko max values na ho 

   // AUR KOI BHI DATA KA MAXIMUM AND MINIMUM VLAUES KO FIND KRNE KE LIYE 
  //  System.out.println(Integer.MAX_VALUE);
  //  System.out.println(Integer.MIN_VALUE);
  //  System.out.println(Long.MAX_VALUE);
  //  System.out.println(Float.MAX_VALUE);
   
   // ayese kr ke aap koi bhi element ka MINIMUM and MAXIMUM value ko dekh sakte h 


  // example :
  // for MINIMUM number find karna 

  // int arr [] = {2,4,2,3,4,6,7,8,78,544,-4,-3,-54};
  // int min = Integer.MAX_VALUE;
  // for (int num : arr){
  //   if(num < min){
  //    min = num;
  //   }

  // }
  // System.out.println("MINIMUM number is :" + min);

  // for MAXIMUM values find krna 

  // int arr [] = {2,4,2,3,4,6,7,8,78,544,-4,-3,-54};
  // int max = Integer.MIN_VALUE;
  // for (int num : arr){
  //   if(num > max){
  //    max = num;
  //   }

  // }
  // System.out.println("MAXIMUM   number is :  " + max);


// upeer aapne jo bhi dekha ye sara 1D array ya aap bol sakte ho one dimensional Arrays h ;












    
    }
    
}
