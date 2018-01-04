package jieyaapp.sn.com.jieyaapp;

/**
 * Created by John on 2017/11/14.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

/** 开场欢迎动画 */
public class Welcome extends Activity {

    private final long SPLASH_LENGTH = 3000;
    Handler handler = new Handler();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        //延迟0.7秒后执行run方法中的页面跳转
        handler.postDelayed(new Runnable() {  //使用handler的postDelayed实现延时跳转

            public void run() {
                Intent intent = new Intent(Welcome.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_LENGTH);//3秒后跳转至应用主界面MainActivity
    }
}
