package com.android.nissen.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA, teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Team A's point incrementation
     */
    public void a3Point(View view)
    {
        teamA += 3;
        displayA(teamA);
    }

    public void a2Point(View view)
    {
        teamA += 2;
        displayA(teamA);
    }

    public void a1Point(View view)
    {
        teamA ++;
        displayA(teamA);
    }

    /**
     * Team B's point incrementation
     */
    public void b3Point(View view)
    {
        teamB += 3;
        displayB(teamB);
    }

    public void b2Point(View view)
    {
        teamB += 2;
        displayB(teamB);
    }

    public void b1Point(View view)
    {
        teamB ++;
        displayB(teamB);
    }

    /**
     * Resets the point for both teams
     */
    public void resetScore(View view)
    {
        teamA = 0;
        teamB = 0;
        displayA(teamA);
        displayB(teamB);
    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamAScore);
        quantityTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamBScore);
        quantityTextView.setText("" + number);
    }

}
