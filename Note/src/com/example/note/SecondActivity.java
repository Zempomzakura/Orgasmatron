package com.example.note;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class SecondActivity extends Activity
{

	private EditText 
	editText, 
	editText2,
	editText3;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		editText = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);	
		editText3 = (EditText) findViewById(R.id.editText3);	
	}

	public void save(View button){
		String text1=(editText.getText().toString());
		String text2=(editText2.getText().toString());
		String text3= (editText3.getText().toString());

		if (text1.trim().length() == 0){
			editText.setError(getText(R.string.error));
		}
		/*if (text2.trim().length() == 0){
			editText2.setError(getText(R.string.error));
			
		}
		if (text3.trim().length() == 0){
			editText3.setError(getText(R.string.error));
		}*/
		
		else{
			Intent intent = getIntent();
			intent.putExtra("text", text1);
			intent.putExtra("text2", text2);
			intent.putExtra("text3", text3);
			setResult(RESULT_OK, intent);
			finish();
		}
	}

	public void cancel(View button)
	{
		setResult(RESULT_CANCELED, new Intent());
		finish();
	}

}