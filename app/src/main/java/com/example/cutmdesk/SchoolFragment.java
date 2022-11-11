package com.example.cutmdesk;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SchoolFragment extends Fragment implements View.OnClickListener {


    ImageView SOET1;
    ImageView SOEVT2;
    ImageView SOF3;
    ImageView SOAS4;
    ImageView SOMC5;
    ImageView SOP6;
    ImageView MSSSOA7;
    ImageView SOABE8;
    ImageView SOM9;
    ImageView SOPAHS10;
    ImageView SOFS11;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_school, container, false);
        SOET1 = (ImageView) view.findViewById(R.id.SOET1);
        SOEVT2 = (ImageView) view.findViewById(R.id.SoVET2);
        SOF3 = (ImageView) view.findViewById(R.id.SOF3);
        SOAS4 = (ImageView) view.findViewById(R.id.SOAS4);
        SOMC5 = (ImageView) view.findViewById(R.id.SOMC5);
        SOP6 = (ImageView) view.findViewById(R.id.SOP6);
        MSSSOA7 = (ImageView) view.findViewById(R.id.MSSSOA7);
        SOABE8 = (ImageView) view.findViewById(R.id.SOABE8);
        SOM9 = (ImageView) view.findViewById(R.id.SOM9);
        SOPAHS10 = (ImageView) view.findViewById(R.id.SOPAHS10);
        SOFS11 = (ImageView) view.findViewById(R.id.SOFS11);

        SOET1.setOnClickListener(this);
        SOEVT2.setOnClickListener(this);
        SOF3.setOnClickListener(this);
        SOAS4.setOnClickListener(this);
        SOMC5.setOnClickListener(this);
        SOP6.setOnClickListener(this);
        MSSSOA7.setOnClickListener(this);
        SOABE8.setOnClickListener(this);
        SOM9.setOnClickListener(this);
        SOPAHS10.setOnClickListener(this);
        SOF3.setOnClickListener(this);
        
        return view;
    }

    @Override
    public void onClick(View v) {

        Intent soetIntent = new Intent(getActivity().getApplication(), soetdepartment.class);
        Intent soevtIntent = new Intent(getActivity().getApplication(), soetdepartment.class);

        startActivity(soetIntent);
        startActivity(soevtIntent);

    }

}
