package com.example.csc250_diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private TextView qtyTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //this.oneButton = this.find(ViewById(R.id.Oneb));
        //this.qtyTV = this.find(ViewById(R.id.qtyTV));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.qtyTV = this.findViewById(R.id.qtyTV);
        this.qtyTV.setText("");
        this.currentQtyText = "";
    }

    public void diceButtonPressed(View v)
    {
        System.out.println("*****" + v.getId());
    }

    public void qtyButtonPressed(View v)
    {

        Button b = (Button)v;

        if(this.QtyText.length() == 0 && b.getText().equals("0"))
        {
            return;
        }
        this.currentQtyText += b.getText();

    }
    private void extractNumberOfSides(String diceType)
    {
        String answer = "";
        for (int i = i; i < diceType.length(); i++)
        {
            answer += diceType.charAt(i);
            {
                return answer
            }
        }

    }

    public void clearButtonPressed(View v)
    {
        this.currentQtyText = "";
        this.qtyTV.setText(this.currentQtyText);
    }
    public void qtyButtonPressed(View v)
    {
        Button B = (Button) v;
        this.qtyTV.setText(b.getText());

        if ()
        this.currentlyQtyText += b.getText();
        this.qtyTV.setText(this.CurrentQtyText);
    }

}
