package swu.xl.pictureshow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MyAdapterFragment extends FragmentPagerAdapter {

    //保存传递的fragment集合
    private List<Fragment> fragments;

    //保存传递的标题数组
    private String[] titles;

    /**
     * 构造方法
     * @param fm
     * @param behavior
     */
    public MyAdapterFragment(@NonNull FragmentManager fm, int behavior, List<Fragment> fragments, String[] titles) {
        super(fm, behavior);

        //获取fragments数据源
        this.fragments = fragments;

        //获取标题的数据源
        this.titles = titles;
    }

    //返回对应位置的 fragment
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    //获取 fragment 的数量
    @Override
    public int getCount() {
        return fragments.size();
    }

    //设置标题
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
