

public class StringbyRaghav {
    public static void main(String[] args){
         

        // String contents 

        //  1. Strings basics
        //  2. built in method 
        //  3. immutability 
        //  4. String builder 
        //  5.Questions


// STINGS IS A NON - PRIMITVE data types and also its immutable once its create it can not be change 


// in array we know how to write characters array in array like this 

// CHARACTER ARRAYS : 

//   char [] arr = {'A','N','U','P'};
// //   for(int ele : arr){    // yaha par type casting ho rha h used char if you want to print 
// //     System.out.print(ele+" ");   // agar ye print kaorge to iska ascii values print hoga na ki character 
   
// //   }

//  for(char ele : arr){     
//     System.out.print(ele+" ");   // to aap isko print karaloge as a form of character 
//   }


// basically, String ka first letter capitals and generally its chreate using str but you can also create useing s,x and whatever name you given 

// String str = "Hello jii";
// System.out.println(str);
// // instead of storing a one word string and can also store multiple senetences such as  this 
// String s = "I love java and also intrest in python ";

  // How to take a input in String 
//   Scanner sc = new Scanner(System.in);
//   String str = sc.nextLine();      // this is print entire senetences
//   System.out.println(str);
//  String x = sc.next();  // its print one word instead of the print senetences after one space its print before word or senetences if no spaces its print all the thing 
//  System.out.println(x);  // it can also print emoji 

// LENGTH & charAT() 

// same like arr.length  
// String str = "Hello jii";
// System.out.println(str.length()); // isme bhi bhi same length work karta h array ki tarah but ye space bhi count karta h aur isme indexing  bhi 0 se start hoti h 
// System.out.println(str.charAt(0)); // ye aapko indexing find karke dega H aayega output me becuase 0 index pr H h







// count the numbers of vowels in a  given string or print a vowels in given the strings 






// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the element : ");
// String str = sc.nextLine();
// int count =0;
// for(int i = 0;i<str.length();i++){
//   char ch = str.charAt(i);
//   if( ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'){    // yah par semicolon mt dena nhi to jitna element h sabko print karega 
//     count ++;
//   }

// }System.out.print(count);


// there are different different method to print vowels like this 

// int count =0;
// for(int i = 0;i<str.length();i++){
//   char ch = str.charAt(i);
//   if( ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' ||    ch =='A'|| ch =='E' || ch=='I' || ch =='O' || ch =='U'){   // ye upper lower dono me print kara sakta h A
//     count ++;
//   }

// }System.out.print(count);

// aap switch case se bhi isko sove kar sakte ho like this 

// int count = 0;
// for(int i =0;i<str.length();i++){
//   char ch = str.charAt(i);
  
//   switch (ch){
//     case 'a':
//     case 'e':
//     case 'i':
//     case 'o':
//     case 'u':
//     case 'A':
//     case 'E':
//     case 'I':
//     case 'O':
//     case 'U':
//     System.out.print(ch+" ");
//     count ++;
//     break;
//   }
  
// }
// System.out.println();
// System.out.println(count);



//Using indexOf() — ⭐ nice interview approach

// This avoids writing all 10 vowels:

//  String vowels = "aeiouAEIOU";

// for (int i = 0; i < str.length(); i++) {
//     char ch = str.charAt(i);

//     if (vowels.indexOf(ch) != -1) {
//         System.out.print(ch + " ");
//     }
// }


// so there are different way to print vowels data 


// wap to print palindrome in  given string 

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the String  : ");
// String str = sc.nextLine();
// int n = str.length();
// int i =0 ,j = n-1;
// while (i<j){
//   if(str.charAt(i)!=str.charAt(j)){
//     System.out.println("ITs not palindrome");
//      break;
// }
//     else {
//       i++;
//        j++;
//       System.out.println("ITs  palindrome");
//       break;
     
//     }  
  
// }

// ek chiz yad rakhna array me pass by reference lagta h aur variable me pass by values  aur string me bhi pass by value hi lagta h 


// String x ="Anup";
// System.out.println(x);
// print(x);
// x = "Kalyani";
// System.out.println(x);



// public static void print(String x){  // so yah bhi same hi kam karta h pass by value deta h x ka value dono function ko alag alag le rha h isliye anup or kalyani hi print karega 
//   x = "MOhan";
// }

String str = "Hello Anup jii ";
System.out.println(str.indexOf('A')); //capital O hoga na ki o its also print space like  output 6 hoga 
System.out.println(str.indexOf(' ')); // 5  because ye fi





    }
}
