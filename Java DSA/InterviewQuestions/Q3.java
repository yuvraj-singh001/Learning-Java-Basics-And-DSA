// // Question - Find the position of an element in a sorted array of infinite numbers.
// // Means - we do not know the size.
// // we can do this by checking the chunk of the array.


// public class Q3 {
//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30 };
//         int target = 7;
//         BinaryS o1 = new BinaryS();
//         int ans = o1.anss(arr, target);
//         System.out.println(ans);
//     }
// }

// class BinaryS {

//     public int anss(int[] arr, int target) {
//         // first find the range and here we are going for size 2 box.
//         int start = 0;
//         int end = 1;

//         // condition for the target to lie in the range.

//         // if target is greater than end then we just double the size of chunk.
//         while (target > arr[end]) {
//             int newStart = end + 1;
//             end = end + (end - start + 1) * 2;

//             start = newStart;
//         }

//         int result = searchBinary(arr, target, start, end);
//         return result;

//     }

//     public int searchBinary(int[] arr, int target, int l, int h) {
//         int mid = 0, ans = 0;
//         while (l < h) {
//             mid = (l + h) / 2;
//             if (arr[mid] == target) {
//                 ans = mid;
//             } else if (arr[mid] > target) {
//                 h = mid - 1;

//             } else {
//                 l = mid + 1;
//             }
//         }

//         return ans;
//     }
// }
