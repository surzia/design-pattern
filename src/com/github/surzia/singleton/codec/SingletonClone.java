package com.github.surzia.singleton.codec;

public class SingletonClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonForClone instance1 = SingletonForClone.instance;
        SingletonForClone instance2 = (SingletonForClone) instance1.clone();
        System.out.println("instance1的hashcode是" + instance1.hashCode());
        System.out.println("instance2的hashcode是" + instance2.hashCode());
    }
}

class SuperClass implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class SingletonForClone extends SuperClass {

    public static SingletonForClone instance = new SingletonForClone();

    private SingletonForClone() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
