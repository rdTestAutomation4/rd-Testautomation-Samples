package com.rd.Lesson15.DesingPattern.Singleton.Sample1;


public class Client {

    public static void main(String [] args){

        Preferences.getInstance().helloSingleton();

        MyPreferences.getInstance().helloSingleton();

    }

}
