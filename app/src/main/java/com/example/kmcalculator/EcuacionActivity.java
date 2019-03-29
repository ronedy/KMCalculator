package com.example.kmcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EcuacionActivity extends AppCompatActivity {

    EditText aa,bb,cc;
    TextView res1, res2;
    double x1,x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion);
    }

    public void resolverEcDos(View view){


        aa = (EditText) findViewById(R.id.a);
        bb = (EditText) findViewById(R.id.b);
        cc = (EditText) findViewById(R.id.c);
        res1 = (TextView) findViewById(R.id.txtx1);
        res2 = (TextView) findViewById(R.id.txtx2);


        int a= Integer.parseInt(aa.getText().toString());
        int b= Integer.parseInt(bb.getText().toString());
        int c= Integer.parseInt(cc.getText().toString());

        x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        res1.setText("X1= "+x1);
        res2.setText("X2= "+x2);

        //Limpio la funcion
    }



}
