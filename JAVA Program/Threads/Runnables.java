// // Priority range(1-10)

// public class Runnables {
//     public static void main(String[] args) {
//         // we can use both to pass o1 and o2.
//         Runnable o1 = new A();
//         B o2 = new B();

//         // we need to create Thread object.
//         Thread t1 = new Thread(o1);
//         Thread t2 = new Thread(o2);
//         t1.start();
//         t2.start();
       
//     }
// }

// class A implements Runnable{
//     public void run(){
//         for(int i = 0 ; i < 10; i++){
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i = 0 ; i < 10; i++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }