package viewpager.com.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeToolbar();
        initializeVariables();
    }

    private void initializeVariables(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
    }

    private void initializeViewPager(){

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
}