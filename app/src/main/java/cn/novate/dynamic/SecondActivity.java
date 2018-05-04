package cn.novate.dynamic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/4 16:03
 * Version 1.0
 * Params:
 * Description:    动态添加布局到容器中
*/

public class SecondActivity extends AppCompatActivity {

    private FrameLayout fl_container;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fl_container = (FrameLayout) findViewById(R.id.fl_container);


        /**
         * 参数1：需要动态添加的布局文件
         * 参数2：父布局容器
         * 参数3：false表示没有把布局文件添加到父布局中，true表示把布局文件添加到容器中
         */

        // 第三个参数设置为false
        View inflateView = LayoutInflater.from(SecondActivity.this).inflate(R.layout.inflate_view_layout, fl_container, false);

        /*// 第三个参数设置为true -> 可以把布局文件添加到父布局中
        View inflateView = LayoutInflater.from(SecondActivity.this).inflate(R.layout.inflate_view_layout, fl_container, true);*/


        /*// 第三个参数设置为false + addView -> 可以把布局文件添加到父布局中
        View inflateView = LayoutInflater.from(SecondActivity.this).inflate(R.layout.inflate_view_layout, fl_container, false);
        fl_container.addView(inflateView);*/

    }
}
