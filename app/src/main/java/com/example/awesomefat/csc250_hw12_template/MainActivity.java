package com.example.awesomefat.csc250_hw12_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //how Android implements MVC
        //lets this activity know which XML layout it should show
        this.setContentView(R.layout.activity_main);
    }

    private String reverse(String s)
    {
        String answer = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            answer = answer + s.charAt(i);
        }
        return answer;
    }

    //MVC expose this function to the interface builder
    public void onChangeButtonPressed(View v)
    {
        //we are in an instance CONTEXT
        //v will be the widget that calls this function upon being clicked

        //MVC - linking interface widget to local variable
        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        EditText inputET2 = (EditText)this.findViewById(R.id.inputET2);
        TextView myLabel = (TextView)this.findViewById(R.id.myLabel);
        String reverse = this.reverse(inputET.getText().toString());
        String reverse2 = this.reverse(inputET2.getText().toString());
        myLabel.setText(reverse + reverse2);
    }

}
