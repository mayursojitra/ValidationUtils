package prodevelopers.validationutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import murait.validation.Validation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Validation.validateEmail(this, "mayur.sojitra55@gmailcom", Toast.LENGTH_LONG)) {

        }
    }
}
