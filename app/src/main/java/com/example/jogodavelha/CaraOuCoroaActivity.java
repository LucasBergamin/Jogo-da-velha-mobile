package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CaraOuCoroaActivity extends AppCompatActivity {

    private ImageView imageComeca;
    private TextView textJogador;
    private Button btnComeçarPartida;

    String jogadorComeca = "";
    String outroJogador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_ou_coroa);

        imageComeca = findViewById(R.id.imageComeca);
        textJogador = findViewById(R.id.textJogador);
        btnComeçarPartida = findViewById(R.id.btnComeçarPartida);

        int comeca = new Random().nextInt(2);

        Bundle dados = getIntent().getExtras();

        String jogador1 = dados.getString("Jogador1");
        String jogador2 = dados.getString("Jogador2");

        if(comeca == 0){
            imageComeca.setImageResource(R.drawable.cara2);
            textJogador.setText("Jogador " + jogador1 + " começa jogando");
            jogadorComeca = jogador1;
            outroJogador = jogador2;
        }
        else{
            imageComeca.setImageResource(R.drawable.coroa2);
            textJogador.setText("Jogador " + jogador2 + " começa jogando");
            jogadorComeca = jogador2;
            outroJogador = jogador1;
        }

        btnComeçarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), JogoActivity.class);

                intent.putExtra("JogadorComeça", jogadorComeca);
                intent.putExtra("outroJogador", outroJogador);

                startActivity(intent);
                finish();
            }
        });


    }
}
