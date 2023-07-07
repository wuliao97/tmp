package com.gybrs.units.core;


public interface UnitBase {
    public double getHP();
    public double getPower();
    public double getGuard();

    public boolean isAlive();
    public void getDamage(final double value);


}
