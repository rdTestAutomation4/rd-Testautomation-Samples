package com.rd.Lesson15.DesingPattern;

public class Bilgisayar2 {
    private String marka;
    private String islemci;
    private int ram;
    private int depolama;

    public static final class Bilgisayar2Builder {
        private String marka = "Intel";
        private String islemci;
        private int ram;
        private int depolama;

        private Bilgisayar2Builder() {
        }

        public static Bilgisayar2Builder aBilgisayar2() {
            return new Bilgisayar2Builder();
        }

        public Bilgisayar2Builder withMarka(String marka) {
            this.marka = marka;
            return this;
        }

        public Bilgisayar2Builder withIslemci(String islemci) {
            this.islemci = islemci;
            return this;
        }

        public Bilgisayar2Builder withRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Bilgisayar2Builder withDepolama(int depolama) {
            this.depolama = depolama;
            return this;
        }

        public Bilgisayar2 build() {
            Bilgisayar2 bilgisayar2 = new Bilgisayar2();
            bilgisayar2.marka = this.marka;
            bilgisayar2.islemci = this.islemci;
            bilgisayar2.ram = this.ram;
            bilgisayar2.depolama = this.depolama;
            return bilgisayar2;
        }

    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "marka='" + marka + '\'' +
                ", islemci='" + islemci + '\'' +
                ", ram=" + ram +
                ", depolama=" + depolama +
                '}';
    }
}
