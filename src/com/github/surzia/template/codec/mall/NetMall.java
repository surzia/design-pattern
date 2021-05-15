package com.github.surzia.template.codec.mall;

import java.util.Map;

public abstract class NetMall {

    String uuid;
    String passwd;

    public NetMall(String uuid, String passwd) {
        this.uuid = uuid;
        this.passwd = passwd;
    }

    public String getGoods(String url) {
        if (!login(uuid, passwd)) return null;
        Map<String, String> map = reptile(url);
        return createBase64(map);
    }

    protected abstract String createBase64(Map<String, String> map);

    protected abstract Map<String, String> reptile(String url);

    protected abstract boolean login(String uuid, String passwd);
}
