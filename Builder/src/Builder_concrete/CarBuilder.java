package Builder_concrete;

import Builder_interface.Builder;
import Product.Car;

public class CarBuilder implements Builder<Car> {
  private Car car;

  public CarBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeats(int seats) {
    this.car.seats = seats;
  }

  @Override
  public void setEngine(String engine) {
    this.car.engine = engine;
  }

  @Override
  public void setTripComputer(boolean installTripComputer) {
    this.car.tripComputer = installTripComputer;
  }

  @Override
  public void setGPS(boolean installGPS) {
    this.car.GPS = installGPS;
  }

  @Override
  public Car getProduct() {
    Car product = this.car;
    this.reset();
    return product;
  }
}
