
public class RaghavSirArray {
    public static void main(String[] args) {
        


//  Scanner sc = new Scanner(System.in);




         // Array used hota h  multiple values ko same data ke store karta h same like variable 
         // linked list , stack ,queue , graph,tree ,array ye sare data types ko store karte h aage padhna 


         // initialization of array 

        // int [] arr = {3,2,6,7,8};   // ye shi tarika h c++ me isko ayese likhte h 
        // int arrr [] = {3,2,6,7,3};  // ye c++ me likhte h to aap kosis karna ki upper wala hi likhe waise ye bhi shi h but uper wala java ke liye best h 


         // print output 
         //System.out.println(arr);   // aap isko ayese print nhi kara sakte do trika h ya to loop se ya indexing se isko print kara sakte h 

         // for indexing se 

        //  System.out.println(arr[0]);         // array ka index hamesha 0 se start hota h aur n-1 tak chlata h ye hamesa yad rakhna 
        //  System.out.println(arr[1]);
        //  System.out.println(arr[2]);        // ye jyada lengthly h jyada time lega isliye ise loop se karo jaldi 
        //  System.out.println(arr[3]);
        //  System.out.println(arr[4]);

  // for updating arr element like this 

//   arr[3] = 12;
//   System.out.println(arr[3]);            // to aap dekhoge ki update ho gya h becoz array mutable hota h isko ander ke element ko change kiya ja sakte h 



    // for  loop se 
    
    // for (int i = 0; i < 5; i++) {
    //     System.out.println(arr[i]);           // arr[i] ka matlab ja i 0 hoga to arr bhi zero index wali values ko print karega isliye arr[i] ko print kiye h 
    // } 


// for (int i = 0; i <= 4; i++) {              // aap isko i<= 4 ya i < 5 dono chala sakte ho 
//         System.out.println(arr[i]);        //but sabse best tarika h aap arr ke length likho be

// }



// for (int i = 0; i < arr.length; i++) {              // arr.length sabse best tarika h arr ke sabhi element ko represent karne ka 
//         System.out.println(arr[i]);        

// }

// int n = arr.length;    // isme index 0 to n-1 tak chalega 

// for (int i = 0; i <n; i++) {                      // sabse best tarika h 
//         System.out.println(arr[i]);        

// }

 //int [] data = new int[9];                  // ye dusra tarika h array ko initialization karne ka new keyword h uske bad int data types isliye laga kyuki sure me datatypes int h isliye 

// agar ye raha    jo data types loge usi ko aap last me bhi likhoge 

// float [] d = new float[5];
// double [] c =new double[9];
// String [] st = new String[9];

// Syntax of array 

// datatypes [] array_Name = new datatypes[size];            // ye hai array ka Syntax







// NOTE : -   Array ka default value 0 hota h yad rakhna hamesh like this 

//int [] arr = new int[7];                      
// for (int i = 0; i < arr.length; i++) {     // aap dekhoge ki ye 0 ko  7 times print karega kyuki iska default value 0 hota h 
//     System.out.println(arr[i]);
// }

// aap is new arr ke ander values assign kar sakte ho like this 


// arr[0]=3;
// arr[1]=5;
// arr[2]=34;
// arr[3]=10;
// arr[4]=13;
// arr[5]=23;
// arr[6]=43;

// for (int i = 0;i<arr.length;i++){               // is tarah aap koi bhi empty array banake uske ander value ko assign kar sakte ho 
//     System.out.println(arr[i]);
// }




//int [] arr = new int[7]; 

// for input 

// for(int i = 0;i<arr.length;i++){
//     int x = sc.nextInt();
//     arr[i] = x;
// }
 
// // for printing  

// for(int i = 0;i<arr.length;i++){
//     System.out.print(arr[i] + " ");    // agar aap input jo bhi element diye usko double chate to like 2 = 4 like this so easy h (arr[i] *2 + " ")  simple h 2 se multiply kar do 
// }



 // aap is input ko ek loop se bhi print kara sakte ho but jab aap ise maximum,minimum,sorting,aur bhi jo array se ho jaye usko print karwawoge to ek loop se nhi ho payega isliye waha do loop ki jaroot padti h 




 // ye dekho ek loops se print karwa na possible h  ye bhi kam karega but try karna ki do loop se input lena ya koi bhi kam karna aasan rahega 

// for(int i = 0;i<arr.length;i++){
//           arr[i] = sc.nextInt();
//            System.out.print(arr[i] + " "); 
// }
  

//  INPUT ke liye aap ayese likhoge 

//for(int i = 0;i<arr.length;i++){
//           arr[i] = sc.nextInt();

//  OUTPUT ke liye aap isko ayese likhoge 

//for(int i = 0;i<arr.length;i++){
//     System.out.print(arr[i] + " ");    
// }

// write a program to print negative number in array  without taking any input 

// int [] arr = {2,3,5,-5,-2,6,-8,-9};

// for(int i=0 ;i<arr.length;i++){
//     if(arr[i]<0){
//         System.out.print(arr[i]+" ");
//     }
// }

          // taking input user and then print negative number;

    //     Scanner sc = new Scanner(System.in);
    //   System.out.print("Enter size of array : ");
    //   int n = sc.nextInt();

    //  System.out.print("Enter the element : ");
    //  int [] arr = new int[n];
     
     
    //  // for input purpose data 
     
    //  for (int i = 0; i < arr.length; i++) {
    //   arr[i] = sc.nextInt();
    // }
    
    // // for printing output 
    // for (int i = 0; i < arr.length; i++) {
    //   if(arr[i]<0){
    //       System.out.println(arr[i]);
    //   }
    // }


//   Print sum of element of the array 
                                                                    // without taking any input 
// int [] arr = {3,4,7,8,1,6,8};
//         int sum = 0;
//         for(int i =0;i<arr.length;i++){
//             sum += arr[i];
//         }
        
        
        
//         System.out.println(sum);

// with input 

    //     Scanner sc = new Scanner(System.in);
    //   System.out.print("Enter size of array : ");
    //   int n = sc.nextInt();

    //  System.out.print("Enter the element : ");
    //  int [] arr = new int[n];
    //  int sum = 0;
     
    //  // for input purpose data 
     
    //  for (int i = 0; i < arr.length; i++) {
    //   arr[i] = sc.nextInt();
    // }
    
    // // for printing output 
    
    // for (int i = 0; i < arr.length; i++) {
    //   sum +=  arr[i];
         
      
    // } System.out.print(" Your sum is : "+sum);   // one thing should be remember when you tried to write or you want to print something releted to sum so you must should be write outside the loops  or for loops 



// wap to print multiplication of element   or you can say product or element 

//    Scanner sc = new Scanner(System.in);
//       System.out.print("Enter size of array : ");
//       int n = sc.nextInt();

//      System.out.print("Enter the element : ");
//      int [] arr = new int[n];
//      int mul = 1;
     
//      // for input purpose data 
     
//      for (int i = 0; i < arr.length; i++) {
//       arr[i] = sc.nextInt();
//     }
    
//     // for printing output 
    
//     for (int i = 0; i < arr.length; i++) {
//       mul *=  arr[i];
         
      
//     } System.out.print(" Your multiply is : "+mul);



//IMPORTANT QUES :  wap to print maximum element in the array             without input 

// int [] arr = {38,4,7,8,1,6,8};
//         int  max= arr[0];                  // iske jagah pr aap ye bhi le sakte ho 
            //int max = Integer.MIN_VALUE;
//         for(int i =0;i<arr.length;i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//         }
//         System.out.println(max);


// with input 

// Scanner sc = new Scanner(System.in);
//       System.out.print("Enter size of array : ");
//       int n = sc.nextInt();

//      System.out.print("Enter the element : ");
//      int [] arr = new int[n];
//      //int  max= arr[0];                // iske jagah pr aap niche wala bhi likh sakte ho dono shi h
//      int max = Integer.MIN_VALUE;                           //  ek chiz yad rakhna jab maximum find karna ho to MIN_VALUE lenge aur minimum ke liye MIN_VALUE
//      // for input purpose data 
     
//      for (int i = 0; i < arr.length; i++) {
//       arr[i] = sc.nextInt();
//     }
    
//     // for printing output 
    
//     for (int i = 0; i < arr.length; i++) {
//       if(arr[i]>max){
//                max = arr[i];
//            }
         
      
//     } System.out.print(" Your maximum number  is : "+ max);



// IMPORTANT QUES :  wap to print minimum  element in the array             without input 

// int [] arr = {38,4,7,8,1,6,8};
//         //int  min= arr[0];                  // iske jagah pr aap ye bhi le sakte ho 
//             int min = Integer.MAX_VALUE;
//         for(int i =0;i<arr.length;i++){
//            if(arr[i]< min){
//                min = arr[i];
//            }
//         }
//         System.out.println(min);


// with input 

// Scanner sc = new Scanner(System.in);
//       System.out.print("Enter size of array : ");
//       int n = sc.nextInt();

//      System.out.print("Enter the element : ");
//      int [] arr = new int[n];
//      //int  min= arr[0];                // iske jagah pr aap niche wala bhi likh sakte ho dono shi h
//      int min = Integer.MAX_VALUE;                           //  ek chiz yad rakhna jab maximum find karna ho to MIN_VALUE lenge aur minimum ke liye MIN_VALUE
//      // for input purpose data 
     
//      for (int i = 0; i < arr.length; i++) {
//       arr[i] = sc.nextInt();
//     }
    
//     // for printing output 
    
//     for (int i = 0; i < arr.length; i++) {
//       if(arr[i]<min){
//                min = arr[i];
//            }
         
      
//     } System.out.print(" Your minimum number  is : "+ min);

//  ab hmlog array me konse sa error kya karta h aur kaise show karta h wah janege 


// int [] arr = {38,4,7,8,1,6,8};
// System.out.println(arr[-1]);  // yaha par out of bound index h kyuki array ke index 0 to n-1 tak chlata h aapne use pahle ya usase bahar likhoge to error dega 



// 1.  array index   out of  bound exception    

// jab bhi out bount exception dikhe to samjh jana aapne 0 se pahle ya n-1 ke bad ke index ko acces kiya h tabhi ye error show kar rha h 


    //   double [] arr = new double[6];    // iska default value 0.0  hota h 
    //   for(int i =0;i<arr.length;i++)
    //     System.out.print(arr[i]+" ");


// char[] arr = new char[6];
//       for(int i =0;i<arr.length;i++)    // iska null hota h 
//         System.out.print(arr[i]+" ");


//  char d = '\0';
// System.out.println((int)d);   // iska ascii value 0 hota h 


// int x =0;
// System.out.println((char)x);    //iska bhi null hi hota h 


//  PASSING ARRAY TO METHOD ---  



        
    //   int [] arr = {5,3,2,4,6};
    //  System.out.println(arr[4]);   // java me pass by value hota  h REFERENCE nhi but array ke liye pass by REFERENCE hota h aur data types like int,float,double par same nhi deta h 
    //  change(arr);
    //  System.out.println(arr[4]);   
    // }
    // public static void change(int [] arr) {      // PASS BY REFERENCE H    becoz dono ek hi array ko represent kar rhe h isliye ek hi array me change hoga 
    //     arr[4] = 67;
        
   
    // chahe to aap change bhi kar sakte ho 

    // int [] arr = {5,3,2,4,6};
    //  System.out.println(arr[4]);
    //  change(arr);
    //  System.out.println(arr[4]);
    // }
    // public static void change(int [] x) {     // variable change karne ke bad bhi yah same hi array ko represent karega 
    //     x[4] = 67;

// Case 1: Primitive (int)
// public static void change(int x) {
//     x = 100;
// }

// public static void main(String[] args) {
//     int x = 10;

//     change(x);

//     System.out.println(x);
// }
// Memory before calling
// main()

// x = 10

// Call

// change(x);

// Java copies the value.

// main()          change()

// x = 10          x = 10

// Now inside change():

// x = 100;

// Memory becomes

// main()          change()

// x = 10          x = 100

// The x in main() never changes.

// Output:

// 10
// Case 2: Array
// public static void change(int[] arr) {
//     arr[4] = 67;
// }

// public static void main(String[] args) {
//     int[] arr = {5,3,2,4,6};

//     change(arr);

//     System.out.println(arr[4]);
// }

// An array lives in memory, and arr stores its reference (address).

// Imagine the array is at address 1000.

// Before calling
// main()

// arr ───► Address 1000

// Address 1000
// +----+----+----+----+----+
// | 5  | 3  | 2  | 4  | 6  |
// +----+----+----+----+----+

// When you call:

// change(arr);

// Java copies the reference, not the whole array.

// main()                  change()

// arr ──► 1000            arr ──► 1000

// Both variables point to the same array.

// Now execute:

// arr[4] = 67;

// The array at address 1000 changes:

// Address 1000

// +----+----+----+----+-----+
// | 5  | 3  | 2  | 4  | 67  |
// +----+----+----+----+-----+

// Since main() also points to address 1000, it sees the updated value.

// Output:

// 67
// Important Difference
// Primitive (int)
// main()

// x = 10

// When passed:

// main()          change()

// 10              10

// Two independent values.

// Array
// main()

// arr ───► Array

// When passed:

// main()          change()

// arr ───► Array
// arr ───► Array

// Two variables, but one shared array.

// Is Java Pass-by-Reference?

// No.

// Java is always pass-by-value.

// The difference is:

// For primitives (int, double, char, etc.), the value itself is copied.
// For objects (including arrays), the reference (address) is copied.

// That's why both variables still point to the same object.

// Easy Analogy 📦
// Primitive (int)

// You have one piece of paper:

// Paper A: 10

// You photocopy it and give it to your friend.

// Now:

// You:     10
// Friend:  10

// If your friend writes 100 on their copy, your paper still says 10.

// Array

// Think of the array as a house.

// arr is just the house address.

// arr = House #1000

// When you pass arr to a method, you give your friend another copy of the address, not another house.

// You:     House #1000
// Friend:  House #1000

// If your friend paints the house blue (changes an element), you both see the same blue house because it's the same house.

// Golden Rule ⭐
// Primitive types (int, float, double, char, boolean, etc.) → Java copies the actual value.
// Arrays and all other objects → Java copies the reference (address). Both references point to the same object, so changing the object's contents is visible everywhere.



 //   --- SHALLOW COPY AND DEEP COPY ---  



  // SHALLOW COPY 

//   int [] arr = {2,4,6,3,6,7};
//   int [] b = arr;
//   b[3] = 9;
//   System.out.println(arr[3]);      // to aap dekhoge ki iska values change ho gya h this is called shallow copy . 



//        DEEP COPY 


// int [] arr = {9,3,2,5,6};

// int [] deep = Arrays.copyOf(arr, arr.length);

// deep [0] = 3;
// System.out.println(arr[0]);    // 9 hi print hoga because ye do array banayega isliye 


 // or aap isko ayese bhi likh skte ho 

//  1. Shallow Copy

// A shallow copy means:

// Only the reference is copied, not the actual object.

// Example:

// int[] arr1 = {10, 20, 30};

// int[] arr2 = arr1;   // Shallow copy
// Memory
// arr1 ───► +----+----+----+
//           |10  |20  |30  |
//           +----+----+----+
//              ▲
//              │
// arr2 ────────┘

// Both variables point to the same array.

// Now,

// arr2[1] = 100;

// Memory becomes

// arr1 ───► +----+-----+----+
//           |10  |100  |30  |
//           +----+-----+----+
//              ▲
//              │
// arr2 ────────┘

// Now print:

// System.out.println(arr1[1]);

// Output

// 100

// Why?

// Because there is only one array.

// 2. Deep Copy

// A deep copy means:

// Create a completely new object and copy every element into it.

// Example

// int[] arr1 = {10, 20, 30};

// int[] arr2 = new int[arr1.length];

// for(int i = 0; i < arr1.length; i++){
//     arr2[i] = arr1[i];
// }
// Memory
// arr1 ─► +----+----+----+
//         |10  |20  |30  |
//         +----+----+----+

// arr2 ─► +----+----+----+
//         |10  |20  |30  |
//         +----+----+----+

// Notice

// There are two different arrays.

// Now,

// arr2[1] = 100;

// Memory becomes

// arr1 ─► +----+----+----+
//         |10  |20  |30  |
//         +----+----+----+

// arr2 ─► +----+-----+----+
//         |10  |100  |30  |
//         +----+-----+----+

// Now,

// System.out.println(arr1[1]);

// Output

// 20

// Because they are different arrays.

// Visual Difference
// Shallow Copy
// arr1 ──► Array ◄── arr2

// One array

// Two references

// Deep Copy
// arr1 ──► Array 1

// arr2 ──► Array 2

// Two different arrays

// Another Example
// Shallow Copy
// int[] a = {1,2,3};
// int[] b = a;

// b[0] = 99;

// System.out.println(a[0]);

// Output

// 99
// Deep Copy
// int[] a = {1,2,3};
// int[] b = a.clone();

// b[0] = 99;

// System.out.println(a[0]);

// Output

// 1

// clone() creates a new array for primitive arrays, so it performs a deep copy of the elements.

// What about Objects?

// Suppose

// class Student{
//     String name;
// }

// Then

// Student s1 = new Student();
// Student s2 = s1;

// This is shallow copy because both references point to the same Student.

// If you create a new Student and copy its fields manually,

// Student s2 = new Student();
// s2.name = s1.name;

// then s2 is a different object. This is a form of deep copy for this simple class.

// Interview Definition
// Shallow Copy	Deep Copy
// Copies only the reference	Copies the actual object/data
// Both variables refer to the same object	Each variable has its own object
// Changes are visible through both references	Changes in one copy do not affect the other
// Faster, uses less memory	Slower, uses more memory because a new object is created
// One important note

// For arrays of primitive types (int[], double[], etc.), methods like clone() or Arrays.copyOf() create a new array and copy all primitive values, so they behave as a deep copy.

// For arrays or objects that contain other objects, clone() often copies only the references to those nested objects. That means the outer object is new, but the inner objects are shared. This is why deep copying complex object graphs requires copying the nested objects too. This distinction is a very common interview question.



// array ko ascending order me sort karna                               by the way hm sorting padhenge to khud se karege but lets see difference method to solve it 


// yah ek tarika h 

//public static void print(int arr []) {
// int [] arr = {5,2,-6,0,1,-9,8,3,2};

// print(arr);

//  Arrays.sort(arr);

//  print(arr);

//     }

//     public static void print(int arr []) {
        
//         for (int i = 0; i <arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();    }               // next line ke liye 
   
   


// WAp to print multiply odd index elements by 2 and add 10 to even index elements

//    int [] arr = {3,5,2,7,6,9,8,4};
   
//  for (int i = 0; i < arr.length; i++) {
//      if(i%2==1) {
//         System.out.print(arr[i]*2 +" ");
//      }else {
//         System.out.print(arr[i]+10 +" ");
//      }
//  }

                                //        SEARCH IN ARRAYS                         ARRAY ME element KAISE SEARCH KARE 


// without input 

// int [] arr = {2,5,6,2,6,3,6,0};
// int target = 6;

// for (int i = 0; i < arr.length; i++) {
//     if(arr[i]==target){
//         System.out.println(arr[i] +" : element exist it ");                // agar sirf itna likhoge to print ho jayega but jitan bar number exist karega utna bar print karega so boolean ka used karo like below code 
//     }
// }



// int [] arr = {2,5,6,2,6,3,6,0};
// int target = 6;
// boolean flag = false;
// for (int i = 0; i < arr.length; i++) {
//     if(arr[i]==target){
//         System.out.println(arr[i]);                  // isko aap print na bhi karao to jaruri nhi h ya iska index bhi print kara sakte ho kis index par hamara elemnet mil gya 
//         flag = true ; 
//         break;         
// }

// }
// if(flag){                                                    // ya flag == true dono baat barabar hi h 
//     System.out.println("element is exist in array ");
// }else{
//     System.out.println("Not existiing ");
// }


// isi code ko modifite karne par 

// int [] arr = {2,5,6,2,6,3,6,0};
// int target = 1;
// boolean flag = false;
// for (int i = 0; i < arr.length; i++) {
//     if(arr[i]==target){                                                    // ye bhi same hi h bus code index ko bhi print karega 
                        
//         System.out.print("Target is exisiting at index : "+ i);
//         flag = true ; 
//         break;         
// }

// }
// if(!flag){
   
//     System.out.println("Not existiing ");
// }


// ye bhi code same hi h but boolean ko hata diya 

// int [] arr = {2,5,6,2,6,3,6,0};
// int flag = -1;                    // -1 means target array me nhi h aur -1 kabhi bhi array ka index nhi hota kyuki array ka index 0 se start hota h 
// int target = 6;
// for (int i = 0; i < arr.length; i++) {
//     if(arr[i]==target){
                    
//         flag = i;       // any no except -1 target array  me h 
//         break;         
// }

// }
// if(flag!=-1){
//     System.out.println("element is exist in array at index " + flag);
// }else{
//     System.out.println("Not existiing ");
// }





// wap to search in arrays   WITH INPUT 

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the size of the array : ");
// int  n = sc.nextInt();

// System.out.print("Enter the element of the array : ");
// int [] arr = new int[n];

// // for input purpose
// for (int i = 0; i < arr.length; i++) {
//   arr[i] = sc.nextInt(); }
  
//   // for tageting array 
//   System.out.print("Enter the element  you want to search : ");
// int target = sc.nextInt();

// boolean found = false;                        // jab bhi koi chiz pata na ho aur find karna ho to start with false becoz abhi tak hmlogo ko pata nhi h so false se start karna 
// for (int i = 0; i < arr.length; i++) {
//   if(arr[i]==target){
//     System.out.print(arr[i]+ "  ");
//     found = true;
//     break;
// }}
// if(found){
//     System.out.print("target exisiting in array ");
// }else {
//     System.out.print("Target not exist ");
// }



// sc.close();




// wap to print two sum             very very important 

// boolean twoSum(int arr[], int target)                     // is code ko bad me dekhenge but logic niche ka yad rakhna same hi chalega 
//         int n = arr.length;
//         for(int i = 0;i<n;i++){
//             for(int j = i+1;i<n;i++){
//                 if(arr[i]+arr[j]==target){
//                     return ture ;
//                 }
//             }
//         } 
//         return false;
    




// PRITN SECONDE LARGEST element IN THE ARRAY 

// int [] arr = {3,5,7,85,3,2,56,6};
// // int max = arr[0];
// int max = Integer.MIN_VALUE;
// int smax = Integer.MIN_VALUE;
// for (int i = 0; i < arr.length; i++) {
//     if(max < arr[i]){
//        max = arr[i];
//     }
// }


// for (int i = 0; i < arr.length; i++) {
//     if(smax < arr[i] && arr[i]!=max){
//        smax = arr[i];
//     }
// }
//  System.out.println(max );

//     System.out.println(smax);


// Dusra tarika ek hi loop se second maximum find karne ka 

// int [] arr = {6,3,2,7,7,3,4};
//         int max = arr[0];  //            instead of this best way write Integer.MIN_VALUE;
//         int smax = arr[0];            // instead of this best way write Integer.MIN_VALUE;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]>max){
//                 smax = max;      // iska matlab pahle max ka value smax me store ho jayega uske bad new max ka value update hoga 
//                 max = arr[i];
//         }
//             else if(arr[i]>smax && arr[i]!=max){
//                 smax = arr[i];
       
//    }
// }
// System.out.println("Max is  :" + max);
// System.out.println("Smax is  :" + smax);


// wap to find minimum values in array 

// int [] arr = {3,5,2,6,8,3,4,0};
// int min = Integer.MAX_VALUE;

// for (int i = 0; i < arr.length; i++) {
//     if(arr[i]<min){
//         min = arr[i];
//     }
// }
// System.out.println("Your minimum values is : "+ min);


// with input to find minimum number 

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the size of array : ");
// int n = sc.nextInt();

// System.out.print("Enter ther array : ");

// int arr [] = new int[n];
// int min = Integer.MAX_VALUE;
// for (int i = 0; i <arr.length; i++) {
//     arr[i] = sc.nextInt();
// }

// for (int i = 0; i <arr.length; i++) {
//    if(arr[i]<min){
//     min = arr[i];
//    }
// }
// System.out.println("Your min is : " + min);


// Print second Minimun number 

// int [] arr = {99,4,2,0,5,2};
// int min = Integer.MAX_VALUE;
// int smin = Integer.MAX_VALUE;

// for (int i = 0; i < arr.length; i++) {
    
//     if(arr[i]<min){
//         smin = min;
//         min = arr[i];
//     }else if(arr[i]<smin && arr[i]!=min){
//         smin = arr[i];
//     }
// }
// System.out.println("Your min is : "+ min);
// System.out.println("YOur second min is : "+ smin);
    


// second minimum number do loops se solve karna  dono shi h

//   int [] arr = {3,5,7,85,3,2,56,6};
 
// int min = Integer.MAX_VALUE;
// int smin = Integer.MAX_VALUE;
// for (int i = 0; i < arr.length; i++) {
//     if(min > arr[i]){
//        min = arr[i];
//     }
// }


// for (int i = 0; i < arr.length; i++) {
//     if(smin > arr[i] && arr[i]!=min){
//        smin = arr[i];
//     }
// }
//  System.out.println("YOUr min is : "+ min );
//  System.out.println("YOUr  second min is : "+ smin ); 
   

// FOR EACH LOOP 

//  What is a for-each loop?

// A for-each loop is used to access every element of an array or collection one by one.

// Syntax
// for (dataType variable : arrayName) {

//     // use variable
// }

// General form:

// for (int x : arr) {
//     System.out.println(x);
// }

// Example 1: Print all elements

// class Main {
//     public static void main(String[] args) {

//         int[] arr = {10, 20, 30, 40, 50};

//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }

// Output
// 10 20 30 40 50

// Dry Run

// Array

// Index	0	1	2	3	4
// Value	10	20	30	40	50

// Loop:

// for (int x : arr)

// Java automatically takes one element at a time.

// Iteration	x
// 1	10
// 2	20
// 3	30
// 4	40
// 5	50

// Output:

// 10 20 30 40 50
// What does it mean?

// This:

// for (int x : arr)

// is similar to saying:

// "Take each element from arr and store it in x."

// Compare with Normal for Loop

// Normal for loop

// for (int i = 0; i < arr.length; i++) {
//     System.out.print(arr[i] + " ");
// }

// Here you use the index (i).

// For-each loop

// for (int x : arr) {
//     System.out.print(x + " ");
// }

// Here you use the value directly.

// Example 2: Find Sum

// int[] arr = {5, 10, 15};

// int sum = 0;

// for (int x : arr) {
//     sum += x;
// }

// System.out.println(sum);

// Dry Run
// x	sum
// 5	5
// 10	15
// 15	30

// Output:

// 30
// Can we modify the array?

// Suppose you write:

// int[] arr = {1, 2, 3};

// for (int x : arr) {
//     x = 100;
// }

// Will the array become

// 100 100 100

// ❌ No.

// Why?

// Because x is just a copy of each element.

// Memory:

// Array

// 1  2  3

// ↓

// Iteration 1

// x = 1

// ↓

// x = 100

// Only x changes.

// The array remains

// 1 2 3
// To change the array

// Use the normal for loop.

// for (int i = 0; i < arr.length; i++) {
//     arr[i] = 100;
// }

// Now the array becomes

// 100 100 100
// When should you use for-each?

// ✅ Printing elements

// for (int x : arr)

// ✅ Calculating sum

// for (int x : arr)

// ✅ Finding maximum

// for (int x : arr)
// When should you NOT use for-each?

// ❌ When you need the index

// Example:

// System.out.println("Index = " + i);

// There is no i in a for-each loop.

// ❌ When you want to modify the array

// arr[i] = 100;

// A for-each loop doesn't give you the index, so you can't update elements this way.

// Interview Difference
// Normal for Loop	For-each Loop
// Uses index (i)	Uses element (x)
// Can modify the array	Cannot modify the array through the loop variable
// Can access arr[i]	Directly gets the value
// Best when index is needed	Best when only reading values
// ⭐ Easy Trick to Remember

// Think of the array as a basket of fruits 🍎🍌🍇.

// for (String fruit : basket)

// means:

// "Take each fruit from the basket, one at a time, and call it fruit."

// You don't care whether it's at index 0, 1, or 2—you only care about the fruit itself.

// That's exactly how the for-each loop works.


// for-each Loop (Enhanced For Loop)
// Used only for

// Arrays
// Collections (ArrayList, HashSet, etc.)

// Syntax

// for(int x : arr){
//     System.out.println(x);
// }

// Example

// int[] arr = {10,20,30};

// for(int x : arr){
//     System.out.println(x);
// }

// Output

// 10
// 20
// 30
// Can we use for-each for pattern printing?

// ❌ No

// Pattern printing needs row and column numbers.

// Example

// for(int i = 1; i <= 5; i++){

//     for(int j = 1; j <= i; j++){

//         System.out.print("* ");
//     }

//     System.out.println();
// }

// You need i and j.

// A for-each loop doesn't give you an index.

// Can we use for-each for searching?

// ✅ Yes

// int[] arr = {10,20,30};

// for(int x : arr){

//     if(x == 20){

//         System.out.println("Found");
//     }
// }
// Can we use for-each to find maximum?

// ✅ Yes

// int max = Integer.MIN_VALUE;

// for(int x : arr){

//     if(x > max){

//         max = x;
//     }
// }
// Can we use for-each to reverse an array?

// ❌ No

// Because you need indexes.

// Can we use for-each to sort?

// ❌ No

// Sorting changes elements using indexes.

// Summary Table
// Task	Best Loop
// Pattern Printing	for
// Arrays (read only)	for-each
// Arrays (modify elements)	for
// Searching	for or for-each
// Find Maximum	for or for-each
// Reverse Array	for
// Sorting	for
// Count Digits	while
// Reverse Number	while
// Armstrong Number	while
// Palindrome Number	while
// Menu Program	do-while
// Easy Trick to Remember ⭐
// 🔹 for → When you know how many times to repeat (patterns, arrays with indexes, tables).
// 🔹 while → When you repeat until a condition changes (digits, reversing numbers, Armstrong).
// 🔹 do-while → When the code must run at least once.
// 🔹 for-each → When you just want to read every element of an array or collection without caring about its index.

// This rule will help you choose the right loop in almost every beginner Java problem.


// * REVERSE ARRAY  *                    // 2 variable ya / 2 - pointer technique bhi bolte h ek chiz java me pointer nhi hota 




    //     int [] arr = {3,19,56,9,83,18,24,85,14};
    //     int n = arr.length;
    //     int i = 0 , j = n-1;         // ye sabse best tarika h array ko reverse karne ka becoz iska time and space complexcity bahut kam h so applies this code 
    //     while (i<j){
    //         int temp = arr[i];    // swaping number ka technique isme bhi aaply hua h 
    //         arr[i] = arr[j];
    //         arr[j] = temp;

    //         i++;  // i har bar ek ek bad rha h
    //         j--;  // j har bar ek ek ghat rha h 
    //     }
        
    //     for(int element : arr){
    //     System.out.print(element + " ");
    // }



    // INSTEAD OF THIS CODE YOU CAN ALSO WRITE THIS         Method 2: Using a New Array

//     int [] arr = {3,19,56,9,83,18,24,85,14};
//    int []  rev = new int[arr.length];
//    for (int i = 0; i < arr.length; i++) {
//        rev[i] = arr[arr.length-1-i];
//    }
//    for(int data : rev){
//     System.out.print(data+" ");
//    }

//Method 3: Print in Reverse (Without Changing the Array) 



// int [] arr = {3,19,56,9,83,18,24,85,14};
// for (int i = arr.length-1; i >= 0; i--) {   //⚠️ The original array is not modified.  isme ya 2nd method me original array change nhi hota but upper wala me changing hota h so used while wala 
//     System.out.print(arr[i]+" ");
// }


    //                     ##  ROTATION OF ARRAY    ##

    //    TWO TYPES KE ROTATION HOTI H PAHLI LEFT OR DUSRI RIGHT ROTATION 

    //     * RIGHT ROTATION BY 1 

    // int [] arr = {3,19,56,9,83,18,24,85,14};
        
    //     // right rotation by 1 
        
    //     int last = arr[arr.length-1];
        
    //     for(int i = arr.length-1;i>0;i--){
    //         arr[i] = arr[i-1];
    //     }
        
    //     arr[0] = last;
        
        
        
    //     for(int element : arr){
    //     System.out.print(element + " ");
    // }


 //  LEFT ROTATION BY 1 

//   int [] arr = {3,19,56,9,83,18,24,85,14};           // KHUD SE DRY RUN KAR KE EK BAR DEKH LENA 
        
//         // left Rotation by 1 
        
//        int first = arr[0];
       
//        for(int i =0;i<arr.length-1;i++){
//            arr[i] = arr[i+1];
//        }
        
//         arr[arr.length-1] = first;
        
//         for(int element : arr){
//         System.out.print(element + " ");
//     }



//            **   MISSING IN ARRAY     **



//    MISSING IN ARRAY                 ye hmne sum se solve kiya h 

//   int [] arr = {1,2,3,4,6};
// int n = 6;                      // yaha pr ye ya arr.length +1 likhna kyuki ek number MISSING h isliye ok dono shi h 
//  int sum = n*(n+1)/2;

//  int actualSum = 0;
//  for(int data : arr){
//     actualSum += data;
//  }
// int MISSING = sum - actualSum;

// System.out.println(MISSING);


// Method 2: Brute Force


// int [] arr = {1,2,3,4,6};
//  int n = 6; 
// for(int i = 1;i<=n;i++){
//     boolean found = false;

//    for(int x : arr){
//     if(x==i){
//         found = true;
//         break;
//     }
//    }
//    if(!found){
//     System.out.println("missing no is : " + i);
//    }


// }


//Method 3: XOR (Interview Favorite)


        // int[] arr = {1,2,4,5};

        // int n = 5;

        // int xor1 = 0;
        // int xor2 = 0;

        // for(int i = 1; i <= n; i++){
        //     xor1 ^= i;
        // }

        // for(int x : arr){
        //     xor2 ^= x;
        // }

        // System.out.println(xor1 ^ xor2);



        //              **    Segregate 0s and 1s   **



//         class Solution {
//     void segregate0and1(int[] arr) {
//         // code here
//         //Arrays.sort(arr);    // sirf isase bhi ho jayega but we want to write logic 
// int [] arr = {0,1,0,1,1,0};
//         int zero =0;
//         int one = 0;  // isme do loop ek sath traverse ho rhe h isliye ise two pass solution ya two pass trverse bolte h 
//         for(int ele : arr){
//             if(ele==0) zero ++;
//             else one ++;
//         }
//         for(int i =0;i<zero;i++){
//             arr[i] = 0;
//         }
//         for(int i =zero;i<arr.length;i++){
//             arr[i] = 1;
//         }
//         for(int ele : arr){
//             System.out.print(ele + " ");
//         }
        
        
//     }
// }


// isko dono ko pahle dry run karo tabhi samjh me aayega 
// int [] arr = {0,1,0,1,1,0};
//  int n = arr.length;
//         int i = 0 , j = n-1;
//         while(i<j){
//             if(arr[i]==0) i++;
//             else if ( arr[j]==1) j--;
//             else if(arr[i]==1 && arr[j]==0){
//                 arr[i] = 0;
//                 arr[j] = 1;
//                 i++;
//                 j--;
//             }

// }

  //            **  WAVE ARRAY   **

//   class Solution {
//     public void sortInWave(int arr[]) {
//         // code here
//         //for(int i = 0;i<arr.length;i+=2){  // ye dono shi h niche wala bhi dekho lo dono shi h
//             //if(i==arr.length-1) break;
//             for(int i = 0;i<arr.length-1;i+=2){
//             int temp = arr[i];
//             arr[i] = arr[i+1];
//             arr[i+1] = temp;
            
//         }
//     }
// }

// class Solution {
//     public void sortInWave(int arr[]) {
//         // code here
//         //for(int i = 1;i<arr.length;i+=2){  // ye dono shi h niche wala bhi dekho lo dono shi h
//             //if(i==arr.length-1) break;
//             for(int i = 0;i<arr.length;i+=2){
//             int temp = arr[i];
//             arr[i] = arr[i-1];
//             arr[i-1] = temp;
            
//         }
//     }
// }


 //                                  ***  ArrayList  ***          

// What is an ArrayList?

// An ArrayList is a dynamic array.  // Dynamic means change hota rahega 

// Array → Fixed size
// ArrayList → Size can grow or shrink automatically

// Example:

// int[] arr = new int[5];

// This array can store only 5 elements.

// But an ArrayList can keep growing:

// ArrayList<Integer> list = new ArrayList<>();           // ArrayList create karte h ayese 

// You can add as many elements as you want.

// Why do we use ArrayList?

// Suppose you don't know how many numbers the user will enter.

// With an array:

// int[] arr = new int[100];

// What if the user enters 101 numbers?

// Problem!

// With ArrayList, Java automatically increases the size.

// Import Statement

// import java.util.ArrayList;  // ye har bar likhna hi hai jaruri h 
// Creating an ArrayList
// import java.util.ArrayList;

// class Main {
//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//     }
// }

// Adding Elements

// list.add(10);
// list.add(20);
// list.add(30);

// Now the list contains:

// [10, 20, 30]
// Complete Example

// import java.util.ArrayList;

// class Main {

//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(10);
//         list.add(20);
//         list.add(30);

//         System.out.println(list);
//     }
// }

// Output

// [10, 20, 30]
// Accessing Elements

// Just like arrays.

// System.out.println(list.get(0));

// Output

// 10
// Updating an Element
// list.set(1, 100);

// Before

// [10,20,30]

// After

// [10,100,30]
// Removing an Element
// list.remove(1);

// Before

// [10,100,30]

// After

// [10,30]
// Size of ArrayList
// System.out.println(list.size());

// Output

// 2

// Notice:

// For arrays

// arr.length

// For ArrayList

// list.size()
// Traversing Using Normal for Loop
// for(int i = 0; i < list.size(); i++){
//     System.out.println(list.get(i));
// }

// Output

// 10
// 20
// 30
// Traversing Using For-each Loop
// for(int x : list){
//     System.out.println(x);
// }

// Output

// 10
// 20
// 30

// This is exactly like the for-each loop you learned for arrays.

// Useful Methods
// Method	Description
// add(x)	Add element
// get(i)	Get element
// set(i, x)	Update element
// remove(i)	Remove by index
// size()	Number of elements
// contains(x)	Check if element exists
// clear()	Remove all elements
// isEmpty()	Check if the list is empty
// Example
// import java.util.ArrayList;

// class Main {

//     public static void main(String[] args) {

//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(5);
//         list.add(10);
//         list.add(15);

//         System.out.println(list.get(1));

//         list.set(1,50);

//         System.out.println(list);

//         list.remove(0);

//         System.out.println(list);

//         System.out.println(list.size());

//     }
// }

// Output

// 10
// [5, 50, 15]
// [50, 15]
// 2
// Array vs ArrayList
// Array	ArrayList
// Fixed size	Dynamic size
// arr.length	list.size()
// arr[i]	list.get(i)
// arr[i] = x	list.set(i, x)
// Faster	Slightly slower
// Can store primitives (int)	Stores wrapper classes (Integer)
// Why Integer instead of int?

// ArrayList stores objects, not primitive types.

// So instead of:

// ArrayList<int> list;

// (which is invalid)

// you write:

// ArrayList<Integer> list;

// Java automatically converts between int and Integer when needed (this is called autoboxing and unboxing).

// Interview Questions
// What is an ArrayList?
// Difference between Array and ArrayList.
// Why do we use Integer instead of int?
// Difference between length and size().
// How do you add, remove, update, and access elements?
// 📚 Recommended Learning Order

// Since you've already completed most array basics, I'd suggest this sequence:

// ✅ Arrays (completed)
// ✅ Searching (Linear, Binary)
// ✅ Array problems (Missing Number, Wave Array, Segregate 0s & 1s)
// ✅ ArrayList
// ➜ Strings
// ➜ Sorting (Bubble, Selection, Insertion)
// ➜ Recursion
// ➜ Linked List

// This order builds on what you've already learned and is excellent for placement preparation.


// import java.util.ArrayList;  // ye important h likhna warna arraylist kam nhi karega aur ha camel case me hi likha like pahle capital and small then capital then small like this ArrayList ;

// class Main {
//     public static void main(String[] args) {
        
       // ArrayList <Integer> list = new ArrayList <> ();
        
        
//         // ADDing element in arraylist 
        
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);


 //  System.out.println(list);         // ye pure ArrayList ko hi ek sath print kar dega backend me internally loop hi lag rha h like this [10, 20, 30, 40, 50]
        
// upar jo print kiya h wah traverse nhi kar rha h java backend me kar de rha h but aap isme traverse nhi kar pa rhe ho so best niche ka tarika h 




        // Accessing element 
    //     System.out.println(list.get(0));
        
        // Updating arraylist element 
        
    //     list.set(3,300);  // isase uske index se update kar sakte ho 
        
    //   System.out.println(list.get(3)); 
        
         // arraylist ka size pata karna 
        
    //     System.out.println(list.size());
        
        
        // for loop se sare element ko access karna 
        
        // for(int i = 0;i<list.size();i++){
        //     System.out.println(list.get(i));  // aap arraylist mese sare element ko access kar loge 
        // }
        
        // for each loop se access karna 
        
        // for(int ele : list){
        //     System.out.println(ele);
        // }
        
        
        // list.remove(4);  // 4 no wala index ab delete ho chuka h 
         //System.out.println(list.get(4)); // isliye error show kar rha h 
        // System.out.println(list.size());  // isliye 4 show kar rha h 
        
        
//     }
// }


// list.add(1,900);   // dono element ke bich me element ko ghused deta h 
// System.out.println(list);

// last element ko remove karna 

// array me arr.length - 1 hota tha but isme 
// list.remove(list.size()-1);  // isase last element delete ho jayega ;
// System.out.println(list);

// reverse element ko print karna 

// but ye likhne se pahle aapko suru me import java.util.Collections likhna jaruri h 

// Collections.reverse(list);  // isase reverse element print ho jayega 
// System.out.println(list);

// dursa method  reverse print karana tha 

// int i = 0 , j = list.size()-1;
//  while(i<j){
//     int temp = list.get(i);
//     list.set(i,list.get(j));
//     list.set(j,temp);
//     i++;
//     j--;
//         }
        // for(int ele : list)           // aap isko for loop ke bina bhi print kar sakte ho like this
        // System.out.print(ele+" ");

//    System.out.print(list+" ");


// aap ArrayList  ko different different data types se bhi likh sakte ho 

// ArrayList <Character>  arr = new ArrayList<> ();       // <> isko aap empty chhod do ya yaha pr bhi same data types <Character> dega ;
// ArrayList <Double>  arr1 = new ArrayList<> ();
// ArrayList <String>  arr5 = new ArrayList<> ();
// ArrayList <Long>  arr6 = new ArrayList<> ();


// isi ko aap vector bologe so instead of ArrayList aap vector bhi use kar sakte ho but vector thoda slow h ArrayList se so ArrayList ka use karna best h

// Example 


// Vector <Integer> list1 = new Vector <> ();
        
        
//         // ADDing element in vector 
        
//         list1.add(10);
//         list1.add(20);
//         list1.add(30);
//         list1.add(40);
//         list1.add(50);


//class Solution {
    // Function for adding one to the number represented by the array
//     Vector<Integer> addOne (int[] arr) {
//          Vector<Integer> ans = new Vector<>();  
//        int n = arr.length;
//        int carry = 1;
//        for(int i = n-1;i>=0;i--){
//            if(arr[i]+carry<=9){
//              ans.add(arr[i]+carry);
//              carry = 0;
//            }else {
//                ans.add(0);
//                carry = 1;
//            }
//        }
//        if(carry==1) ans.add(1);
//        Collections.reverse(ans);
//        return ans;
        
//     }
// }              dry run this code


//         VERY VERY IMPORTANT        **       MERGE TWO SORTED ARRAY    **        VERY VERY IMPORTANT SO ACHHE SE PADH LENA ISE 




//         int [] arr1 = {1,3,5,7,9,10};
//         int [] arr2 = {2,4,6,8,11,15,68};
//         int n = arr1.length;
//         int m = arr2.length;
//         int [] ans = new int[n+m];
//         int i =0,j=0,k=0;
//         while(i<n && j<m){
//             if(arr1[i]<arr2[j]){
//                 ans[k] = arr1[i];
//                 i++;
//             }else{
//                 ans[k] = arr2[j];
//                 j++;
//             } k++;
            
//         }
        
//         // while(i<n){
//         //     ans[k] = arr1[i];    //  AAP IS CODE KO HIDE KARKE BHI PRINT KARA SAKTE HO 
//         //     i++;
//         //     k++;
//         // }

//         while (j<m){
//             ans[k] = arr2[j];
//             j++;
//             k++;
//         }
       
//         for(int ele : ans){
            
//         System.out.print(ele+" ");
//     }
// 

// Method 2: Copy + Sort (Easy)

// Copy both arrays into one new array.
// Sort the new array.

// Code
// import java.util.Arrays;

// class Main {
//     public static void main(String[] args) {

//         int[] arr1 = {1, 3, 5};
//         int[] arr2 = {2, 4, 6};

//         int[] ans = new int[arr1.length + arr2.length];

//         int k = 0;

//         for (int i = 0; i < arr1.length; i++) {
//             ans[k++] = arr1[i];
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             ans[k++] = arr2[i];
//         }

//         Arrays.sort(ans);

//         for (int x : ans) {
//             System.out.print(x + " ");
//         }
//     }
// }

// Output

// 1 2 3 4 5 6
// Complexity
// O((n+m) log(n+m))

// Easy to understand, but not preferred in interviews because the arrays are already sorted.

// Method 3: Nested Loops (Not Recommended)

// This method compares every element.

// for(int i = 0; i < arr1.length; i++) {
//     for(int j = 0; j < arr2.length; j++) {
//         // compare
//     }
// }

// Time Complexity

// O(n × m)

// ❌ Very slow.

// Comparison
// Method	Time	Interview
// Two Pointer	O(n + m)	⭐⭐⭐⭐⭐
// Copy + Sort	O((n+m) log(n+m))	⭐⭐
// Nested Loops	O(n × m)	❌
// Which one should you learn?

// Since you're preparing for coding interviews, learn the Two Pointer method first. It is the standard solution expected by interviewers.

// ⭐ One More Interview Question

// There is another famous problem:

// Merge two sorted arrays without using extra space.

// Example:

// arr1 = {1,3,5}
// arr2 = {2,4,6}

// After merging:

// arr1 = {1,2,3}
// arr2 = {4,5,6}

// This problem is harder and uses techniques like the Gap Method (Shell Sort idea) or swapping followed by sorting. It's commonly asked in companies like Amazon, Microsoft, and Adobe.

// Since you're still building your array fundamentals, I recommend mastering the normal two-pointer merge first before moving on to the "without extra space" version.


 // ISKO ALSO CALLED 3 Pointer technique BHI BOLTE H 

// ISKO Function SE SOVLE KAR RHE H 
//public static void main(String[] args) {
        //  int [] a = {1,3,5,7,9,10};
        // int [] b = {2,4,6,8,11,15,68};
        // int n = a.length;
        // int m = b.length;
        // int [] ans = new int[n+m];
        //   merge(ans,a,b); 
        //   int i = 0,j=0,k=0;
        //   public static void merge(int [] ans,int [] a,int [] b){
        //     int n = a.length;
        //     int m = b.length;
        //     int i =0,j=0,k=0;
        //     while(i<n && j<m){
        //         if(a[i]<b[j]){
        //             ans[k] = a[i];
        //             i++;
        //         }else{
        //             ans[k] = b[j];
        //             j++;
        //         } k++;

        //     }

            // while(i<n){
            //     ans[k] = arr1[i];    //  AAP IS CODE KO HIDE KARKE BHI PRINT KARA SAKTE HO 
            //     i++;
            //     k++;
            // }

        //     while (j<m){
        //         ans[k] = b[j];
        //         j++;
        //         k++;
        //     }

        //    for(int ele : ans){

        //    System.out.print(ele+" ");
  



//}


//   SEGRAGATE OS ,1S AND 2S IN ARRAY  (VERY IMPORTANT)   ye interview me bahut pucha jata h

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


        // int [] arr = {0,1,0,2,0,1,0,2,1,2,1,0,2,1,0};
        // int zero = 0,one =0,two = 0;
        // for(int ele : arr){
        //     if(ele ==0) zero ++;
        //     else if(ele ==1) one ++;
        //     else two++;
        // }
        // for(int i=0;i<zero;i++){
        //     arr[i]= 0;
        // }
        // for(int i = zero;i<zero+one;i++){
        //     arr[i] = 1;
            
        // }
        // for(int i =zero+one;i<arr.length;i++){
        //     arr[i] = 2;
        // }
        // for(int ele : arr){
        //   System.out.print(ele+" ");  
        // }
        
   




































}}

