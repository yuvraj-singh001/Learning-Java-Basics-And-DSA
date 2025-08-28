// // final- variable, method, class.

// package FinalKeyWord;

// public class FKW {
//     public static void main(String[] args) {
//         // WITH VARIABLE.
//         // we use final key word to make any variable a constant.
//         final int num = 8;
//         // num = 9;                      we can't change the value.
//         System.out.println(num);

        
//         Calc o1 = new Calc();
//         o1.show();
//         o1.add(3, 5);

//         AdvCal o2 = new AdvCal();
//         o2.show();
//         o2.add(5, 6);
//     }
// }


// // WITH CLASS.
// // we can use the final keyword to stop inheritance of a class.
// final class Calc{
//     public void show(){
//         System.out.println("in calc show");
//     }
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }


// // WITH METHOD.
// // we can stop the method overriding by using final keyword.
// class Cal{
//     public final void show(){
//         System.out.println("in calc show");
//     }
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
// }

// class AdvCal extends Cal{
//     // public void show(){
//     //     System.out.println("in cal show by uv");        we can not override it.
//     // }
// }