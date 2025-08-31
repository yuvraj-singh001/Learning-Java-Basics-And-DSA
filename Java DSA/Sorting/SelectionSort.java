// package Sorting;

// import java.util.Scanner;

// public class SelectionSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the length of the array");
//         int m = sc.nextInt();

//         int[] arr = new int[m];
        
//         System.out.println("Enter the values of the Array");
//         for(int i = 0 ; i < m ; i++){
//             arr[i] = sc.nextInt();
//         }


//         int max;
//         for(int i = 0 ; i< arr.length ;i++){
//             max = 0;
//             for (int j = 1 ;j < arr.length-i; j++){
//                 if(arr[j]>arr[max]){
//                     max = j;
//                 }
//             }
            
//             int temp = arr[max];
//             arr[max] = arr[arr.length-i-1];
//             arr[arr.length-i-1] = temp;
//         }

//         for(int i = 0 ; i < m ; i++){
//             System.out.println(arr[i]);
//         }
//         sc.close();
//     }
// }
