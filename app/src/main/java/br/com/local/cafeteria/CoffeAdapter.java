package br.com.local.cafeteria;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeAdapter extends RecyclerView.Adapter<CoffeAdapter.MyViewHolder> {

    private Context context;
    private List<Coffe> coffe;


    public CoffeAdapter(Context context, List<Coffe> coffe) {
        this.context = context;
        this.coffe = coffe;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.card_coffe, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.Titulo.setText(coffe.get(position).getTitulo());
        holder.Imagem.setImageResource(coffe.get(position).getImagem());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, listFragment.class);

                intent.putExtra("Titulo", coffe.get(position).getTitulo());
                intent.putExtra("Descricao",coffe.get(position).getDescricao());
                intent.putExtra("Imagem", coffe.get(position).getImagem());

                context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return coffe.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView Titulo;
        ImageView Imagem;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            Titulo = itemView.findViewById(R.id.nomecafe);
            Imagem = itemView.findViewById(R.id.cafeimg);
            cardView = itemView.findViewById(R.id.idCardView);

        }
    }
}