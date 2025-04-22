package com.rd.Lesson10;

public enum HaftaGunleri {
    PAZARTESI(1, false),
    SALI(2, false),
    CARSAMBA(3, false),
    PERSEMBE(4, false),
    CUMA(5, false),
    CUMARTESI(6, true),
    PAZAR(7, true);

    private int gunNo;

    private boolean haftaSonu;

    public int getGunNo() {
        return gunNo;
    }

    public boolean getHaftaSonu() {
        return haftaSonu;
    }

    HaftaGunleri(int gunNo, boolean haftaSonu) {
        this.gunNo = gunNo;
        this.haftaSonu = haftaSonu;
    }

    public String isHaftaIci() {
        if( gunNo >= 1 && gunNo <= 5) {
            return "Hafta içi";
        } else {
            return "Hafta sonu";
        }
    }

    public boolean isHaftaSonu(){
        return haftaSonu;
    }
}
