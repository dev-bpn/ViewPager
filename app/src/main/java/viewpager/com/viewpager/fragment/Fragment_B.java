package viewpager.com.viewpager.fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import viewpager.com.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_B extends Fragment {


    public Fragment_B() {
    }

    public static Fragment_B newInstance(){
        Fragment_B fragment_b = new Fragment_B();
        return fragment_b;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }


}
