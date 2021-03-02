package com.example.workstudy.pattern.decorate;

import com.example.workstudy.pattern.People;

public class Man implements People {
    @Override
    public String getName() {
        return "男人";
    }

    @Override
    public String getDescription() {
        return getName()+":你好";
    }
}
