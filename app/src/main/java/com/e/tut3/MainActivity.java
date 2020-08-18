package com.e.tut3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2 ;
    Button btnOk ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind the object with views

        et1 = findViewById(R.id.inputNo1);
        et2 = findViewById(R.id.inputNo2);
        btnOk = findViewById(R.id.okBtn);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //This is a toast
                Toast toast = Toast.makeText(getApplicationContext(),
                        "sending....",Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.TOP|Gravity.CENTER,0,0);

                toast.show();

                // calling the custom toast
                showImageToast();

                String n1 = et1.getText().toString();
                String n2 = et2.getText().toString();

                //explicit intent
                Intent i = new Intent(MainActivity.this,SecondActivity.class);

                //passing the values to next activity
                i.putExtra("EXTRA_1",n1);
                i.putExtra("EXTRA_2",n2);

                startActivity(i);

            }
        });
    }

    //creating a method for custom toast
    private void showImageToast(){

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the custom_toast.xml file
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(this);
        toast.setView(layout);//setting the view of custom toast layout
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }
}