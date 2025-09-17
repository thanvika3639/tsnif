 class Car3 {
 void start() {
     System.out.println("Car starts with a key.");
 }
}

class SportsCar extends Car3 {
 void turbo() {
     System.out.println("SportsCar has turbo speed.");
 }
}

class ElectricCar extends Car3 {
 void charge() {
     System.out.println("ElectricCar charges with electricity.");
 }
}

class LuxuryCar extends Car3 {
 void comfort() {
     System.out.println("LuxuryCar has high comfort features.");
 }
}

public class Hierarchial {
 public static void main(String[] args) {
     
     SportsCar sc = new SportsCar();
     sc.start();   
     sc.turbo();  

     ElectricCar ec = new ElectricCar();
     ec.start();   
     ec.charge();  

     LuxuryCar lc = new LuxuryCar();
     lc.start();   
     lc.comfort(); 
 }
}
