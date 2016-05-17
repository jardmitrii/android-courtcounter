package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAscore = 0;
    int teamBscore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();
        displayForTeamB();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addThreeForTeamA(View view) {
        addForTeamA(3);
    }

    public void addTwoForTeamA(View view) {
        addForTeamA(2);
    }

    public void addOneForTeamA(View view) {
        addForTeamA(1);
    }

    public void addThreeForTeamB(View view) {
        addForTeamB(3);
    }

    public void addTwoForTeamB(View view) {
        addForTeamB(2);
    }

    public void addOneForTeamB(View view) {
        addForTeamB(1);
    }

    public void resetScores(View view) {
        teamAscore = 0;
        teamBscore = 0;
        displayForTeamA();
        displayForTeamB();
    }

    public void addForTeamA(int points) {
        teamAscore += points;
        displayForTeamA();
    }

    public void addForTeamB(int points) {
        teamBscore += points;
        displayForTeamB();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAscore));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBscore));
    }
}
