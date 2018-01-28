package com.example.bom.healthtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {
    private EditText nameView;
    private EditText ageView;
    private EditText emailView;
    private EditText passwordView;
    public static final FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static final DatabaseReference myRef = database.getReference("user_info");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
     //   FirebaseDatabase database = FirebaseDatabase.getInstance();
       //DatabaseReference myRef = database.getReference("user_info");
        nameView = (EditText) findViewById(R.id.name);
        ageView = (EditText) findViewById(R.id.name);
        emailView = (EditText) findViewById(R.id.name);
        passwordView = (EditText) findViewById(R.id.name);
        Button mRegisterButton = (Button) findViewById(R.id.register_button);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

           //       User user = new User(emailView.getText().toString(), passwordView.getText().toString(), nameView.getText().toString(), Integer.parseInt(ageView.getText().toString()));
             //       myRef.child(emailView.getText().toString()).setValue(user);
                toHome();
            }
        });
    }

    private void toHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


