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
        mainSystem.getBuilding("SDU").addRoom("2B");
        mainSystem.getBuilding("SDU").getRoom("1A").addSensor("O2", (int) (Math.random()*100), (int) (Math.random()*100));
        mainSystem.getBuilding("SDU").getRoom("1A").addSensor("Temperature", -5, 35);
        mainSystem.getBuilding("SDU").getRoom("1A").addSensor("CO2", 0, 99);
        
        mainSystem.addBuilding("DTU");
        mainSystem.getBuilding("DTU").addRoom("234F");
        
        mainSystem.addBuilding("Car Shop");
        mainSystem.getBuilding("Car Shop").addRoom("Storage");

        System.out.println("The different buildings are: " + mainSystem.toString());
        System.out.println("SDU's rooms are: " + mainSystem.getBuilding("SDU").toString());
        System.out.println("DTU's rooms are: " + mainSystem.getBuilding("DTU").toString());
        System.out.println("the Car shop rooms are: " + mainSystem.getBuilding("Car Shop").toString());
        System.out.println("What does the sensors keep track of in 1A, at SDU: " + mainSystem.getBuilding("SDU").getRoom("1A").getSensors());
    }

}
