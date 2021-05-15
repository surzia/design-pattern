package com.github.surzia.template.codec.mall;

public class Main {

    public static void main(String[] args) {
        NetMall jd = new JDNetMall("10001", "*****");
        String jdRes = jd.getGoods("https://item.jd.com/100008348542.html");
        System.out.println(jdRes);
        System.out.println("*********************");
    }
}
