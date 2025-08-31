// package Sorting;
// import java.util.Scanner;
// // it is also known as sinking sort and exchange sort.
// public class BubbleSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the length of the array");
//         int m = sc.nextInt();

//         int[] arr = new int[m];
        
//         System.out.println("Enter the values of the Array");
//         for(int i = 0 ; i < m ; i++){
//             arr[i] = sc.nextInt();
//         }

//         int i = 0, j = 0;
//         boolean swap;
//         for(i = 0 ; i <arr.length ; i++){
//             swap = false;
//             for(j = 1 ; j <arr.length-i ; j++){
//                 if(arr[j-1]>arr[j]){
//                     int temp = arr[j];
//                     arr[j] = arr[j-1];
//                     arr[j-1] = temp;
//                     swap = true;
//                 }
//             }
//             if(swap == false){
//                 break;
//             }
//         }

//         for(i = 0 ; i < m ; i++){
//             System.out.println(arr[i]);
//         }

//         sc.close();
//     }    
// }