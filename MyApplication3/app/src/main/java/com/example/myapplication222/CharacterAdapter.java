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

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {
    private List<Character> characterList;

    public CharacterAdapter(List<Character> characterList) {
        this.characterList = characterList;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false); // Оставляем оригинальное название layout
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        Character character = characterList.get(position);
        holder.productNameTextView.setText(character.getName());
        holder.lconImageView.setImageResource(character.getImageResource());
        holder.imageView2.setImageResource(character.getImageResource2());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), AnotherActivity2.class);
            intent.putExtra("persona_name", character.getName());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {
        public TextView productNameTextView;
        public ImageView lconImageView;
        public ImageView imageView2;

        public CharacterViewHolder(View view) {
            super(view);
            productNameTextView = view.findViewById(R.id.productNameTextView);
            lconImageView = view.findViewById(R.id.lconImageView);
            imageView2 = view.findViewById(R.id.ImageView2);
        }
    }
}