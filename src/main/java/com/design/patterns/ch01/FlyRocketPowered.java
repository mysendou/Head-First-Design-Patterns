package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 飞行行为的一个具体实现，即带有火箭加速器的飞行行为
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
