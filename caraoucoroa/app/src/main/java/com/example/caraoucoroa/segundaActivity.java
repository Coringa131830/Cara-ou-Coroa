package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class segundaActivity extends AppCompatActivity {
    private ImageView imagemResultado;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        imagemResultado = findViewById(R.id.imagemResultado);
        botaoVoltar     = findViewById(R.id.botaoVoltar);

        Bundle dados = getIntent().getExtras();
        int numero   = dados.getInt("numero");

        if (numero == 0){
            imagemResultado.setImageResource(R.drawable.moeda_cara);
        }else {
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
