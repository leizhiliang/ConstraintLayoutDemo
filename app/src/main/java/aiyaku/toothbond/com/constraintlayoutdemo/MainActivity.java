package aiyaku.toothbond.com.constraintlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import aiyaku.toothbond.com.constraintlayoutdemo.chains.ChainsActivity;
import aiyaku.toothbond.com.constraintlayoutdemo.dimension.DimensionActivity;
import aiyaku.toothbond.com.constraintlayoutdemo.group.GroupActivity;
import aiyaku.toothbond.com.constraintlayoutdemo.percent.PercentActivity;

/**
 * 资料：
 * 1、http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2017/1019/8618.html
 * 2、https://blog.csdn.net/qq_21234647/article/details/62218519
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_dimension).setOnClickListener(this);
        findViewById(R.id.btn_chains).setOnClickListener(this);
        findViewById(R.id.btn_group).setOnClickListener(this);
        findViewById(R.id.btn_percent).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dimension:
                startActivity(new Intent(this, DimensionActivity.class));
                break;
            case R.id.btn_chains:
                startActivity(new Intent(this, ChainsActivity.class));
                break;
            case R.id.btn_group:
                startActivity(new Intent(this, GroupActivity.class));
                break;
            case R.id.btn_percent:
                startActivity(new Intent(this, PercentActivity.class));
                break;
        }
    }
}
