public class MULTIdimensionArray {
    public static void main(String[] args) {
        
        
        // MULTIdimensionArray definition: MULTIdimensionArray is an array of arrays. It is a collection of data items that are stored in a contiguous memory location
        //  and can be accessed using an index. It is also known as a 2D array or a matrix. It is used to store data in a tabular form and can be used to represent a table, 
        // a grid, or a spreadsheet. It is also used to represent a graph or a network. It is also used to represent a game board or a chess board.
        //   It is also used to represent a 3D array or a 4D array.
        
        
        //creation of array in java: There are three steps to create an array in Java: declaration, allocation, and initialization.
        // declaration of array: The declaration of an array is the process of defining the type of the array and the name of the array. It is like a blueprint of the array. It does not allocate memory for the array. It just tells Java that we are going to create an array of
        // a certain type and we will use a variable name to refer to that array. The syntax for declaring an array is: dataType[] arrayName; or dataType arrayName[]; For example, int[] numbers; or int numbers[]; is the declaration of an array of integers with the name numbers.
        // allocation of array: The allocation of an array is the process of creating an array and allocating memory for the array. It is done using the new keyword. The syntax for allocating an array is: arrayName = new dataType[size]; For example, numbers = new int[5];


        // initialization of array: The initialization of an array is the process of assigning values to the array at the time of declaration or after declaration. It can be done in two ways: using an array initializer or using a loop. The syntax for initializing an array using an array
        //  initializer is: dataType[] arrayName = {value1, value2, value3, ...}; For example, int[] marks = {99, 95, 90, 88, 80}; is the initialization of an array of integers with the name marks and the values 99, 95, 90, 88, and 80.
        
        //allocation of array in java: The allocation of an array is the process of creating an array and allocating memory for the array. It is done using the new keyword. The syntax for allocating an array is: arrayName = new dataType[size]; For example, numbers = new int[5]; 
        // is the allocation of an array of integers with the name numbers and the size 5. This means that the array can hold 5 integers and the index of the array will be from 0 to 4.
        
        
        // MULTIdimensionArray create in java: To create a MULTIdimensionArray in Java, we need to follow the same steps as creating a one-dimensional array,
        //  but we need to use two sets of square brackets [] [] to indicate both dimensions.
        // The syntax for declaring a MULTIdimensionArray is: dataType[][] arrayName; For example, int[][] multi; is the declaration of a MULTIdimensionArray of integers 
        // with the name multi.
        // The syntax for allocating a MULTIdimensionArray is: arrayName = new dataType[rows][columns]; For example, multi = new int[4][5]; is the allocation of a MULTIdimensionArray of integers with the name multi, 4 rows and 5 columns. This means that the array can hold 20 integers and the index of the array will be from 0 to 3 for rows and 0 to 4 for columns.
        
        
        // eg : 1D array : int [] marks = {99,93,33,54,94,23}  // two array me one d array ka har ek element ek rows ko show karta h like 99 pahla rows 0 93 dursra rows 1 33 teesra rows 2 54 chotha rows 3 94 paanchwa rows 4 23 chatha rows 5 ko show karta h
        // eg : 2D array : int [] [] arr = { {2,4,5} , {6,3,2} , {9,3,5} }  // isme 2D array me 3 rows hai aur har ek rows me 3 columns hai like 2,4,5 pahla rows 0 6,3,2 dursra rows 1 9,3,5 teesra rows 2 ko show karta
        
        
        
        
        // Creation of MULTIdimensionArray 
        
        int multi [] [] = new int [4] [];        // yaha pr multi ke pass 2 bracket [] [] isliye lagaye kyuki ek rows ko aur ek column ko indicate krta h jab bhi MULTIdimensionArray banana to do likhna jaruri h 
                                                  // aur pahle bracket [] me rows ka size dena jaruri h aur dusre bracket [] me column ka size dena jaruri h
      // another way to represent MULTIdimensionArray  // aur column ya rows hamesha n - 1 tak hota h agar arraym me 4 rows hai to index 0 se start hoga aur last index 3 hoga aur agar array me 5 columns hai to index 0 se start hoga aur last index 4 hoga (n-1) tk chalta h 

      //int [] [] data = new int[3][2];    //ye dono shi h 
    
      // initialization of MULTIdimensionArray 

      int arr [][] = {

       {2,4,5},{6,3,2},{9,3,5},{4,5,112}

      };

   


   // upper jo bhi array create kiye ho usko access karne ke liye index ka use karte hai jaise arr[0][0] se hume first element 2 milega arr[0][1] se hume second element 4 milega arr[0][2] se hume third element 5 milega arr[1][0] se hume fourth element 6 milega arr[1][1] se hume fifth 
   // element 3 milega arr[1][2] se hume sixth element 2 milega arr[2][0] se hume seventh element 9 milega arr[2][1] se hume eighth element 3 milega arr[2][2] se hume ninth element 5 milega


//    System.out.println(arr[2][0]); // is code se hume 9 milega kyuki arr[2][0] se hume seventh element 9 milega
//    System.out.println(arr[0][1]); // is code se hume 4 milega kyuki arr[0][1] se hume second element 4 milega
//    System.out.println(arr[1][2]); // is code se hume 2 mile ga kyuki arr[1][2] se hume sixth element 2 milega   
   

   // row ka size ya column ka size find karna: To find the size of rows or columns in a MULTIdimensionArray, we can use the length property of the array. 
   // The syntax for finding the size of rows is: arrayName.length; For example, arr.length; will give us the number of rows in the array. The syntax for finding 
   // the size of columns is: arrayName[0].length; For example, arr[0].length; will give us the number of columns in the first row of the array. This is because all rows in a MULTIdimensionArray have the same number of columns.

//    int rowsize = arr.length; // is code se hume 3 milega kyuki arr.length se hume number of rows in the array milega
//    int columnsize = arr[0].length; // is code se hume 3 milega kyuki arr[0].length se hume number of columns in the first row of the array milega arr[0] means : first row of the array jisme 3 columns hai to arr[0].length se hume number of columns in the first row of the array milega aur sabhi rows me same number of columns hai to arr[0].length se hume number of columns in the array milega

//    System.out.println("The size of rows in the array is: " + rowsize); // is code se hume 3 milega kyuki arr.length se hume number of rows in the array milega
//     System.out.println("The size of columns in the array is: " + columnsize); // is code se hume 3 milega kyuki arr[0].length se hume number of columns in the first row of the array milega

  // printing of 2D array : 

    // for (int i = 0; i < arr.length; i++) { // is code se hume number of rows in the array milega
    //     for (int j = 0; j < arr[i].length; j++) { // is code se hume number of columns in the current row of the array milega
    //         System.out.print(arr[i][j] + " "); // is code se hume current element of the array milega aur space dega
    //     }
    //     System.out.println(); // is code se hume new line milega

// ya aap for each loop ka use kar sakte hai 2D array ko print karne ke liye

// for (int i[] : arr){ // is code se hume current row of the array milega isme i[] ka meaning hai current row of the array jisme 3 columns hai to i[] se hume current row of the array milega aur har ek row me 3 columns hai to i[] se hume current row of the array milega
//     for (int j : i){ // is code se hume current element of the current row of the array milega
//         System.out.print(j + " "); // is code se hume current element of the array milega aur space dega
//     }
// System.out.println(); // is code se hume new line milega


  int sum = 0 ;
  for(int i =0; i<arr.length;i++){
    for(int j = 0; j<arr[i].length;j++){
        sum += arr[i][j]; // is code se hume current element of the array milega aur usko sum me add karega
    }
  }System.out.println("The sum of all elements in the array is: " + sum); // is code se hume sum of all elements in the array milega

    


    }





    }

// jab aap array banate like arr [] ={2,3,4,5,6,7} and aap arr[2] likhe to 4 ko access kr paoge so akhirkar aap access kaise kr pate ho 
 // uske liye ek formula ka used hota h 
 // formula : address of element = base address + index * size of data type
 // base address : array ke first element ka address hota h
 // index : array ke element ka index hota h
 // size of data type : array ke element ke data type ka size hota h
 // example : int arr [] = {2,3,4,5,6,7} ;  // is array me base address 1000 hai to arr[2] ka address hoga 1000 + 2 * 4 = 1008 to arr[2] ka address 1008 hoga aur arr[2] ka value 4 hoga kyuki arr[2] ka address 1008 hoga aur arr[2] ka value 4
