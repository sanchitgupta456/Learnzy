package com.sanchit.Upsilon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserDataSetupActivity1 extends AppCompatActivity {

    Button nextButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_1);

        nextButton = (Button) findViewById(R.id.selectLaterNext1);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserDataSetupActivity1.this,UserDataSetupActivity2.class);
                startActivity(intent);
            }
        });
    }
}
