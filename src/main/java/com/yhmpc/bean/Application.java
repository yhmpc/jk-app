package com.yhmpc.bean;

public class Application {
    private String name = "Jenkins APP deploy in tomcat...";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                '}';
    }
}
