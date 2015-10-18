package viewpager.com.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import it.neokree.materialtabs.MaterialTabHost;
import viewpager.com.viewpager.adapter.ViewPagerAdapter;

public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private static ViewPager viewPager;
    private MaterialTabHost materialTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeToolbar();
        initializeVariables();
        setViewPagerAdapter();
    }

    private void initializeVariables(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        materialTabHost = (MaterialTabHost) findViewById(R.id.materialTabHost);
    }

    private void setViewPagerAdapter(){
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager() , 4));
        getViewPagerAtCurrentPosition(0);
    }

    public static void getViewPagerAtCurrentPosition(int position){
        viewPager.setCurrentItem(position);
    }

    private void initializeToolbar(){
        toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(this , "Setting" , Toast.LENGTH_LONG).show();
        }else if(id == R.id.action_share){
            Toast.makeText(this , "Share" , Toast.LENGTH_LONG).show();
        }else if(id == R.id.action_refresh){
            Toast.makeText(this , "Refresh" , Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if(viewPager.getCurrentItem() == 0){
        super.onBackPressed();
        }else {
            MainActivity.getViewPagerAtCurrentPosition(0);
        }
    }
}
