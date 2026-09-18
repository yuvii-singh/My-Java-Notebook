public class FunctionArray {
   
    // FUNTION AND ARRAY MEANS : IT MEANS HOW FUCNTION IS USED IN ARRAY 
public static void main (String [] args){

// iska matlab funtion array me used kaise hota h 

// QUESTION .1 WRITE A FUNCTION TO PRINT ARRAY 

int arr [] ={3,5,7,2,4,7,8,9};
// printArray(arr);


// QUEST 2. WRITE A FUNCTION TO RETURN  SUM OF ALL ELEMENT IN ARRAY 

//   int sum = getsum(arr);
//   System.out.println("total number sum is :"+ sum);



// Question 3. write a function to double the values present inside  the array 

// for single array 
System.out.println("before");
printArray(arr);
 

// for double array 
System.out.println("after ");
doubleArray(arr);

printArray(arr);








}

public static void printArray(int arr[]){     // ye void wala h 
    for(int element : arr){
        System.out.println(element);
    }
}


// public static int getsum(int arr[]){                 // non void h 
//     int sum = 0;  
//     for(int element : arr){
//         sum = sum + element;
        
//     }
//     return sum ;
// }

public static void doubleArray(int arr[]){
    int n = arr.length;
    for(int index = 0;index<n;index++){
        arr[index] = 2*arr[index];
    }
}



}
    

