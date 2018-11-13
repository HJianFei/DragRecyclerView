package com.hjianfei.dragrecyclerviewdemo;

/**
 * <pre>
 *     author : HJFei
 *     e-mail : 190766172@qq.com
 *     time   : 2018/11/13
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Subject {

    private String title;
    private int img;

    public Subject(String title, int img) {
        this.title = title;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
