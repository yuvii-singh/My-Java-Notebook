public class basic {
    
public static void main (String[] args ){
    // System.out.println("Hello world "); // println used to next line also you can used \n for next line inside the quatotaion marks 
    // System.out.print("Hello world  \n ");
    // System.out.println("Hello world ");
    


// print the star same like right angle triangle 
                // System.out.println("*\n* *\n* * *\n* * * *");
  
                // character ka used kaise karte h and type casting kaise karte h niche dekh lo sare usi ke bare me h 


        // char ch = 'A';
        // int x = ch;   // this is implicit type casting  char se int me convert ho gya h
        // char data = 'a';
        // int y = (int) data; // this is explicit type casting 
        // char da = '0';
        // int p = da ;
        // char c = '!';
        // char d = '@';
        // int k = c;
        // int l = d;
        // System.out.println(p);
        // System.out.println(k);
        // System.out.println(l);
    
// basically type casting ka matlab hota h ek data type ke value ko dusre data type me convert karna aur java me do tarah ke type casting hote h implicit aur explicit  conversion 

// example of implicit type casting : char se int me convert karna , short se int me convert karna , int se long me convert karna , float se double me convert karna etc 

// example of explicit type casting : int se char me convert karna , long se int me convert karna , double se float me convert karna etc
  
char d = 'A';
System.out.println(d+0);  // without changing into integer it can give you value 
System.out.println(d+d); // aapko do character add kar ke de dega but aapko integer me convert kar ke dega char se char ko add karne pr java usko integer me convert kar deta h aur uske ascii value ke hisab se add kar ke de deta h

// aap multiply,divide,subtract bhi kar sakte h 

// type casting aap integer ko character me ,float ko integer me , double ko float me convert kar sakte h just like this 

int a  = 107;
char ch = (char)a;  // explicit conversion h implicit conversion java support nhi karta kabhi kabhi 

System.out.println(ch); // isko integer ko character me convert kar ke de diya h

//ayese hi float ko integer me convert kar sakte h

float f = 3.53f;  // isme maximum 6 ya 7 tak elemnet or decimal number ko store kara sakte h like this 
int x = (int)f;  // isme decimal part ko ignore kar ke integer me convert kar ke de diya h
System.out.println(x); // isko float se integer me convert kar ke de diya h

// Let's start with:

// x++
// ++x
// x--
// --x
// 1. Post Increment (x++)

// Means:

// Use the current value first, then increase by 1.

// Example:

// int x = 5;

// System.out.println(x++);

// Output:

// 5

// After printing:

// x = 6;
// Memory View
// x = 5

// print x  → 5
// increase x → 6

// 2. Pre Increment (++x)

// Means:

// Increase first, then use the value.

// Example:

// int x = 5;

// System.out.println(++x);

// Output:

// 6
// Memory View
// x = 5

// increase x → 6
// print x → 6
// 3. Compare Both
// int x = 5;

// System.out.println(x++);
// System.out.println(x);

// Output:

// 5
// 6
// int x = 5;

// System.out.println(++x);
// System.out.println(x);

// Output:

// 6
// 6
// 4. Post Decrement (x--)

// Means:

// Use current value first, then decrease by 1.

// int x = 5;

// System.out.println(x--);

// Output:

// 5

// Now:

// x = 4;
// 5. Pre Decrement (--x)

// Means:

// Decrease first, then use.

// int x = 5;

// System.out.println(--x);

// Output:

// 4
// 6. Most Important Example
// int x = 5;

// int y = x++;

// Step by step:

// y = 5
// x becomes 6

// Final:

// x = 6
// y = 5

// Now:

// int x = 5;

// int y = ++x;

// Step by step:

// x becomes 6
// y gets 6

// Final:

// x = 6
// y = 6
// 7. Inside Expressions
// int x = 5;

// System.out.println(x++ + 10);

// Process:

// Use x = 5
// 5 + 10 = 15
// Then x becomes 6

// Output:

// 15

// Final:

// x = 6
// int x = 5;

// System.out.println(++x + 10);

// Process:

// x becomes 6
// 6 + 10 = 16

// Output:

// 16
// 8. Other Common Operators
// Addition Assignment
// x += 5;

// Same as:

// x = x + 5;
// Subtraction Assignment
// x -= 3;

// Same as:

// x = x - 3;
// Multiplication Assignment
// x *= 2;

// Same as:

// x = x * 2;
// Division Assignment
// x /= 2;

// Same as:

// x = x / 2;
// Modulus Assignment
// x %= 3;

// Same as:

// x = x % 3;
// Interview Trick Question
// int x = 5;

// int y = x++ + ++x;

// Let's solve it:

// x = 5

// x++  → use 5, then x becomes 6

// ++x  → x becomes 7, use 7

// 5 + 7 = 12

// Final:

// x = 7
// y = 12

// Many beginners get this wrong.

// Easy Rule to Remember
// x++ → use first, change later
// ++x → change first, use later
// x-- → use first, decrease later
// --x → decrease first, use later






            }
}