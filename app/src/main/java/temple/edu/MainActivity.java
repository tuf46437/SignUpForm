package temple.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myButton = findViewById(R.id.messageButton);
        View.OnClickListener ocl;
        ocl = new View.OnClickListener(){

            final EditText username = (EditText)findViewById(R.id.usernameInput);
            final EditText email = (EditText)findViewById(R.id.emailInput);
            final EditText password = (EditText)findViewById(R.id.passwordInput);
            final EditText conPasswords= (EditText)findViewById(R.id.conPasswordInput);

            @Override
            public void onClick(View v) {

                if(username.length() == 0 || email.length() == 0 || password.length() == 0){
                    Toast.makeText(MainActivity.this, "Please fill in all your data", Toast.LENGTH_SHORT).show();
                }
                else if(( password.getText().toString()).equals(conPasswords.getText().toString()))
                {
                    Toast.makeText(MainActivity.this, "Your passwords match", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), SuccessfulSignUps.class);

                    //Bundle data = new Bundle();
                    //data.putString("usernameInput",username.getText().toString());

                    i.putExtra("usernameInput",  username.getText().toString());
                    startActivity(i);

                    //start new activity with details
                }
                else {
                    Toast.makeText(MainActivity.this, "Please try again the passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        };

        myButton.setOnClickListener(ocl);
    }


}
