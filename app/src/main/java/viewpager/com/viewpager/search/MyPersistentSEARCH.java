package viewpager.com.viewpager.search;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.quinny898.library.persistentsearch.SearchBox;
import com.quinny898.library.persistentsearch.SearchResult;

import viewpager.com.viewpager.R;

/**
 * Created by Dell on 11/5/2015.
 */
public class MyPersistentSEARCH {

    public static void openSearch(final SearchBox searchBox  , final Context context , final Toolbar toolbar) {

        toolbar.setTitle("");
        searchBox.revealFromMenuItem(R.id.action_search, (Activity) context);
        for (int x = 0; x < 10; x++) {
            String[] names = {"aaa" , "sss" , "ddd" , "aaa" , "sss" , "ddd" , "aaa" , "sss" , "ddd" , "aaa" , "sss" , "ddd"};
            SearchResult option = new SearchResult(names[x], context.getResources().getDrawable(
                    R.mipmap.ic_launcher));
            searchBox.addSearchable(option);
        }

        searchBox.setSearchListener(new SearchBox.SearchListener() {

            @Override
            public void onSearchOpened() {
                // Use this to tint the screen

            }

            @Override
            public void onSearchClosed() {
                // Use this to un-tint the screen
                closeSearch(searchBox , context , toolbar);
            }

            @Override
            public void onSearchTermChanged(String term) {
                // React to the search term changing
                // Called after it has updated results
            }

            @Override
            public void onSearch(String searchTerm) {
                Toast.makeText(context, searchTerm + " Searched",
                        Toast.LENGTH_LONG).show();
                toolbar.setTitle(searchTerm);

            }

            @Override
            public void onResultClick(SearchResult result) {
                //React to result being clicked
                Log.i("GGG" , result.toString());
            }

            @Override
            public void onSearchCleared() {

            }

        });

    }

    protected static void closeSearch(SearchBox searchBox , Context context , Toolbar toolbar) {
        searchBox.hideCircularly((Activity) context);
        if(searchBox.getSearchText().isEmpty())toolbar.setTitle("");
    }

}
