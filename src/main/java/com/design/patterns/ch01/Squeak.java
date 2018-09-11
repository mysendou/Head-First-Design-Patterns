package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 鸭子呱呱叫的具体实现，发出吱吱叫的声音
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
