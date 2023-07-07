package com.gybrs.units.core.value;

public class HitPoint implements Value {
    private final double value;

    public HitPoint(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public Value reinValue(final double value) {
        return new HitPoint(value);
    }

    @Override
    public boolean isLessThanZero() {
        return this.value >= 0;
    }
}
