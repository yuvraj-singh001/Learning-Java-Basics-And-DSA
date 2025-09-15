// import java.util.Scanner;

// public class Q18 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the no of elements in arr A and B");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int A[] = new int[a];
//         int B[] = new int[b];

//         System.out.println("Enter the no of element in Arr A");
//         for(int i = 0 ; i< a; i++){
//             A[i] = sc.nextInt();
//         }

//         System.out.println("Enter the no of element in Arr B");
//         for(int i = 0 ; i< b; i++){
//             B[i] = sc.nextInt();
//         }

//         int res[] = new int[b];

//         for(int i = 0 ; i< b ; i++){
//             int count = 0;
//             for(int j = 0 ; j< a ;j++){
//                 if(A[j]>B[i]){
//                     count++;
//                 }
//             }
//             res[i] = count;
//         }

//         for(int i = 0 ; i< b; i++){
//             System.out.print(res[i] + " ");
//         }
//         sc.close();
//     }
// }
