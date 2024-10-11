import Builder_concrete.*;
import Director.Director;
import Product.*;

public class App {
  public static void main(String[] args) throws Exception {
    Director<Car> d = new Director<>();
    CarBuilder car_builder = new CarBuilder();

    d.setBuilder(car_builder);
    d.constructSportsCar();

    Car car = car_builder.getProduct();

    System.out.println(car.seats);
    System.out.println(car.engine);
    System.out.println(car.tripComputer);
  }
}
