public class Method_Function {
    public static void main(String[] args) {
        
   // in C++ method ko functions bolte h c++ ya python me but java me isi function ko  [method] bolte h 
   // so jab bhi koi method bole samjh lena ki wah functions ki baat kr rha h  because ise java me method hi bolte h 

   // definition of function:   A function or method  is a block of code that performs a specific task and can be called from other parts of the program. Functions are used to break down a program into smaller, more manageable pieces, making it easier to read, understand, and maintain.
   
   // let understand this line public static void main(String[] args ){}
    // public : public [access modifier] h iska matlab h ki ye method ya function ko  kisi bhi class se access kiya ja sakta h in the sense  ki  inside the class as well as outside the class dono jagah se access kiya ja sakta h
    // static : static [modifier] h iska matlab h ki ye method ya function ko bina kisi object ke access kiya ja sakta h in the sense ki  aap directly class name ke through access kar sakte ho is method ko bina kisi object ke access kiya ja sakta h 
    // void : void [return type] h iska matlab h ki ye method ya function koi value return nahi karta h in the sense ki  ye method ya function koi value return nahi karta h jab bhi aap void ka used karenge iska mtlb waha kuchh return nahi krta h 
    // main : main [method name] h iska matlab h ki ye method ya function ka naam main h in the sense ki  ye method ya function ka naam main h aur is method ko java runtime environment automatically call karta h jab bhi aap program run karte ho to ye method automatically call hota h aur is method ke andar jo bhi code likha hota h wo execute hota h 
    // String[] args : String[] args [parameter] h iska matlab h ki ye method ya function ek parameter leta h jiska naam args h aur iska type String[] h in the sense ki  ye method ya function ek parameter leta h jiska naam args h aur iska type String[] h aur ye parameter command line arguments ke liye use hota h jab bhi aap program run karte ho to aap command line arguments de sakte ho aur ye parameter un command line arguments ko store karta h in the sense ki  ye parameter un command line arguments ko store karta h jo aap program run karte ho to aap command line arguments de sakte ho aur ye parameter

    // A function is a block of code or set of instruction which is used to perform specific task specific task means  : ya to wah sum ,multiplication,divide in jaise specific task karega real life example : aapko ek function banana h jiska naam add hai aur ye function do number ka sum karega to ye function ka specific task h ki ye do number ka sum karega to jab bhi aap is function ko call karoge to ye function do number ka sum karega aur aapko result dega

   // bulky code : bulky code ka matlab h ki  code jo bahut lamba hota h aur usme bahut saare lines of code h jise padhna aur samajhna mushkil hota h to jab bhi aapko bulky code mile to aap us code ko chhote chhote functions me divide kar do taki aapko samajhne me asani ho aur aapko code ko maintain karne me bhi asani ho

  // A function is set of instruction which is used to perform specific tast such as sum,average,minimum data ,and so on . 

  // fucntion delaration : aap function ko declare kaise karte ho 

  // modifier static return_type nameOfMethod or name of function (parameter1,parameter2....){
    //     // body of function


  // public static void main(String[] args){ 

 // public : meaning h yah ek [access modifier] h it means aap ise kisi bhi class ke ander ya bahar access kar sakte h insider ya outside the class dono jagah se access kar sakte h
//agar aap public nhi likhte to compiler isko default access modifier samjhta h iska matlab h ki ye method ya function sirf usi class ke ander access kiya ja sakta h jisme ye method ya function declare hua h .

// void : yaha pr return type ka kam krta h iska matlab h ki ye method ya function koi value return nahi karta h jab bhi aap void ka used karenge iska mtlb waha kuchh return nahi krta h
// agar void ke jagah int rahta to ye integer value return karta h aur agar void ke jagah String rahta to ye string value return karta h aur agar void ke jagah boolean rahta to ye boolean value return karta h aur agar void ke jagah double rahta to ye double value return karta h aur agar void ke jagah char rahta to ye char value return karta h aur agar void ke jagah float rahta to ye float value return karta h aur agar void ke jagah long rahta to ye long value return karta h aur agar void ke jagah short rahta to ye short value return karta h aur agar void ke jagah byte rahta to ye byte value return karta h

 // Main : matlb function ka name h aur is function ko java runtime environment automatically call karta h jab bhi aap program run karte ho to ye method automatically call hota h aur is method ke andar jo bhi code likha hota h wo execute hota h


// String[] args : iska mtlb () bracket ke ander jo bhi h yah input parameter h aur is parameter ka naam args h aur iska type String[] h iska matlab h ki ye method ya function ek parameter leta h jiska naam args h aur iska type String[] h aur ye parameter command line arguments ke liye use hota h jab bhi aap program run karte ho to aap command line arguments de sakte ho aur ye parameter un command line arguments ko store karta h in the sense ki  ye parameter un command line arguments ko store karta h jo aap program run karte ho to aap command line arguments de sakte ho aur ye parameter un command line arguments ko store karta h 

// Static : aap jab bhi koi class banate ho to us class ko access karne ke liye aapko us class ka object banana padta h taki aap us class ke members ko access kar sako lekin agar aap kisi method ya function ko static bana dete ho to aap us method ya function ko bina kisi object ke access kar sakte ho in the sense ki  aap directly class name ke through access kar sakte ho is method ko bina kisi object ke access kiya ja sakta h

// static ka mtlv : access any class without creating object of that class

//main(String[] args) : iska hm method ka signature kahte h method signature ka matlab h ki  method ka naam aur uske parameters ka combination method signature kehlata h  aur ye method signature method overloading me use hota h jab aap same naam ke multiple methods banate ho to compiler ko pata nahi hota h ki aap kis method ko call karna chahte ho to compiler method signature ke through ye decide karta h ki aap kis method ko call karna chahte ho


         // Call the function 

         //jab bhi aapko function ka used krna h usko aap call karte h mean call the function 
         // function call karne ke liye aapko function ka name aur uske parameters dena h taki aap us function ko call kar sako
            //  System.out.println("Calling the function");
            //   heYuvii (); // function ko call kar rhe h 
            // // ek chiz yad rakhna function ko call kr rhe ho and to dono function static me honi chaiye tabhi call kr paoge 
        
            // System.out.println("ye bad me execure hoga because function call hone ke baad hi ye line execute hogi "); // kyuki jis function ko aap call kar rhe ho us function ke andar jo bhi code likha h wo execute hoga aur uske baad hi ye line execute hogi kyuki function call hone ke baad hi ye line execute hogi
       
       
//            int d =sum (13,23);
//    System.out.println("total sum is " + d);
   
      








}       


   



    //   public static int sum(int a, int b){
    //     int result = a+b;
    //     return result;  // ek chiz hamesha yad rakhana return ka bad ya niche kitne bhi code likhe ho but aap return ke bad kisi ko bhi execute nhi kr sakte ho agar aap kahi pr bhi return keyword last me dekh rahe ho iska mtlb iske niche kuchh nhi likh sakte whhi se wapas chale jo jaha pr function ki call ho rhi h whi pr 
    //   }




    // public static  void  heYuvii (){  // public laga sakte ho ya chhod sakte ho compiler automatically isko default access kar leta h 
    //     System.out.println("Hey Yuvii");
    //     System.out.println("Welcome to Java Programming");
    //     System.out.println(37484);
    //   } 



  // function call stack : jab bhi aap kisi function ko call karte ho to us function ke andar jo bhi code likha h wo execute hota h aur jab wo function ka execution complete ho jata h to control wapas us function ko call karne wale function ke paas chala jata h aur ye process repeat hota h jab tak program complete nahi ho jata h is process ko function call stack kehte h




// return type : return type ka meaning h ki aap whi se return back karte ho jaha pr aapne function ko call kiya h aur return type ka matlab h ki aap function ke andar jo bhi value calculate karte ho usko return karte ho jise aap us function ko call karne wale function me use kar sakte ho uske niche 



























    }

