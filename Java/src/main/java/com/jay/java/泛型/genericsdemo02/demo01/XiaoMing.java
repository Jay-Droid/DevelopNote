package com.jay.java.泛型.genericsdemo02.demo01;

public class XiaoMing extends Person {


    public RawPlate getPlate(){
        return new RawPlate();
    }

    public <T> AIPlate<T> getAIPlate(){
        return new AIPlate<T>();
    }

}
