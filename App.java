
import java.security.PublicKey;

public class App {
 
public static void main(String[] args) {
    
    // default construtor short form me aap ise ctor bol sakte h 
//     Student A = new Student ();
    
    
//     A.name = "Vishal ";
//     A.age = 23;
//     A.nos = 5;
//     A.id = 343;

// System.out.println(A.name);
// System.out.println(A.id);
// System.out.println(A.nos);
// System.out.println(A.age);

// A.bunk();
// A.sleep();
// A.study();


// we call parameterized construtor 

Student A = new Student(5,24,5,"yuvii");

// System.out.println(A.name);
// System.out.println(A.id);
// System.out.println(A.nos);
// System.out.println(A.age);

// A.bunk();
// A.sleep();
// A.study();


// Copy construtor or copy ctor call 

Student B = new Student(A);  // aap dekhoge ye copy construtor parameter ka pura values copy kar liya h 

System.out.println(B.name);
System.out.println(B.id);
System.out.println(B.nos);
System.out.println(B.age);

B.sleep();
B.study();
B.bunk();

// object ka lifecycle means : same like a human life human ka born hota h and survive karta h and than dead ho jata h waise hi object used karta h attribute than behaviour set hota and then end ho jata h 














}
    
    
}
