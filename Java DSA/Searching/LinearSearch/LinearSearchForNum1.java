// import java.util.Scanner;

// public class LinearSearchForNum1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of elements in the array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         if(n == 0){
//             System.out.println("Nothing in the array");
//         }

//         else{
//             System.out.println("enter the " + n + " values in the array");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the value you want to find in it");
//         int x = sc.nextInt();

//         int flag = 0;
//         int count = 0;

//         System.out.print("The indexes are: ");
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == x) {
//                 flag = 1;
//                 count++;
//                 System.out.print(i + " , ");
//             }
//         }

//         if (flag == 1) {
//             System.out.println("");
//             System.out.println("Element found and the number of times it occurs is " + count);

//         }

//         else {
//             System.out.println("No such element found");
//         }

//         sc.close();
//         }
//     }
// }


// // This code is to check the number of times the element occurs and to show their indexes.