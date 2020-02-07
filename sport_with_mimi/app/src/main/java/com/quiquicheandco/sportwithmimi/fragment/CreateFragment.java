package com.quiquicheandco.sportwithmimi.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.quiquicheandco.sportwithmimi.R;
import org.androidannotations.annotations.EFragment;

@EFragment(R.layout.create_seance)
public class CreateFragment extends Fragment {

    public static CreateFragment newInstance() {
        return new CreateFragment_();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
