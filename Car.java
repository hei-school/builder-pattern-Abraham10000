// Car.java
public class Car {
  private int seats;
  private Engine engine;
  private int tripCounter;
  private boolean hasGPS;

  public Car() {
    this.seats = 0;
    this.engine = new Engine("Default", 100);
    this.tripCounter = 0;
    this.hasGPS = false;
  }

  public int getSeats() {
    return seats;
  }

  public Engine getEngine() {
    return engine;
  }

  public int getTripCounter() {
    return tripCounter;
  }

  public boolean isHasGPS() {
    return hasGPS;
  }
}
