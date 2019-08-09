package com.bingley.learning.basic.set;

/**
 * Created by SAM on 2017/6/15.
 */
public class TestBean {


    public int getTop() {
        return top;
    }

    private int top;


    private String id;

    public TestBean(String id, int top) {
        this.id = id;
        this.top = top;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TestBean) {
            TestBean testBean = (TestBean) obj;
            // 满足下面两个条件，意味着是相同的   true 代表相同

            if (testBean.id.equals(id) && (testBean.top == top)) {
                return true;
            }
        }
        return super.equals(obj);
    }

}
