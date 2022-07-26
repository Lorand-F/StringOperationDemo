package com.example.stringoperationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btRemoveString, btRemoveCharacter, btSplitString, btGetUrlString;
    TextView tvOutputBefore, tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRemoveString=findViewById(R.id.bt_remove_string);
        btRemoveCharacter=findViewById(R.id.bt_remove_character);
        btSplitString=findViewById(R.id.bt_split_string);
        btGetUrlString=findViewById(R.id.bt_get_url_string);
        tvOutputBefore=findViewById(R.id.tv_output_before);
        tvOutput=findViewById(R.id.tv_output_after);

        btRemoveString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="Channel Name : Android Application";
                tvOutputBefore.setText(s);
                tvOutput.setText(s);
                String removedString=s.replaceAll("Channel Name : ","");
                tvOutput.setText(removedString);
            }
        });

        btRemoveCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="(19.1234,73.4321)";
                tvOutputBefore.setText(s);
                String removedLeftCharacter=s.replace("(","");
                String removedRightCharacter=removedLeftCharacter.replace(")","");
                tvOutput.setText(removedRightCharacter);
            }
        });

        btSplitString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="19.4321,73.1234";
                tvOutputBefore.setText(s);
                String[] split=s.split(",");
                String s1=split[0];
                String  s2=split[1];;
                tvOutput.setText(String.format("%s\n%s", s1, s2));
            }
        });

        btGetUrlString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOutputBefore.setText(R.string.in_progress);
                tvOutput.setText(R.string.in_progress);
            }
        });
    }
}