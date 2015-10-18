package viewpager.com.viewpager.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import viewpager.com.viewpager.MainActivity;
import viewpager.com.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_A extends Fragment {

    private String[] names = {"name for fragment 1" , "name for fragment 2" , "name for fragment 3" , "name for fragment 4" , "name for fragment 5"};
    private static ListView listView;
    public Fragment_A() {
    }

    public static Fragment_A newInstance(){
        Fragment_A fragment_a = new Fragment_A();
        return fragment_a;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_a, container, false);
        listView = (ListView) layout.findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, names));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        MainActivity.getViewPagerAtCurrentPosition(1);
                        break;
                    case 1:
                        MainActivity.getViewPagerAtCurrentPosition(2);
                        break;
                    case 2:
                        MainActivity.getViewPagerAtCurrentPosition(3);
                        break;
                    case 3:
                        MainActivity.getViewPagerAtCurrentPosition(4);
                        break;
                }
            }
        });
        return layout;
    }

     public static Object getItemData(int position){
         return listView.getItemAtPosition(position);
    }

}
