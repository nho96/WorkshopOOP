/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author Nicolai
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Driver mainSystem = new Driver();
        mainSystem.addBuilding("SDU");
        mainSystem.getBuilding("SDU").addRoom("1A");
        mainSystem.getBuilding("SDU").getRoom("1A").addSensor("O2", 0, 99);
        mainSystem.getBuilding("SDU").getRoom("1A").addSensor("CO2", 0, 99);
        mainSystem.addBuilding("DTU");
//        System.out.println(mainSystem.getBuildingList());
        System.out.println(mainSystem.toString());

    }

}
