package com.github.surzia.singleton.codec;

import java.lang.reflect.Constructor;

@SuppressWarnings("rawtypes")
public class SingletonReflection {

    public static void main(String[] args) throws Exception {
        Constructor constructor = SingletonForReflection.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonForReflection instance1 = (SingletonForReflection) constructor.newInstance();
        SingletonForReflection instance2 = (SingletonForReflection) constructor.newInstance();
        System.out.println("instance1的hashcode是" + instance1.hashCode());
        System.out.println("instance2的hashcode是" + instance2.hashCode());
    }
}

enum SingletonForReflection {
    INSTANCE;
}
