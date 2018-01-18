package jieyaapp.sn.com.jieyaapp.view.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

import jieyaapp.sn.com.jieyaapp.R;
import jieyaapp.sn.com.jieyaapp.view.fragment.DealFragment;
import jieyaapp.sn.com.jieyaapp.view.fragment.FirstFragment;

public class MainActivity extends Activity implements View.OnClickListener{

    private TextView topBar;
    private TextView tabDeal;
    private TextView tabPoi;
    private TextView tabMore;
    private TextView tabUser;

    private FrameLayout ly_content;

    private FirstFragment f2,f3,f4;
    private DealFragment f1;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        setContentView(R.layout.activity_main);

        bindView();
    }
    //UI组件初始化与事件绑定
    private void bindView() {
        topBar = (TextView)this.findViewById(R.id.txt_top);
        tabDeal = (TextView)this.findViewById(R.id.txt_deal);
        tabPoi = (TextView)this.findViewById(R.id.txt_poi);
        tabUser = (TextView)this.findViewById(R.id.txt_user);
        tabMore = (TextView)this.findViewById(R.id.txt_more);
        ly_content = (FrameLayout) findViewById(R.id.fragment_container);

        tabDeal.setOnClickListener(this);
        tabMore.setOnClickListener(this);
        tabUser.setOnClickListener(this);
        tabPoi.setOnClickListener(this);

    }
    //重置所有文本的选中状态
    public void selected(){
        tabDeal.setSelected(false);
        tabMore.setSelected(false);
        tabPoi.setSelected(false);
        tabUser.setSelected(false);
    }
    //隐藏所有Fragment
    public void hideAllFragment(FragmentTransaction transaction){
        if(f1!=null){
            transaction.hide(f1);
        }
        if(f2!=null){
            transaction.hide(f2);
        }
        if(f3!=null){
            transaction.hide(f3);
        }
        if(f4!=null){
            transaction.hide(f4);
        }
    }
    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        hideAllFragment(transaction);
        switch(v.getId()){
            case R.id.txt_deal:
                selected();
                tabDeal.setSelected(true);
                if(f1==null){
                    f1 = new DealFragment();
                    transaction.add(R.id.fragment_container,f1);
                }else{
                    transaction.show(f1);
                }
                break;

            case R.id.txt_more:
                selected();
                tabMore.setSelected(true);
                if(f2==null){
                    f2 = new FirstFragment("第二个Fragment");
                    transaction.add(R.id.fragment_container,f2);
                }else{
                    transaction.show(f2);
                }
                break;

            case R.id.txt_poi:
                selected();
                tabPoi.setSelected(true);
                if(f3==null){
                    f3 = new FirstFragment("第三个Fragment");
                    transaction.add(R.id.fragment_container,f3);
                }else{
                    transaction.show(f3);
                }
                break;

            case R.id.txt_user:
                selected();
                tabUser.setSelected(true);
                if(f4==null){
                    f4 = new FirstFragment("第四个Fragment");
                    transaction.add(R.id.fragment_container,f4);
                }else{
                    transaction.show(f4);
                }
                break;
        }

        transaction.commit();
    }
}
