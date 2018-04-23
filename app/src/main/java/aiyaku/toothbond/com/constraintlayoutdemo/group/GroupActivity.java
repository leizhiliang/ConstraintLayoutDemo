package aiyaku.toothbond.com.constraintlayoutdemo.group;

import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import aiyaku.toothbond.com.constraintlayoutdemo.R;

public class GroupActivity extends AppCompatActivity {

    private Group group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        group = findViewById(R.id.group);
        findViewById(R.id.sure).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (group.getVisibility() == View.GONE) {
                    group.setVisibility(View.VISIBLE);
                } else {
                    group.setVisibility(View.GONE);
                }
            }
        });
    }
}
