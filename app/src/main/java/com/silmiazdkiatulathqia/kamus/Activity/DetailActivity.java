package com.silmiazdkiatulathqia.kamus.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.silmiazdkiatulathqia.kamus.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_KATA = "ITEM_KATA";
    public static final String ITEM_TERJEMAHAN = "ITEM_TERJEMAHAN";

    @BindView(R.id.tv_kata)
    TextView tv_kata;

    @BindView(R.id.tv_terjemahan)
    TextView tv_terjemahan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

        tv_kata.setText(getIntent().getStringExtra(ITEM_KATA));
        tv_terjemahan.setText(getIntent().getStringExtra(ITEM_TERJEMAHAN));
    }
}
