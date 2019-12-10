package by.gsu.pmslab;

public class Coord {

    private String lon;
    private String lat;

    public Coord() {
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString(){
        return lon + "\n" + lat + ";";
    }
}
