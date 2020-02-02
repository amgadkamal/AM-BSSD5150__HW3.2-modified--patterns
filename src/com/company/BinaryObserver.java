package com.company;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BinaryObserver implements PropertyChangeListener {
    /*
    Subject subject;

    public BinaryObserver(Subject subject)
    {   this.subject = subject;
        this.subject.attach(this);
    }
     @Override
    public void update() {
        System.out.println("Binary String:" + Integer.toBinaryString(subject.getmState()));
    }
     */

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int)evt.getNewValue();
        String output = Integer.toBinaryString(val);
        System.out.println("Binary String:" + output);
    }
}
