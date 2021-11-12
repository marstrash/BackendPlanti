package com.example.BackendPlanti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pflanze {

    private int PID;
    private String Name;
    private int Standort;
    private int Schwierigkeit;
    private String Merkmale;
    private String WissName;


    public Pflanze() {}

    @Id
    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStandort() {
        return Standort;
    }

    public void setStandort(int standort) {
        Standort = standort;
    }

    public int getSchwierigkeit() {
        return Schwierigkeit;
    }

    public void setSchwierigkeit(int schwierigkeit) {
        Schwierigkeit = schwierigkeit;
    }

    public String getMerkmale() {
        return Merkmale;
    }

    public void setMerkmale(String merkmale) {
        Merkmale = merkmale;
    }

    public String getWissName() {
        return WissName;
    }

    public void setWissName(String wissName) {
        WissName = wissName;
    }
}
