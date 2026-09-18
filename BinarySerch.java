public class BinarySerch {
    public static void main(String[] args) {

// Binary Search in Java 🔍

// Binary Search is used to search for an element in a sorted array.

// Example
// arr = {10, 20, 30, 40, 50, 60, 70}
// target = 50

// Instead of checking every element one by one, Binary Search checks the middle element and eliminates half of the array each time.



      // Binary search : tab kam karta h jab array sorted ho so first array ko sort karna hoga then applies binary search 
      // Example int [] arr = {10, 20, 30, 40, 50, 60, 70}; target = 50;
      // wah pahle mid elemnet find karega then check karega ki target mid se chota h ya bada h agar chota h to left side me search karega aur agar bada h to right side me search karega
      // again sare element ko find karega jab tak target element mil jaye ya fir array ke sare element check ho jaye 

      // linear search : isi example ko one by one check karega ki target element array me h ya nahi 

      // binary search is more efficient than linear search for large arrays because it reduces the number of comparisons needed to find the target element.
      // However, it requires the array to be sorted beforehand, which may take additional time if the array is not already sorted.


         // ** most important point ** yad rakhna 


      // Binary Search Algorithm
      // 1. Find the middle element of the array.
      // 2. If the middle element is equal to the target element, return the index of the middle element.  if(mid == target) then return mid
      // 3. If the target element is less than the middle element, repeat the search on the left half of the array.  if(mid > target) then search in left half of the array 
      // 4. If the target element is greater than the middle element, repeat the search on the right half of the array.  if(mid < target) then search in right half of the array
      // 5. Repeat steps 1-4 until the target element is found or the search space is empty.
      // 6. If the target element is not found, return -1 to indicate that the element is not present in the array.
      // 7. The time complexity of binary search is O(log n), where n is the number of elements in the array.
      // 8. The space complexity of binary search is O(1) because it uses a constant amount of space for variables.
      



      // ye chiz hamesha yad rakhna 

//       Binary Search:

// O(log n)

// For example, with 1,000,000 elements, binary search needs only about 20 comparisons in the worst case, because it cuts the search space roughly in half each time.

// Important ⭐

// Binary Search requires the array to be sorted:

// 10 20 30 40 50 60 70

// Not: 30 10 70 20 50

// For now, focus on remembering:

// mid = low + (high - low) / 2   // ye hamesha yad rakhna 

// if target == arr[mid]
//     found

// else if target > arr[mid]
//     low = mid + 1

// else
//     high = mid - 1
  
  // lets understand the why time complexity of binary search is O(log n) and linear search is O(n)
  // iska code run ayese kar rha h n,n/2,n/4,n/8,n/16,.....,1 
  // isko aap ayese bhi likh sakte ho 1,2,3,4,....n/2,1  isko x terms bolte h we know formula of x tems is n/2^x = 1 => n = 2^x => log2(n) = x => x = log2(n) => O(log n) so iska time complexity O(log n) hoga
  
  // code   leetcode 704. Binary Search 

//   class Solution {
//     public int search(int[] arr, int target) {
//        int n = arr.length;
//         int low =0,high = n-1;
//         while(low<=high){
//             int mid = (low+high)/2 ;
//             if(arr[mid]==target){
//                 return mid;
//             }else if(arr[mid]>target){
//                 high = mid-1;
//             }else {
//                 low = mid + 1;
//             }
//     } return -1;
// }}
  
  // first  occurrence of target element in sorted array
  //x
  
  // aapko binary search find karna h but problem ye h ki array descending order me usase aapko find karna h 
  
  
  
  int[] arr ={9,8,7,6,5,4,3,2,1} ;
       int target =3;
        int n = arr.length;
        int low =0,high = n-1;
        while(low<=high){
            int mid = (low+high)/2 ;
            if(arr[mid]>target){
                low = mid-1;
            }else if(arr[mid]<target){
                
                high = mid+1;
            }
            else{
                System.out.println("target ke barabar h ");
                break;
            }

        }
  
  
//   So why <=?

// Because in normal binary search, we want to search while there is at least one element remaining.

// That means:

// low < high     → multiple elements
// low == high    → exactly ONE element
// low > high     → no elements
  
//   Important Difference ⭐
// Normal Binary Search

// Question:

// "Does 50 exist in the array?"

// Use:

// while(low <= high)

// Because you need to check the final remaining element.

// Find Peak / First-Last / Lower Bound Type Problems

// Sometimes the goal is:

// "Reduce the search range until only one answer remains."

// Then you often use:

// while(low < high)
// Visual Difference
// low <= high
// low                high
//  ↓                   ↓
// [ 10 | 20 | 30 | 40 | 50 ]

// Continue

// ↓

//        low = high
//           ↓
//         [50]

// Continue checking it ✅
// low < high
// low = high
//    ↓
//  [50]

// low < high
// 5 < 5 ❌

// Stop
  
  
  // ek chiz yad rakhana hm mid = (low+high)/2 likhte h but iske ander ek problem h integer overflow error de deta h iska best solution h 

  //mid =low + high+ low-low/2 = 2low +high-low/2  then 2low/2 = low so its become low  + (high-low)/2
  
  // so now mid =low + (high-low)/2
  
  // Although kabhi kabhi uper wala hi kam karta h niche wala nhi mid =low + (high-low)/2 

  // example low = -2^31, high = 2^31 -1 is comdintion me ye naya mid ka forumula kam nhi karta h uper wala hi kam karega interview ke purpose se 

  // but ayesa hota nhi h ye hamesha kam karta h but remembering for interview 
  
  // modulus ka formula : [a%b = a - b*(a/b)]  is formula ko hamehs yad rakhana 

  // SEARCH IN SORTED ARRAY  class Solution {
//     public boolean searchMatrix(int[][] arr, int tar) {
//         // code here
//         int rows = arr.length,col = arr[0].length;
//         int low = 0,high = rows* col-1;
//         while(low<=high){
//             int mid = (low+high)/2;
//             int midrow = mid/col,midcol = mid%col;
//             if(arr[midrow][midcol]==tar) return true;
//             else if (arr[midrow][midcol]>tar) high = mid -1;
//             else low = mid+1;
//         }
//         return false;
//     }
// }

  
  
  
  
  
  // mene sara Question leetcode or gfg pr solve kar rkha h so jakar waha se dekh lo 
  
  
    }
}
