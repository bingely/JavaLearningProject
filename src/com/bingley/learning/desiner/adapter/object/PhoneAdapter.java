package com.example.desiner.adapter.object;

/**
 * @author bingley
 * @date 2019/3/27.
 */
// 而对象适配器是通过传递对象来实现
public class PhoneAdapter implements Adapter{

    /**
     * 适配器持有源目标对象
     */
    private Electric mElectric;

    public PhoneAdapter(Electric electric) {
        mElectric = electric;
    }

    @Override
    public int convert_5v() {
        System.out.println("adapter begin work：");
        System.out.println("input ：" + mElectric.output_220v());
        System.out.println("out：" + 5);
        // convert_9v
        return 5;
    }
}
