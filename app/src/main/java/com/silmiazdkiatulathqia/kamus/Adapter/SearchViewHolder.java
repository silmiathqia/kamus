package com.silmiazdkiatulathqia.kamus.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.silmiazdkiatulathqia.kamus.Activity.DetailActivity;
import com.silmiazdkiatulathqia.kamus.Model.KamusModel;
import com.silmiazdkiatulathqia.kamus.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_kata)
    TextView tv_kata;

    @BindView(R.id.tv_terjemahan)
    TextView tv_terjemahan;

    SearchViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(final KamusModel item) {
        tv_kata.setText(item.getKata());
        tv_terjemahan.setText(item.getTerjemahan());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.ITEM_KATA, item.getKata());
                intent.putExtra(DetailActivity.ITEM_TERJEMAHAN, item.getTerjemahan());
                itemView.getContext().startActivity(intent);
            }
        });
    }
}
