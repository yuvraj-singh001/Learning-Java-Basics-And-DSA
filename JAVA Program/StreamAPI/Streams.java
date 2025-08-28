// package StreamAPI;

// import java.util.*;
// import java.util.function.Consumer;
// import java.util.stream.*;

// public class Streams {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8);
        
//         System.out.println(nums);

//         // // using for each to read array.
//         // Consumer<Integer> con =  n->System.out.println(n);
//         // nums.forEach(con);

//         // // these both are same.
//         // nums.forEach(n->System.out.println(n));





//         // to seperate the desired values.this is one way but we can do it more easily.
//         int sum=0;
//         for (int n : nums){
//             if(n%2 == 0){
//                 n = n*2;
//                 sum = sum+n;
//             }
//         }
//         System.out.println(sum);

//         // we are using stream interface to filter and many methods.
//         // we can use stream only once.but are many methods to work on and thats good about it.

//         Stream<Integer> s1 = nums.stream();
//         // s1.forEach(n -> System.out.println(n));
//         Stream<Integer> s2 = s1.filter(n-> n%2 == 0);
//         Stream<Integer> s3 = s2.map(n->n*2);

//         // another method
//         int result = s3.reduce(0,(c,e)->c+e);
//         System.out.println(result);
//         // printing
//         // s3.forEach(n -> System.out.println(n));



//         // we can use it also like this.
//         int result1 = nums.stream()
//             .filter(n -> n%2 == 0)
//             .map(n->n*2)
//             .reduce(0, (c,e) -> c+e);

//         System.out.println(result1);
//     }
// }
