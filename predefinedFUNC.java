
import java.util.Scanner;

public class predefinedFUNC {


// NOTE : EK CHIZ HAMESHA YAD RAKHNA FUNCTIN AAP KITNA BHI BANAYE YA UPPER YA NICHE YA BICH ME PAHLE RUN MAIN FUCNTION HI KAREGA USKI BAD JO BHI FUNCTION KO CALL KARENGE WAH RUN karega 

// MAIN FUCNTION :  public static void main(String[] args) {} YE YAH YAHI PAHLE RUN KAREGA 



// public static void Anup(){
//     System.out.println("Namste jii");
// }

//                                        // ek aur chiz main fucntion ek time hi chalega bar bar run nhi karega but aur function bar bar call kiya ja sakta h but main function ko call nhi kiya ja sakta h 
//     public static void main (String[] args){
//         System.out.println("Hello JII");      // pahle ye run karega kyuki main function h aur isme kisi function ko call nhi kiya h abhi 
//    Anup();                              // ab anup ko call kar rha h to anup bhi run karega 
// raja();                                     // ab raja ko bhi call karega function ke ander jo bhi chiz hai waha sara run karega agar function ko hm call kare 
//  }

// public static void raja(){
//     System.out.println("Where is my Queen ");
//     for (int i = 0; i < 10; i++) {
//         System.out.print(i+" ");
        
//     }
// }



// public static void trisul(){
   
//     System.out.println("Vishal");
// }

// public static void main (String[] args){
// kunjal();

// }

// public static void kunjal(){
//     System.out.println("Ankuj");
//     payal();
// }

// public static void payal() {
//     trisul();
//     System.out.println("ninja"); 
//     trisul();
// }




// public static void sankh(){
                                                               // ye function infinite times runs karega kabhi end hi nhi hoga just like loop infinite
//     System.out.println("Vishal");
// }

// public static void main (String[] args){
// sreya();

// }

// public static void sreya(){
//     System.out.println("Ankuj");
//     pradeep();
// }

// public static void pradeep() {
//     sankh();
//     System.out.println("ninja"); 
//     sreya();
// }


//   Lets knows parameters and arguments in coding .

// public static void  sum(int a , int b){   // small bracket ke ander jo bhi chiz h usko parameters bolte h 
 
//   System.out.println(a+b);
    
// }

// public static void  max(int a , int b){   // small bracket ke ander jo bhi chiz h usko parameters bolte h 
 
 
    
 
// }

// public static void main (String[] args){

//  //sum(5,8);                                 //     is code ko arguments bolte h 

// max(4,90);                                  // isko bhi same hi bolte h 



  // Lets know about      return types   in function 


// General Syntax


// returnType functionName(parameters) {

//     // code

//     return value;
// }



// Example:

// int add(int a, int b) {
//     return a + b;
// }


// Types of Functions (Based on Return Type)

// There are 2 main return types:

// 1. void Function (Returns Nothing)

// void means:

// "I don't return any value."

// Example:

// class Main {

//     static void hello() {
//         System.out.println("Hello");
//     }

//     public static void main(String[] args) {
//         hello();
//     }
// }

// Output:

// Hello

// Notice:  There is no return statement.


// 2. Function with Return Type

// Suppose:

// static int add(int a, int b) {
//     return a + b;
// }

// Call:

// int ans = add(10, 20);
// System.out.println(ans);

// Output:

// 30

// The function returns the value 30.

// Different Return Types
// int
// static int square(int n) {
//     return n * n;
// }

// Returns:

// 25
// double
// static double area(double r) {
//     return 3.14 * r * r;
// }

// Returns a decimal value.

// boolean
// static boolean isEven(int n) {

//     if(n % 2 == 0)
//         return true;

//     return false;
// }

// Output:

// true

// or

// false


// char
// static char grade() {
//     return 'A';
// }

// Returns

// A

// String
// static String name() {
//     return "Yuvii";
// }

// Returns

// Yuvii

// Difference Between void and int
// void
// static void add(int a, int b) {
//     System.out.println(a + b);
// }

// Call:

// add(10,20);

// Output:

// 30

// The function prints the answer itself.

// int
// static int add(int a, int b) {
//     return a + b;
// }

// Call:

// System.out.println(add(10,20));

// Output:

// 30

// The function returns the answer to the caller, which can then print it, store it in a variable, or use it in another calculation.

// Why do we use return?

// Example:

// static int add(int a, int b) {
//     return a + b;
// }

// When you call:

// int x = add(10,20);

// Think like this:

// add(10,20)

// ↓

// return 30

// ↓

// int x = 30

// So now

// x = 30
// Why not just print?

// Suppose:

// static void add(int a, int b) {
//     System.out.println(a + b);
// }

// You cannot do this:

// int x = add(10,20);   // ❌ Error

// because void returns nothing.

// But with int:

// int x = add(10,20);   // ✅

// works perfectly.

// Interview Classification

// Functions are usually classified into 4 types:

// Parameters   	Return Type    	Example
// ❌ No	        ❌ No (void)   	hello()
// ✅ Yes      	❌ No (void)	    printTable(int n)
// ❌ No	        ✅ Yes	          getPi()
// ✅ Yes       	✅ Yes	          add(int a, int b)


// Example of all 4

// 1. No Parameters, No Return
// static void hello() {
//     System.out.println("Hello");
// }

// 2. Parameters, No Return
// static void table(int n) {
//     for(int i = 1; i <= 10; i++) {
//         System.out.println(n * i);
//     }
// }

// 3. No Parameters, Return
// static int getNumber() {
//     return 100;
// }

// 4. Parameters, Return
// static int multiply(int a, int b) {
//     return a * b;
// }
// My recommendation for learning

// Since you're just starting with methods, learn them in this order:

// void methods (no return)
// int return methods
// boolean return methods (very common for isPrime(), isPalindrome(), isPerfect())
// String and char return methods

//Once you're comfortable with these, Java methods will become much easier to understand.

// Quest Find the permutation and combination 

//for permutation =  nCr = n!/r!*(n-r)!      
// for combination = nPr = n!/(n-r)!

// without function aap isko ayese bana sakte h 

// public static void main(String[] args) {
  
//  Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int r = sc.nextInt();

// int fact = 1;

// for(int i =1;i<=n;i++){
// fact *=i;
// }

// int d = 1;

// for(int i =1;i<=r;i++){
// d *=i;
// }


// int p = 1;
// for(int i =1;i<=n-r;i++){
// p *=i;
// }


// int nCr = fact/(d*p);
// System.out.println(nCr);              // ye code bahut lengthy hai  isko bar bar ek hi chiz likhna pad rha iske jagah hm function ya methods likh sakte h like this 


// int nCr = fact(n)/(fact(r)*fact(n-r));
// int nPr = fact(n)/(fact(n-r));
// System.out.println("permutation is : "+nCr);
// System.out.println("combination  is : "+nPr);


// }

// public static int fact(int x) {
 


//   int fact = 1;
//   for(int i =1;i<=x;i++){
//     fact *=i;
//   }
//   return fact;
    
// }

// public static void passvalue(int x) {
//   x = 15;
  
// }
// public static void main(String[] args) {
  

//   int x = 6;
//   System.out.println(x);     // ye only 6 or again 6 print karega kyuki yah pass by value h original value ko copy kar ke usi value ko return karta h baki dusre function ko return nhi karta h    
//   passvalue(x);
//   System.out.println(x);
// }

// Java has only Pass by Value.

// There is no true pass by reference in Java.

// Let's understand it from the beginning.

// 1. Pass by Value

// In pass by value, Java sends a copy of the variable.

// Example:

// class Main {

//     static void change(int x) {
//         x = 100;
//     }

//     public static void main(String[] args) {

//         int x = 10;

//         change(x);

//         System.out.println(x);
//     }
// }

// Dry Run

// Initially

// main()

// x = 10

// Call

// change(x);

// Java copies the value.

// main()           change()

// x = 10           x = 10

// Inside function

// x = 100;

// Now

// main()           change()

// x = 10           x = 100

// Function ends.

// change()'s x is destroyed.

// main()

// x = 10

// Output

// 10

// 2. What people call "Pass by Reference"

// Many beginners think this is pass by reference.

// Example:

// class Student {
//     int age;
// }

// class Main {

//     static void change(Student s) {
//         s.age = 25;
//     }

//     public static void main(String[] args) {

//         Student s = new Student();

//         s.age = 20;

//         change(s);

//         System.out.println(s.age);
//     }
// }

// Output

// 25

// Many people say,

// "Java passed the object by reference."

// ❌ This is not correct.

// What actually happens?

// Memory:

// Student Object

// age = 20

// Variable:

// s

// ↓

// Object

// When you call

// change(s);

// Java copies the reference.

// main()                 change()

// s -------------\       s -------------\
//                 \                      \
//                  -------> Object <------
//                            age = 20

// There are two references.

// But both point to the same object.

// When you do

// s.age = 25;

// you modify the same object.

// Therefore

// age = 25

// Output

// 25
// Proof that Java is NOT Pass by Reference

// Look carefully.

// class Student {
//     int age;
// }

// class Main {

//     static void change(Student s) {

//         s = new Student();

//         s.age = 100;
//     }

//     public static void main(String[] args) {

//         Student s = new Student();

//         s.age = 20;

//         change(s);

//         System.out.println(s.age);
//     }
// }
// What do you think prints?

// Many beginners think

// 100

// Actually

// 20

// Why?

// Because

// s = new Student();

// changes only the copied reference.

// The original reference inside main() still points to the first object.

// Memory Diagram

// Before

// main()

// s ---------> Object A
//               age = 20

// Function call

// main()             change()

// s ------\          s ------\
//          \                  \
//           ---> Object A <-----
//                age = 20

// Now execute

// s = new Student();

// Now

// main()                 change()

// s --------> Object A   s --------> Object B
//             age=20                age=100

// Function ends.

// Object B is no longer referenced.

// main() still points to Object A.

// Output

// 20
// Interview Answer

// Question: Does Java support pass by reference?

// Answer:

// No.

// Java is 100% pass by value.

// Primitive variables → copy of the value is passed.
// Objects → copy of the reference is passed.
// Easy Table
// Data Type	What is Passed?	Original Changes?
// int	Copy of value	❌ No
// double	Copy of value	❌ No
// char	Copy of value	❌ No
// boolean	Copy of value	❌ No
// Object	Copy of reference	✅ Object's fields can change
// Easy Trick to Remember

// Imagine a house and its address:

// The house = Object
// The address = Reference

// When Java calls a method, it doesn't give the original address card.

// It makes a photocopy of the address.

// So both people have:

// Address Copy
//       ↓
//    Same House

// If one person paints the house, both see the new color, because it's the same house.

// But if one person writes a new address on their own photocopy, the other person's address doesn't change.

// That's exactly how Java handles objects. It copies the reference, not the object itself, which is why Java is still pass by value.


// Swap two number ka code same like this  

// class Main {
//     public static void main(String[] args) {

//         int a = 5, b = 10;

//         int temp = a;

//         a = b;

//         b = temp;

//         System.out.println(a + " " + b);
//     }
// }


// Step 1
// int a = 5, b = 10;

// Memory:

// Variable	Value
// a	5
// b	10
// Step 2
// int temp = a;

// temp stores the value of a.

// Memory:

// Variable	Value
// a	5
// b	10
// temp	5

// Think of temp as a temporary box that safely stores a before you overwrite it.

// Step 3
// a = b;

// The value of b is copied into a.

// Memory:

// Variable	Value
// a	10
// b	10
// temp	5

// Notice that the original value 5 would have been lost if we hadn't saved it in temp.

// Step 4
// b = temp;

// The saved value from temp is copied into b.

// Memory:

// Variable	Value
// a	10
// b	5
// temp	5

// Now the values have been swapped.

// Step 5
// System.out.println(a + " " + b);

// Output:

// 10 5
// Visual Representation
// Initially
// a = 5
// b = 10
// Save a
// temp = 5

// a = 5
// b = 10
// temp = 5
// Copy b into a
// a = 10
// b = 10
// temp = 5
// Copy temp into b
// a = 10
// b = 5
// temp = 5
// Why do we need temp?

// Imagine you try to swap without it:

// a = b;
// b = a;

// Dry run:

// Initially:

// a = 5
// b = 10

// After:

// a = b;
// a = 10
// b = 10

// Now do:

// b = a;
// a = 10
// b = 10

// The original 5 is gone forever.

// That's why we first save it in a temporary variable:

// temp = a;

// so we can restore it later.































































































}




















