package com.example.a20200319_01_fragment01;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseAtivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setEvents();
    public abstract void setValus();

}
