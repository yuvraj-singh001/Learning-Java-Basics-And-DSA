// // interface is not a class
// // class -> class = extends
// // class -> interface = implements
// // interface -> interface = extends

// package Interface;

// public class Interface {
//     public static void main(String[] args) {
//         C o1 = new C();
//         o1.Show();
//         o1.config();
//         o1.show1();
//         // A.area = "hello";                 //it is final therefore we can not change it. 
//         System.out.println(A.area);
//         System.out.println(A.age);
//     }
// }

// interface A{
//     int age=20;                //the all the variable in side the interface are final and static.so we have to initialize it here
//     String area="shape";     
//      void Show();
//      void config();
    
// }

// interface B{
//     void show1();
// }

// interface X extends B{         // we can extend a interface also.
//     void show2();
// }

// class C implements A,B{            //a class can implement more than one interface and only 1 in abstract class.

//     @Override
//     public void Show() {
//         System.out.println("in B Show");
//     }

//     public void config(){
//         System.out.println("in config");
//     }

//     @Override
//     public void show1() {
//         System.out.println("in show1");
//     }
    
// }



// types of interface
// Noraml- interface with 2 or more methods.
// Functional/SAM- with only one function.
// Marker-A blank interface.
