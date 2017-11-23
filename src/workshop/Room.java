/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolai
 */
public class Room {

    private List<Sensor> sensorList = new ArrayList<Sensor>(100);
    private String name;

    Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSensor(String type, int minValue, int maxValue) {
        sensorList.add(new Sensor(type, minValue, maxValue));
    }

    public String getSensors() {
        String name = "";
        for (int i = 0; i < sensorList.size(); i++) {
            name += sensorList.get(i).getType();
            if (i != sensorList.size() - 1) {
                name += ", ";
            }
        }
        return name;
    }

}
