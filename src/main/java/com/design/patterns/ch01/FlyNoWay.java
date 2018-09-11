package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 飞行行为的一个具体实现，即没有翅膀的飞行行为
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
