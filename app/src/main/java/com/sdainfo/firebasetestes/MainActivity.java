package com.sdainfo.firebasetestes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference loja01 = FirebaseDatabase.getInstance().getReference();


    private EditText b, c, d, e, f, g, i, h, j;
    private String id, ap, ge, nc, nm, ob, tl, sn;
    private Modelo modelo;
    private List<Modelo> modeloList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        modelo = new Modelo();


        b = findViewById(R.id.contato);
        c = findViewById(R.id.id);
        d = findViewById(R.id.apelido);
        e = findViewById(R.id.genero);
        f = findViewById(R.id.nascimento);
        g = findViewById(R.id.nome);
        i = findViewById(R.id.obs);
        h = findViewById(R.id.telefone);
        j = findViewById(R.id.sobrenome);

    }

    public void salvar(View view) {

        loja01.child("user").child(modelo.getId());


        modelo.setApelido("kkkkk");
        modelo.setGenero("fssssss");
        modelo.setNascimento("25/04/2001");
        modelo.setNome("Mariane");
        modelo.setObs("filha");
        modelo.setFone("987656789");
        modelo.setSobrenome("Alencar");

        loja01.child("contato").child(modelo.getId()).setValue(modelo);


    }


}