package com.example.note;

import java.util.ArrayList;
import java.util.List;



import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ListActivity {
	
	private List<Item_Object> NavItms = new ArrayList<Item_Object>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
	}
	
	public void editText(View button){
		Intent intent = new Intent(this, SecondActivity.class);
		startActivityForResult(intent, 2);
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if (RESULT_OK == resultCode){
			NavItms.add(new Item_Object(data.getStringExtra("text").toString(),
					data.getStringExtra("text2").toString(),
					data.getStringExtra("text3").toString()));ListAdapter adapter = new AdapterBase(NavItms, this);
					ListView lv = getListView();
					lv.setAdapter(adapter);
					lv.setTextFilterEnabled(true);
					
					lv.setOnItemClickListener(new OnItemClickListener(){
				        public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
				            // TODO Auto-generated method stub
				           // Toast.makeText(getApplicationContext(), "Ha pulsado el item " + position, Toast.LENGTH_SHORT).show();
				        	Intent intent = new Intent(MainActivity.this, Activity3.class);
				        	Bundle b = new Bundle();
							b.putString("tit",(NavItms.get(position).getTitulo()).toString());
							b.putString("clas",(NavItms.get(position).getClasi()).toString());
							b.putString("de",(NavItms.get(position).getDescrip()).toString());
							 //b.putString(, value)
							 intent.putExtras(b);
				            startActivity(intent);
				        }

						
				     
				    }); 
		}
		else{
			Toast.makeText(this, R.string.cancel, Toast.LENGTH_LONG).show();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
