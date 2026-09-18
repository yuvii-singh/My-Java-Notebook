

import java.math.BigInteger;
import java.util.Scanner;

public class DataInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int  age = sc.nextInt();
        float f = sc.nextFloat();
        BigInteger bg = sc.nextBigInteger();
        System.out.println("my age is :" +age);
        System.out.println("my age is :" +f);
        System.out.println("my age is :" +bg);


    sc.close();  // jab bhi aap input lo ya jisname ka scanner banaoge to us name ka sc likhar closed kar dena ye best tarikha h data isase leak nhi hota 


    }
    
}
