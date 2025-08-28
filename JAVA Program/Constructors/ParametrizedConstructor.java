// package Constructors;

// public class ParametrizedConstructor {
//     public static void main(String[] args) {
//         Human o1 = new Human();
//         Human o2 = new Human(18,"rakesh");
//         // o1.setAge(22);
//         // o1.setName("Yuvraj");
//         System.out.println(o1.getAge());
//         System.out.println(o1.getName());
//         System.out.println(o2.getAge());
//         System.out.println(o2.getName());
//     }
// }


// class Human{
//     private int age;
//     private String name;

//     public Human(int age , String n){      //Parametried Constructor in which we can pass value.
//         this.age = age;
//         name = n;
//     }

//     public Human(){
//         System.out.println("in constructor");
//         age = 12;
//         name = "your name";
//     }

//     public int getAge() {
//         return age;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }  
// }