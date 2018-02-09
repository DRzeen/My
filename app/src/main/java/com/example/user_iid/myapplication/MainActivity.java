package com.example.user_iid.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int numberchiken = 0 ;
    int numbermeat = 0;
    TextView numberchikentxt;
    TextView numbermeattxt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         numberchikentxt   = (TextView) findViewById(R.id.textView5);
         numbermeattxt = (TextView) findViewById(R.id.textView2);



    }





    public void incrementchiken(View view){ if(numberchiken==100){
        Toast.makeText(this,"cant order more than 100 units",Toast.LENGTH_SHORT).show();
        }
        else {numberchiken++; numberchikentxt.setText(String.valueOf(numberchiken));}
    }

    public void order_button (View view){
        boolean cheez = ((CheckBox) findViewById(R.id.checkBox)).isChecked();
        boolean hotsaus = ((CheckBox) findViewById(R.id.checkBox2)).isChecked();
        EditText client_name = (EditText) findViewById(R.id.editText);
       String clientS = client_name.getEditableText().toString();
        int cheezPrice = 0;
        int hotsausprice =0;
        int orderPrice ;
        TextView order = (TextView) findViewById(R.id.textView6);
        String cheezS ;
        String hotsausS ;
        String order_summary;
        if (cheez== true){cheezS = "\n" +"add cheez to shawrma";cheezPrice=2;}
        else {cheezS = "";}
        if (hotsaus==true){hotsausS = "\n" +"add Hot Saus to shawrma";hotsausprice=1;}
        else   {hotsausS="";}
        orderPrice = (7*numberchiken)+(10*numbermeat)+((numberchiken+numbermeat)*cheezPrice)+((numberchiken+numbermeat)*hotsausprice);
        order_summary ="Name of customer  :  " + clientS + "\n" + numbermeat + "  Meat Shawrma" + "\n" + numberchiken + "   Ciken Shawrma "
                +  cheezS + hotsausS + "\n" + "price :  " + orderPrice + "$" + "\n" + "\n" ;
        order.setText(order_summary);



    }


    public void decrement_chiken(View view){  if (numberchiken == 0){
        Toast.makeText(this,"cant order less than 0 units",Toast.LENGTH_SHORT).show();

    }
    else{  numberchiken--; numberchikentxt.setText(String.valueOf(numberchiken));}}

    public void increment_meat(View view){ if(numbermeat==100){
        Toast.makeText(this,"cant order more than 100 units",Toast.LENGTH_SHORT).show();}
    else {numbermeat++; numbermeattxt.setText(String.valueOf(numbermeat));}
    }




    public void decrement_meat(View view){  if (numbermeat == 0){
        Toast.makeText(this,"cant order less than 0 units",Toast.LENGTH_SHORT).show();

    }
    else{  numbermeat--; numbermeattxt.setText(String.valueOf(numbermeat));}}





}
