// import java.util.Scanner;

// public class MinNumInArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of elements in the array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("enter the "+ n +" values in the array");
//         for(int i = 0 ; i < n; i++){
//             arr[i]= sc.nextInt();
//         }

//         MinNumSearch o1 = new MinNumSearch();
//         o1.minNumSearch(arr);

//         sc.close();
//     }
// }

// class MinNumSearch{
//     public void minNumSearch(int[] arr){
//         int min = arr[0];
//         int curr;

//         for(int i = 0 ; i < arr.length ; i++){
//             curr = arr[i];
//             if(curr<min){
//                 min = curr;
//             }
//         }

//         System.out.println(min);
//     }
// }


// // Same for the max only change the symbol in the if condition in the min function.