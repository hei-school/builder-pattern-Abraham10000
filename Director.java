// Director class
class Director {
  public void makeSportsCar(Builder builder) {
    builder.reset();
    builder.setSeats(2);
    builder.setEngine(new SportEngine());
    builder.setTripComputer(true);
    builder.setGPS(true);
  }


}