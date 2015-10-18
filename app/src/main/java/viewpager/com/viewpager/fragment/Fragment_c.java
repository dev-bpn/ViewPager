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
public class Fragment_C extends Fragment {

    private TextView textView;
    public Fragment_C() {
        // Required empty public constructor
    }

    public static Fragment_C newInstance(){
        Fragment_C fragment_c = new Fragment_C();
        return fragment_c;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_c, container, false);
        textView = (TextView) layout.findViewById(R.id.text_view_fragc);
        textView.setText(Fragment_A.getItemData(2).toString());
        return layout;
    }


}
