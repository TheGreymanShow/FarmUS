package thegreymanshow.farmus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

        Spinner spinner;
        Button fab;
        EditText name;
        EditText state;
        EditText village;
        EditText message;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);


            name = (EditText) findViewById(R.id.field1);
            state = (EditText) findViewById(R.id.field2);
            village = (EditText) findViewById(R.id.field3);
            message = (EditText) findViewById(R.id.field4);


            fab = (Button) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    BackgroundTask backgroundTask = new BackgroundTask(Register.this);
                    backgroundTask.execute("register","",name.getText().toString(),state.getText().toString(),village.getText().toString(),message.getText().toString());
            /*name.getText().toString(),email.getText().toString(s),phone.getText().toString(),college.getText().toString(),amba.getText().toString()*/
                }
            });

        }


    }

