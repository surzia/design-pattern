package com.github.surzia.template.codec.car;

public abstract class CarTemplate {

    protected String chassis;
    protected String body;
    protected String paints;
    protected String interior;

    public CarTemplate() {
        super();
    }

    // steps
    protected abstract void fixChassis();

    protected abstract void fixBody();

    protected abstract void paintCar();

    protected abstract void fixInterior();

    // template
    public void manufactureCar() {
        fixChassis();
        fixBody();
        paintCar();
        fixInterior();
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPaints() {
        return paints;
    }

    public void setPaints(String paints) {
        this.paints = paints;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "CarTemplate{" +
                "chassis='" + chassis + '\'' +
                ", body='" + body + '\'' +
                ", paints='" + paints + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}
