package com.design.patterns.ch01;

/**
 * Created by Jeff.Ma on 12/5/2017.
 * 鸭子类的超级父类
 */
public abstract class Duck {
    //定义鸭子 Fly 的行为
    FlyBehavior flyBehavior;
    //定义鸭子叫的行为
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
        }
    public void swim(){
        System.out.println("Swim swim swim swim...");
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void display(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
