// package UpcastingAndDowncasting;

// public class UAD {
//     public static void main(String[] args) {

//         // this the object of B but refered to A so we are going up this is upcasting.
//         // it happens implicitly without (A) so we do not need to write it.
//         A obj = (A) new B();

//         obj.show1();
        
//         // obj is parent reference and we are downcasting it to child refernce.
//         B obj1 = (B) obj;
//         obj1.show1();
//         obj1.show2();
//     }
// }


// class A{
//     public void show1(){
//         System.out.println("in show A");
//     }
// }
// class B extends A{
//     public void show2(){
//         System.out.println("in show B");
//     }
    
// }