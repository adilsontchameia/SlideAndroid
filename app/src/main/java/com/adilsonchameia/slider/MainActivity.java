package com.adilsonchameia.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setFullscreen(true);

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.fragment_intro1)
                .build()
        );
        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.fragment_intro2)
                .build()
        );

        /*
        //autoplay(4500,INFINITE);
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new SimpleSlide.Builder()
                .title("Titulo")
                .description("Descricao")
                .image(R.drawable.um)
                .background(R.color.colorPrimaryDark)
                .build());

        addSlide(new SimpleSlide.Builder()
                .title("Titulo2")
                .description("Descricao2")
                .image(R.drawable.dois)
                .background(R.color.colorPrimaryDark)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Titulo3")
                .description("Descricao3")
                .image(R.drawable.tres)
                .background(R.color.colorPrimaryDark)
                .build());
        addSlide(new SimpleSlide.Builder()
                .title("Titulo4")
                .description("Descricao4")
                .image(R.drawable.quatro)
                .background(R.color.colorPrimaryDark)
                .build());

         */
    }

}