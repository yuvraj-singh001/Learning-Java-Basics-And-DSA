// package Collections.Map;

// import java.util.*;

// // It is a key value pair.(Unoredered)
// // keys can not be repeated but vakues can be.

// public class Maps {
//     public static void main(String[] args) {
        
//         Map<String,Integer> student = new HashMap<>();
//         // it synchronized and can be used for threads.
//         // Map<String,Integer> student1 = new Hashtable<>();

//         student.put("yuvraj",57 );
//         student.put("vineet",56 );
//         student.put("uv",58 );
        
//         // to change something in values 
//         student.put("vineet",99 );

//         // to get key set
//         System.out.println(student.keySet());

//         // and we use for like this
//         for ( String name :student.keySet()){
//             System.out.println(name+" : "+student.get(name));
//         }

//         System.out.println(student);
//         System.out.println(student.get("uv"));

//     }
// }
