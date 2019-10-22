package com.kundan.makingtoasterlibraryexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kundan.mytoasterlibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.showToast(this, "Hello");
    }
}
