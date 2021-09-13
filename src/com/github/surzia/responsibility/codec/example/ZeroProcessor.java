package com.github.surzia.responsibility.codec.example;

public class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor processor) {
        super(processor);
    }

    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
