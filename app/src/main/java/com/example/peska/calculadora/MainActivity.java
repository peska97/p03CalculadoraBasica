package com.example.peska.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView r;
    double n1,n2,res;
    String operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b0(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"0");
    }
    public void b1(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"1");
    }
    public void b2(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"2");
    }
    public void b3(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"3");
    }
    public void b4(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"4");
    }
    public void b5(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"5");
    }
    public void b6(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"6");
    }
    public void b7(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"7");
    }
    public void b8(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"8");
    }
    public void b9(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+"9");
    }
    public void bu(View view){
        r=(TextView)findViewById(R.id.tv);
        r.setText(r.getText()+".");
    }

    public void OnClickOperacionCapturaNumero1(View view){
        r=(TextView)findViewById(R.id.tv);
        n1=Double.parseDouble(r.getText().toString());
        r.setText("");
    }

    public void Sumar(View view){
        operacion="+";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Restar(View view){
        operacion="-";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Multiplicar(View view){
        operacion="*";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Dividir(View view){
        operacion="/";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Exponente(View view){
        operacion="exp";
        r=(TextView)findViewById(R.id.tv);
        try{
            n1= Double.parseDouble(r.getText().toString());
            r.setText("");
        }catch (NumberFormatException nfe) {}
    }

    public void bi(View view){
        r=(TextView)findViewById(R.id.tv);
        n2= Double.parseDouble(r.getText().toString());
        if(operacion.equals("+")){
            res=n1+n2;
        }else if(operacion.equals("-")){
            res=n1-n2;
        }else if(operacion.equals("*")){
            res=n1*n2;
        }else if(operacion.equals("/")){
            res=n1/n2;
        }else if(operacion.equals("exp")){
            r=(TextView)findViewById(R.id.tv);
            n2=Double.parseDouble(r.getText().toString());
            r.setText("");
            res=Math.pow(n1,n2);
        }
        r.setText(" "+res);
    }

    //public void BorrarUltimo(View view){
     //   if(r.getText().toString().equals(""))(
       //         r.setText(r.getText().subSequence(0,r.getText().length()-1)+"");
         //       )
   // }
    public void BorrarTodo(View view){
        n1=0.0;
        n2=0.0;
        r=(TextView)findViewById((R.id.tv));
        r.setText("");
    }




}
