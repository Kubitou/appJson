package com.example.appjson;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela extends AppCompatActivity {

    EditText containerJson, containerLer, containerJsonGer;
    EditText edtNome, edtCll, edtEmail;

    Button btnLerJson, btnTransforma, btnLimpa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    edtNome = findViewById(R.id.inputNome);
    edtCll = findViewById(R.id.inputCell);
    edtEmail = findViewById(R.id.inputEmail);
    containerJson = findViewById(R.id.containerJson);
    containerLer = findViewById(R.id.containerLer);
    containerJsonGer = findViewById(R.id.containerJsonGerado);
    btnLerJson = findViewById(R.id.btnLerJson);
    btnTransforma = findViewById(R.id.btnGerarJson);
    btnLimpa = findViewById(R.id.btnLimpar);

    }
}