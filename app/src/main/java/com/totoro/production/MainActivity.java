package com.totoro.production;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button_1)
    Button button1;
    @Bind(R.id.button_2)
    Button button2;
    @Bind(R.id.button_3)
    Button button3;
    @Bind(R.id.button_4)
    Button button4;
    @Bind(R.id.button_5)
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setTitle("我的应用作品集");
    }

    @OnClick({R.id.button_1, R.id.button_2, R.id.button_3, R.id.button_4, R.id.button_5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button_1:
                Toast.makeText(this, "热门电影", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_2:
                Toast.makeText(this, "股票雄鹰", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_3:
                Toast.makeText(this, "XYZ阅读器", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_4:
                Toast.makeText(this, "最新闻", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_5:
                Toast.makeText(this, "毕业设计", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
