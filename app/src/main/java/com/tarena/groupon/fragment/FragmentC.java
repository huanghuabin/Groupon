package com.tarena.groupon.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tarena.groupon.R;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class FragmentC extends BaseFragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_c,container,false);
        textView = (TextView) getActivity().findViewById(R.id.tv_fragment_skip);
        skip(textView);
        return view;
    }
}
