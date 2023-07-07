package com.gybrs.units.core.value;

public interface Value {
    public double getValue();

    public Value reinValue(final double value);


    public boolean isLessThanZero();
}
