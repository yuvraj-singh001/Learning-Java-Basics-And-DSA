// package BinarySearch;

// public class OrderAgnosticSearch {
//     public static void main(String[] args) {
//         int[] arr = { 10, 55, 88, 66, 99, 102, 108, 109 };
//         int[] arr1 = { 10, 55, 88, 66, 99, 102, 108, 109 };

//         int target = 66;

//         BinaryS o1 = new BinaryS();
//         o1.orderAgnosticSearchBinary(arr, target);
//     }
// }

// class BinaryS {
//     public void orderAgnosticSearchBinary(int[] arr, int target) {
//         int mid, l, h;
//         l = 0;
//         h = arr.length - 1;

//         if (arr[l] < arr[h]) {
//             while (l <= h) {
//                 mid = (l + h) / 2;
//                 // mid= start + (end - start)/2; //if the (start+ end) exceeds the range of int
//                 // in java.
//                 if (arr[mid] == target) {
//                     System.out.println("Element found on : " + mid);
//                     break;

//                 } else if (arr[mid] > target) {
//                     h = mid - 1;
//                 }  else if (arr[mid] < target) {
//                     l = mid + 1;
//                 }
//                 else{
//                     System.out.println("Element not found");
//                 }
//             }
//         }

//         else {
//             while (l <= h) {
//                 mid = (l + h) / 2;
//                 // mid= start + (end - start)/2; //if the (start+ end) exceeds the range of int
//                 // in java.
//                 if (arr[mid] == target) {
//                     System.out.println("Element found on : " + mid);
//                     break;

//                 } else if (arr[mid] < target) {
//                     h = mid - 1;
//                 } else if (arr[mid] > target) {
//                     l = mid + 1;
//                 }
//                 else{
//                     System.out.println("Element not found");
//                 }
//             }
//         }

//     }
// }

// // when we do not no the order asscending or decending order.
// // we have to use the if to check the order.