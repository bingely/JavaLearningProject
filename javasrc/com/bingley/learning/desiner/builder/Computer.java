package com.bingley.learning.desiner.builder;

/**
 * 口诀：普通bean,修改它的一个有参的构造方法，传入类名+builder命名的对象，在里面初始化bean的变量
 * 创建一个内部类Builder 里面的属性跟外面保持一致，获取它们属性的方法的返回值是该内部类对象类型，
 *          再创建个builder方法，返回类型是外部类类型，生成一个外部类实例
 * @author bingley
 * @date 2019/3/26.
 */

public class Computer {

    private final String cName;
    private final String cNumber;

    public String getcName() {
        return cName;
    }

    public String getcNumber() {
        return cNumber;
    }

    private Computer(ComputerBuilder computerBuilder) {
        this.cName = computerBuilder.cName;
        this.cNumber = computerBuilder.cNumber;
    }


    @Override
    public String toString() {
        return "Consoler{" +
                "cName='" + cName + '\'' +
                ", cNumber='" + cNumber + '\'' +
                '}';
    }


    public static class ComputerBuilder {

        public String cName;
        public String cNumber;



        public ComputerBuilder name(String cName) {
            this.cName = cName;
            return this;
        }


        public Computer builder() {
            return new Computer(this);
        }
    }

}
