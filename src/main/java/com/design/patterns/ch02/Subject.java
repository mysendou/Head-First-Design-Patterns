package com.design.patterns.ch02;

/**
 * 主题类
 */
public interface Subject {

    /**
     * 注册监听者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除监听者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知监听者
     */
    public void notifyObserver();
}
