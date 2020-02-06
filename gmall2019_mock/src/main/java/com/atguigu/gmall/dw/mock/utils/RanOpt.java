package com.atguigu.gmall.dw.mock.utils;

/**
 * Author:chenxiaoyang
 * Date:
 * Version:
 */
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}

