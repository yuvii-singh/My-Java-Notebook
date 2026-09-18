import java.util.Scanner;                    

public class PrimeNumber {      
    public static void main(String [] args){
        


// Quest 1. write a program to check whether a number is prime or not          


    //     System.out.print("Enter the number is : ");
    //     Scanner sc = new Scanner(System.in);
    //     int n =sc.nextInt();
    //     for(int i =2;i<=n-1;i++){
            
        
    //     if(n%i==0){

        
    
    //         System.out.println(" composite number ");
    //         break;                                        // ye jaise hi ek bar bhi condition true ho jati h to loop se bahar aa jata h aur break ke baad niche ka code execute nahi hota h 
           
    //     }else {
    //         System.out.println( "Prime number ");
    //         break;   // agar composite nhi h to prime number h to ek bar hi print hoga aur break ke baad niche ka code execute nahi hoga aur loop bhi ek bar hi chalega break se loop se bahar aa jata h 
    //     }
    
    
    // }
   // } // i is the factor of n and n/i is also factor of n so we can check till i*i<=n or i<=root(n) if i*i>n then it means n has no factor so n is prime number
//}
    // prime me samjhne ke liye agar n factor h to n/i bhi factor hoga means i*i =n    ya aap isko i = root(n) tak hi check kar sakte h  aur agar i*i>n ho jata h to iska matlab h ki n ka koi factor nahi h to n prime number h

// java me root(n) nhi likh sakte to function ka used karo like Math.sqrt(n)  ya aap i*i<=n ka use kar sakte h

// factor occurs in pair hamesha pair me hota h example 12 ka factor 2 h to n/ 2 = 6 bhi factor hoga  to iska matlab h ki agar n ka factor h to n/i bhi factor hoga  to iska matlab h ki agar i*i>n ho jata h to iska matlab h ki n ka koi factor nahi h to n prime number h


// ye uska best efficient code h jo time complexity O(root(n)) h aur space complexity O(1) h  aur ye code prime number ko check karne ke liye best h

//  System.out.print("Enter the number is : ");
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         boolean flag = true;  // true means prime number 
//         for(int i =2;i<=Math.sqrt(n);i++){   // ISME LOOP ROOT N TAK CHALEGA BAHUT KAM CHALEGA ISLIYE BEST H
            
        
//         if(n%i==0){
//             flag = false;  // false means composite number
            
//             break;
//           }} if(n==1){
//             System.out.println(" 1 is neither prime nor composite number ");
//         }else if(flag==false){
//             System.out.println(" composite number ");
                                            
//         }else {
//             System.out.println( "Prime number ");
//            }


// Quest take a input from the user and print all factors of the number 


// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         System.out.print("Enter the number is : ");
//         Scanner sc = new Scanner(System.in);
//         int n =sc.nextInt();
//         for(int i =1;i<=Math.sqrt(n);i++){  // Math.sqrt(n) means root(n) input me agar 12 le to root(12) = 3.4641 to loop 3 tak chalega aur 1,2,3 ke factors print karega aur n/i ke factors bhi print karega
            
        
//         if(n%i==0){         // iska mtlb h ki agar n 36 h to do bar 6,6 print nhi hoga ye likhenge to 
//                 if(i==n/i){
//             System.out.println(i);}
//             else {
//                  System.out.println(i);  
//                   System.out.println(n/i);  // ye quotient h  n/i = 36/1 = 36, 36/2=18, 36/3=12, 36/4=9, 36/6=6, 36/9=4, 36/12=3, 36/18=2, 36/36=1   to ye sab factors print karega
//         }}
//     }
//     sc.close();   // best practice h ki scanner close kar do jab bhi aap input lo 
// }}



// iteration measn : loop ke andar jitna bhi code chalega wo iteration kehlate h  jaise agar loop 10 bar chalega to 10 iteration hoga  aur agar loop 100 bar chalega to 100 iteration hoga  aur agar loop 1000 bar chalega to 1000 iteration hoga

























    }}