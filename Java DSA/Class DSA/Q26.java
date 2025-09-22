// import java.util.Scanner;

// public class Q26 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows (n): ");
//         int n = sc.nextInt();
//         System.out.print("Enter number of columns (m): ");
//         int m = sc.nextInt();
//         int[][] arr = new int[n][m];

//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         swap(arr, n, m);

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println("");
//         }
//         sc.close();
//     }

//     static void swap(int[][] arr, int n , int m){
//         for(int i = 0; i< n ; i++){
//             for(int j = 0 ; j < m ; j++){
//                 if(i+1<n && j+1<m){
//                     int temp = arr[i][j];
//                     arr[i][j] = arr[i+1][j+1];
//                     arr[i+1][j+1] = temp;
//                 }
//             }
//         }
//     }
// }

// // 24 29 12 33
// // 25 36 18 17
// // 31 22 43 67