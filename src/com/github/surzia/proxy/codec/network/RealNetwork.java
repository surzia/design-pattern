package com.github.surzia.proxy.codec.network;

public class RealNetwork implements CampusNetwork {

    @Override
    public void connectTo(String host) {
        System.out.println("Connecting to " + host);
    }
}
