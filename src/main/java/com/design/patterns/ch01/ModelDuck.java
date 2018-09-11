package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 一个鸭子的具体实现，鸭子模型，并定义器行为，没有翅膀，呱呱叫
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
