package com.example.tejus_bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText w;
    EditText h;
    Button submit;
    TextView bmi;
   // int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        w=(EditText) findViewById(R.id.wi);
        h=(EditText) findViewById(R.id.hi);
        submit=(Button) findViewById(R.id.submit);
        bmi=(TextView) findViewById(R.id.answer);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w1=Double.parseDouble(w.getText().toString());
                double h1=Double.parseDouble(h.getText().toString());
                double ans= w1/(h1*h1);
                bmi.setText(Double.toString(ans));
            }
        });
    }
}
