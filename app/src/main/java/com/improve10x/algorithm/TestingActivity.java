package com.improve10x.algorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class TestingActivity extends AppCompatActivity {
    Button sumBtn;
    TextView resultTxt;
   SeekBar aseekbarSb;
   SeekBar bseekbarSb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        handleInitviews();
        handleSumBtn();
    }

    private void handleSumBtn() {
        sumBtn.setOnClickListener(view -> {
            int input1 = aseekbarSb.getProgress();
            int input2 = bseekbarSb.getProgress();
            String result = sumIsLessThan100(input1, input2);
            resultTxt.setText(result);
        });
    }

    private String sumIsLessThan100(int input1, int input2) {

        boolean result = false;
        if (input1 + input2 < 100) {
            result = true;
        }
        return result + "";
    }

    public void handleInitviews() {
        sumBtn = findViewById(R.id.sum_btn);
        aseekbarSb = findViewById(R.id.aseekbar_sb);
        bseekbarSb = findViewById(R.id.bseekbar_sb);
        resultTxt = findViewById(R.id.result_txt);
    }

    @Override
    protected void onPause() {
        super.onPause();
        aseekbarSb.setProgress(0);
        bseekbarSb.setProgress(0);
        resultTxt.setText("");
    }
}