
public class Sorting {
    public static void main(String[] args) {
        
    

// public static void main(String[] args){                // yah normal sirf ek element ko sort karne ke liye code used hota h 
// int [] arr = {1,3,2,4,5,6};
// for(int i = 0;i<arr.length-1;i++){
//    if(arr[i]>arr[i+1]){
//     for(int ele: arr){
//         System.out.print(ele + " ");
//     }
//    }


// }
// }





// Bubble Sort KA CODE H KAISE UNSORTED ELEMENT KO SORT KARTE H 

// public static void print(int[] arr){
//     for(int ele : arr){
//         System.out.print(ele + " ");
//     }
    
// }

       // iska time complexity o(n^2) h     jo ki worst case h 
//     public static void main(String[] args){
       
//         int[] arr = {2,4,2,5,6,1,9,5,3,0,5};  // ISKA BHI TIME COMPLEXITY O(N2) HI HOTA H
//         int n = arr.length;
//         for(int i =0;i<n-1;i++){
//             for(int j = 0;j<n-1-i;j++){  // n-1-i becoz largest element last index par aa jata h to need nhi h dubara count karne ki isliye swap kar denge 
//               if ( arr[j] > arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//               }
//             }
//         }
//   print(arr);
//     }


// best case or average case of time complexity  (optimize code bol sakte h )


//public static void main(String[] args){
           // int swap = 0;
//         int[] arr = {2,4,2,5,6,1,9,5,3,0,5};  // ISKA BHI TIME COMPLEXITY O(N2) HI HOTA H
//         int n = arr.length;
//         for(int i =0;i<n-1;i++){
//             for(int j = 0;j<n-1-i;j++){  // n-1-i becoz largest element last index par aa jata h to need nhi h dubara count karne ki isliye swap kar denge 
//               if ( arr[j] > arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];    // swap int h hmisko boolean se bhi solve kar sakte h but boolean ka size chhota hota h int se 
//                 arr[j+1] = temp;
           //    swap ++;
//               }
//             }
//         }
// if(swap==0) break;                          // isase loop bar bar run nhi karega aur iska time compleixty 0(n) ho jayega ;
//   print(arr);
//     }


// best case uper wala ka O(n) h 
// average case uske uper wala ka O(n^2) h   // actually average most of the time worst case hi hota h 
// worst case uske uper wala ka O(n^2) h 





//    sort an array in descending order using bubble sort 

 // BUBBLE SORT (REVERSE ORDER )

// class Main {
    
//      public static void print(int[] arr){
//     for(int ele : arr){
//         System.out.print(ele + " ");
//     }
    
// }
            
       
//     public static void main(String[] args){
       
//         int[] arr = {2,4,2,5,6,1,9,5,3,0,5}; 
//         int n = arr.length;
//         for(int i =0;i<n-1;i++){  // n-1 ko passes bolte h  itne passes chal rha h  
//             for(int j = 0;j<n-1-i;j++){  
//               if ( arr[j] < arr[j+1]){            // sab kuchh same h bas isko less than ka sign laga diya 
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//               }
//             }
//         }
//   print(arr);
//     }
   
// }


// AGAR ME TIME COMPLEXITY KO BACHANE KE LIYE EXTRA SPACE LAGA RHA HU TO USME KOI BURAI NHI H 



// Move all zeros to end this is question 

// class Solution {
    // void pushZerosToEnd(int[] arr) {
       
    //     int n = arr.length;
    //      int j = 0;
    //     for(int i =0;i<n;i++){
    //           if ( arr[i] !=0){ 
    //            if(i!=j){                     
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //           }
                  
    //          j++; }
    //         }
    //     }
        
        
    // }
// built in sort dono ko bolte h arrays.sort or Collections.sort dono built in sort h inka time compleixty O(n long n ) hota h 

// array ko sort karne ke liye Arrays.sort(arr)  se ho jata h but agar aap Arraylist ki baat kar rahe ho to usko sort karne ke liye aap Collections ka used karna padta h 

// like Collections.sort(arr)   aapko arraylist ko reverse  bhi karne ke liye Collections.reverse(arr) ka used karna padta h 

// NOTE : merge sort ka time compleixty O(n log n) hota h whereas bubble sort,selection and insertion in sab ka lagbhag 0(n^2) hota h so merge sort best h

// becoz 0(n log n) bahut chhota h o(n^2) se 

// but merge sort ka space complexity 0(N) hota h jabki bubble,selection ,insertion ka space 0(1) hota h 

// note:  merge sort ka time compleixty kabhi bhi change nhi hota h 
// quick sort ka bhi 0(n log n) hota h but kabhi kabhi o(N square) hota jata h but merge sort ka nhi aur quick sort ka space complexity o( log n) hota h



                                         // SELECTION SORT 


// basically bubble sort me do element ko swap kar rhe the and the ascending order me isko adjust kar rhe the so isme swapping jyada ho rhi thi 
// but selection sort me pure elemnet mese least or minimum element dekhenge and then first element ko swap karenge to isme sorting ek certain time ke liye ho rha h 

// selection sort me  do chize hoti h ek hoti h sorted array ek hoti h UNSORTED part jo ki sort karnege 
// selection sort ka time compleixty best case,average case and worst case tino me = o(n square ) hi hoti h hamesha  ke liye 





// int [] arr = {0,3,2,5,7,2,1,9,4,3,4};
// int n = arr.length;

// for(int i =0;i<n-1;i++) {     // n-1 pass chalega 

//     int min = Integer.MAX_VALUE;                               // +infinite  value h iska 
//     int mindx = -1;    // yaha pr aap koi bhi chiz likh sakte ho 

//     for(int j = i;j<n;j++){
//         if(arr[j]<min){
//             min = arr[j];
//             mindx = j;
//         }
//     } int temp = arr[i];
//     arr[i] = arr[mindx];
//     arr[mindx] = temp;

// } 
// for(int ele: arr){
    
//     System.out.print(ele +" ");
// }   






//         int [] arr = {0,3,2,5,7,1,9,4};
// int n = arr.length;

// for(int i =n-1;i>0;i--) {     // n-1 pass chalega 

//     int min = Integer.MIN_VALUE;   // -infinte tak value h iska 
//     int mindx = -1;

//     for(int j = i;j>0;j--){
//         if(arr[j]>min){                    // bhai iska approach yah h ki yah sabse pahle maximum element ko find karega aur usko end me arrange karega then second maximum element ko find karega 
//             min = arr[j];                 // uppar wala minimum element ko find karega and first position par arrange karega isko 
//             mindx = j;
//         }
//     } int temp = arr[i];
//     arr[i] = arr[mindx];
//     arr[mindx] = temp;

// } 
// for(int ele: arr){
    
//     System.out.print(ele +" ");
// }  




// COMMON ELEMENTS IN ARRAY IT MEASN AAPKO DO SORTED ARRAY DIYA HUA H USME SE AAPKO COMMON ELEMENT FIND KARNA H 


// class Solution {
//     public static ArrayList<Integer> commonElements(int a[], int b[]) {
//         int i = 0,  j = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         Arrays.sort(a);
//         Arrays.sort(b);
//         while(i<a.length && j < b.length){
//             if(a[i]==b[j]){
//                 ans.add(b[j]);
//                 i++;
//                 j++;
                
//             }else if(a[i]<b[j]){
//                 i++;
//             }else j++;
                
//         } return ans;
        
//     }
// }

                                    // STABILITY OF SORTING 

// BUBBLE SORT : STABLE HOTA H WHEREAS SELECTION SORT UNSTABLE HOTA H 


// int arr [] = {7,3,4,7,8,1};
//         int n = arr.length;
//         for(int i =0;i<n-1;i++){                  // YE BUBBLE SORT KA CODE H HAMESAH STABLE RAHEGA CHAHE KITNI BAR BHI REPETATION WORK AAYE YE HAMESHA STABLE RAHEGA 
//             for(int j =0;j<n-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int ele : arr){
//         System.out.print(ele +" ");
//     }


//  int arr [] = {7,3,4,7,8,1}; // THIS IS SELECTION SORT BUT YE UNSTABLE RAHEGA AGAR 7* BAD ME RAHE TO YE PAHLE AAYEGA CHANGE KAR DEGA  YA 7^ BAD ME ISLIYE UNSTABLE RAHEGA 
//         int n = arr.length;
//         for(int i =0;i<n-1;i++){
//             int min = Integer.MAX_VALUE;
//             int mindx = 0;
//             for(int j =i;j<n;j++){
//                 if(arr[j]<min){
//                    min = arr[j];
//                    mindx = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[mindx];
//             arr[mindx] = temp;
//         }
//         for(int ele : arr){
//         System.out.print(ele +" ");
//     }



                                      // INSERTION SORT   ::         YAH BHI SAME BUBBLE SORT KI TARAH HOTA H 

// More similar to bubble sort   (Adjacent element swapping hoti h isme )

// int [] arr ={4,1,7,3,9,1,0,8};  // yah ek mera aaray  h isme pahle element ko jyu ke teyo likh denge fir dusra element ko phale se swap karenge agar dusra element pahle se jyada h to swap 
// aur fir tisra element ko dusre ke sath swap karenge agar tisra element dusre se chhota h to swap karenge aur fir tisra element ko pahle ke sath swap karenge agar tisra element pahle se chhota h to swap karenge aur is tarah se ye pura array sort ho jayega

// iska time complexity o(n^2) h worst case me 
// aur best case me o(n) h  [agar array already sorted h to ye sirf ek pass karega aur fir break kar dega ] 
// aur space complexity o(1) h
// insertion sort ka definition h ki ye ek stable sorting algorithm h aur ye adjacent element ko swap karte h aur isme sorted array ka use hota h

//  int [] arr ={4,1,7,3,9,1,0,8};

// for (int i = 0; i < arr.length; i++) {
//     int j = i;
//     while(j>0 && arr[j]<arr[j-1]){
//         int temp = arr[j];
//         arr[j] = arr[j-1];
//         arr[j-1] = temp;
//         j--;
//     }
    
// }
// for(int ele : arr){
//     System.out.print(ele+" ");
// }

// insertion sort ka time


                                  // STABILITY of insertion sort :  insertion sort hamesha stable hota h chahe kitni bar bhi repetition ho

                                  













































    }
}




   
