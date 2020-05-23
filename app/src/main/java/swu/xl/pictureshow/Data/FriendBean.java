package swu.xl.pictureshow.Data;

/**
 * 好友模型
 */
public class FriendBean {
    //图片资源id
    private int icon_id;
    //好友名称
    private String name;
    //好友动态
    private String mode;

    //构造方法
    public FriendBean(int icon_id, String name, String mode) {
        this.icon_id = icon_id;
        this.name = name;
        this.mode = mode;
    }

    //set,get方法
    public int getIcon_id() {
        return icon_id;
    }

    public void setIcon_id(int icon_id) {
        this.icon_id = icon_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
