public class TimeSpace {
    public static void main(String[] args) {
        // Time Complexity : O(1) - Constant Time Complexity
        int a = 5;
        int b = 10;
        int sum = a + b; // This operation takes constant time
        System.out.println("Sum: " + sum);

        // Space Complexity : O(1) - Constant Space Complexity
        int c = 20; // This variable takes constant space
        System.out.println("Value of c: " + c);
    }       
    

} 
// Time Complexity : O(n) - Linear Time Complexity
// Space Complexity : O(n) - Linear Space Complexity
// Example:
// import java.util.Scanner;
// public class Example {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n]; // This array takes O(n) space
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt(); // This loop takes O(n) time
//         }
//         System.out.println("Array elements:");
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i]); // This loop takes O(n) time
//         }
//         sc.close();
//     }
// }


// Time complexity : ka means kitna time lagega kisi algorithm ko complete hone me
// Space complexity : ka means kitni memory lagegi kisi algorithm ko complete hone me 

// real life example :
// if you have to travel 60 km distance by car and your car speed is 60 km/h
// then time taken to reach your destination is 1 hour
// here distance = 60 km
// speed = 60 km/h
// time = distance/speed = 60/60 = 1 hour   
// in this example time complexity is O(1) because time taken is constant 1 hour regardless of distance
// and space complexity is O(1) because car takes constant space regardless of distance traveled

// another example : yadi aapko 1000 students ke naam store karne hai to aapko 1000 jagah chahiye hogi
// to isme space complexity O(n) hogi jaha n = number of students
// aur agar aapko 1000 students ke naam print karne hai to aapko 1000 operations karne padenge
// to isme time complexity O(n) hogi jaha n = number of students    


// different types of time complexity :
// 1. O(1) : Constant Time Complexity
// 2. O(n) : Linear Time Complexity
// 3. O(n^2) : Quadratic Time Complexity
// different types of space complexity :
// 1. O(1) : Constant Space Complexity
// 2. O(n) : Linear Space Complexity
// 3. O(n^2) : Quadratic Space Complexity   

// basically there are three types of complexities :
// 1. Best Case Complexity : minimum time/space taken by an algorithm                   represent sign is Ω (omega) (1)
// 2. Average Case Complexity : average time/space taken by an algorithm                represent sign is Θ (theta) ( n+1)/2 )
// 3. Worst Case Complexity : maximum time/space taken by an algorithm                   represent sign is O (big O) (n)

// why need to analyze time and space complexity :
// 1. to optimize the code
// 2. to compare different algorithms
// 3. to improve performance of the code
// 4. to reduce resource consumption
// factorial of number means : n! = n*(n-1)*(n-2)*(n-3)*(n-4)....
// 1! = 1,0!=1, 2! = 2, 3! = 3*2*1 and so on ..

// koi bhi algorithm ya function ka time and space complexity analyze karne ke liye hume ye dekhna hota hai ki usme loops, recursive calls, data structures ka use kaise ho raha hai
// jaise ki agar koi function me single loop hai jo n times chalega to uska time complexity O(n) hoga
// agar nested loop hai jisme outer loop n times chalega aur inner loop bhi n times chalega to uska time complexity O(n^2) hoga
// agar koi function me constant time operations hai jaise addition, subtraction, multiplication etc to uska time complexity O(1) hoga
// similarly space complexity analyze karne ke liye hume dekhna hota hai ki function me kitni memory allocate ho rahi hai
// jaise ki agar koi function me ek array create ho raha hai jiska size n hai to uska space complexity O(n) hoga
// agar koi function me constant number of variables create ho rahe hai to uska space complexity O(1) hoga 



// hamesha worst case complexity ko hi analyze karna chahiye kyunki wo hume maximum time/space batata hai jo kisi algorithm ko lag sakta hai
// aur uske basis par hi hum apne code ko optimize kar sakte hai aur better performance de sakte hai
// isliye hamesha big O notation ka use karke time and space complexity ko express karte hai taki hume pata chale ki humare algorithm ka performance kaisa hai
// aur usme improvement ki jarurat hai ya nahi
//


// jis bhi code ka time and space complexity kam hoga wo code zyada efficient hoga aur better performance dega
// isliye hamesha apne code ka time and space complexity analyze karna chahiye aur usme improvement karte rahna chahiye taki hum apne code ko zyada efficient bana sake 
