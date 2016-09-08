package com.lsukev.dogorcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbNo, rbYes, rbDroolNo, rbDroolYes;
    private RadioGroup canineRadioGroup, droolRadioGroup;
    private TextView txtComfort;
    private SeekBar seekBar;
    private CheckBox cbDog, cbCat, cbParrot;
    private Button btnShowResults;
    private int dogCounter;
    private int catCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
    }
    public void setUp(){
        dogCounter = 0;
        catCounter = 0;

        canineRadioGroup = (RadioGroup)findViewById(R.id.canineRadioGroup);
        droolRadioGroup = (RadioGroup) findViewById(R.id.droolRadioGroup);
        txtComfort = (TextView)findViewById(R.id.txtComfort);
        //checkboxes
        cbDog = (CheckBox) findViewById(R.id.cbDog);
        cbCat = (CheckBox) findViewById(R.id.cbCat);
        cbParrot = (CheckBox) findViewById(R.id.cbParrot);
        //radio buttons
        rbNo = (RadioButton)findViewById(R.id.rbNo);
        rbYes = (RadioButton)findViewById(R.id.rbYes);
        rbDroolNo = (RadioButton)findViewById(R.id.rbDroolNo);
        rbDroolYes = (RadioButton) findViewById(R.id.rbDroolYes);

        btnShowResults = (Button) findViewById(R.id.btnShowResults);
        btnShowResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
