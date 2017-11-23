/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.List;

/**
 *
 * @author Nicolai
 */
public class Sensor {

    private List<Measurement> measureList;
    private String unit;
    private int minValue = 1;
    private int maxValue = 99;
    private String type;
    private String name;

    Sensor(String type, int minValue, int maxValue) {
        this.type = type;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    Sensor(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSensorValue() {
        return measureList.get(measureList.size() - 1).getValue();
    }

}
