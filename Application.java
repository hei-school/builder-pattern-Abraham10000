class Application {

  public static void main(String[] args) {

      Director director = new Director();

      CarBuilder carBuilder = new CarBuilder();
      director.makeSportsCar(carBuilder);
      Car car = carBuilder.getProduct();
    System.out.println(car);

      CarManualBuilder manualBuilder = new CarManualBuilder();
      director.makeSportsCar(manualBuilder);
      Manual manual = manualBuilder.getProduct();
      System.out.println(manual);

  }
}