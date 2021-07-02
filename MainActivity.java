package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: test

    }

    public void onBtnClick (View view){
        TextView viewFirstName;
        viewFirstName = (TextView) findViewById(R.id.viewFirstName);

        //convert textview to string
        String tvValue = viewFirstName.getText().toString();

        int BTC_USD_Value = 0;
        //if (!tvValue.equals("") && !tvValue.equals('.')) {
             BTC_USD_Value = Integer.parseInt(tvValue);
        //}

        TextView viewLastName = findViewById(R.id.viewLastName);
        TextView viewEmail = findViewById(R.id.viewEmail);

        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        viewFirstName.setText("Bitcoin USD Value: " + edtTxtLastName.getText().toString());
        viewLastName.setText("Last Name: " + edtTxtLastName.getText().toString());
        viewEmail.setText("Email: " + edtTxtEmail.getText().toString());
    }

}