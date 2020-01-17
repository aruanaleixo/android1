package com.example.cadastrosala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputNome;
    private EditText inputEmail;
    private EditText inputEnd;
    private EditText inputFone;
    private Button  botaoEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNome = findViewById(R.id.nome_id);
        inputEmail = findViewById(R.id.email_id);
        inputEnd = findViewById(R.id.end_id);
        inputFone = findViewById(R.id.telefone_id);
        botaoEnviar = findViewById((R.id.botao_eviar));

        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = inputNome.getText().toString();
                String end = inputEnd.getText().toString();
                String fone = inputFone.getText().toString();
                String email = inputEmail.getText().toString();



            }


            private void validarCampos(String nome, String end, String fone, String email) {
                if (nome.isEmpty() || (end.isEmpty()) || email.isEmpty() || fone.isEmpty()) {
                    Toast.makeText(this, "Todos os campos devem ser preenchidos", Toast.LENGTH_LONG ).show();
                }else {
                    Toast.makeText(this, "Prossiga", Toast.LENGTH_LONG).show();
                }
            }

        });






        }



    }
}
