package com.github.surzia.visitor.codec.book;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}
