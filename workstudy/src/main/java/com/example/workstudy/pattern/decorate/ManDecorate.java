package com.example.workstudy.pattern.decorate;

public class ManDecorate  extends Man implements Decorate{

    private Man man;

    @Override
    public String getDescription() {
        return  getDecorate()+super.getDescription();
    }

    public ManDecorate(Man man) {
        this.man = man;
    }

    public ManDecorate() {
    }


    @Override
    public String getDecorate() {
        return "穿上西装的";
    }
}
