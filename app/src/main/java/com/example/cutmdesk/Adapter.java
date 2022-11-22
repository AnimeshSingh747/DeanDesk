package com.example.cutmdesk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    LayoutInflater inflater;
    List<StudentDataModel> songs;

    public Adapter(Context ctx, List<StudentDataModel> songs) {
        this.inflater = LayoutInflater.from(ctx);
        this.songs = songs;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.csedatalist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        // bind the data
        holder.textViewName.setText(songs.get(position).getFirstName() + " " + songs.get(position).getLastName());
        holder.textViewGender.setText(songs.get(position).getGender());
        holder.textViewBranch.setText(songs.get(position).getClass_());
        holder.textViewSem.setText(songs.get(position).getSemester());
        holder.textViewRoll.setText(songs.get(position).getRollNo());
        holder.textViewContact.setText(songs.get(position).getContactNo());


//        Picasso.get().load(songs.get(position).getCoverImage()).into(holder.songCoverImage);


    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewGender ,textViewBranch, textViewSem, textViewRoll, textViewContact;
//        ImageView songCoverImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewName);
            textViewGender = itemView.findViewById(R.id.textViewGender);
            textViewBranch = itemView.findViewById(R.id.textViewBranch);
            textViewSem = itemView.findViewById(R.id.textViewSem);
            textViewRoll = itemView.findViewById(R.id.textViewRoll);
            textViewContact = itemView.findViewById(R.id.textViewContact);

//            songArtists = itemView.findViewById(R.id.songArtist);
//            songCoverImage = itemView.findViewById(R.id.coverImage);

            // handle onClick

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Do Something With this Click", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
