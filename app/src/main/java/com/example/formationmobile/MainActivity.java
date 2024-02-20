package com.example.formationmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText val1, val2;
    private Button btnplus, btnsous, btnmul, btndiv;
    private TextView res;
    private String v1, v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        btnplus = findViewById(R.id.btnplus);
        btnsous = findViewById(R.id.btnsous);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        res = findViewById(R.id.res);
        btnplus.setOnClickListener(v -> {
            v1 = val1.getText().toString();
            v2 = val2.getText().toString();
            res.setText(Integer.toString(Integer.parseInt(v1) + Integer.parseInt(v2)));
        });
        btnsous.setOnClickListener(v -> {
            v1 = val1.getText().toString();
            v2 = val2.getText().toString();
            res.setText(Integer.toString(Integer.parseInt(v1) - Integer.parseInt(v2)));
        });
        btnmul.setOnClickListener(v -> {
            v1 = val1.getText().toString();
            v2 = val2.getText().toString();
            res.setText(Integer.toString(Integer.parseInt(v1) * Integer.parseInt(v2)));
        });
        btndiv.setOnClickListener(v -> {
            v1 = val1.getText().toString();
            v2 = val2.getText().toString();
            res.setText(Integer.toString(Integer.parseInt(v1) / Integer.parseInt(v2)));
        });
    }
}