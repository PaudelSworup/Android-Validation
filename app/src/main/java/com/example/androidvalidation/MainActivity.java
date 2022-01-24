package com.example.androidvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_Submit(View view){
        String name = ((EditText)findViewById(R.id.txtName)).getText().toString();
        String email = ((EditText)findViewById(R.id.txtEmail)).getText().toString().trim();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


        try {
            if(name.isEmpty()) {
                Context context = getApplicationContext();
                CharSequence text = "Name cannot be blanked";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }else if(name.length() < 3){
                Context context = getApplicationContext();
                CharSequence text = "Name must be more than 3 character";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }else if(email.isEmpty()) {
                Context context = getApplicationContext();
                CharSequence text = "Email cannot be blanked";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                return;

            }else if(!email.matches(emailPattern)){
                Context context = getApplicationContext();
                CharSequence text = "Email not valid";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                return;

            }else{

                Intent intent = new Intent(this, HomeActivity.class);
                intent.putExtra("name_is", name );
                intent.putExtra("email_is", email );
                startActivity(intent);

            }
        }catch(Exception e){}
    }
}