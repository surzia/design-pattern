package com.github.surzia.responsibility.codec.example;

public abstract class Processor {
    private final Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    ;

    public void process(Number request) {
        if (processor != null)
            processor.process(request);
    }

    ;
}
