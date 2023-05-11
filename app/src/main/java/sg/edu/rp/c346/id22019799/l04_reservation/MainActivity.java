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
    TextView tvBook, tvPhoneNum,tvPax,tvDate,tvTime,tvSmoke;
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
        tvPhoneNum=findViewById(R.id.textViewphonenum);
        tvPax=findViewById(R.id.textViewpax);
        tvDate=findViewById(R.id.textViewdate);
        tvTime=findViewById(R.id.textViewtime);
        tvSmoke=findViewById(R.id.textViewsmoking);
        editName=findViewById(R.id.editTextName);
        editPhoneNumber=findViewById(R.id.editTextPhoneNumber);
        editPax=findViewById(R.id.editTextPax);
        editPhoneNumber=findViewById(R.id.editTextPhoneNumber);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        radioGroup=findViewById(R.id.radioGroupSmoke);
        //radioSmoking=findViewById((R.id.radioSmoking));
        //radioNonSmoking=findViewById((R.id.radioNonSmoking));
        btnBook=findViewById(R.id.buttonBook);
        btnReset=findViewById((R.id.buttonReset));

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Name
                String name = editName.getText().toString();

                //Phone Number
                String phonenumstring = editPhoneNumber.getText().toString();
                int phonenumber = Integer.parseInt(phonenumstring);

                //Pax
                String paxstring = editPhoneNumber.getText().toString();
                int pax = Integer.parseInt(paxstring);

                //Date
                int nowYear = dp.getYear();
                int nowMonth = dp.getMonth()+1;
                int nowDay = dp.getDayOfMonth();
                //smoking ?
                int checkedRadioId = radioGroup.getCheckedRadioButtonId();
                //Time
                int nowHour = tp.getHour();
                int nowMin = tp.getMinute();
                if(nowMin<10 && checkedRadioId==R.id.radioSmoking){
                    tvBook.setText("Name: "+name);
                    tvPhoneNum.setText("Phone No. : "+phonenumber);
                    tvPax.setText("Pax: "+pax);
                    tvDate.setText("Date: "+nowDay+"/"+nowMonth+"/"+nowYear);
                    tvTime.setText("Time: "+nowHour+":0"+nowMin);
                    tvSmoke.setText("Table Type: Smoking");
                }
                else if(nowMin<10 && checkedRadioId==R.id.radioNonSmoking){
                    tvBook.setText("Name: "+name);
                    tvPhoneNum.setText("Phone No. : "+phonenumber);
                    tvPax.setText("Pax: "+pax);
                    tvDate.setText("Date: "+nowDay+"/"+nowMonth+"/"+nowYear);
                    tvTime.setText("Time: "+nowHour+":0"+nowMin);
                    tvSmoke.setText("Table Type: Non Smoking");
                }else if(nowMin>=10 && checkedRadioId==R.id.radioSmoking){
                    tvBook.setText("Name: "+name);
                    tvPhoneNum.setText("Phone No. : "+phonenumber);
                    tvPax.setText("Pax: "+pax);
                    tvDate.setText("Date: "+nowDay+"/"+nowMonth+"/"+nowYear);
                    tvTime.setText("Time: "+nowHour+":"+nowMin);
                    tvSmoke.setText("Table Type: Smoking");
                }else{
                    tvBook.setText("Name: "+name);
                    tvPhoneNum.setText("Phone No. : "+phonenumber);
                    tvPax.setText("Pax: "+pax);
                    tvDate.setText("Date: "+nowDay+"/"+nowMonth+"/"+nowYear);
                    tvTime.setText("Time: "+nowHour+":"+nowMin);
                    tvSmoke.setText("Table Type: Non Smoking");
                }
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