package by.gsu.pmslab;

public class Main {

    public static final double ONE_CELCI = 33.8;
    private String temp;
    private String pressure;
    private String humidity;
    private String temp_min;
    private String temp_max;

    public Main() {
    }

    public String getTemp() {
        double result;
        int integerResult;
        result = Double.parseDouble(temp);
        result /= ONE_CELCI;
        integerResult = (int) result;
        temp = Integer.valueOf(integerResult).toString();
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTemp_min() {
        double result;
        int integerResult;
        result = Double.parseDouble(temp_min);
        result /= ONE_CELCI;
        integerResult = (int) result;
        temp_min = Integer.valueOf(integerResult).toString();
        return temp_min;
    }

    public void setTemp_min(String temp_min) {
        this.temp_min = temp_min;
    }

    public String getTemp_max() {
        double result;
        int integerResult;
        result = Double.parseDouble(temp_max);
        result /= ONE_CELCI;
        integerResult = (int) result;
        temp_max = Integer.valueOf(integerResult).toString();
        return temp_max;
    }

    public void setTemp_max(String temp_max) {
        this.temp_max = temp_max;
    }
}
