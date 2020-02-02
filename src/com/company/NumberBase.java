package com.company;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NumberBase extends Subject {

        //NumberBase is the subject and has a property whose change needs support
        private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

        // the subject registers listeners that want to know when its property changes
        public void addPropertyChangeListener(PropertyChangeListener listener) {
            this.pcs.addPropertyChangeListener(listener);
        }


        //the subject removes listeners when needed
        public void removePropertyChangeListener(PropertyChangeListener listener) {
            this.pcs.removePropertyChangeListener(listener);
        }

        //the property that is subject to change
        private int value;

        //getter for property
        public int getValue() {
            return this.value;
        }

        //setter for property which notifies listeners
        public void setValue(int newValue) {
            int oldValue = this.value;
            this.value = newValue;
            this.pcs.firePropertyChange("value", oldValue, newValue);
        }



}
