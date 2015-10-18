package viewpager.com.viewpager.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import viewpager.com.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_A extends Fragment {

    private String[] names = {"name for fragment 1" , "name for fragment 2"};
    private static ListView listView;
    public Fragment_A() {
    }

    public static Fragment_A newInstance(){
        Fragment_A fragment_a = new Fragment_A();
        return fragment_a;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_a, container, false);
        listView = (ListView) layout.findViewById(R.id.list_view);
        listView.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, names));
        return layout;
    }

     public static Object getItemData(int position){
         return listView.getItemAtPosition(position);
    }

}
