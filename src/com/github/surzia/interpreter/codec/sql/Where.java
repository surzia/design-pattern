package com.github.surzia.interpreter.codec.sql;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {

    private final Predicate<String> filter;

    Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setFilter(filter);
        return ctx.search();
    }
}
