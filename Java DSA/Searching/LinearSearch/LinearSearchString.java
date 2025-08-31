// import java.util.Scanner;

// public class LinearSearchString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the srting you want to search for");
//         String str = sc.nextLine();

//         System.out.println("Enter the target element");
//         char target = sc.next().charAt(0);

//         LinearSeacrh o1 = new LinearSeacrh();
//         o1.LSearch(str, target);

//         sc.close();
//     }
// }

// class LinearSeacrh{
//     public void LSearch(String str , char target){
//         int flag = 0 ;
//         if(str.length() == 0){
//             System.out.println("Nothing found in the string");
//         }

//         else{
//             for(int i = 0 ; i < str.length() ; i++){
//                 if(target == str.charAt(i)){
//                     flag = 1 ;
//                 }
//             }
//         }
//         if(flag == 1){
//             System.out.println("The target element is found");
//         }
//         else {
//             System.out.println("The is no match for the given target");
//         }
//     }
// }

// // This is the code to find the target in a given string.
// // Or we can use chararray.