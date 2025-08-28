// package Enumeration;

// public class Enums1 {
//     public static void main(String[] args) {
//         Status s = Status.Pending;


//         if(s == Status.Running){
//             System.out.println("All Good");
//         }
//         else if (s == Status.Failed){
//             System.out.println("Try Again");
//         }
//         else if (s == Status.Pending){
//             System.out.println("Please Wait");
//         }
//         else{
//             System.out.println("Done");
//         }

//         // or we can use the switch here
//         switch(s){
//             case Running:
//                         System.out.println("All Good");
//                         break;
//             case Failed:
//                         System.out.println("Try Again");
//                         break;
//             case Pending:
//                         System.out.println("Please Wait");
//                         break;
//             case Success:
//                         System.out.println("Done");
//                         break;
//         }
//     }
// }

// // all the things in the status are objects(constants) and status is a class.

// enum Status{
//     Running, Failed, Pending, Success;
// }