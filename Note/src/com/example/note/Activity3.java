package com.example.note;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends Activity {
	   
	@Override
	   public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.tercera_actividad);
	 
	      // Capturamos los objetos gr‡ficos que vamos a usar
	      TextView text = (TextView) findViewById(R.id.textView1);
	      TextView text2 = (TextView) findViewById(R.id.textView2);
	      TextView text3 = (TextView) findViewById(R.id.textView3);
	      Button button = (Button) findViewById(R.id.boton);
	      Bundle bundle = this.getIntent().getExtras();
	      
	      text.setText(bundle.getString("tit"));
	      text2.setText(bundle.getString("clas"));
	      text3.setText(bundle.getString("de"));
	 
	      // Cambiamos el texto al bot—n
	      button.setText("Aceptar");
	 
	      // Evento onclick del bot—n, cuando se pulse, cerramos la actividad
	      
	      button.setOnClickListener(new OnClickListener() {
	         public void onClick(View v) {
	            finish();
	         }
	      });
	   }
	}