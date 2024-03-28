package artur.renata.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_enviar = findViewById(R.id.btn_enviar);
        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et_digiteaqui = findViewById(R.id.et_digiteaqui); //seleciona a caixa de texto e a instancia em uma variavel
                String texto_digiteaqui = et_digiteaqui.getText().toString(); //Obtem o texto digitado em nossa primeira tela

                Intent i = new Intent(MainActivity.this, NextActivity.class); //declara a nossa intenção de trocar de tela

                i.putExtra("texto", texto_digiteaqui); //envia este valor junto da nossa intenção

                startActivity(i); //Inicia a ativdade

            }
        });

    }
}