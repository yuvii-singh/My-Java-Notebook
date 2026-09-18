public class bool {
   public static void main (String[] args){

    System.out.println("Namste Jii");
//     boolean isfound =true;
//     boolean isavailable = false;

//    System.out.println(isavailable);
   
//    char ch = 'k';
//    System.out.println("my character is :" + ch);
//   System.out.println("my character is :" + (char) (ch+1)); // ye jo sare character h wah sare integer se mapped hote h and insabka ek ascii values hota  h like 
//   // A = 65,B =66,C = 67 YA a = 97,b = 98 , c = 99 ye sare ka hota h 
  
// System.out.println("my character is :" + (char) (ch+5)); // k ke 5 letter ke bad wala ko print karega 

// data types   : primitive and non primitive 

// primitive : boolean ,numeric : (boolen me boolean )  (numeric ; character and integral [character me char ] [integral me integer and floating point ]   {integer me byte  ,short,int,long }  {floating me float, doublt} ) hota h 

// non - primitive : strings ,array etc ye hota h 

// character show krta h : a,b,c,d ya A,B,C,D ,E YA 1,2,3,4,5 YA KOI SPECIAL CHARACTER @,#.$ YE CHAR SHOW KRTA H 

// jo bhi a,b,c ya A,B,C ,D  ye sare character h and ye sare interger values se mapped hote h  aur insab ka mapped ko ascii values bolte h like A = 65,B = 66,C = 67, YA a= 97,b = 98,c = 99 ye sare hote h 

// range of all primitive data types 
// data types           size             range 

// byte                1 byte            stores whole number -128 to 127
// short               2 byte           same above  -32768 to 32767
// int                 4 byte           same above  -2147483648 to 2147483647
// long                8 byte          same   bahut jyada bas last me l likh dana like 3434L 
// float               4 byte          store factorial number  store 6 to 7 decimal numver
// double              8 byte            store same factorial  store 15 decimal digits
// boolean             1 bit             store true and false 
// char                2 bytes           stores a single character /letter or ascii values 


// byte num = 110;  //150 pr error isliye de rha h ki out of range h 
// System.out.println(num);

// short  data = 30000;
// System.out.println(data);

// int a = 38383838;
// System.out.println(a); 

// long numb = 9393820238l;  //9393820238 ye error isliye aa rha h kyuki aapka isko last L ya l dono me se koi l de sakte ho  dena padega nhi to out of range batayega 
// System.out.println(numb);


// float f = 34.5f;  //34.5 me error isliye aa rha h kyuki aapko jab bhi float banaiyega usme last me f dena padega tabhi sahi hoga otherwise error show karega
// System.out.println(f);

// float l = 3.53838384544f;  // isme maximum 6 ya 7 tak elemnet or decimal number ko store kara sakte h like this 
// System.out.println(l);

// double  d = 54.3234342343242334334;  // isme maximum 14 ya 15 hi values ko decimal ko store kara sakte ho 
// System.out.println(d);

// implicit and explicit  conversion in java 

// implicit bahut aasan h like chhote size ke data ko bade size ke data me store karna ko implicit data types or conversion bolte h like byte ki size 1 byte ko short me 2 byte ke size me store karan 
// ya short ka size 2 byte  ko int me 4 byte me store karana aur int ko long me store karan ko implicit bolte h 
byte n = 110 ;
short n1 = n ;
System.out.println(n1);  // ye conversion ho gya implicit byte ko short me store kara diya 

short t = 200 ; 
int t1 = t ;
System.out.println(t1); // ye convert ho gya h this is called implicit conversion easy to understand 

int u = 34354;
long u1 = u;
System.out.println(u1);

 // explicit me bade size ke data ko chhotte size me store karana ko explicit conversion bolte h aur int ko character me badla 

 int p  = 107;
 char ch = (char)p;  // ye convert ho gya int se char me like ascii values of 107 is k  this is called explict converison
 System.out.println(ch);

int k = 80;
char mych =(char) k;
System.out.println(mych);  // isko explict conversion bolte h 

// hm bade data types ko chhhote data types me bhi store kara sakte h like this 

long l = 34343l;
int l1 = (int)l; // ye long me tha usko int me convert kr diya 
System.out.println(l1);

int  g = 534;
byte b = (byte)g;  // int me tha usk0 bute me convert kr diya this is called explicit conversion ;
System.out.println(b);


short s = 334;
byte v = (byte) s;
System.out.println(v);













} 
}
