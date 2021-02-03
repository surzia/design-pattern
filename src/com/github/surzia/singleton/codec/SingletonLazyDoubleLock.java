package com.github.surzia.singleton.codec;

public class SingletonLazyDoubleLock {

    private static SingletonLazyDoubleLock instance = null;

    private SingletonLazyDoubleLock() {
    }

    public static SingletonLazyDoubleLock getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyDoubleLock.class) {
                if (instance == null) {
                    instance = new SingletonLazyDoubleLock();
                }
            }
        }
        return instance;
    }
}
