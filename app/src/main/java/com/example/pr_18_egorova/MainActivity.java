package com.example.pr_18_egorova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button btnSave;
    private Button btnLoad;
    private TextView textView;

    private String savedText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получение ссылок на элементы интерфейса
        editText = findViewById(R.id.editTextTextPersonName);
        btnSave = findViewById(R.id.btnSave);
        btnLoad = findViewById(R.id.btnLoad);
        textView = findViewById(R.id.textView);

        // Обработка нажатия кнопки "Save"
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savedText = editText.getText().toString(); // Получение текста из EditText
                Toast.makeText(MainActivity.this, "Успешно сохранено", Toast.LENGTH_SHORT).show();
            }
        });

        // Обработка нажатия кнопки "Load"
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(savedText); // Установка сохраненного текста в TextView
            }
        });
    }
}