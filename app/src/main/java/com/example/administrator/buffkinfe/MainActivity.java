package com.example.administrator.buffkinfe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_show)
    public TextView tv;
    @BindView(R.id.btn_click)
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
     @OnClick(R.id.btn_click)
   public  void click(){
         tv.setText("黄油刀");
         Toast.makeText(MainActivity.this,"dianjileanidna",Toast.LENGTH_LONG).show();
     }
}
