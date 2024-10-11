package Builder_concrete;

import Builder_interface.Builder;
import Product.CarManual;

public class CarManualBuilder implements Builder<CarManual> {
  private CarManual carManual;

  public CarManualBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.carManual = new CarManual();
  }

  @Override
  public void setSeats(int seats) {
    this.carManual.seats = seats;
  }

  @Override
  public void setEngine(String engine) {
    this.carManual.engine = engine;
  }

  @Override
  public void setTripComputer(boolean installTripComputer) {
    this.carManual.tripComputer = installTripComputer;
  }

  @Override
  public void setGPS(boolean installGPS) {
    this.carManual.GPS = installGPS;
  }

  @Override
  public CarManual getProduct() {
    CarManual product = this.carManual;
    this.reset();
    return product;
  }
}
