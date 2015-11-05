package viewpager.com.viewpager.search;

import android.content.Context;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.widget.SearchView;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

/**
 * Created by Dell on 11/5/2015.
 */

// http://stackoverflow.com/questions/15804805/android-action-bar-searchview-as-autocomplete

public class ArrayAdapterSearchView extends SearchView {

    String[] names = {"Butwal" , "Bhairahawa" , "Lumbini" , "Pokhara" , "Dharan"};
    public static ArrayAdapter adapter;

    private SearchView.SearchAutoComplete mSearchAutoComplete;

    public ArrayAdapterSearchView(Context context) {
        super(context);
        initialize(context);
    }

    public ArrayAdapterSearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    public void initialize(final Context context) {
        mSearchAutoComplete = (SearchAutoComplete) findViewById(android.support.v7.appcompat.R.id.search_src_text);
        mSearchAutoComplete.setThreshold(0);
        adapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, names);
        this.setAdapter(adapter);
        this.setOnItemClickListener(null);
    }

    @Override
    public void setSuggestionsAdapter(CursorAdapter adapter) {
        // don't let anyone touch this
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        mSearchAutoComplete.setOnItemClickListener(listener);
    }

    public void setAdapter(ArrayAdapter<?> adapter) {
        mSearchAutoComplete.setAdapter(adapter);
    }

    public void setText(String text) {
        mSearchAutoComplete.setText(text);
    }

}