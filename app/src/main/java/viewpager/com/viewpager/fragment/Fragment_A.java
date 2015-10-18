package viewpager.com.viewpager.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import viewpager.com.viewpager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_A extends Fragment {


    public Fragment_A() {
    }

    public static Fragment_A newInstance(){
        Fragment_A fragment_a = new Fragment_A();
        return fragment_a;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }


}
