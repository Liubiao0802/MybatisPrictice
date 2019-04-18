package com.lb.po;

import lombok.Data;

public class Specil {
    private int spilinfoid;
    private int depinfoid;
    private String spilinfocode;
    private String spilinfoname;
    private String spilinfoaim;
    private String spilinfoprodire;

    public Specil() {
    }

    public Specil(int spilinfoid, int depinfoid, String spilinfocode, String spilinfoname, String spilinfoaim, String spilinfoprodire) {
        this.spilinfoid = spilinfoid;
        this.depinfoid = depinfoid;
        this.spilinfocode = spilinfocode;
        this.spilinfoname = spilinfoname;
        this.spilinfoaim = spilinfoaim;
        this.spilinfoprodire = spilinfoprodire;
    }

    public int getSpilinfoid() {
        return spilinfoid;
    }

    public void setSpilinfoid(int spilinfoid) {
        this.spilinfoid = spilinfoid;
    }

    public int getDepinfoid() {
        return depinfoid;
    }

    public void setDepinfoid(int depinfoid) {
        this.depinfoid = depinfoid;
    }

    public String getSpilinfocode() {
        return spilinfocode;
    }

    public void setSpilinfocode(String spilinfocode) {
        this.spilinfocode = spilinfocode;
    }

    public String getSpilinfoname() {
        return spilinfoname;
    }

    public void setSpilinfoname(String spilinfoname) {
        this.spilinfoname = spilinfoname;
    }

    public String getSpilinfoaim() {
        return spilinfoaim;
    }

    public void setSpilinfoaim(String spilinfoaim) {
        this.spilinfoaim = spilinfoaim;
    }

    public String getSpilinfoprodire() {
        return spilinfoprodire;
    }

    public void setSpilinfoprodire(String spilinfoprodire) {
        this.spilinfoprodire = spilinfoprodire;
    }

    @Override
    public String toString() {
        return "Specil{" +
                "spilinfoid=" + spilinfoid +
                ", depinfoid=" + depinfoid +
                ", spilinfocode='" + spilinfocode + '\'' +
                ", spilinfoname='" + spilinfoname + '\'' +
                ", spilinfoaim='" + spilinfoaim + '\'' +
                ", spilinfoprodire='" + spilinfoprodire + '\'' +
                '}';
    }
}
