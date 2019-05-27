package by.gsu.pmslab;


import java.io.Serializable;

public class Bus implements Serializable, Comparable {
    private int id;
    private String name;
    private String busNumber;
    private String routeNumber;
    private int yearStart;
    private int mileage;

    public Bus(){
    }

    public Bus(int id, String name, String busNumber, String routeNumber, int yearStart, int mileage) {
        this.id = id;
        this.name = name;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.yearStart = yearStart;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return name + ";" + busNumber + ";" +
                routeNumber + ";" + yearStart + ";" +
                mileage;
    }

    @Override
    public int compareTo(Object obj) {
        Bus bus = (Bus) obj;
        return busNumber.compareTo(bus.getBusNumber());
    }
}
