package com.github.surzia.visitor.codec.document;

public class JsonElement extends Element {

    public JsonElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
