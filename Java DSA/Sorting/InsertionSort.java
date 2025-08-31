// package Sorting;

// import java.util.Scanner;

// public class InsertionSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the length of the array");
//         int m = sc.nextInt();

//         int[] arr = new int[m];
        
//         System.out.println("Enter the values of the Array");
//         for(int i = 0 ; i < m ; i++){
//             arr[i] = sc.nextInt();
//         }


//         selectionSort(arr);


//         for(int i = 0 ; i < m ; i++){
//             System.out.println(arr[i]);
//         }
//     }

//     static void selectionSort(int arr[]){
//         for(int i = 0 ; i<arr.length-1 ; i++){
//             for (int j = i+1 ; j>0;j--){
//                 if(arr[j]<arr[j-1]){
//                     int temp = arr[j];
//                     arr[j] =arr[j-1];
//                     arr[j-1] = temp;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//     }
// }
