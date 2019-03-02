package com.aruns.techbooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomGrid extends BaseAdapter{
    private Context context;
    private final String[] text;
    private final int[] image;
    public CustomGrid(MainActivity mainActivity, String[] text, int[] image) {
        context=mainActivity;
        this.text=text;
        this.image=image;
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View grid;
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {

            grid = new View(context);
            grid = inflater.inflate(R.layout.grid_single, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(text[position]);
            imageView.setImageResource(image[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
