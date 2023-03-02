package com.ensaj.pfa2023.Fuzzy;


public class FuzzyNumber {
    private  double lowerBound;

    private  double midlbound;
    private  double upperBound;

    public FuzzyNumber(double lowerBound,double midlbound, double upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.midlbound=midlbound;
    }

    public void setLowerBound(double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public double getMidlbound() {
        return midlbound;
    }

    public void setMidlbound(double midlbound) {
        this.midlbound = midlbound;
    }

    public void setUpperBound(double upperBound) {
        this.upperBound = upperBound;
    }

    public double getLowerBound() {
        return lowerBound;
    }

    public double getUpperBound() {
        return upperBound;
    }

    public double getMidpoint() {
        return (lowerBound + upperBound) / 2;
    }

    public double getWidth() {
        return upperBound - lowerBound;
    }


}
