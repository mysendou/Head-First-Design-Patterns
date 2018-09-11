package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 呱呱叫行为的一个具体实现，发出呱呱叫的声音
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!!!");
    }
}
