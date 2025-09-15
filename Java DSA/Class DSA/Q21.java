// import java.util.Scanner;

// public class Q21 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of element in array");
//         int n = sc.nextInt();

//         System.out.println("Enter the elements in the array");
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int profit = 0;
//         int buyp = arr[0];
//         for(int i = 0 ; i < n ; i++){
//             if(buyp > arr[i]){
//                 buyp = arr[i];
//             }
//             profit = Math.max(profit, arr[i]-buyp);
//         }

//         System.out.println(profit);
//     }
// }
