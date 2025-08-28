// package First;
// import java.util.Scanner;

//EVEN ODD CHECKER

// public class first
// {
//     public static void main(String a[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number to check");
//         int num = sc.nextInt();
//         if(num%2==0){
//             System.out.println("The number is even");
//         }
//         else{
//             System.out.println("The number is odd");
//         }
//     }
// }

//PRIME NUMBER CHECKER

// public class first{
//     public static void main(String a[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to check even or odd");
//         int num = sc.nextInt();
//         for(int i=2;i<num/2;i++){
//             if(num%i==0){
//                 System.out.println("The number is composite");
//                 break;
//             }
//             else{
//                 System.out.println("The number is prime");
//                 break;
//             }
//         }
//     }
// }


//FACTORIAL FINDER

// public class first{
//     public static void main(String a[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to find the factorial");
//         int num = sc.nextInt();
//         int result = 1;
//         if(num==0 || num == 1){
//             System.out.println("The factorial is: 1");
//         }
//         else{
//             int i = num;
//             while(i!=0){
//                 result = result * i;
//                 i--;
//             }
//             System.out.println("The factorial is: "+ result);
//         }
//     }
// }



// FIBONACI SERIES
// public class first{
//     public static void main(String a[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of terms you want to print");
//         int num = sc.nextInt();
//         int n1 = 0;
//         int n2 = 1;
//         System.out.println(n1);
//         System.out.println(n2);
//         for (int i = 2; i<num-1;i++){
//             int n3 = n1+n2;
//             n1 = n2;
//             n2 = n3;
//             System.out.println(n2);
//         }

        
//     }
// }
