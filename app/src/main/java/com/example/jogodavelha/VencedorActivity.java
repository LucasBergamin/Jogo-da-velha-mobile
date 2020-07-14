package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VencedorActivity extends AppCompatActivity {

    private TextView textVencedor;
    private Button buttonJogarNovamente;
    String ganhador1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vencedor);
        textVencedor = findViewById(R.id.textVencedor);
        buttonJogarNovamente = findViewById(R.id.buttonJogarNovamente);

        Bundle dados = getIntent().getExtras();

        ganhador1 = dados.getString("ganhador");

        if ("velha".equals(ganhador1)) {
            textVencedor.setText("Deu velha");
        }else {
            textVencedor.setText("O jogador " + ganhador1 + " venceu a partida");
        }

        buttonJogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
