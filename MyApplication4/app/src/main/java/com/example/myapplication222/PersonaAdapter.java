package com.example.myapplication222;

import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder> {

    private List<Persona> personaList;

    public PersonaAdapter(List<Persona> personaList) {
        this.personaList = personaList;
    }

    @NonNull
    @Override
    public PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new PersonaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaViewHolder holder, int position) {
        Persona persona = personaList.get(position);
        holder.productNameTextView.setText(persona.getName());
        holder.lconImageView.setImageResource(persona.getImageResource());
        holder.imageView2.setImageResource(persona.getImageResource2());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), AckActivity.class);
            intent.putExtra("user", new User(persona.getName(), "Компания", 25));
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return personaList.size();
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder {
        public TextView productNameTextView;
        public ImageView lconImageView;
        public ImageView imageView2;

        public PersonaViewHolder(View view) {
            super(view);
            productNameTextView = view.findViewById(R.id.productNameTextView);
            lconImageView = view.findViewById(R.id.lconImageView);
            imageView2 = view.findViewById(R.id.ImageView2);
        }
    }
}