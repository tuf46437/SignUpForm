package temple.edu;

import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
public class SuccessfulSignUps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_sign_ups);
        //Intent intent = getIntent();
        //String extra = intent.getExtras().getString("usernameInput");


        Bundle main = getIntent().getExtras();

        String usernameInput = main.getString("usernameInput");



        String message =
                        "Welcome, " +  usernameInput + ", to the Sign Up Form App";
        TextView tb = (TextView) findViewById(R.id.Message);
        tb.setText(message);

    }
}
