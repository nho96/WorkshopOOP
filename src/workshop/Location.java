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
public class Location {
    
    int [] coordinate = new int [2];
    
Location(int x, int y){   
    coordinate[0] = x;
    coordinate[1] = y;
}   

public int[] getLocation(){
    return coordinate;
}

}
