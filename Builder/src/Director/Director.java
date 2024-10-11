package Director;

import Builder_interface.Builder;

public class Director<T> {

  private Builder<T> builder;
  
  public void setBuilder(Builder<T> builder) {
    this.builder = builder;
  }

  public void constructSportsCar() {
    this.builder.reset();
    this.builder.setEngine("Sport");
    this.builder.setSeats(2);
    this.builder.setGPS(true);
  }
}
