// // we can not use non static variable in static method for that we have to pass the obj reference to the static method.
// package Static;

// public class StaticMethod {
//     public static void main(String[] args) {
//         Mobile o1 = new Mobile();
//         o1.brand = "apple";
//         o1.price = 1500;
//         // o1.name = "SmartPhone";

//         Mobile o2 = new Mobile();
//         o2.brand = "Samsung";
//         o2.price = 1200;
//         // Mobile.name = "SmartPhone";

//         Mobile o3 = new Mobile();
//         o3.brand = "Oppo";
//         o3.price = 1400;
//         Mobile.name = "Phone";

//         o1.show();
//         o2.show();
//         o3.show();
//         Mobile.show1(o1);
//     }
// }


// class Mobile{
//     String brand;
//     int price;
//     static String name;

//     public void show(){
//         System.out.println(brand + " : " + price +" "+ name);
//     }
//     public static void show1(Mobile obj){
//         System.out.println("In static method");
//         System.out.println(obj.brand + " : " + obj.price +" "+ name);
//     }
// }