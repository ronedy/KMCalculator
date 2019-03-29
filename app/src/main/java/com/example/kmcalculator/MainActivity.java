package com.example.kmcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvdisplay;
    double n1 =0.0, n2= 0.0, res; //para que no halla ningun error lo dejo en 0.0
    String operador; //nombre del operador que mostrara las operaciones que se van a realizar


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void bCero(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"0");
    }
    public void bUno(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"1");
    }
    public void bDos(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"2");
    }
    public void bTres(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"3");
    }
    public void bCuatro(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"4");
    }
    public void bCinco(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"5");
    }
    public void bSeis(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"6");
    }
    public void bSiete(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"7");
    }
    public void bOcho(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"8");
    }
    public void bNueve(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"9");
    }
    public void bPunto(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+".");
    }


    public void OnClickOperacionCapturaNumero1(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        n1 = Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }

    //CAPTURAMOS LOS OPERADORES

    public void Sumar(View view){
        operador="+";
        OnClickOperacionCapturaNumero1(view);
    }

    public void Restar(View view){
        operador="-";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Multiplicar(View view){
        operador="*";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Dividir(View view){
        operador="/";
        OnClickOperacionCapturaNumero1(view);
    }

    //Ahora con los exponentes elevar a N

    public void Exponente(View view){
        operador="exp";
        OnClickOperacionCapturaNumero1(view);
        tvdisplay=(TextView) findViewById(R.id.tv_dis);

        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");

        }catch (NumberFormatException nfe){

        }

    }


    public void bIgual(View view){
        tvdisplay=(TextView) findViewById(R.id.tv_dis);
        n2 = Double.parseDouble(tvdisplay.getText().toString());

        if(operador.equals("+")){
            res = n1+n2;
        }
        else if (operador.equals("-")){
            res = n1-n2;
        }
        else if (operador.equals("*")){
            res = n1*n2;
        }
        else if (operador.equals("/")){
            res = n1/n2;
        }
        else if (operador.equals("exp")){
            tvdisplay = (TextView) findViewById(R.id.tv_dis);
            n2 = Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
            res = Math.pow(n1,n2);
        }

        tvdisplay.setText(""+res);
    }

    public void Rnd(View view){

        for(int x=0; x <= 100; x++){ //100 será el número máximo
           int na = (int) Math.floor(Math.random()*(100-(1+1)+(1)));

            //Yo creo que esto es fuera del for
           tvdisplay.setText(String.valueOf(na));
        }

    }

    public void Raiz(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res=Math.sqrt(n1);
            tvdisplay.setText(String.valueOf(res));

        }catch(NumberFormatException nfe){

        }

    }

    public void ExpCuadrado(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res=Math.pow(n1,2);
            tvdisplay.setText(String.valueOf(res));

        }catch (NumberFormatException nfe){

        }
    }

    public void ExpCubico(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            res=Math.pow(n1,3);
            tvdisplay.setText(String.valueOf(res));

        }catch (NumberFormatException nfe){

        }
    }

    public void Sen(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1); //variable para radianes
            res=Math.sin(rd);
            tvdisplay.setText(String.valueOf(res));

        }catch(NumberFormatException nfe){

        }
    }

    public void Cos(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1); //variable para radianes
            res=Math.cos(rd);
            tvdisplay.setText(String.valueOf(res));

        }catch(NumberFormatException nfe){

        }
    }

    public void Tan(View view){
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        try{
            n1 = Double.parseDouble(tvdisplay.getText().toString());
            double rd = Math.toRadians(n1); //variable para radianes
            res=Math.tan(rd);
            tvdisplay.setText(String.valueOf(res));

        }catch(NumberFormatException nfe){

        }
    }

    public void Factorial(View view){
        int fact = 1;
        int x;
        try{
            for(x=1; x<=n1; x++){
                fact = fact*x;
            }

            tvdisplay.setText(String.valueOf(res));

        }catch(NumberFormatException nfe){

        }

    }

    public void BorrarUltimo(View view){
        if (tvdisplay.getText().toString().equals(" ")){
            tvdisplay.setText(tvdisplay.getText().subSequence(0,tvdisplay.length()-1)+"");
        }

        else if (tvdisplay.getText().toString().equals("")){
            tvdisplay.setText("");
        }
        else
        {
            tvdisplay.setText(tvdisplay.getText().subSequence(0,tvdisplay.length()-1)+"");
        }
    }

    public void BorrarTodo(View view){
        n1=0.0;
        n2=0.0;
        tvdisplay = (TextView) findViewById(R.id.tv_dis);
        tvdisplay.setText(" ");
    }

    public void Salir(View view){
        finish();
    }


    public void irEcuacion(View view){
        Intent intent = new Intent(getApplicationContext(), EcuacionActivity.class);
        startActivity(intent);
    }


}
