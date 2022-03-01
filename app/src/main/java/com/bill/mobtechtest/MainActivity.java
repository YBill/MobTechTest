package com.bill.mobtechtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mob.MobSDK;

/**
 * MobTech 集成文档：https://www.mob.com/wiki/detailed?wiki=81&id=136
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // MobTech 第六步
        MobSDK.submitPolicyGrantResult(true, null);
    }
}