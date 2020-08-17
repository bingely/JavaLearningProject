package com.bingley.learning.basic.generic;

// 泛型类的特点
// 在类名称后面定义了通用的数据类型，可用于类中成员的定义类型
public class Container<K, V> {
    private K k;
    private V v;

    public Container(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
