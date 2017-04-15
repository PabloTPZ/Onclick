package com.example.pablo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.txtRes);

        //llamando al metodo setOnclick
        //se tiene q instanciar el boton//
        Button button=(Button) findViewById(R.id.btnClick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Me diste Click desde el OnclickListener");
            }
        });

        //instanaciando un view para llamar al id del boton
        View boton=(View) findViewById(R.id.btnImp);
        boton.setOnClickListener(this);
    }
    public void dameClick(View view){
        textView.setText("Me diste Click desde el onclick de xml");
    }

    //este metodo se implementa con view.onclickListener
    //necesitamos darles id's
    @Override
    public void onClick(View v) {
        if (v.getId()==findViewById(R.id.btnImp).getId()){
            textView.setText("Me diste click desde la implementacion View.OnClickListener ");
        }
    }
}
