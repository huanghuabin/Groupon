package com.tarena.groupon.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tarena.groupon.R;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class FragmentD extends BaseFragment {

    Button btnSkip;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_d,container,false);
        btnSkip = (Button) getActivity().findViewById(R.id.btn_fragment_skip);
        skip(btnSkip);
        return view;
    }
}
