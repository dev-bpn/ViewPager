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
public class Fragment_E extends Fragment {

    private TextView textView;
    public Fragment_E() {
        // Required empty public constructor
    }

    public static Fragment_E newInstance(){
        Fragment_E fragment_e = new Fragment_E();
        return fragment_e;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_e, container, false);
        textView = (TextView) view.findViewById(R.id.text_view_frage);
        textView.setText(Fragment_A.getItemData(4).toString());
        return view;
    }


}
