package prodevelopers.validationutils;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import murait.validation.Validation;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etText;
    private Button btnEmailCheck;
    private Button btnEdittext;
    private Button btnPhoneValidate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        etText = findViewById(R.id.et_text);
        btnEmailCheck = findViewById(R.id.btn_email_check);
        btnEdittext = findViewById(R.id.btn_edittext);
        btnPhoneValidate = findViewById(R.id.btn_phone_validate);
        btnEmailCheck.setOnClickListener(this);
        btnEdittext.setOnClickListener(this);
        btnPhoneValidate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_email_check:
                if (!Validation.validateEmail(etText.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Please enter valid email!!!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Email address is Valid", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_edittext:
                if (Validation.isEmptyEditText(etText)) {
                    Toast.makeText(getApplicationContext(), "EditText is Empty", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "EditText is not Empty", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_phone_validate:
                if (Validation.validatePhoneNumber(etText.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Phone Number is Valid", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Phone Number is not Valid", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
