package com.example.desiner.prototype;

/**
 * @author bingley
 * @date 2019/3/27.
 */

public class Spec implements Cloneable{
    //
    private int width;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Spec{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    protected Spec clone() throws CloneNotSupportedException {//重写Spec的clone方法
        return (Spec) super.clone();
    }
}
