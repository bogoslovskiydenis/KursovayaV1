package com.example.kursovayav1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView date;
    private TextView nameOutput, dataOut, surnameOutput;
    private EditText editName,editSurname ;

    SharedPreferences sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editSurname = findViewById(R.id.editSurname);
        date = findViewById(R.id.date);
        nameOutput = findViewById(R.id.nameOutput);
        surnameOutput = findViewById(R.id.surnameOutput);
        dataOut = findViewById(R.id.dataOut);


        //обработчик нажатия
        Button saveData = findViewById(R.id.saveData);
        saveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editName.getText().toString();
                String surname = editSurname.getText().toString();
                String data = date.getText().toString();

                nameOutput.setText(name);
                surnameOutput.setText(surname);
                dataOut.setText(data);

            }
        });

        //Время
        date.setText(
                new SimpleDateFormat("EEEE,dd MMMM yyyy HH:mm a", Locale.getDefault())
                        .format(new Date())
        );
    }
}