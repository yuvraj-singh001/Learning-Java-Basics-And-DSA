// package DynamicMethodDispatch;

// public class DMD {
//     public static void main(String[] args) {
//         // we can refer this o1 of type A(Parent) only in case of inheritance.
//         // A o1; (OR)
//         A o1 = new A();
//         o1.show();

//         o1 = new B();
//         o1.show();

//         o1 = new C();
//         o1.show();
//     }
// }

// class A{
//     public void show(){
//         System.out.println("in A show");
//     }
// }

// class B extends A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }

// class C extends A{
//     public void show(){
//         System.out.println("in C show");
//     }
// }