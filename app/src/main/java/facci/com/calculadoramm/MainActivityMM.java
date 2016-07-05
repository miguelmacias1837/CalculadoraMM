package facci.com.calculadoramm;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityMM extends AppCompatActivity implements OnClickListener {
      boolean suma = false;
      boolean resta = false;
      boolean mul= false;
    Double[]  numero= new Double[20];
    Double  resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_mm);
        

        Button acerca = (Button) findViewById(R.id.buttonA);
        acerca.setOnClickListener(this);
        Button n0 = (Button) findViewById(R.id.button0);
        n0.setOnClickListener(this);
        Button igual = (Button) findViewById(R.id.buttoni);
        igual.setOnClickListener(this);
        Button n1 = (Button) findViewById(R.id.button1);
        n1.setOnClickListener(this);
        Button n2 = (Button) findViewById(R.id.button2);
        n2.setOnClickListener(this);
        Button n3 = (Button) findViewById(R.id.button3);
        n3.setOnClickListener(this);
        Button mas = (Button) findViewById(R.id.buttonm);
        mas.setOnClickListener(this);
        Button n4 = (Button) findViewById(R.id.button4);
        n4.setOnClickListener(this);
        Button n5 = (Button) findViewById(R.id.button5);
        n5.setOnClickListener(this);
        Button n6 = (Button) findViewById(R.id.button6);
        n6.setOnClickListener(this);
        Button menos = (Button) findViewById(R.id.buttonme);
        menos.setOnClickListener(this);
        Button n7 = (Button) findViewById(R.id.button7);
        n7.setOnClickListener(this);
        Button n8 = (Button) findViewById(R.id.button8);
        n8.setOnClickListener(this);
        Button n9 = (Button) findViewById(R.id.button9);
        n9.setOnClickListener(this);
        Button por = (Button) findViewById(R.id.buttonpo);
        por.setOnClickListener(this);
        findViewById(R.id.buttonA).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityMM.this, MainActivity2.class));
            }
        });
    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();

          switch (seleccion) {
              case R.id.buttonA:
               pantalla.setText("");
                  break;
              case R.id.button0:
                  pantalla.setText(a+"0");
                  break;
              case R.id.buttoni:
                  numero[1] = Double.parseDouble(a);
                  if (suma == true){
                      resultado= numero[0] + numero[1];
                      pantalla.setText(String.valueOf(resultado));

                  }else if (resta == true){
                      resultado= numero[0] - numero[1];
                      pantalla.setText(String.valueOf(resultado));

                  }else if (mul == true){
                      resultado= numero[0] * numero[1];
                      pantalla.setText(String.valueOf(resultado));

                  }

                  break;
              case R.id.button1:
                  pantalla.setText(a+"1");
                  break;
              case R.id.button2:
                  pantalla.setText(a+"2");
                  break;
              case R.id.button3:
                  pantalla.setText(a+"3");
                  break;
              case R.id.buttonm:
                  suma=true;
                  numero[0] = Double.parseDouble(a);
                  pantalla.setText("");
                  break;
              case R.id.button4:
                  pantalla.setText(a+"4");
                  break;
              case R.id.button5:
                  pantalla.setText(a+"5");
                  break;
              case R.id.button6:
                  pantalla.setText(a+"6");
                  break;
              case R.id.buttonme:
                  resta=true;
                  numero[0] = Double.parseDouble(a);
                  pantalla.setText("");
                  break;
              case R.id.button7:
                  pantalla.setText(a+"7");
                  break;
              case R.id.button8:
                  pantalla.setText(a+"8");
                  break;
              case R.id.button9:
                  pantalla.setText(a+"9");
                  break;
              case R.id.buttonpo:
                  mul=true;
                  numero[0] = Double.parseDouble(a);
                  pantalla.setText("");
                  break;


      }
      }
    }

