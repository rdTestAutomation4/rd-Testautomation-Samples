package com.rd.Lesson9;

public class Araba2 {
    private String marka;
    private String model;
    private int yil;
    private boolean otomatik;

    public Araba2() {
        this.marka = "Tesla";
        this.model = "Y3";
        this.yil =2024;
        this.otomatik = true;
    }

    public Araba2(boolean otomatik, int yil, String model, String marka) {
        this.otomatik = otomatik;
        this.yil = yil;
        this.model = model;
        this.marka = marka;
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

    public boolean isOtomatik() {
        return otomatik;
    }

    public void setOtomatik(boolean otomatik) {
        this.otomatik = otomatik;
    }
}
