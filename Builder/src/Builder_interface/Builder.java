package Builder_interface;

public interface Builder<T> {
  public void reset();
  public void setSeats(int seats);
  public void setEngine(String engine);
  public void setTripComputer(boolean installTripComputer);
  public void setGPS(boolean installGPS);
  public T getProduct();
}
