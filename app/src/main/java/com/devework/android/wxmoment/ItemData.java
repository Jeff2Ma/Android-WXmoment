package com.devework.android.wxmoment;

/**
 * 展示数据的调用方法
 *
 */
public class ItemData {
    /*
    * 需要展示的数据：
    * 昵称、头像、朋友圈内容、时间、图片（可选）
    * name, avatar, content, time, pic(optional)
    *
    **/
    private String name;
    private int avatar;
    private String content;
    private String time;
    private int pic;

    public ItemData(String name,int avatar,String content,String time,int pic){
        this.name = name;
        this.avatar = avatar;
        this.content = content;
        this.time = time;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimet() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

}
