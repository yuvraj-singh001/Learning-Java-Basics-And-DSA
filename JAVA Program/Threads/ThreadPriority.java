
// // Priority range(1-10)

// public class ThreadPriority {
//     public static void main(String[] args) {
//         A o1 = new A();
//         B o2 = new B();

//         // by giving the priority we are just suggesting the scheduler to give that object that priority.
//         o1.setPriority(2);
//         o2.setPriority(Thread.MAX_PRIORITY);
//         System.out.println(o1.getPriority());
//         System.out.println(o1.getName());
//         o1.setName("jajkhsdkl");
//         System.out.println(o1.getName());


//         o1.start();
//         o2.start();
//     }
// }

// class A extends Thread{
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

// class B extends Thread{
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