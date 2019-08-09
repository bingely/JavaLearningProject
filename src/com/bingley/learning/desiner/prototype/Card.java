package com.example.desiner.prototype;

/**
 * @author bingley
 * @date 2019/3/27.
 */

public class Card implements Cloneable {
    /**
     * 卡号
     */
    private int num;
    private String cardName;

    Spec spec = new Spec();

    public Card() {
        System.out.println("Card perform construtor");
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSpec(int length, int width) {
        spec.setLength(length);
        spec.setWidth(width);
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", cardName='" + cardName + '\'' +
                ", spec=" + spec +
                '}';
    }

    @Override
    public Card clone() throws CloneNotSupportedException {//重写clone()方法，clone()方法不是Cloneable接口里面的，而是Object里面的
        System.out.println("clone don't perform construtor");
        Card card = (Card) super.clone();
        //对spec对象也调用clone，实现深拷贝
        card.spec = (Spec) spec.clone();
        return card;
    }


}
