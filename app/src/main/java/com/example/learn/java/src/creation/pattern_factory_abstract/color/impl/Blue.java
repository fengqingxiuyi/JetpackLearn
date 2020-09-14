package com.example.learn.java.src.creation.pattern_factory_abstract.color.impl;

import com.example.learn.java.src.creation.pattern_factory_abstract.color.IColor;

/**
 * @author ShenBF
 * @desc 蓝色，具体实现类
 * @date 2018/7/24
 */
public class Blue implements IColor {

    @Override
    public void fill() {
        System.out.println("填充了蓝色");
    }

}
