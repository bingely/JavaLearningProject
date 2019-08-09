package com.bingley.learning.desiner.stragety;

/**
 * @author bingley
 * @date 2019/3/26.
 */

public class StragetyContext {

    CalculateStragety mCalculateStragety;

    /**
     * 根据需要注入相应的策略
     *
     * @param calculateStragety 注入的策略
     */
    public void setCalculateStragety(CalculateStragety calculateStragety) {
        mCalculateStragety = calculateStragety;
    }

    /**
     * 把具体的计算委托给注入的策略
     *
     * @param km 公里数
     * @return 车费
     */
    public int calculatePrice(int km) {
        return mCalculateStragety.calculatePrice(km);
    }
}
