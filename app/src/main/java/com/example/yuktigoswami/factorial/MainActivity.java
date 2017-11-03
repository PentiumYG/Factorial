package com.example.yuktigoswami.factorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t;
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView)findViewById(R.id.textView);
        e=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int a;
        String s=e.getText().toString();
        a=Integer.parseInt(s);
        int f=0;
        for(int i=a-1;i>1;i--){
            a=a*i;
        }
        String r=String.valueOf(a);
        t.setText(r);
        e.setText(null);

    }
}
