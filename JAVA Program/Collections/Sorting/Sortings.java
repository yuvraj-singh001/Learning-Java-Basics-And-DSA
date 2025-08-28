// package Collections.Sorting;

// import java.util.*;

// public class Sortings {
//     public static void main(String[] args) {

//         // sorting according to the last number.
//         Comparator<Integer> com = new Comparator<Integer>() {
//             public int compare(Integer i, Integer j){
//                 if(i%10>j%10)
//                     return 1;
//                 else
//                     return -1;
//             }
//         };

//         List<Integer> nums = new ArrayList<>();
//         nums.add(55);
//         nums.add(68);
//         nums.add(60);
//         nums.add(94);

//         // collection is a class which have so many methods.
//         Collections.sort(nums);
        
//         // if we want to sort it on our way.we use comparator to make our logic in sorting.
//         Collections.sort(nums,com);


//         System.out.println(nums);


//         // this is the program which sort the strings according to their length.
//         Comparator<String> com1 = new Comparator<String>() {
//             public int compare(String i, String j){
//                 int n = i.length();
//                 int m = j.length();
//                 if(n>m)
//                     return 1;
//                 else
//                     return -1;
//             }
//         };

//         List<String> str = new ArrayList<String>();

//         str.add("Hello");
//         str.add("yuvraj");
//         str.add("Singh");
//         str.add("How");

//         Collections.sort(str,com1);


//         System.out.println(str);
//     }
// }
