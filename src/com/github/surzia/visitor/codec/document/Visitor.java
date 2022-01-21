package com.github.surzia.visitor.codec.document;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}
