package sg.edu.rp.c346.id22019799.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView tvBook;
    EditText editName;
    EditText editPhoneNumber;
    EditText editPax;
    DatePicker dp;
    TimePicker tp;
    RadioGroup radioGroup;
    RadioButton radioSmoking;
    RadioButton radioNonSmoking;
    Button btnBook;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBook=findViewById(R.id.textViewDisplayIBooking);
        editName=findViewById(R.id.editTextName);
        editPhoneNumber=findViewById(R.id.editTextPhoneNumber);
        editPax=findViewById(R.id.editTextPax);
        editPhoneNumber=findViewById(R.id.editTextPhoneNumber);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        radioGroup=findViewById(R.id.radioGroupSmoke);
        radioSmoking=findViewById((R.id.radioSmoking));
        radioNonSmoking=findViewById((R.id.radioNonSmoking));
        btnBook=findViewById(R.id.buttonBook);
        btnReset=findViewById((R.id.buttonReset));

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Name
                String name = editName.getText().toString();

                //Phone Number
                String phonenumstring = editPhoneNumber.getText().toString();
                int p = Integer.parseInt(Paxstring);
            }
        });

        //Reset
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Name
                editName.setText("");
                //Phone Number
                editPhoneNumber.setText("");
                //Pax
                editPax.setText("");
                //Date
                dp.updateDate(2020,5,1);
                //Time
                tp.setHour(19);
                tp.setMinute(30);
                //Smoking ?
                radioSmoking.setChecked(false);
                radioNonSmoking.setChecked(false);


            }
        });

    }
}