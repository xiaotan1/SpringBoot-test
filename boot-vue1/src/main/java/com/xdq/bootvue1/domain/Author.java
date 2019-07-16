package com.xdq.bootvue1.domain;

public class Author {

    private String aName;
    private int aAge;

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public int getaAge() {
        return aAge;
    }

    public void setaAge(int aAge) {
        this.aAge = aAge;
    }

    @Override
    public String toString() {
        return "Author{" +
                "aName='" + aName + '\'' +
                ", aAge=" + aAge +
                '}';
    }
}
