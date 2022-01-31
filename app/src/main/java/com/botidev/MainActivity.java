package com.botidev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "Botao";

    private EditText nome,email,telefone;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editName);
        email = findViewById(R.id.editEmail);
        telefone = findViewById(R.id.editPhone);
        resultado = findViewById(R.id.resultado);
        Button botaoCadastrar = findViewById(R.id.btn_cadastrar);

         botaoCadastrar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Log.i(TAG, "onClick: clicou no botao ");
              String editNome = nome.getText().toString();
                resultado.setText(editNome);
             }
         });
    }
}