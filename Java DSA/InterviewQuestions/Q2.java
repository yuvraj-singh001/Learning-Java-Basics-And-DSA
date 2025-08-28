// // Question- find the Floor of a number in an array.
// // Means - The greatest element which is just smaller or equal to the target number in the all element.

// package InterviewQuestions;

// public class Q2 {
//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
//         int target = 15;

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

//         // because the end(h) will be at the next position of the Start(l) when the loop breaks and we get our answer.
//         return arr[h];

//     }
// }
