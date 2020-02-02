package com.company;

public class Main {

    public static void main(String[] args) {
	  NumberBase nb = new NumberBase(); //binary

          /*
          new HexObserver(nb);
       new OctalObserver(nb);
       new BinaryObserver(nb);
         System.out.println("first state change : 15");
	     nb.setmState(15);
         System.out.println("first state change : 10");
         nb.setmState(10);
          */

          nb.addPropertyChangeListener(new BinaryObserver());
          nb.addPropertyChangeListener(new HexObserver());
          nb.addPropertyChangeListener(new OctalObserver());
          nb.addPropertyChangeListener(new AsciiObserver());

          System.out.println("First state change: 97");
          nb.setValue(97);
  

          System.out.println("Second state change: 110");
          nb.setValue(110);


          System.out.println("Third state change: 122");
          nb.setValue(122);


    }
}
