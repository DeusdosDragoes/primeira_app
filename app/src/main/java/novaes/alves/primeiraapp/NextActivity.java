package novaes.alves.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView; //Importes automaticos

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);// para setar o conteudo da caixa

        Intent i = getIntent(); //declara intenção
        String texto = i.getStringExtra("texto"); //extrai de "texto" apenas string
        TextView tvTexto = findViewById(R.id.tvTexto); //cria a caixa e a nomeia com tvTexto
        tvTexto.setText(texto); //seta a variavel a caixa de texto com o que foi digitado
    }
}