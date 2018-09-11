package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 飞行行为的一个具体实现，即有翅膀的飞行行为
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
