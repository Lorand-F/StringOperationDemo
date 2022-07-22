package com.example.stringoperationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btRemoveString, btRemoveCharacter, btSplitString, btGetUrlString;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRemoveString=findViewById(R.id.bt_remove_string);
        btRemoveCharacter=findViewById(R.id.bt_remove_character);
        btSplitString=findViewById(R.id.bt_split_string);
        btGetUrlString=findViewById(R.id.bt_get_url_string);
        tvOutput=findViewById(R.id.tv_output);
    }
}