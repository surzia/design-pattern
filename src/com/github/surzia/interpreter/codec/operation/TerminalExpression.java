package com.github.surzia.interpreter.codec.operation;

public class TerminalExpression implements Expression {

    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpreter(String con) {
        return con.contains(data);
    }
}
