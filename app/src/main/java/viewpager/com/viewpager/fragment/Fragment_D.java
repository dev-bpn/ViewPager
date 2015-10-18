package viewpager.com.viewpager.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import viewpager.com.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_D extends Fragment {

    private TextView textView;
    public Fragment_D() {
        // Required empty public constructor
    }

    public static Fragment_D newInstance(){
        Fragment_D fragment_d = new Fragment_D();
        return fragment_d;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__d, container, false);
        textView = (TextView) view.findViewById(R.id.text_view_fragd);
        textView.setText(Fragment_A.getItemData(3).toString());
        return view;
    }


}
