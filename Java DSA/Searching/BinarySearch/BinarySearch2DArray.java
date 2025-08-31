// import java.util.Scanner;
// // This is for the sorted matrix for row and column both.

// public class BinarySearch2DArray {
//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the Rows and columns of the array");
//         int m = sc.nextInt();
//         int n = sc.nextInt();

//         System.out.println("Enter the target element");
//         int target = sc.nextInt();

//         int[][] arr = new int[m][n];
        
//         System.out.println("Enter the values of the Array");
//         for(int i = 0 ; i < m ; i++){
//             for(int j = 0 ; j < n ; j++){
//                     arr[i][j] = sc.nextInt();
//             }
//         }

//         // int r1 = 0;
//         // int r2 = m-1;
//         // while(r1<=r2){
//         //     int l = 0;
//         //     int h = n-1;
//         //     int mid = (r1+r2)/2;
//         //     while(l<=h){
//         //         int mid1 = (l+h)/2;
//         //         if(arr[mid][mid1] == target){
//         //             System.out.println(mid);
//         //             System.out.println(mid1);
//         //             // residx = mid1;
//         //         }
//         //         else if(l<h && arr[mid][mid1] < target){
//         //             l = mid1 +1;
//         //         }
//         //         else if(l<h && arr[mid][mid1] > target){
//         //             h = mid1 - 1;
//         //         }
//         //     }
//         //     if(arr[mid][l]< target){
//         //         r1 = mid + 1;
//         //     }
//         //     else if(arr[mid][l]> target){
//         //         r2 = mid -1;
//         //     }
//         // }

//         int r = 0;
//         int c = arr.length-1;

//         while(r < arr.length && c >=0){
//             if(arr[r][c] == target){
//                 System.out.println(arr[r][c]);
//             }
//             if(arr[r][c]<target){
//                 r++;
//             }
//             else{
//                 c--;
//             }
//         }

//         sc.close();
//     }
// }
