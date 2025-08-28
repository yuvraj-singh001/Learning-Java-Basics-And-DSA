// package Inheritance;

// public class ThisAndSuper {
//     public static void main(String[] args) {
//         B o1 = new B(4);
//         // B o2 = new B(5);

//     }
// }


// class A{
//     public A(){ 
//         super();
//         System.out.println("in a");
//     }
//     public A(int n){ 
//         super();
//         System.out.println("in a int");
//     }
// }

// // super is always in the constructor which calls the constructor of parent class.
// // in java every class extends object class.

// class B extends A{
//     public B(){ 
//         super();
//         System.out.println("in b");
//     }
//     public B(int a){ 
//         this();
//         System.out.println("in b int");
//     }
// }