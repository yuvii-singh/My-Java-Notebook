//  IMPORTANT NOTES TO REMEMBER
//  1.  Time Complexity is the measure of the amount of time an algorithm takes to complete as a function of the length of the input.
//  2.  Time Complexity is usually expressed using big O notation, which describes the upper bound of the growth rate of an algorithm's running time.
//  3.  Common time complexities include O(1), O(log n), O(n), O(n log n), O(n^2), and O(2^n).  

// 4.  The time complexity of an algorithm can be affected by factors such as the size of the input, the number of operations performed, and the efficiency of the algorithm's implementation.  
// 5.  Analyzing the time complexity of an algorithm is important for understanding its performance and scalability, and can help in choosing the most efficient algorithm for a given problem.  
// 6.  Time complexity can be analyzed using various techniques, such as counting the number of operations performed, analyzing the algorithm's control flow, and using mathematical analysis to derive the growth rate of the algorithm's running time.


// SPACE COMPLEXITY
// 1. Space complexity is the measure of the amount of memory an algorithm uses as a function of the length of the input.
// 2. Space complexity is usually expressed using big O notation, which describes the upper bound of the growth rate of an algorithm's memory usage.
// 3. Common space complexities include O(1), O(n), O(n^2), and O(2^n).
// 4. The space complexity of an algorithm can be affected by factors such as the size of the input, the number of variables used, and the efficiency of the algorithm's implementation 


// AGAR 0(K+-n) ho to ye bhi 0(n) hi hoga. 0(n) ka matlab hai ki algorithm ka time complexity input ke size ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi double ho jayega.

// agar 0(K) ho to ye bhi 0(1) hi hoga. 0(1) ka matlab hai ki algorithm ka time complexity constant hai, yaani ki input ke size ke badhne se algorithm ka running time nahi badhta.

// agar 0(n-7) ho to ye bhi 0(n) hi hoga. 0(n) ka matlab hai ki algorithm ka time complexity input ke size ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi double ho jayega.

// agar 0(2n) ho to ye bhi 0(n) hi hoga. 0(n) ka matlab hai ki algorithm ka time complexity input ke size ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi double ho jayega.

// agar 0(n^2 + n) ho to ye bhi 0(n^2) hi hoga. 0(n^2) ka matlab hai ki algorithm ka time complexity input ke size ke square ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time char guna ho jayega.

// agar 0(n^2 + n + 1) ho to ye bhi 0(n^2) hi hoga. 0(n^2) ka matlab hai ki algorithm ka time complexity input ke size ke square ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time char guna ho jayega.

// agar 0(3n+8) ho to ye bhi 0(n) hi hoga. 0(n) ka matlab hai ki algorithm ka time complexity input ke size ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi double ho jayega.

// ek chiz yad rakhna hamesha agar do loop h aur dono alag alag h to dono ka time  0(n) + 0(n) = 0(2n) = 0(n) hoga. Agar do loop nested h to dono ka time 0(n^2) hoga.
// Example for(int i = 1 ;i<=n;i++){ 
//System.out.println(i);}
// for(int j = 1 ;j<=n;j++) {    // YE DO loop alag alag h to dono ka time 0(n) + 0(n) = 0(2n) = 0(n) hoga.
//} 

// another one important point is agar loop ke ander multiple statements h to dono ka time 0(n) hoga. Example for(int i = 1 ;i<=n;i++){
//System.out.println("Hello");
//System.out.println("World");  // YE DO statement h to dono ka time 0(n) hoga. 0(n) + 0(n) = 0(2n) = 0(n) hoga
// System.out.println("Hello World");  // YE tin statement h to tino ka time 0(n) hoga. 0(n) + 0(n) + 0(n) = 0(3n) = 0(n) hoga  chahe jitna bhi statement h loop ke ander dono ka time 0(n) hi hoga.

// agar do loop h aur dono alag alag h like ek n tak to dusra m tak to dono ka time 0(n) + 0(m) = 0(n+m) hoga. Agar do loop nested h to dono ka time 0(n*m) hoga. Example
//  for(int i = 1 ;i<=n;i++){
//System.out.println(i);}
// for(int j = 1 ;j<=m;j++) {    // YE DO loop alag alag h to dono ka time 0(n) + 0(m) = 0(n+m) hoga.
//}

// agar aap loop 100 tak ya 1000 tak ya 10000 tak chala rahe ho to iska time complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka time complexity constant hai, yaani ki input ke size ke badhne se algorithm ka running time nahi badhta. Example
//  for(int i = 1 ;i<=100;i++){

//}

// aapne jitne abhi tak solve  kiya h question like sum,min,max,smax,smix,product,reverse,sort,search ,linear  insab ka time complexity 0(n) hoga. 0(n) ka matlab hai ki algorithm ka time complexity input ke size ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi double ho jayega.

// SPACE COMPLEXITY & AUXILIARY SPACE 

// space complexity : space complexity is the measure of the amount of memory an algorithm uses as a function of the length of the input. It includes both the space used by the input and the space used by the algorithm itself.
// auxiliary space : auxiliary space is the extra space or temporary space used by an algorithm to solve a problem. It does not include the space used by the input.


// auxiliary space : why its need because some algorithm use extra space to solve a problem. For example, merge sort uses extra space to merge two sorted arrays. The auxiliary space used by merge sort is O(n) because it creates a temporary array of size n to store the merged result.
// agar extra space nhi liya to algorithm ka auxiliary space 0(1) hoga. 0(1) ka matlab hai ki algorithm ka auxiliary space constant hai, yaani ki input ke size ke badhne se algorithm ka auxiliary space nahi badhta. Example : bubble sort, insertion sort, selection sort, quick sort (in-place), heap sort (in-place) etc.

// agar do loop ek sath run kare outer loop n tak aur inner loop m tak to algorithm ka time complexity o(n*m) hoga  Example :
//  for(int i = 1 ;i<=n;i++){
//  for(int j = 1 ;j<=m;j++) {
// sout("Hello World");  // YE DO loop nested h to dono ka time complexity 0(n*m) hoga. 0(n) * 0(m) = 0(n*m) hoga 
// } }


// agar do loop ek sath run kare outer loop n tak aur inner loop bhi n tak to algorithm ka time complexity o(n^2) hoga  Example : isko Quadratic time bolte h 
// for(int i = 1 ;i<=n;i++){
// for(int j = 1 ;j<=n;j++) {
// sout("Hello World");  // YE DO loop nested h to dono ka time complexity 0(n^2) hoga. 0(n) * 0(n) = 0(n^2) hoga aur space complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka space complexity constant hai, yaani ki input ke size ke badhne se algorithm ka space complexity nahi badhta.
// } }

// important ***

// agar do loop ho like this for(int i = 1 ;i<=n;i++){
// for(int j = 1 ;j<=i;j++) {
// sout("Hello World");  // YE DO loop nested h to dono ka time complexity 0(n^2) hoga. 0(n) * 0(n) = 0(n^2) hoga aur space complexity 0(1) hoga.


// ek loop n tk chal rha h dura i tak to formula n = n(n+1)/2 hoga. iska time complexity 0(n^2) hoga. 0(n) * 0(n) = 0(n^2) hoga aur space complexity 0(1) hoga. iska bhi o(n^2) hoga.



// 0(n^2 + n) hoga kyuki niche 2 ko constant h to chod do to n^2 ka highest priority hoga i mean uska aukat jyada h normal n se isliye (n^2) hoga yad rakhna 

// agar do loop ek sath run kare outer loop n tak aur inner loop bhi n tak like this 

// for(int i = 1 ;i<=n;i++){
// for(int j =i+1 ;j<=n;j++) {
// sout("Hello World");  // YE DO loop nested h to dono ka time complexity 0(n^2) hoga. 0(n) * 0(n) = 0(n^2) hoga aur space complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka space complexity constant hai, yaani ki input ke size ke badhne se algorithm ka space complexity nahi badhta.
// } } 

// because inner loop ka starting point i+1 h to iska time complexity 0(n^2) hoga. 0(n) * 0(n) = 0(n^2) hoga aur space complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka space complexity constant hai, yaani ki input ke size ke badhne se algorithm ka space complexity nahi badhta.


// agar do ek loop ho like this 
// for(int i = 1 ;i<=n;i*=2){
//sout("Hello World");  // YE loop ka time complexity 0(log n) hoga. 0(log n) ka matlab hai ki algorithm ka time complexity input ke size ke logarithmic ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi logarithmic ke proportional badhega. aur space complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka space complexity constant hai, yaani ki input ke size ke badhne se algorithm ka space complexity nahi badhta.


// becoz i chalega i=1,2,4,8,16,32 .... like this agar n = 52 ; to apne destination tak nhi pahuchega i so 

// example se 1,2,3,4,5,6 ....x terms chalega so x=?  

// x ka formula = a*r^(x-1) = n   (xterms find kiya hame) a = 1, r = 2, n = 52 //gp geometric propogation ka formula a*r^(x-1) = n hoga. 1*2^(x-1) = n hoga. 2^(x-1) = n hoga. x-1 = log2(n) hoga. x = log2(n) + 1 hoga. time complexity = 0(x) = 0(log2 n) hoga. 0(log n) ka matlab hai ki algorithm ka time complexity input ke size ke logarithmic ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi logarithmic ke proportional badhega. aur space complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka space complexity constant hai, yaani ki input ke size ke badhne se algorithm ka space complexity nahi badhta.
// 1*2^(x-1) = n            // a=1 isliye hua kuki gp ki first terms 1 hoti h r ko common ration bolte h gp ka 
// 2^(x-1) = n
// x-1 = log2(n) // log 2 isliye aaya dono taraf log se mulstiply kare to 
// x = log2(n) + 1
// timee complexity = 0(x) = 0(log2 n) hoga. 0(log n) ka matlab hai ki algorithm ka time complexity input ke size ke logarithmic ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi logarithmic ke proportional badhega. aur space complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka space complexity constant hai, yaani ki input ke size ke badhne se algorithm ka space complexity nahi badhta.


//                        ****    important notes  *****




// yah note yad rakhna Rule to Remember
// i++ or i += 1 → O(n)
// i *= 2 or i /= 2 → O(log n)
// Nested: O(n) × O(log n) → O(n log n)


// Interview Rule ⭐

// If the loop variable is multiplied or divided by any constant greater than 1:

// i *= 2;
// i *= 3;
// i *= 5;
// i /= 2;
// i /= 10;

// Then the Time Complexity is always O(log n).

// The logarithm's base depends on the multiplier/divisor (2, 3, 5, etc.), but in Big-O notation we ignore the base, so we simply write:

// O(logn)
// 	​


// Only the multiplier/divisor changes the base of the log, not the Big-O complexity.


// for(int i = 2; i <= n; i *= 3) {
//     System.out.println("Hello");
// }
// Dry Run (n = 100)

// Values of i:

// 2 → 6 → 18 → 54 → 162 (stop)

// The loop runs 4 times.

// Mathematical Analysis

// Initially,

// i = 2

// After k iterations,

// i = 2 × 3^k

// The loop continues until:

// 2 × 3^k ≤ n

// Ignoring the constant 2 (constants don't affect Big-O):

// 3^k ≈ n

// Taking logarithm:

// k = log₃ n

// Since changing the base of a logarithm only changes it by a constant factor,

// log
// 3
// 	​

// n=
// log
// 2
// 	​

// 3
// log
// 2
// 	​

// n
// 	​


// and constants are ignored in Big-O.

// Final Answer
// Time Complexity: O(log n) ✅
// Space Complexity: O(1) ✅
// Auxiliary Space: O(1) ✅




// for(int i = n; i >= 1; i /= 2) {
//     System.out.println("Hello");
// }
// Step 1: Dry Run (n = 16)
// Iteration	i	Prints
// 1	16	Hello
// 2	8	Hello
// 3	4	Hello
// 4	2	Hello
// 5	1	Hello
// 6	0	Loop stops

// Notice that every iteration i becomes half of its previous value.

// Sequence:

// 16 → 8 → 4 → 2 → 1 → 0
// Step 2: Time Complexity

// Suppose the loop runs k times.

// After every iteration:

// n / 2^k = 1

// Solve for k:

// 2^k = n

// k = log₂n

// So the loop executes log₂n times.

// Time Complexity
// O(logn)
// 	​

// Step 3: Space Complexity

// Variables used:

// int i;

// Only one integer variable is used.

// No array, no list, no recursion.

// Therefore:

// Space Complexity = O(1)

// Step 4: Auxiliary Space

// Extra memory used:

// i

// Only constant extra memory.

// Auxiliary Space = O(1)

// Final Answer
// Complexity	Value	Reason
// Time Complexity	O(log n)	i is divided by 2 every iteration
// Space Complexity	O(1)	Only one variable (i)
// Auxiliary Space	O(1)	No extra data structures or recursion



// for(int i = 1; i <= n; i += i) {
//     System.out.println("Hello");
// }

// Notice this statement:

// i += i;

// is exactly the same as:

// i = i + i;

// which is equivalent to:

// i *= 2;

// So the values of i become:

// 1 → 2 → 4 → 8 → 16 → 32 → ...
// Dry Run (n = 16)
// Iteration	i
// 1	1
// 2	2
// 3	4
// 4	8
// 5	16
// Stop	32

// The loop executes 5 times.

// Time Complexity

// After k iterations:

// i = 2^k

// The loop stops when:

// 2^k > n

// Taking logarithm:

// k = log₂n

// Therefore,

// ✅ Time Complexity = O(log n)

// Space Complexity

// Only one variable (i) is used.

// ✅ Space Complexity = O(1)

// Auxiliary Space

// No extra array, list, recursion, or additional memory.

//✅ Auxiliary Space = O(1)

// for (int i = 1; i <= n; i *=2) {  // abhi solve kiya iska time complexity 0(lon n) hoga
// for(int  j = 1; j <= n; j++) {  // iska time complexity 0(n) hoga 
// System.out.println("Hello World"); 
// } 

// dono ko mulstiply karenge tc = 0(log n) * 0(n) = 0(n log n) hoga. aur space complexity 0(1) hoga. 0(1) ka matlab hai ki algorithm ka space complexity constant hai, yaani ki input ke size ke badhne se algorithm ka space complexity nahi badhta.


// fastes kon h 

//0(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(n^3) <<< O(2^n)(Exponential time bolte h bahut slow hota h recursion me padhenge isko )                                         < O(n!)

// O(1) > O(log n) > O(n) > O(n log n) > O(n^2) > O(n^3) >> O(2^n) > O(n!)  (Fastest to Slowest)

// TLE ( TIME LIMIT EXCEEDED )  - Agar aapka code time limit exceed kar raha h to iska matlab aapka code slow h aur iska time complexity bahut jyada h. Aapko apna code optimize karna hoga.IS ERROR KO SOLVE KARENGE ISLIYE COMPLEXITY JARURI H EK FIX TIMER KE ANDER APNA CODE KO SUBMIT KARNA HOTA H OTHERWISE TLE ERROR AAYEGA 


// for(int i = 1;i*i<=n;i++){  // iska time complexity O(sqrt n) hoga. 0(sqrt n) ka matlab hai ki algorithm ka time complexity input ke size ke square root ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi square root ke proportional badhega. aur space complexity 0(1) hoga. 

// i*i <=n means i^2 = n aur square udhar jayega to i <=root(n) time chalega to squre(n) hi iska time complexity hoga .yah code prime number ka h so be remeber 

//agar i+i<=n ho to isko 2i =n aur i<=n/2 times run karega to iska time compleixty 0(n) hoga. 0(n) ka matlab hai ki algorithm ka time complexity input ke size ke proportional hai. Agar input ka size double ho jata hai, to algorithm ka running time bhi double ho jayega. aur space complexity 0(1) hoga.   

// note::  agar (n+logn) ho to ye o(n) hoga . agar (n^2 + logn) ho to ye o(n^2) hoga . agar (n^3 + logn) ho to ye o(n^3) hoga . agar (n^4 + logn) ho to ye o(n^4) hoga . agar (n^5 + logn) ho to ye o(n^5) hoga . agar (n^6 + logn) ho to ye o(n^6) hoga . agar (n^7 + logn) ho to ye o(n^7) hoga . agar (n^8 + logn) ho to ye o(n^8) hoga . agar (n^9 + logn) ho to ye o(n^9) hoga . agar (n^10 + logn) ho to ye o(n^10) hoga . agar (n^11 + logn) ho to ye o(n^11) hoga . agar (n^12 + logn) ho to ye o(n^12) hoga . agar (n^13 + logn) ho to ye o(n^13) hoga . agar (n^14 + logn) ho to ye o(n^14) hoga . agar (n^15 + logn) ho to ye o(n^15) hoga . agar (n^16 + logn) ho to ye o(n^16) hoga . agar (n^17 + logn) ho to ye o(n^17) hoga . agar (n^18 + logn) ho to ye o(n^18) hoga . agar (n^19 + logn) ho to ye o(n^19) hoga . agar (n^20 + logn) ho to ye o(n^20) hoga .


// for(int i = 1; i <= n; i *= 2) {
//     for(int j = 1; j <= i; j++) {
//         System.out.println("Hello");
//     }
// }

// Let's assume n = 8.

// Step 1: Outer Loop

// The values of i are:

// i = 1
// i = 2
// i = 4
// i = 8

// The outer loop runs 4 times (log₂8 + 1).

// Step 2: Inner Loop
// When i = 1
// for(int j = 1; j <= 1; j++)

// Runs 1 time.

// Hello
// When i = 2
// for(int j = 1; j <= 2; j++)

// Runs 2 times.

// Hello
// Hello
// When i = 4

// Runs 4 times.

// Hello
// Hello
// Hello
// Hello
// When i = 8

// Runs 8 times.

// Hello × 8
// Step 3: Total Work

// Now add all the executions:

// 1
// +2
// +4
// +8
// ----
// 15

// So the total number of prints is 15.

// Suppose n = 16

// Then:

// 1
// +2
// +4
// +8
// +16
// ------
// 31
// Suppose n = 32
// 1
// +2
// +4
// +8
// +16
// +32
// -------
// 63
// Do you notice a pattern?
// n	Total Prints
// 8	15
// 16	31
// 32	63
// 64	127

// The total is always:

// 2n - 1

// Examples:

// n = 8 → 2×8 − 1 = 15
// n = 16 → 2×16 − 1 = 31
// n = 32 → 2×32 − 1 = 63

// In Big-O, we ignore constants and -1:

// 2n - 1  →  O(n)
// Why is it NOT O(n log n)?

// Many people think:

// Outer loop = O(log n)
// Inner loop = O(n)

// So they multiply them:

// O(log n) × O(n) = O(n log n)

// ❌ This is wrong.

// Why?

// Because the inner loop does not run n times every iteration.

// It runs:

// 1
// 2
// 4
// 8
// 16
// ...

// not

// n
// n
// n
// n
// ...

// Since the inner loop changes every time, you must add the work:

// 1 + 2 + 4 + 8 + ... + n

// This sum is O(n).

// A Rule to Remember

// ✅ If the inner loop always runs n times:

// for (i = 1; i <= n; i++)
//     for (j = 1; j <= n; j++)

// Then:

// n × n = O(n²)

// ✅ If the inner loop depends on i:

// for (i = 1; i <= n; i *= 2)
//     for (j = 1; j <= i; j++)

// Then calculate:

// 1 + 2 + 4 + ... + n

// which is:

// O(n)


 //                                       REMEMBER ALL THE FORLUMA TRICKS 

//  🚀 Step 1: Look at the Loop Update

// Case 1: Constant Increment/Decrement
// i++
// i--
// i += 2
// i -= 5
// Trick

// 👉 Linear movement

// Example:

// for(int i = 1; i <= n; i++)   // i+=2 ya 5 to bhi same hi h

// Runs:

// 1 2 3 4 ... n

// Time Complexity:

// O(n)
// Case 2: Multiplication/Division
// i *= 2
// i /= 2
// i *= 3
// i /= 5
// i += i
// Trick

// 👉 Doubling/Halving

// Example:

// for(int i = 1; i <= n; i *= 2)

// Runs:

// 1 2 4 8 16 ...

// Time Complexity:

// O(log n)

// Golden Rule:

// Whenever you see *= or /= (with a constant > 1), think O(log n).

// Step 2: For Nested Loops
// Trick A: Independent Loops → Multiply

// Example:

// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= n; j++) {
//     }
// }

// Outer:

// O(n)

// Inner:

// O(n)

// Multiply:

// O(n²)

// Example:

// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= n; j *= 2) {
//     }
// }

// Outer:

// O(n)

// Inner:

// O(log n)

// Answer:

// O(n log n)
// Trick B: Inner Loop Depends on Outer Loop

// Example:

// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= i; j++) {
//     }
// }

// Don't multiply.

// Write the work:

// 1
// 2
// 3
// ...
// n

// Sum:

// 1+2+3+...+n

// Formula:

// n(n+1)/2

// Answer:

// O(n²)

// Another example:

// for(int i = 1; i <= n; i *= 2) {
//     for(int j = 1; j <= i; j++) {
//     }
// }

// Write the work:

// 1
// 2
// 4
// 8
// 16
// ...
// n

// Add it:

// 1+2+4+8+...+n

// Answer:

// O(n)
// Step 3: Learn These Common Patterns
// Loop	Time Complexity
// i++	O(n)
// i+=5	O(n)
// i*=2	O(log n)
// i/=2	O(log n)
// i+=i	O(log n)
// Two independent n loops	O(n²)
// n × log n	O(n log n)
// 1+2+3+...+n	O(n²)
// 1+2+4+8+...+n	O(n)
// Step 4: Special Sums (Very Important)
// Arithmetic Series
// 1 + 2 + 3 + 4 + ... + n

// Answer:

// O(n²)
// Geometric Series
// 1 + 2 + 4 + 8 + ... + n

// Answer:

// O(n)
// Step 5: The 10-Second Interview Algorithm

// Whenever you see a loop:

// Question 1

// How does i change?

// i++ → O(n)
// i+=k → O(n)
// i*=k → O(log n)
// i/=k → O(log n)
// Question 2

// Does the inner loop depend on the outer loop?

// No

// Multiply complexities.

// Yes

// Write the sequence:

// 1
// 2
// 3
// ...

// or

// 1
// 2
// 4
// 8
// ...

// Then find the sum.

// Example Quiz
// Q1
// for(int i = 1; i <= n; i++)

// Answer?

// ✅ O(n)

// Q2
// for(int i = n; i >= 1; i /= 2)

// Answer?

// ✅ O(log n)

// Q3
// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= n; j++)
// }

// Answer?

// ✅ O(n²)

// Q4
// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= i; j++)
// }

// Think:

// 1+2+3+...+n

// Answer?

// ✅ O(n²)

// Q5
// for(int i = 1; i <= n; i *= 2) {
//     for(int j = 1; j <= i; j++)
// }

// Think:

// 1+2+4+8+...+n

// Answer?

// ✅ O(n)


//                                                      yah foluma se aap koi bhi sum find kar sakte ho like this 


// Suppose n = 5

// Then the sum is:

// 1 + 2 + 3 + 4 + 5

// Instead of adding one by one, do this trick.

// Write it normally:

// 1 + 2 + 3 + 4 + 5

// Now write it in reverse:

// 5 + 4 + 3 + 2 + 1

// Now add both rows:

// 1 + 2 + 3 + 4 + 5
// 5 + 4 + 3 + 2 + 1
// -------------------
// 6 + 6 + 6 + 6 + 6

// Each column adds to 6, and there are 5 columns.

// So,

// 2 × Sum = 6 × 5

// Since 6 = n + 1 and 5 = n,

// 2 × Sum = n(n + 1)

// Divide both sides by 2:

// Sum = n(n + 1) / 2
// General Formula
// 1+2+3+⋯+n=
// 2
// n(n+1)
// 	​

// 	​

// Example (n = 10)
// 1+2+3+4+5+6+7+8+9+10

// Formula:

// 10 × 11 / 2 = 55

// Correct!

// Why is the Time Complexity O(n²)?

// Suppose you have:

// for(int i = 1; i <= n; i++) {
//     for(int j = 1; j <= i; j++) {
//         System.out.println("Hello");
//     }
// }

// The inner loop runs:

// i = 1  → 1 time
// i = 2  → 2 times
// i = 3  → 3 times
// i = 4  → 4 times
// ...
// i = n  → n times

// Total work:

// 1 + 2 + 3 + 4 + ... + n

// Using the formula:

// n(n + 1) / 2

// Expand it:

// (n² + n) / 2

// Big-O ignores constants and smaller terms:

// (n² + n) / 2
//    ↓
// O(n²)
// ⭐ One More Important Pattern

// Similarly, remember this geometric series:

// 1 + 2 + 4 + 8 + ... + n

// Its sum is approximately:

// 2n - 1

// So its complexity is:

// O(n)
// Easy Rule to Memorize
// Series	Formula	Big-O
// 1 + 2 + 3 + ... + n	n(n+1)/2	O(n²)
// 1 + 2 + 4 + 8 + ... + n	2n - 1	O(n)

// These two series appear very frequently in coding interviews. If you remember just these two formulas, you'll be able to solve many nested-loop complexity questions quickly.

// why this happenign 2 × Sum = 6 × 5

// This is the most important part. Once you understand this, you'll never forget the formula.

// Let's take n = 5.

// Step 1: Original Sum
// S = 1 + 2 + 3 + 4 + 5
// Step 2: Write the same sum in reverse
// S = 5 + 4 + 3 + 2 + 1

// Notice that both are the same sum, so both equal S.

// Step 3: Add them vertically
//       1 + 2 + 3 + 4 + 5
//       5 + 4 + 3 + 2 + 1
//     ---------------------
//       6 + 6 + 6 + 6 + 6

// Now look at each column:

// 1 + 5 = 6
// 2 + 4 = 6
// 3 + 3 = 6
// 4 + 2 = 6
// 5 + 1 = 6

// Every column equals 6.

// And since there are 5 columns, the total is:

// 6 + 6 + 6 + 6 + 6
// = 6 × 5
// Step 4: Why is it 2 × S?

// Because you added S + S.

// S = 1 + 2 + 3 + 4 + 5

// S = 5 + 4 + 3 + 2 + 1

// ---------------------
// S + S = 6 × 5

// But:

// S + S = 2S

// So:

// 2S = 6 × 5

// Divide both sides by 2:

// S = (6 × 5) / 2

// Since:

// 6 = n + 1
// 5 = n

// we get:

// S=
// 2
// n(n+1)
// 	​

// Another Example (n = 4)
// S = 1 + 2 + 3 + 4

// S = 4 + 3 + 2 + 1

// -----------------
//     5 + 5 + 5 + 5

// There are 4 fives:

// 2S = 5 × 4

// So:

// S = (5 × 4) / 2 = 10

// Check:

// 1 + 2 + 3 + 4 = 10 ✅
// Easy Way to Remember

// Whenever you see:

// 1 + 2 + 3 + ... + n

// Think:

// Write it forward.
// Write it backward.
// Every pair becomes n + 1.
// There are n pairs.
// Since you counted the sum twice, divide by 2.

// That's why:

// 2
// n(n+1)
	

	
//Great question! This is a tricky interview pattern.

// Code
// for(int i = 2; i <= n; i *= i) {
//     System.out.println("Hello");
// }

// Notice the update:

// i *= i;

// This means:

// i = i * i;

// So i is squared every iteration.

// Dry Run (n = 1000)

// Initial:

// i = 2

// Iterations:

// Iteration	i
// 1	2
// 2	4 (2²)
// 3	16 (4²)
// 4	256 (16²)
// 5	65536 (256²) → Stop

// Sequence:

// 2 → 4 → 16 → 256 → 65536

// Notice how i grows extremely fast.

// Mathematical Idea

// After each iteration:

// 2
// 2
// 2
// 2
// 4
// 2
// 8
// 2
// 16

// The exponent keeps doubling.

// So after k iterations:

// i=2
// 2
// k

// The loop stops when:

// 2
// 2
// k
// >n

// Take log base 2 on both sides:

// 2
// k
// >log
// 2
// 	​

// n

// Take log again:

// k>log
// 2
// 	​

// (log
// 2
// 	​

// n)

// Therefore,

// ✅ Time Complexity
// O(loglogn)
// 	​

// Space Complexity

// Only one variable (i) is used.

// ✅ Space Complexity = O(1)

// Auxiliary Space

// No extra arrays, recursion, or data structures.

// ✅ Auxiliary Space = O(1)

// Final Answer
// Complexity	Value
// Time Complexity	O(log log n)
// Space Complexity	O(1)
// Auxiliary Space	O(1)
// 🎯 Trick to Remember
// Update	Time Complexity
// i++	O(n)
// i *= 2	O(log n)
// i *= i	O(log log n)

// The faster the loop variable grows, the fewer iterations are needed.

// If you're preparing for placements, I can also teach you all the uncommon patterns like i = i*i, i = 2^i, j = i*i, nested logarithmic loops, etc., which are frequently asked in coding tests
















































































// Time Complexity Comparison (Fastest to Slowest)

// Complexity	                        Name	                                  Example

// O(1)	                              Constant	                               Array index access
// O(log n)	                          Logarithmic	                           Binary Search
// O(n)                               Linear	                               Traversing an array
// O(n log n)	                      Linearithmic	                           Merge Sort
// O(n²)	                          Quadratic	                               Bubble Sort
// O(n³)	                          Cubic	                                   Triple nested loops
// O(2ⁿ)	                          Exponential	                           Recursive Fibonacci
// O(n!)	                          Factorial	                               Permutations