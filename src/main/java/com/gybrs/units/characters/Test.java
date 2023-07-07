package com.gybrs.units.characters;

import com.gybrs.units.core.value.*;

public class Test extends Unit {
    private HitPoint hitpoint;
    private PowerPoint powerPoint;
    private GuardPoint guardPoint;

    public Test(final double hValue, final double pValue, final double gValue) {
        this.hitpoint = new HitPoint(hValue);
        this.powerPoint = new PowerPoint(pValue);
        this.guardPoint = new GuardPoint(gValue);
    }


    @Override
    public double getHP() {
        return this.hitpoint.getValue();
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
    public void getDamage(final double value) {
        this.hitpoint = new HitPoint(hitpoint.getValue() - value);
    }


    @Override
    public boolean isAlive() {
        return this.hitpoint.getValue() > 0;
    }


    @Override
    public String toString() {
        return "HP: " + this.hitpoint.getValue() + "\n" +
                "POWER: " + this.powerPoint.getValue() + "\n" +
                "GUARD: " + this.guardPoint.getValue() + "\n";
    }
}
