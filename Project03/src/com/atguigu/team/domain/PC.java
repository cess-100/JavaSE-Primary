package com.atguigu.team.domain;

public class PC implements Equipment {

    private String model;//机器型号
    private String display;//显示器名称

    public PC() {
        super();
    }

    public PC(String model, String display) {
        super();
        this.model = model;//机器的型号
        this.display = display;//显示器的名称
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
