package com.github.surzia.visitor.codec.book;

public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
