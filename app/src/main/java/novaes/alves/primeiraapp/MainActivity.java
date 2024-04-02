package novaes.alves.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Constroi os elementos de interface

        Button btnEnviar = findViewById(R.id.btnEnviar); //Obtem o botao enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etDigiteAqui=findViewById(R.id.etDigiteAqui); //Faz com que seja possivel editar a caixa de texto
                String TextoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("texto", TextoDigitado);
                startActivity(i);
            }
        });

    }
}