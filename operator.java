
import java.util.function.UnaryOperator;

public class operator {
    public static void main (String [] args){
    
 // operator in java    
    
    // Arithmetic opeartor[+,-,*,/,%]
    // Relational operator [>,<,>=,<=,==,!=]
    // Logical operator [&& ,||,!]
    // Bitwise (will do later )
    // Assignment operator [=,=+,-=,/=,*=,%=]
    // Unary inc / Dec (++,--)
//     1. Arithmetic Operators

// Used for mathematical calculations.

// Operator	  Meaning	        Example
//  +   	  Addition	        a + b
//  -   	 Subtraction	    a - b
//  *   	 Multiplication	    a * b
//  /   	 Division	        a / b
//  %    	 Modulus     	    a % b
    
    
//  2. Relational (Comparison) Operators

// Used to compare two values (result is true or false).

// Operator 	Meaning	          Example
//  ==      	Equal to	       a == b
//  !=      	Not equal to	    a != b
//  >       	Greater than	    a > b
//  <       	Less than	        a < b
//  >=      	Greater or equal	a >= b
//  <=      	Less or equal	    a <= b


// 3. Logical Operators

// Used to combine boolean expressions.

// Operator 	Meaning     	      Example
// &&       	AND                	(a > 0 && b > 0)  ( isme agar sari true h to true hoga  agar ek bhi false hogi to false aa jayegi )

// !         	NOT              	!(a > 0)   ( true ko false dega aur false ko true dega  )

//  ||           OR                  (a> b || b>c)  ( isme sari false hogi to false dega agar ek bhi true ho jaye to true de dega )

// 4. Assignment Operators

// Used to assign values to variables.

// Operator     	Example     	Equivalent to
// =               	a = 5          	—
// +=           	a += 3      	a = a + 3         ( a +=5 is mtlb a = a+ 5 same sare operatin me hota h )
// -=            	a -= 3      	a = a - 3
// *=            	a *= 3      	a = a * 3
// /=           	a /= 3      	a = a / 3

// 5. Unary Operators

// Operate on a single operand.

// Operator       	Meaning         	Example
// +	            Positive         	+a                (iska mtlb a++ = a+1 ya a-- means = a-1 ya ++a iska mtlb bhi same =a+1 or --a sab same h hai )
// -             	Negative         	-a             ( ++a this is called pre Increment)
// ++           	Increment       	a++            ( a++ this is called post Increment)
// --           	Decrement         	a--
// !             	Logical NOT      	!true


// 6. Bitwise Operators

// Work on bits (binary values).

// Operator	                 Meaning
// &                        	AND
// `                          	`
// ^                           	XOR
// ~                     	Complement
// <<                   	Left shift
// >>                    	Right shift

// . Ternary Operator

// A shorthand for if-else.

// int result = (a > b) ? a : b;

    
//     int num  = 5;
//     int num2 = 12;
//     System.out.println((float) num2/num);  // jaruri nhi h double me hi explicit krna isko float me bhi kr sakte ho 

// System.out.println(num2%num);  // % modulas bolte h ye remainder provider karta h  

// int a = 10;
// int b = 20 ;
// int c = 30;
// boolean num = false; 
// boolean num1 = (b<c); 
// boolean num2 = (a<c); 

// boolean answer = num && num1 && num2;
// System.out.println(answer);
// boolean answer1 = num || num1 || num2;
// System.out.println(answer1);
// boolean answer2 = !num;
// System.out.println(answer2);


// unary opeartor
 // INCREMENT 
// int a = 6;
// System.out.println(a++);  // iska mtlb post Increment pahle same values output aayega then increase karega 
// System.out.println(a);  // 6 ko print kr diya then increment kiya to 7 hoga aur niche isliye iska ouput 8 aaya 
// System.out.println(++a); // pre increment isme pahle increment hoga then values ko show karega  iska anseer  8 isliye aaya upper values ko 7 increment kr diya tha 


// DECREMENT 
int val = 10 ;
System.out.println(val--); // pahle value ko print karega then Decrement karega 
System.out.println(val);   // upper me value ko print kr diya tha then usko decrement kr diya tha 
System.out.println(--val);  // pahle decrement opetion apply hoga then values ko print karwayega 8 answer isliye aaya kyuki value decrement hokar upper 9 ho gya tha then 9 -1 8 hoga 























    }
}
