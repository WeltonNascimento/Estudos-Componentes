package com.cursoandroid.componentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    //nome Email
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    //CheckBox

    private CheckBox checkVerde;
    private CheckBox checkRosa;
    private CheckBox checkAmarelo;
    private TextView cores;

    //RadioButton

    private RadioButton masculino;
    private RadioButton feminino;
    private RadioButton outros;
    private TextView sexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);

        campoEmail = findViewById(R.id.email);

        textoResultado = findViewById(R.id.result);


        //CheckBox

        cores = findViewById(R.id.cores);

        checkVerde = findViewById(R.id.checkVerde);

        checkAmarelo = findViewById(R.id.checkAmarelo);

        checkRosa = findViewById(R.id.checkRosa);

        //Radio Button

        masculino = findViewById(R.id.radioM);

        feminino = findViewById(R.id.radioF);

        outros = findViewById(R.id.radioOutro);

        sexo = findViewById(R.id.sexo);


    }


    public void checkbox() {
        String texto1 = "";

        if (checkVerde.isChecked()) {

            texto1 = " Verde\n";


        }
        cores.setText("Cor selecionada foi:" + texto1);

        if (checkRosa.isChecked()) {
            texto1 = texto1 + " Rosa\n";

        }
        cores.setText("Cor selecionada foi:"+texto1);


        if (checkAmarelo.isChecked()) {
            texto1 = texto1 + " Amarelho\n";

        }
        cores.setText("Cor selecionada foi:"+texto1);


    }

    public void radioButton() {

        String texto2 = "";

        if (masculino.isChecked()) {
            texto2 = "Sexo Selecionado:  Masculino";


        } else if (feminino.isChecked()) {
            texto2 = "Sexo Selecionado:  Feminino";


        } else if (outros.isChecked()) {
            texto2 = "Sexo Selecionado: Outros";
        }
        sexo.setText(texto2);
    }

    public void enviar(View view) {


        String email =  campoEmail.getText().toString() + "\n";

        String nome =   campoNome.getText().toString()+ "\n";

        textoResultado.setText(nome + "\n" + email);

        checkbox();

        radioButton();

    }

    public void clean(View view) {


        campoNome.setText("");
        campoEmail.setText("");
        textoResultado.setText("");
        cores.setText("");
        sexo.setText("");

    }
}



