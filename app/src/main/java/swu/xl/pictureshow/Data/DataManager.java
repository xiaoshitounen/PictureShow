package swu.xl.pictureshow.Data;

import android.content.Context;

import java.util.List;

public class DataManager {
    //存储的数据
    public List<FriendBean> friends;

    //上下文
    private Context context;

    //标志内容的状态
    private boolean flag = true;

    //单例模式
    private static DataManager instance = null;
    private DataManager(Context context){
        this.context = context;
        loadData();
    }
    public static DataManager getDataManager(Context context){
        if (instance == null){
            instance = new DataManager(context);
        }
        return instance;
    }

    /**
     * 加载数据
     */
    private void loadData() {
        friends = DataUtil.loadData(context);
    }

    /**
     * 刷新数据
     */
    public void reloadData(){
        if (flag){
            friends.clear();
            friends.addAll(DataUtil.reloadData(context));
        }else {
            friends.clear();
            friends.addAll(DataUtil.loadData(context));
        }

        flag = !flag;
    }
}
