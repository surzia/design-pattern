package com.github.surzia.state.codec.goods;

public class Location {

    protected String code;
    protected String address;
    protected String area;
    protected String city;
    protected String country;
    protected String zipCode;

    public Location(String code, String address, String area, String city, String country, String zipCode) {
        this.code = code;
        this.address = address;
        this.area = area;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return code + " (" + address + " " + area + " " + city + " " +
                country + " " + zipCode + ")";
    }
}
