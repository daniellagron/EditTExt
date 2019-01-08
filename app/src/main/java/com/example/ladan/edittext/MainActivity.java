package com.example.ladan.edittext;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1;
    Button btn1;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tv1 = (TextView)findViewById(R.id.tv1);
        et1 = (EditText)findViewById(R.id.et1);
        btn1 = (Button)findViewById(R.id.btn1);
        String st = et1.getText().toString();

    }

    public void gettext(View view) {
        tv1.setText(et1.getText());
    }
}
