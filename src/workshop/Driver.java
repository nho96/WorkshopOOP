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
public class Driver {

    private List<Building> buildingList = new ArrayList<Building>(100);

    Driver() {
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    @Override
    public String toString() {
        String name = "";
        for (int i = 0; i < buildingList.size(); i++) {
            name += buildingList.get(i).getName();
            if (i != buildingList.size()-1) {
                name += ",";
            }
        }
        return name;
    }
    
    public Building getBuilding(String name){
        Building building = null;
        for (int i = 0; i < buildingList.size(); i++) {
             if(buildingList.get(i).getName().equals(name)){
                building = buildingList.get(i);
             }
                
        }
        
       return building;     
    }

    public void addBuilding(String name) {
        buildingList.add(new Building(name));
    }

    public void deleteBuilding(String name) {
        for (int i = 0; i < buildingList.size(); i++) {
            if (buildingList.get(i).getName().equalsIgnoreCase(name)) {
                buildingList.remove(i);
            }
        }
    }
}
