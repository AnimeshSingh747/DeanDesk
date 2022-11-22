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


    ImageView soet1;
    ImageView sovet2;
    ImageView sof3;
    ImageView soas4;
    ImageView somc5;
    ImageView sop6;
    ImageView msssoa7;
    ImageView soabe8;
    ImageView som9;
    ImageView sopahs10;
    ImageView sofs11;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_school, container, false);



        soet1 = (ImageView) view.findViewById(R.id.soet1);
        sovet2 = (ImageView) view.findViewById(R.id.sovet2);
        sof3 = (ImageView) view.findViewById(R.id.sof3);
        soas4 = (ImageView) view.findViewById(R.id.soas4);
        somc5 = (ImageView) view.findViewById(R.id.somc5);
        sop6 = (ImageView) view.findViewById(R.id.sop6);
        msssoa7 = (ImageView) view.findViewById(R.id.msssoa7);
        soabe8 = (ImageView) view.findViewById(R.id.soabe8);
        som9 = (ImageView) view.findViewById(R.id.som9);
        sopahs10 = (ImageView) view.findViewById(R.id.sopahs10);
        sofs11 = (ImageView) view.findViewById(R.id.sofs11);

        soet1.setOnClickListener(this);
        sovet2.setOnClickListener(this);
        sof3.setOnClickListener(this);
        soas4.setOnClickListener(this);
        somc5.setOnClickListener(this);
        sop6.setOnClickListener(this);
        msssoa7.setOnClickListener(this);
        soabe8.setOnClickListener(this);
        som9.setOnClickListener(this);
        sopahs10.setOnClickListener(this);
        sofs11.setOnClickListener(this);


  
        

        return view;
    }

    @Override
    public void onClick(View v) {

        Intent soetIntent = new Intent(getActivity().getApplication(), soetdepartment.class);


        startActivity(soetIntent);


    }


}
