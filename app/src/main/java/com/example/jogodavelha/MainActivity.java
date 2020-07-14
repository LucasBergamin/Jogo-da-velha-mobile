package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editJogador1, editJogador2;
    private Button btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editJogador1 = findViewById(R.id.editJogador1);
        editJogador2 = findViewById(R.id.editJogador2);
        btnJogar = findViewById(R.id.btnComeçar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Jogador1 = editJogador1.getText().toString();
                String Jogador2 = editJogador2.getText().toString();

                if("".equals(Jogador1) || "".equals(Jogador2)){
                    Toast.makeText(getApplicationContext(), "Por favor preencha todos campos", Toast.LENGTH_SHORT).show();
                }else{
                Intent intent = new Intent(getApplicationContext(), CaraOuCoroaActivity.class);

                intent.putExtra("Jogador1", Jogador1);
                intent.putExtra("Jogador2", Jogador2);

                startActivity(intent);
                }
            }
        });

    }
}
