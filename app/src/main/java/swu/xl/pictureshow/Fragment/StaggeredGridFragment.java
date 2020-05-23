package swu.xl.pictureshow.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import swu.xl.pictureshow.Data.DataManager;
import swu.xl.pictureshow.R;

public class StaggeredGridFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //加载布局
        View inflate = inflater.inflate(R.layout.staggered_grid_layout, null);

        //找到控件
        final SwipeRefreshLayout refresh = inflate.findViewById(R.id.refresh);
        final RecyclerView recycler = inflate.findViewById(R.id.recycler);
        refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //跟新数据
                DataManager.getDataManager(getContext()).reloadData();

                //刷新
                RecyclerView.Adapter adapter = recycler.getAdapter();
                adapter.notifyDataSetChanged();

                //取消刷新
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (refresh.isRefreshing()) {
                            refresh.setRefreshing(false);
                        }
                    }
                }, 500);
            }
        });

        return inflate;
    }
}
