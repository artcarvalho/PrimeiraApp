package artur.renata.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); //obtem Intent que criou a tela
        String texto = i.getStringExtra("texto"); // Pega o texto que foi declarado em nossa intent

        TextView tv_txt= findViewById(R.id.tv_texto); //Cria um Objeto do tipo textview, que irá representar nossa caixa de texto
        tv_txt.setText(texto); //Modifica Nossa caixa de texto para o texto especificado

    }
}