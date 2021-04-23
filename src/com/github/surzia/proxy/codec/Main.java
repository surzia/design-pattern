package com.github.surzia.proxy.codec;

public class Main {

    public static void main(String[] args) {
        System.out.println("Using Real Image class...");
        Image realImage = new RealImage("ABC.jpg");
        realImage.showSummary();
        realImage.load();
        realImage.show();
        realImage.resize();
        realImage.close();
        realImage.remove();
        System.out.println("------------------------------------------------");
        System.out.println("Using Proxy Image class...");
        Image proxyImage = new ProxyImage("ABC.jpg", true);
        proxyImage.showSummary();
        proxyImage.load();
        proxyImage.show();
        proxyImage.resize();
        proxyImage.close();
        proxyImage.remove();
        System.out.println("------------------------------------------------");
        System.out.println("Using Remote Image class...");
        Image remoteImage = new RemoteImage("192.168.0.1", "ABC.jpg");
        remoteImage.showSummary();
        remoteImage.load();
        remoteImage.show();
        remoteImage.resize();
        remoteImage.close();
        remoteImage.remove();
        System.out.println("------------------------------------------------");
        System.out.println("Using Proxy Image class...");
        Image proxyRemoteImage = new ProxyImage("192.168.0.1", "ABC.jpg", false);
        proxyRemoteImage.showSummary();
        proxyRemoteImage.load();
        proxyRemoteImage.show();
        proxyRemoteImage.resize();
        proxyRemoteImage.close();
        proxyRemoteImage.remove();
        System.out.println("------------------------------------------------");
    }
}
