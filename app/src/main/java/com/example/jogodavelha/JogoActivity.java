package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class JogoActivity extends AppCompatActivity {

    private TextView textJogador1, textJogador2;
    private ImageView image00, image01, image02, image10, image11, image12, image20, image21, image22;
    private String Jogador1 = "";
    private String Jogador2 = "";
    JogoDaVelha jogoDaVelha = new JogoDaVelha();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        textJogador1 = findViewById(R.id.textJogador1);
        textJogador2 = findViewById(R.id.textJogador2);

        image00 = findViewById(R.id.image00);
        image01 = findViewById(R.id.image01);
        image02 = findViewById(R.id.image02);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image20 = findViewById(R.id.image20);
        image21 = findViewById(R.id.image21);
        image22 = findViewById(R.id.image22);

        Bundle dados = getIntent().getExtras();

        Jogador1 = dados.getString("JogadorComeça");
        Jogador2 = dados.getString("outroJogador");

        textJogador1.setText(Jogador1);
        textJogador2.setText(Jogador2);

        mensagem();

        image00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(0);
                jogoDaVelha.setSegundo(0);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image00.setImageResource(R.drawable.bolinha);
                } else {
                    image00.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(0,0);
                ganhador();
                mensagem();
                image00.setEnabled(false);
            }
        });

        image01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(0);
                jogoDaVelha.setSegundo(1);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image01.setImageResource(R.drawable.bolinha);
                } else {
                    image01.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(0, 1);
                ganhador();
                mensagem();
                image01.setEnabled(false);
        }
        });

        image02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(0);
                jogoDaVelha.setSegundo(1);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image02.setImageResource(R.drawable.bolinha);
                } else {
                    image02.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(0, 2);
                ganhador();
                mensagem();
                image02.setEnabled(false);
            }
        });

        image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(1);
                jogoDaVelha.setSegundo(0);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image10.setImageResource(R.drawable.bolinha);
                } else {
                    image10.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(1, 0);
                ganhador();
                mensagem();
                image10.setEnabled(false);
        }
        });

        image11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(1);
                jogoDaVelha.setSegundo(1);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image11.setImageResource(R.drawable.bolinha);
                } else {
                    image11.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(1, 1);
                ganhador();
                mensagem();
                image11.setEnabled(false);
        }
        });

        image12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(1);
                jogoDaVelha.setSegundo(2);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image12.setImageResource(R.drawable.bolinha);
                } else {
                    image12.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(1, 2);
                ganhador();
                mensagem();
                image12.setEnabled(false);
        }
        });

        image20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(2);
                jogoDaVelha.setSegundo(0);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image20.setImageResource(R.drawable.bolinha);
                } else {
                    image20.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(2, 0);
                ganhador();
                mensagem();
                image20.setEnabled(false);
            }
        });

        image21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(2);
                jogoDaVelha.setSegundo(1);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image21.setImageResource(R.drawable.bolinha);
                } else {
                    image21.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(2, 1);
                ganhador();
                mensagem();
                image21.setEnabled(false);
            }
        });

        image22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogoDaVelha.setPrimeiro(2);
                jogoDaVelha.setSegundo(2);
                jogoDaVelha.vez();
                if (jogoDaVelha.vez()) {
                    image22.setImageResource(R.drawable.bolinha);
                } else {
                    image22.setImageResource(R.drawable.x);
                }
                jogoDaVelha.verificar(2, 2);
                ganhador();
                mensagem();
                image22.setEnabled(false);
            }
        });
    }

    public void mensagem() {

        if (jogoDaVelha.vez()) {
            Toast.makeText(getApplicationContext(), "Vez do jogador: " + Jogador1, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Vez do jogador: " + Jogador2, Toast.LENGTH_SHORT).show();
        }
    }

    public void ganhador() {
        if (jogoDaVelha.chequando() == 0) {
            Intent intent = new Intent(getApplicationContext(), VencedorActivity.class);
            intent.putExtra("ganhador", Jogador2);
            startActivity(intent);

            finish();

        } else if (jogoDaVelha.chequando() == 1) {
            Intent intent = new Intent(getApplicationContext(), VencedorActivity.class);
            intent.putExtra("ganhador", Jogador1);
            startActivity(intent);

            finish();

        } else if(jogoDaVelha.chequando() == 2){
            Intent intent = new Intent(getApplicationContext(), VencedorActivity.class);
            intent.putExtra("ganhador", "velha");
            startActivity(intent);

            finish();
        }
    }
}




