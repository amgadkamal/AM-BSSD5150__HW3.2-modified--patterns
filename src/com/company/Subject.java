package com.company;


import java.util.ArrayList;

public abstract class Subject  {
    private ArrayList<Observer> mObservers =  new ArrayList<Observer>();
    private int mState;

    public int getmState(){
        return mState;

    }

    public void setmState(){
        this.mState=mState;
        notifyAllobservers();
    }
    public void attach (Observer observer){
        mObservers.add(observer);
            }

    public void notifyAllobservers(){
        for (Observer observer : mObservers){

            observer.update();
        }
    }


}
