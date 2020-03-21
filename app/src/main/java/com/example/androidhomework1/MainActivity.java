package com.example.androidhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    private RadioGroup radioGroup;
    private CheckBox checkBox;
    private int man;
    private int graduate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn1);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText2);
        radioGroup = findViewById(R.id.radioGroup);
        checkBox = findViewById(R.id.checkBox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edin = editText.getText().toString();
                String sex = "";
                String gra = "";
                if (man == 1){
                    sex = "男";
                }
                else {
                    sex = "女";
                }
                if (graduate == 1){
                    gra = "已毕业";
                }
                else{
                    gra = "未毕业";
                }
                textView.setText(edin + ' ' + sex + ' ' + gra);
                Log.i("MainActivity", "按钮被点击了");
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton4){
                    man = 1;
                }
                else {
                    man = 0;
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    graduate = 1;
                }
                else {
                    graduate = 0;
                }
            }
        });
    }
}
