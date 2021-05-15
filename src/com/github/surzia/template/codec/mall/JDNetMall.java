package com.github.surzia.template.codec.mall;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JDNetMall extends NetMall {

    public JDNetMall(String uuid, String passwd) {
        super(uuid, passwd);
    }

    @Override
    protected String createBase64(Map<String, String> map) {
        return map.toString();
    }

    @Override
    protected Map<String, String> reptile(String url) {
        String str = HttpClient.get(url);
        Pattern p9 = Pattern.compile("(?<=title>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<>();
        if (m9.find()) {
            map.put("name", m9.group());
        }
        map.put("price", "5999.00");
        System.out.printf("模拟京东商品爬虫解析：%s | %s 元 %s", map.get("name"), map.get("price"), url);
        return map;
    }

    @Override
    protected boolean login(String uuid, String passwd) {
        System.out.printf("login into jd.com..., uuid = %s, passwd = %s", uuid, passwd);
        System.out.println();
        System.out.println("====================");
        return true;
    }
}
