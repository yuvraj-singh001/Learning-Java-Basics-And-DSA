// import java.util.Scanner;

// public class LinearSearchForNum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of elements in the array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("enter the "+ n +" values in the array");
//         for(int i = 0 ; i < n; i++){
//             arr[i]= sc.nextInt();
//         }

//         System.out.println("Enter the value you want to find in it");
//         int x = sc.nextInt();

//         int flag =0;
//         int pos = 0 ;

//         for(int i = 0 ; i < n; i++){
//             if(arr[i] == x){
//                 flag = 1;
//                 pos = i;
//             }
//         }

//         if(flag == 1){
//                 System.out.println("Element found and the position is " + pos);

//             }

//             else{
//                 System.out.println("No such element found");
//             }

//         sc.close();
//     }
// }


// //This is the normal code which just check the element.