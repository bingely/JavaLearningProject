package com.bingley.learning.basic.thread

import java.util.concurrent.TimeUnit

object TestStopThread2 {
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) { // 第一种方式
        val moonRunner = MoonRunner()
        val thread = Thread(moonRunner, "MoonRunner")
        thread.start()
        TimeUnit.MICROSECONDS.sleep(10)
        thread.interrupt()
        // 第二种方式
        val moonRunner2 = MoonRunner2()
        val thread2 = Thread(moonRunner2, "MoonRunner2")
        thread2.start()
        TimeUnit.MICROSECONDS.sleep(16000)
        moonRunner2.cacel()
    }

    class MoonRunner : Runnable {
        private var i: Long = 0
        override fun run() {
            while (!Thread.currentThread().isInterrupted) {
                i++
                println("MoonRunner--i=$i"
                )
            }
            println("stop")
        }
    }

    class MoonRunner2 : Runnable {
        private var i: Long = 0
        @Volatile
        private var on = true

        override fun run() {
            while (on) {
                i++
                println("MoonRunner2---i=$i")
            }
            println("stop")
        }

        fun cacel() {
            on = false
        }
    }
}