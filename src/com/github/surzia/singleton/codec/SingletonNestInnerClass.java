package com.github.surzia.singleton.codec;

public class SingletonNestInnerClass {

    private SingletonNestInnerClass() {
    }

    private static class SingletonClassHolder {
        static final SingletonNestInnerClass instance = new SingletonNestInnerClass();
    }

    public static SingletonNestInnerClass getInstance() {
        return SingletonClassHolder.instance;
    }
}
