package com.gybrs.units.characters;

import com.gybrs.units.core.UnitBase;
import com.gybrs.units.core.value.GuardPoint;
import com.gybrs.units.core.value.HitPoint;
import com.gybrs.units.core.value.PowerPoint;

public final class Test implements UnitBase {
    private HitPoint hitPoint;
    private PowerPoint powerPoint;
    private GuardPoint guardPoint;

    public Test(final double hValue, final double pValue, final double gValue) {
        this.hitPoint = new HitPoint(hValue);
        this.powerPoint = new PowerPoint(pValue);
        this.guardPoint = new GuardPoint(gValue);
    }

    @Override
    public double getHP() {
        return this.hitPoint.getValue();
    }

    @Override
    public double getPower() {
        return this.powerPoint.getValue();
    }

    @Override
    public double getGuard() {
        return this.guardPoint.getValue();
    }

    @Override
    public boolean isAlive() {
        return getHP() > 0;
    }

    @Override
    public void getDamage(final double value) {
        this.hitPoint = (HitPoint) this.hitPoint.reinValue(this.hitPoint.getValue() - value);
    }

    @Override
    public String toString() {
        return "HP: " + this.getHP() + "\n" +
                "POWER: " + this.getPower() + "\n" +
                "GUARD: " + this.getGuard();
    }

}
