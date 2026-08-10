public class Object{
  public static void main(String[] args){
    Car car = new Car();
    System.out.println(car.make +","+car.model+","+car.year+","+car.price+","+car.isRunning);
    car.start();
    car.Stop();
  }
}
public class Car{
    String make="Force";
    String model="Mustang";
    int year=2025;
    double price=5800.99;
    boolean isRunning=false;
    void start(){
      System.out.println("Start!!");
    }
    void Stop(){
      System.out.println("Stop!!");
    }
}