package com.example.basketforapples;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.basketforapples.R;

public class MainActivity extends AppCompatActivity {

    EditText etInputApple;
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBasketNumber(View view) {

        etInputApple = (EditText) findViewById(R.id.etInputApple); // etInputApple 이라는 아이디를 가진 EditText 를 찾아옴
        tvAnswer = (TextView) findViewById(R.id.tvAnswer); // tvBasketComment 라는 아이디를 가진 TextView 찾아옴

        try {
            int inputApple = Integer.parseInt(etInputApple.getText().toString()); // etInputApple 의 입력값을 toString 으로 받아 parseInt 로 다시 정수 변환
            etInputApple.setText(""); // 버튼 누르면 etInputApple 클리어
            Log.i("jeongmin", "inputApple : " + inputApple);
            int numberOfBasket = inputApple%10==0?inputApple/10:inputApple/10+1; // inputApple 을 10으로 나눈 나머지가 0이라면 inputApple/10출력, 나머지가 있다면 inputApple/10의 값에 1을 더한 값 출력
            tvAnswer.setText(numberOfBasket + "개");
        } catch (Exception e){ // 예외처리
            Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다.\n 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
         }
    }
}