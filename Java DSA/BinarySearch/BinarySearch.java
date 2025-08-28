// package BinarySearch;

// public class BinarySearch {
//     public static void main(String[] args) {
        
//         int[] arr = {10,55,88,66,99,102,108,109};

//         int target = 66;

//         BinaryS o1 = new BinaryS();
//         o1.searchBinary(arr,target);
        
//     }
// }

// class BinaryS{
//     public void searchBinary(int[] arr , int target){
//         int mid, l, h;
//         l = 0;
//         h = arr.length-1;
//         while(l<=h){
//             mid = (l+h)/2;
//             // mid= start + (end - start)/2;   //if the (start+ end) exceeds the range of int in java.
//             if(arr[mid] == target){
//                 System.out.println("Element found on : " + mid);
//                 break;
               
//             }
//             else if(arr[mid]>target){
//                 h = mid-1;
//             }
//             else{
//                 l = mid + 1;
//             }
//         }

//     }
// }


// // Here we need a sorted array.