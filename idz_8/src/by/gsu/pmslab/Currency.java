package by.gsu.pmslab;

import java.io.Serializable;

public class Currency implements Serializable {

    private String numCode, charCode, scale, name, rate, id;

    public Currency(String numCode, String charCode, String scale, String name, String rate) {
        this.numCode = numCode;
        this.charCode = charCode;
        this.scale = scale;
        this.name = name;
        this.rate = rate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Currency() {
    }

    public String getNumCode() {
        return numCode;
    }

    public void setNumCode(String numCode) {
        this.numCode = numCode;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCode: " + numCode + "\n" +
                charCode + " " + scale + " = " + rate + " BLR" + "\n----------------------";
    }
}
