package com.example.desiner.builder;

/**
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
