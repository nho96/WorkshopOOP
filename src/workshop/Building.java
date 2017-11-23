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
public class Building {

    private String name;
    private List<Room> roomList= new ArrayList<Room>(100);

    Building(String name) {
        this.name = name;
    }

    public void addRoom(String name) {
//        if (roomList.size() != 0 ) {
           roomList.add(new Room(name));
//        }
    }

    public Room getRoom(String name) {
        Room room = null;
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getName().equals(name)) {
                room = roomList.get(i);
            }

        }

        return room;
    }

    public void delRoom() {

    }

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = name;
    }
}
