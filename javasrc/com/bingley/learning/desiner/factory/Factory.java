package com.bingley.learning.desiner.factory;

/**
 * @author bingley
 * @date 2019/3/28.
 */

public class Factory {

    public Product create() {
        return new ProductA();
    }


    public static <T extends Product> T create(Class<T> clz) {
        Product product = null;
        try {
            product  = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T)product;
    }


}
