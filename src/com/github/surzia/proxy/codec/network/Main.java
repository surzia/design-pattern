package com.github.surzia.proxy.codec.network;

public class Main {

    public static void main(String[] args) {
        CampusNetwork network = new ProxyNetwork();
        try {
            network.connectTo("www.baidu.com");
            network.connectTo("banned.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
