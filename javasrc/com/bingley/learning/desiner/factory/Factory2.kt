package com.bingley.learning.desiner.factory

/**
 * 利用的是Class.foName反射的特点进行
 * @author bingley
 * @date 2019/3/28.
 */
class Factory2 {
    fun create(): Product {
        return ProductA()
    }

    companion object {
        fun <T : Product?> create(clz: Class<T>): T? {
            var product: Product? = null
            try {
                product = Class.forName(clz.name).newInstance() as Product
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return product as T?
        }
    }
}