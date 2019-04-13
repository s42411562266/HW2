package com.example.edittext2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ed1,ed2,ed3;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setBackgroundDrawableResource(R.drawable.bird);
    }
    int size=30;
    public void response(View v){
        ed1=findViewById(R.id.editText5);
        ed2=findViewById(R.id.editText6);
        ed3=findViewById(R.id.editText7);
        text=findViewById(R.id.textView2);
        float height=Float.parseFloat(ed2.getText().toString());
        float weight=Float.parseFloat(ed3.getText().toString());
        float BMI=(float)(weight/(Math.pow(height/100,2.0)));
        String BMI2=String.valueOf(BMI);
        text.setTextSize(size);
        text.setTextColor(Color.rgb(250,0,0));
        text.setText("Hello "+ed1.getText().toString()+"!\n"+"Your BMI is: "+BMI2);
        Toast.makeText(this,chnagePic(BMI),Toast.LENGTH_LONG).show();
    }
    private String chnagePic(float st){
        String ans=null;
        if(st>25.0){
            ans=new String("You are very fat = =!");
            getWindow().setBackgroundDrawableResource(R.drawable.afriad);
        }
        else if(st<18.5){
            ans=new String("You are so silm.....");
            getWindow().setBackgroundDrawableResource(R.drawable.kuso);
        }
        else {
            ans = new String("You are the stander!!!");
            getWindow().setBackgroundDrawableResource(R.drawable.bird);
        }
        return ans;
    }
}
