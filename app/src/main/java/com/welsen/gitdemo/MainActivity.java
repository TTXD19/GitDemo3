package com.welsen.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Test
        Toast.makeText(this, "Git Demo", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Git Demo 2", Toast.LENGTH_SHORT).show();

    }

    private void MethodUpdate(){

        Toast.makeText(this, "Git Demo3", Toast.LENGTH_SHORT).show();

    }

}
