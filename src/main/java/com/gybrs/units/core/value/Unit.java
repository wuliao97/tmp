package com.gybrs.units.core.value;

import com.gybrs.units.core.UnitBase;

public abstract class Unit implements UnitBase {
    public abstract double getHP();
    public abstract double getPower();
    public abstract double getGuard();

    public abstract void getDamage(final double value);

    public abstract boolean isAlive();
}
