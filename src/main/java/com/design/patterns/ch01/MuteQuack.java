package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 叫行为的一个具体实现沉默
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
