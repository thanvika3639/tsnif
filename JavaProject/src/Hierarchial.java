 class Car3 {
 void start() {
     System.out.println("Car starts with a key.");
 }
}

//Child class 1
class SportsCar extends Car3 {
 void turbo() {
     System.out.println("SportsCar has turbo speed.");
 }
}

//Child class 2
class ElectricCar extends Car3 {
 void charge() {
     System.out.println("ElectricCar charges with electricity.");
 }
}

//Child class 3
class LuxuryCar extends Car3 {
 void comfort() {
     System.out.println("LuxuryCar has high comfort features.");
 }
}

//Main class
public class Hierarchial {
 public static void main(String[] args) {
     
     SportsCar sc = new SportsCar();
     sc.start();   // from Car
     sc.turbo();   // own method

     ElectricCar ec = new ElectricCar();
     ec.start();   // from Car
     ec.charge();  // own method

     LuxuryCar lc = new LuxuryCar();
     lc.start();   // from Car
     lc.comfort(); // own method
 }
}
