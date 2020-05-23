package swu.xl.pictureshow.Data;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import swu.xl.pictureshow.R;

public class DataUtil {
    /**
     * 加载数据
     */
    public static List<FriendBean> loadData(Context context){
        //图片资源数据
        int[] icon_ids = new int[]{
                R.drawable.friend1,
                R.drawable.friend2,
                R.drawable.friend3,
                R.drawable.friend4,
                R.drawable.friend5,
                R.drawable.friend6,
                R.drawable.friend7,
                R.drawable.friend8,
                R.drawable.friend9,
                R.drawable.friend10
        };

        //名字数据
        String[] names = context.getResources().getStringArray(R.array.name);

        //动态数据
        String[] modes = context.getResources().getStringArray(R.array.mode);

        //初始化数据
        List<FriendBean> friends = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            FriendBean friend = new FriendBean(icon_ids[i],names[i],modes[i]);

            friends.add(friend);
        }

        return friends;
    }

    public static List<FriendBean> reloadData(Context context) {
        //图片资源数据
        int[] icon_ids = new int[]{
                R.drawable.friend1,
                R.drawable.friend2,
                R.drawable.friend3,
                R.drawable.friend4,
                R.drawable.friend5,
                R.drawable.friend6,
                R.drawable.friend7,
                R.drawable.friend8,
                R.drawable.friend9,
                R.drawable.friend10
        };

        //名字数据
        String[] names = context.getResources().getStringArray(R.array.name);

        //动态数据
        String[] modes = context.getResources().getStringArray(R.array.mode);

        //初始化数据
        List<FriendBean> friends = new ArrayList<>();
        for (int i = 9; i >= 0; i--) {
            FriendBean friend = new FriendBean(icon_ids[i],names[i],modes[i]);

            friends.add(friend);
        }

        return friends;
    }
}
