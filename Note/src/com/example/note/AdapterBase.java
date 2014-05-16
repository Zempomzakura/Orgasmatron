package com.example.note;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AdapterBase extends BaseAdapter { 
	private List<Item_Object> items;
	private Context context;
	private int numItems = 0;

	public AdapterBase(final List<Item_Object> items, Context context) {
    this.items = items;
    this.context = context;
    this.numItems = items.size();
	}

	public int getCount() {
    return numItems;
	}

	public Item_Object getItem(int position) {
    return items.get(position);
	}

	public long getItemId(int position) {
    return 0;
	}
	
	public void notifyDataSetChanged()
	  {
	       super.notifyDataSetChanged();
	   }

	public View getView(int position, View convertView, ViewGroup parent) {
		
		// Get the current list item
		final Item_Object item = items.get(position);
		// Get the layout for the list item
		final LinearLayout itemLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.textview, parent, false);
		// Set the text label as defined in our list item
		TextView txtLabel = (TextView) itemLayout.findViewById(R.id.textView1);
		txtLabel.setText(item.getTitulo());

    return itemLayout;
}

}