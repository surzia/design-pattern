package com.github.surzia.interpreter.codec.sql;

import java.util.List;

public class Select implements Expression {

    private final String column;
    private final From from;

    Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setColumn(column);
        return from.interpret(ctx);
    }
}
