// package Sorting;

// import java.util.Scanner;

// public class CycleSort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the length of the array");
//         int m = sc.nextInt();

//         int[] arr = new int[m];
        
//         System.out.println("Enter the values of the Array");
//         for(int i = 0 ; i < m ; i++){
//             arr[i] = sc.nextInt();
//         }


//         cycleSort(arr);


//         for(int i = 0 ; i < m ; i++){
//             System.out.println(arr[i]);
//         }
//     }

//     static void cycleSort(int arr[]){
//         for(int i  = 0 ; i < arr.length - 1 ;i++){
//             int correct = arr[i]-1;
//             if(arr[i] != arr[correct] ){
//                 int temp = arr[i];
//                 arr[i] = arr[correct];
//                 arr[correct] = temp;
//             }
//             else{
//                 i++;
//             }
//         }
//     }
// }
