package com.codepath.apps.DoGether.activities;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.codepath.apps.DoGether.R;
import com.codepath.apps.DoGether.TwitterClient;
import com.codepath.apps.DoGether.adapters.CommunityViewAdapter;
import com.codepath.apps.DoGether.models.CommunityView;

import java.util.ArrayList;

public class CommunityViewActivity extends ActionBarActivity {



    private ArrayList<CommunityView> userEvents;
    private CommunityViewAdapter aUserEvents;
    private ListView lvCommunityView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_view);
        setUpViews();
    }

    public void setUpViews(){
        lvCommunityView = (ListView) findViewById(R.id.lvCommunityView);
        userEvents = new ArrayList<>();
        aUserEvents = new CommunityViewAdapter(this, userEvents);
        lvCommunityView.setAdapter(aUserEvents);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_community_view, menu);
        return true;
    }

    public void onCreateEventAction(MenuItem mi){

        Intent i = new Intent(CommunityViewActivity.this, CreateEventActivity.class);
        startActivity(i);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
