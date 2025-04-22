package com.rd.Lesson9;

public class Car2 {
    private String marka;
    private String model;
    private int yil;

    public Car2(String marka) {
        this.marka = marka;
    }

    public Car2(int yil, String model, String marka) {
        this.yil = yil;
        this.model = model;
        this.marka = marka;
    }

    public Car2(String marka, int yil, String model) {
        this.yil = yil;
        this.model = model;
        this.marka = marka;
    }

    public Car2() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}