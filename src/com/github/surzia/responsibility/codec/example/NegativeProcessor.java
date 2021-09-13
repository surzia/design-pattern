package com.github.surzia.responsibility.codec.example;

public class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor processor) {
        super(processor);

    }

    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
