package com.example.premiereappli;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity
{

	private Button buttonRecupNombre;
	private EditText textRecupNombre;
	private String chaine;
	private Integer nombre;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		((TextView) findViewById(R.id.textView2)).setText("Quelle est votre mise totale?");
		
		buttonRecupNombre = (Button) findViewById(R.id.button1);
		textRecupNombre = (EditText) findViewById(R.id.editText1);

		// listener sur le bouton
		buttonRecupNombre.setOnClickListener(new OnClickListener()
		{

			public void onClick(View v)
			{
				chaine = textRecupNombre.getText().toString();
				nombre = Integer.parseInt(chaine);

				// on affiche le nombre dans une petite pop-up qui s'affiche quelques secondes en bas d'ecran
				Toast.makeText(MainActivity.this, "Le nombre = " + chaine + " !", Toast.LENGTH_LONG).show();

				// affichage du nombre dans notre textView
				if (nombre < 1000){
					((TextView) findViewById(R.id.textView1)).setText("Mais tu est pauvre! Tu n'as que " + chaine + " euros !");
				}
				else {
					((TextView) findViewById(R.id.textView1)).setText("Tu iras loins! Mais essaie de ne pas perdre tes " + chaine + " euros !");
				}
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
