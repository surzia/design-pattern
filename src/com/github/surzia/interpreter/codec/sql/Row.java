package com.github.surzia.interpreter.codec.sql;

public class Row {

    private final String name;
    private final String surname;

    Row(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
