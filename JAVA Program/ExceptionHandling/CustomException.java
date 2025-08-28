// public class CustomException {
//     public static void main(String[] args){
//         int i = 20;
//         int j=0 ;
//         try
//         {
//             j = 18/i;
//             if(j ==0){
//                 throw new YuvrajException("divide by zero");
//             }
//         }
//         catch(YuvrajException e){
//             // handling
//             j = 18/1;
//             System.out.println("thats a default output "+ e);
//         }
//         catch(Exception e){
//             System.out.println("Something went gone wrong. " +e);
//         }

//         System.out.println(j);
//     }
// }

// // to create custom exception we have to create a class with constructor and extends it to exception class.
// class YuvrajException extends Exception{
//     public YuvrajException(String string){
//         System.out.println(string);
//     }
// }