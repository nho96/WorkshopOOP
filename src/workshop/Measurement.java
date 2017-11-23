/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.Date;

/**
 *
 * @author Nicolai
 */
public class Measurement {
    
    private double value = Math.random()*100;
    private java.util.Date timestamp;
    
    Measurement(){   
    }

    public double getValue() {
        return value;
    }

    public Date getTimestamp() {
        return timestamp;
    }
     
}
