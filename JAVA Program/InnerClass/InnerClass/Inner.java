// // class inside another class

// package InnerClass;

// public class Inner {
//     public static void main(String[] args) {
//         A o1 = new A();
//         o1.show();

//         // this will work with nonstatic class.
//         // A.B o2 = o1.new B();
//         // o2.config();


//         // it will work for Static class.
//         A.B o2 = new A.B();
//         o2.config();

//     }
// }


// // we cannot make the outer class a static class.only in the inner class.
// class A{

//     int age;

//     public void show(){
//         System.out.println("in Class A");
//     }

//     static class B{
//         public void config(){
//             System.out.println("in config");
//         }
//     }
// }