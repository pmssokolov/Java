package by.gsu.pmslab;


import java.util.List;

public class MainWeather {
    private String name;
    private String base;
    private String visibility;
    private String dt;
    private String timezone;
    private String id;
    private Coord coord;
    private List<Weather> weather;
    private Main main;
    private Wind wind;
    private String icon;
    private String mainMini;

    public MainWeather() {
    }

    public Wind getWind() {
        return wind;
    }

    public String getDescription() {
        String array = String.valueOf(weather.get(0));
        String[] description=array.split(" ");
        return description[2]+" "+description[3];
    }

    public String getMainMini() {
        String array = String.valueOf(weather.get(0));
        String[] main=array.split(" ");
        return main[1];
    }

    public void setMainMini(String mainMini) {
        this.mainMini = mainMini;
    }

    public String getIconS() {
        String array = String.valueOf(weather.get(0));
        String[] icon=array.split(" ");
        return icon[0];
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Coord getCoord(){
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }


}
