package com.example.workstudy.pattern.decorate;

public class WomenDecorate extends Women implements Decorate{

    private Women women;

    @Override
    public String getDescription() {
        return getDecorate()+super.getDescription();
    }

    public WomenDecorate(Women women) {
        this.women = women;
    }

    public WomenDecorate() {
    }

    @Override
    public String getDecorate() {
        return "穿上漂亮裙子的";
    }
}
