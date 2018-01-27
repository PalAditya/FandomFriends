package com.app.lenovo.fandomfriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //int flag = 1;
        EditText bio = (EditText) findViewById(R.id.Bio);
        //ImageView img=(ImageView)findViewById(R.id.FandomFollowed4);
        final ImageButton edit=(ImageButton)findViewById(R.id.imageButton);
        edit.setOnClickListener(new View.OnClickListener() {

            EditText bio = (EditText) findViewById(R.id.Bio);

            //int flag = 1;
            @Override
            public void onClick(View view){
                if(!bio.isEnabled()) {
                    bio.setEnabled(true);
                    bio.setCursorVisible(true);
                    bio.setFocusableInTouchMode(true);
                    edit.setImageResource(R.drawable.nrg);
                }
                else {
                    bio.setEnabled(false);
                    bio.setCursorVisible(false);
                    bio.setFocusableInTouchMode(false);
                    edit.setImageResource(R.drawable.sm);
                }
            }
        });
    }


}
