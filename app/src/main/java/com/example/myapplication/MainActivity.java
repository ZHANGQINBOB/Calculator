package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    ActivityMainBinding binding;
    String input = "";
    String output = "";
    boolean canOpe = true;
    boolean ifEqual = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initView();
        binding.bt0.setOnClickListener(this);
        binding.bt1.setOnClickListener(this);
        binding.bt2.setOnClickListener(this);
        binding.bt3.setOnClickListener(this);
        binding.bt4.setOnClickListener(this);
        binding.bt5.setOnClickListener(this);
        binding.bt6.setOnClickListener(this);
        binding.bt7.setOnClickListener(this);
        binding.bt8.setOnClickListener(this);
        binding.bt9.setOnClickListener(this);
        binding.btAdd.setOnClickListener(this);
        binding.btMinus.setOnClickListener(this);
        binding.btMultiple.setOnClickListener(this);
        binding.btDivide.setOnClickListener(this);
        binding.btAc.setOnClickListener(this);
        binding.btEqual.setOnClickListener(this);
        binding.btDelete.setOnClickListener(this);



    }

    private void initView() {
        input = binding.etInput.getText().toString();
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_0:
                input += "0";
                canOpe = true;

                break;
            case R.id.bt_1:
                canOpe = true;
                input += "1";
                break;
                case R.id.bt_2:
                    canOpe = true;
                input += "2";
                break;
            case R.id.bt_3:
                canOpe = true;
                input += "3";
                break;
            case R.id.bt_4:
                canOpe = true;
                input += "4";
                break;
            case R.id.bt_5:
                canOpe = true;
                input += "5";
                break;
            case R.id.bt_6:
                canOpe = true;
                input += "6";
                break;
            case R.id.bt_7:
                canOpe = true;
                input += "7";
                break;
            case R.id.bt_8:
                canOpe = true;
                input += "8";
                break;
            case R.id.bt_9:
                canOpe = true;
                input += "9";
                break;
            case R.id.bt_add:
                if (canOpe) {
                    input += " + ";
                    canOpe = false;
                }


                break;
            case R.id.bt_minus:
                if (canOpe) {

                    canOpe = false;
                    input += " - ";
                }
                break;
            case R.id.bt_multiple:
                if (canOpe) {

                    canOpe = false;
                    input += " * ";
                }
                break;
            case R.id.bt_divide:
                if (canOpe) {

                    canOpe = false;
                    input += " ÷ ";
                }
                break;
            case R.id.bt_ac:
                input = "";
                break;
            case R.id.bt_equal:
                output = String.valueOf(Calculator.calculate(input));
                binding.etOutput.setText(output);
                ifEqual = true;
                break;
            case R.id.bt_delete:
                if (' ' == input.charAt(input.length()-1)) {
                    input = input.substring(0, input.length() - 3);
                    canOpe = true;
                }
                else {
                    input = input.substring(0, input.length() - 1);
                }

                break;
        }
        if (ifEqual) {
            binding.etInput.setText(input);
            input = "";
            ifEqual = false;
        }
        else {
            binding.etInput.setText(input);

        }
    }
}