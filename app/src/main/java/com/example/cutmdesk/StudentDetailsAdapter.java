package com.example.cutmdesk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class StudentDetailsAdapter extends RecyclerView.Adapter<StudentDetailsAdapter.ViewHolder>{

    private ArrayList<StudentDetailsModal> studentsdetailsModal = new ArrayList<StudentDetailsModal>();
    private Context context;


    public StudentDetailsAdapter(   Context context, ArrayList<StudentDetailsModal> studentDetailsModals){
        this.studentsdetailsModal = studentDetailsModals;
        this.context = context;
    }

    @NonNull
    @Override
    public StudentDetailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.csedatalist, parent, false);
        return new StudentDetailsAdapter.ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull StudentDetailsAdapter.ViewHolder holder, int position) {
        ViewHolder.textViewName.setText(studentsdetailsModal.get(position).getFirstName() + " " + studentsdetailsModal.get(position).getLastName());
        ViewHolder.textViewRoll.setText(studentsdetailsModal.get(position).getRollNo().toString());
        ViewHolder.textViewBranch.setText(studentsdetailsModal.get(position).getClass_());

    }

    @Override
    public int getItemCount() {
        return studentsdetailsModal.size();
    }


    public static class ViewHolder  extends RecyclerView.ViewHolder{
        public static TextView textViewRoll;
        private static TextView textViewName;
        private static TextView textViewBranch;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewRoll    = (TextView) itemView.findViewById(R.id.textViewRoll);
            textViewBranch = (TextView) itemView.findViewById(R.id.textViewBranch);
        }
    }
}
