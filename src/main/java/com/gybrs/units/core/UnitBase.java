package com.gybrs.units.core;


import com.gybrs.units.core.value.GuardPoint;
import com.gybrs.units.core.value.PowerPoint;
import com.gybrs.units.core.value.HitPoint;

public interface UnitBase {
    public double getHP();
    public double getPower();
    public double getGuard();


    public boolean isAlive();

}
