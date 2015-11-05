package viewpager.com.viewpager.search;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.Toolbar;

import com.quinny898.library.persistentsearch.SearchBox;
import com.quinny898.library.persistentsearch.SearchResult;

import viewpager.com.viewpager.MainActivity;
import viewpager.com.viewpager.R;

/**
 * Created by Dell on 11/5/2015.
 */
public class MyPersistentSEARCH {

    public static void openSearch(final SearchBox searchBox  , final Context context , final Toolbar toolbar) {

        String[] names = context.getResources().getStringArray(R.array.city_name);
        toolbar.setTitle("");
        searchBox.revealFromMenuItem(R.id.action_search, (Activity) context);
        for (int x = 0; x < 10; x++) {
            SearchResult option = new SearchResult(names[x], context.getResources().getDrawable(R.mipmap.ic_launcher));
            searchBox.addSearchable(option);
        }

        searchBox.setSearchListener(new SearchBox.SearchListener() {

            @Override
            public void onSearchOpened() {}

            @Override
            public void onSearchClosed() {
                closeSearch(searchBox , context , toolbar);
            }

            @Override
            public void onSearchTermChanged(String term) { }

            @Override
            public void onSearch(String searchTerm) {
                toolbar.setTitle(searchTerm);
            }

            @Override
            public void onResultClick(SearchResult result) {
                String resString = result.toString();
                onSearchItemClick(resString);
            }

            @Override
            public void onSearchCleared() { }

        });
    }

    protected static void closeSearch(SearchBox searchBox , Context context , Toolbar toolbar) {
        searchBox.hideCircularly((Activity) context);
        if(searchBox.getSearchText().isEmpty())toolbar.setTitle("");
    }

    private static void onSearchItemClick(String result){

        if(result.equals("TAB_1")){
            MainActivity.getViewPagerAtCurrentPosition(1);
        }else if(result.equals("TAB_2")){
            MainActivity.getViewPagerAtCurrentPosition(2);
        }else if(result.equals("TAB_3")){
            MainActivity.getViewPagerAtCurrentPosition(3);
        }

    }
}
