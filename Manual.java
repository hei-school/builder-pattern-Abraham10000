// Manual.java
public class Manual {
    private int seats;
    private Engine engine;
    private int tripCounter;
    private boolean hasGPS;

    public Manual() {
        this.seats = 0;
        this.engine = new Engine("Default", 100);
        this.tripCounter = 0;
        this.hasGPS = false;
    }
    // Méthodes getter pour accéder aux propriétés
    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getTripCounter() {
        return tripCounter;
    }

    public boolean hasGPS() {
        return hasGPS;
    }
}
