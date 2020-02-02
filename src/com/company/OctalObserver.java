package com.company;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OctalObserver implements PropertyChangeListener {

    /*
  Subject subject;

  public OctalObserver (Subject subject){

      this.subject = subject;
      this.subject.attach(this);
  }

    @Override
    public void update() {
      System.out.println("Octal String:"+Integer.toOctalString(subject.getmState()));

    }
*/
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        int val = (int)evt.getNewValue();
        String output = Integer.toOctalString(val);
        System.out.println("Octal String:" + output);
    }
}
