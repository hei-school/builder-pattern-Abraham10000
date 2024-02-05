// Concrete builder for Car
class CarBuilder implements Builder {
  private Car car;

  public CarBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.car = new Car();
  }

  public void setSeats(int seats) {
    System.out.println(seats);
  }

  public void setEngine(Engine engine) {
    System.out.println("Type de la voirture est : " +engine.getType() + " avec un moteur de : "+engine.getHorsepower());
  }

  public void setTripComputer(boolean tripComputer) {
    System.out.println(" trip computer set");
  }

  public void setGPS(boolean gps) {
    System.out.println("gps set");
  }

  public Car getProduct() {
    Car product = this.car;
    this.reset();
    return product;
  }
}
