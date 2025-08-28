// // Question- find the ceiling of a number in an array.
// // Means - The smallest element which is greater or equal to the target number in the all element.

// package InterviewQuestions;

// public class Q1 {
//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
//         int target = 15;


//         // This is for the the sorted value only.

//         // int ceiling= 0;
//         // for (int i = 0; i < arr.length; i++) {
//         //     if(arr[i] >= target){
//         //         ceiling = arr[i];
//         //         break;
//         //     }
//         // }
//         // System.out.println(ceiling);

//         BinaryS o1 = new BinaryS();
//         int ans = o1.searchBinary(arr, target);
//         System.out.println(ans);

//     }
// }

// class BinaryS{
//     public int searchBinary(int[] arr , int target){
//         int mid, l, h;
//         l = 0;
//         h = arr.length-1;
//         while(l<=h){
//             mid = (l+h)/2;
//             if(arr[mid] == target){
//                 return arr[mid];
               
//             }
//             else if(arr[mid]>target){
//                 h = mid-1;
//             }
//             else if(arr[mid]<target) {
//                 l = mid + 1;
//             }
//         }

//         // because the l will be at the next position of the end(h) when the loop breaks and we get our answer.
//         return arr[l];

//     }
// }
