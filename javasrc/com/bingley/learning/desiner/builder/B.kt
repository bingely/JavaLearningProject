package com.bingley.learning.desiner.builder

class B private constructor(builder: BBuilder) {
    private val age: String? = null
    private val name: String?

    class BBuilder {
        var age: String? = null
        var name: String? = null
        fun name(name: String?): BBuilder {
            this.name = name
            return this
        }

        fun builder(): B {
            return B(this)
        }
    }

    init {
        name = builder.name
    }
}