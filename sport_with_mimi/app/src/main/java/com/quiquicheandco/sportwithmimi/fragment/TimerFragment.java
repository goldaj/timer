package com.quiquicheandco.sportwithmimi.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.quiquicheandco.sportwithmimi.R;
import org.androidannotations.annotations.EFragment;

@EFragment(R.layout.main_timer)
public class TimerFragment extends Fragment {

    //Used in the fragment view pager
    public static TimerFragment newInstance() {
        return new TimerFragment_();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}
