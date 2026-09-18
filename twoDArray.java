import java.util.Scanner;


public class twoDArray {
    public static void main (String [] args) {
    
        Scanner sc = new Scanner(System.in);

        // int rows = sc.nextInt();
        // int colum = sc.nextInt();

        // int  [][] number = new int [rows][colum];
    

        // // input 
        // for (int i = 0; i<rows;  i++){
        //     for(int j = 0;j<colum;j++){

        //         number [i][j]=sc.nextInt();

        //     }
        // }
        
        // // output 
        // for (int i = 0; i<rows;i++){
        //     for(int j = 0;j<colum;j++){

        //         System.out.print(number[i][j] + " ");

        //     }
        //     System.out.println();
    
    //}
        
        
        
        
        
        
        
        // Quest  Take a   matrix as input from the user. Search for a given number x and print the indices at which it occures.

          int rows = sc.nextInt();
        int colum = sc.nextInt();

        int  [][] number = new int [rows][colum];
    

        // input 
        for (int i = 0; i<rows;  i++){
            for(int j = 0;j<colum;j++){

                number [i][j]=sc.nextInt();

            }
        }
        
        int x = sc.nextInt();

        for (int i = 0; i<rows;  i++){
            for(int j = 0;j<colum;j++){
             
                // compared with x 
                if(number [i][j] == x){
                    System.out.println("x is found at location(" + i + ","+j+")");
                }
              

            }
        }

   // java 2D array  =  array of arrays
   // rows and columns 
   // syntax
   // dataType  [][]  variableName = new dataType [rows][columns];
   // example
   // int  [][] number = new int [3][4]; // 3 rows and 4 columns
    // input 
    // for (int i = 0; i<3;  i++){
    //     for(int j = 0;j<4;j++){  
    //         number [i][j]=sc.nextInt();
    //     }    
    // }
    // output 
    // for (int i = 0; i<3;i++){
    //     for(int j = 0;j<4;j++){
    //         System.out.print(number[i][j] + " ");
    //     }
    //     System.out.println();
    // }
    

    // 2d array declaration and initialization
    // int  [][] number = {
    //     {1,2,3},  // row 0
    //     {4,5,6},  // row 1
    //     {7,8,9}   // row 2
    // };
        
    // // output
    // for (int i = 0; i<3;i++){
    //     for(int j = 0;j<3;j++){
    //         System.out.print(number[i][j] + " ");
    //     }
    //     System.out.println();
    // }


    // definition of 2d array
    // typically 2d array is used to represent matrix
    // matrix is a collection of numbers arranged into fixed number of rows and columns
    // example of 3x3 matrix
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // here 3 is number of rows and 3 is number of columns
    // total number of elements in matrix = rows * columns = 3 * 3 = 9










        
    }   
    
}
