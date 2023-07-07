package com.gybrs;

import com.gybrs.units.characters.Test;

public class Main {
    public static void main(String[] args) {
        Test obj = new Test(100, 20, 30);
        System.out.println(obj.toString());
        System.out.println("--- damaged ---\n");
        obj.getDamage(40);
        System.out.println(obj.toString());

    }
}