package com.johannes2002895.mycoffeelistshop.Activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.johannes2002895.mycoffeelistshop.Config;
import com.johannes2002895.mycoffeelistshop.R;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMGPOSTER = "extra_imgposter";
    private TextView tvNama, tvDetail;
    ImageView imgPoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvNama = findViewById(R.id.tv_name);
        tvDetail = findViewById(R.id.tv_detail);
        imgPoster = findViewById(R.id.img_poster);
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String  imgPosterFile = getIntent().getStringExtra(EXTRA_IMGPOSTER);
        tvNama.setText(nama);
        tvDetail.setText(detail);
        Glide.with(DetailActivity.this)
                .load(Config.IMAGES_URL + imgPosterFile)

                .apply(new RequestOptions().placeholder(R.color.black))
                .into(imgPoster);
    }
}