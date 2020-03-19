package com.example.a20200319_01_fragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.a20200319_01_fragment01.databinding.ActivityMainBinding;

public class MainActivity extends BaseAtivity {
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setEvents();
        setValus();
    }

    @Override
    public void setEvents() {
        binding.firstFragCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                첫 프레그먼트 호출 버튼이 눌리면?
//                firstfr 보이게 =>firstfrag는 기능 별로 없음
//                fristfr을 감싸ㅡㄴ 레이아웃을 추가
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                secondfrag 숨김
                binding.secondFragLayout.setVisibility(View.GONE);
            }
        });

        binding.secondFragCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                첫 프레그 숨겨줌
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                2번쪠 보여줌
                binding.secondFragLayout.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public void setValus() {

    }
}
