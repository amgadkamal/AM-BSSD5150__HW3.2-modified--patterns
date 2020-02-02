package com.company;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class HexObserver implements PropertyChangeListener {
    /*
    Subject subject;
    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);}

    @Override
    public void update() {
        System.out.println("Hexadecimal String" + Integer.toHexString(subject.getmState()).toUpperCase());
    }
}
*/

     @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int)evt.getNewValue();
        String output = Integer.toHexString(val);
        System.out.println("Hex String:" + output);
    }
}