package com.example.student976.durhamguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        String[ ] attractions = {"DPAC", "DBAP", "Life and Science"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, attractions));

    } // end onCreate

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position) {
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dpacnc.com/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.milb.com/index.jsp?sid=t234")));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this,LifeAndScience.class));
                break;
        } // end switch
    } // end onList

} // end class
