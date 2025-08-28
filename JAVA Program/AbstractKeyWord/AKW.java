// package AbstractKeyWord;

// public class AKW {
//     public static void main(String[] args) {

//         // we cannot create the object of abstract class.but we can create reference.
//         Car o1 = new UpdatedWagonR();
//         o1.drive();
//         o1.playMusic();
//         o1.fly();
//     }
// }


// // abstract say we will declare this method in another place.we can use abstract in abstract class.and it is not compulsary to hava 
// // abstract method in abstract class.
// abstract class Car{
//     public abstract void drive();
//     public abstract void fly();
//     public void playMusic(){
//         System.out.println("Play Music.....");
//     }
// }

// // if we are extending a abstract class  then we have to define abstract method of the parent class.
// // if we donot want to define all abstract method in the parent class then we have to make child class an abstract class but then we 
// // have to declare another class so that you can make obj of that to use

// abstract class WagonR extends Car{          //concrete class.
//     public void drive(){
//         System.out.println("Driving....");
//     }

   
// }


// class UpdatedWagonR extends WagonR{

//     @Override
//     public void fly() {
//         System.out.println("Flying....");
//     }
    
// }