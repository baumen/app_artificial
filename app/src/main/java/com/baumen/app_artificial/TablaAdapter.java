package com.baumen.app_artificial;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by jjesusmonroy on 25/09/18.
 */

public class TablaAdapter extends RecyclerView.Adapter<TablaAdapter.RecyclerViewHolder> {
    String data[][];

    public TablaAdapter(String[][] data) {
        this.data = data;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tablam,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.numero1.setText(data[position][0]);
        holder.operador.setText(data[position][1]);
        holder.numero2.setText(data[position][2]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView numero1,numero2,operador;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            numero1= (TextView) itemView.findViewById(R.id.numero1);
            numero2= (TextView) itemView.findViewById(R.id.numero2);
            operador= (TextView) itemView.findViewById(R.id.operador);
        }
    }
}
