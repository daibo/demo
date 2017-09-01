package com.model;

/**
 * Created by daibo on 2017/9/1.
 */
public class Index_articleTitleAdressHot_M {
    private String title;
    private String sketch;
    private String hot;
    private String address;

    @Override
    public String toString() {
        return "Index_articleTitleAdressHot_M{" +
                "title='" + title + '\'' +
                ", sketch='" + sketch + '\'' +
                ", hot='" + hot + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Index_articleTitleAdressHot_M() {
    }

    public Index_articleTitleAdressHot_M(String title, String sketch, String hot, String address) {

        this.title = title;
        this.sketch = sketch;
        this.hot = hot;
        this.address = address;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
