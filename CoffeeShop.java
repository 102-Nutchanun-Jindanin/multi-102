public class CoffeeShop {
 public static void main(String[] args) {
    CoffeeMachine machine = new CoffeeMachine();
    Thread t1 = new Thread(new CoffeeMaker("Espresso", machine));
    Thread t2 = new Thread(new CoffeeMaker("Latte", machine));
    Thread t3 = new Thread(new CoffeeMaker("Cappuccino", machine));
    t1.start();
    t2.start();
    t3.start();
 System.out.println("🛎 รับออเดอร์ครบแล้ว");
 }
}