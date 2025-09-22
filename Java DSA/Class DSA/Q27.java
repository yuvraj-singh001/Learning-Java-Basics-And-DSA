// import java.util.Scanner;

// public class Q27 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter the main string");
//         String s1 = sc.nextLine();
//         System.out.println("enter the 2nd string");
//         String s2 = sc.nextLine();
//         System.out.println("enter a number");
//         int n = sc.nextInt();

//         StringBuilder res = new StringBuilder();

//         int count = 0;
//         for(int i = 0 ; i<s1.length() ; i++){
//             char ch = s1.charAt(i);
//             if(count == n){
//                 res.append(s2);
//                 count = 0;
//             }
//             res.append(ch);
//             count++;
//         }

//         System.out.println(res);
//     }
// }
