package com.gybrs.units.core.value;

public class GuardPoint implements Value {
    private final double value;

    public GuardPoint(double value) {
        this.value = value;
    }


    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public Value reinValue(double value) {
        return new GuardPoint(value);
    }

    @Override
    public boolean isLessThanZero() {
        return this.value >= 0;
    }
}
