package com.github.surzia.proxy.codec.network;

import java.util.ArrayList;
import java.util.List;

public class ProxyNetwork implements CampusNetwork {

    private final CampusNetwork network = new RealNetwork();
    private static final List<String> blacklist;

    static {
        blacklist = new ArrayList<>();
        blacklist.add("banned.com");
    }

    @Override
    public void connectTo(String host) throws Exception {
        if (blacklist.contains(host.toLowerCase())) {
            throw new Exception("请使用内网访问资源");
        }
        network.connectTo(host);
    }
}
