// import java.util.Scanner;

// public class Q25 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows (n): ");
//         int n = sc.nextInt();
//         System.out.print("Enter number of columns (m): ");
//         int m = sc.nextInt();
//         int[][] matrix = new int[n][m];

//         System.out.println("Enter matrix elements:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Submatrix after removing:");

//         for (int i = 1; i < n - 2; i++) {
//             for (int j = 1; j < m - 2; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }