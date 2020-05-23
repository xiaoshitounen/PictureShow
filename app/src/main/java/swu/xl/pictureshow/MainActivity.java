package swu.xl.pictureshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import swu.xl.pictureshow.Fragment.GridFragment;
import swu.xl.pictureshow.Fragment.LinearFragment;
import swu.xl.pictureshow.Fragment.StaggeredGridFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        ViewPager pager = findViewById(R.id.pager);
        TabLayout tab = findViewById(R.id.tab);

        //fragment数据源
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new LinearFragment());
        fragments.add(new GridFragment());
        fragments.add(new StaggeredGridFragment());

        //标题数据源
        String[] titles = getResources().getStringArray(R.array.title);

        //设置适配器
        pager.setAdapter(
                new MyAdapterFragment(
                        getSupportFragmentManager(),
                        FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,
                        fragments,
                        titles
                )
        );

        //绑定tab和fragment
        tab.setupWithViewPager(pager);
    }
}
