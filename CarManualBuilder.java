
// Concrete builder for Manual
class CarManualBuilder implements Builder {
  private Manual manual;

  public CarManualBuilder() {
    this.reset();
  }

  public void reset() {
    this.manual = new Manual();
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
  public Manual getProduct() {
    Manual product = this.manual;
    this.reset();
    return product;
  }
}
