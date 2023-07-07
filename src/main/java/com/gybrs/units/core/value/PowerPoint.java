package com.gybrs.units.core.value;

public class PowerPoint implements Value {
    private final double value;

    public PowerPoint(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public Value reinValue(final double value) {
        return new PowerPoint(value);
    }


    @Override
    public boolean isLessThanZero() {
        return this.value >= 0;
    }
}
