package com.example.android.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_a_score = 0;
    int team_b_score = 0;
    int foul_a_score = 0;
    int foul_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void addThreeForTeamA (View v) {
        displayForTeamA(team_a_score = team_a_score + 3);

    }

    public void addTwoForTeamA (View v) {
        displayForTeamA(team_a_score = team_a_score + 2);

    }


    public void addThreeForTeamB (View v) {
        displayForTeamB(team_b_score = team_b_score + 3);

    }

    public void addTwoForTeamB (View v) {
        displayForTeamB(team_b_score = team_b_score + 2);

    }

    public void addSixForTeamA (View v) {
        displayForTeamA(team_a_score = team_a_score + 6);

    }

    public void addSixForTeamB (View v) {
        displayForTeamB(team_b_score = team_b_score + 6);

    }

    public void addOneForTeamA (View v) {
        displayForTeamA(team_a_score = team_a_score + 1);

    }

    public void addOneForTeamB (View v) {
        displayForTeamB(team_b_score = team_b_score + 1);

    }

    public void addFoulForTeamA (View v) {
        foulsForTeamA(foul_a_score = foul_a_score + 1);

    }

    public void addFoulForTeamB (View v) {
        foulsForTeamB(foul_b_score = foul_b_score + 1);

    }

    public void resetButton (View v) {
        team_a_score = 0;
        team_b_score = 0;
        foul_a_score = 0;
        foul_b_score = 0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
        foulsForTeamA(foul_a_score);
        foulsForTeamB(foul_b_score);
    }



    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    /**
     * Displays the given fouls for Team A.
     */
    public void foulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.foulTextView);
        scoreView.setText(String.valueOf(fouls));
    }
    /**
     * Displays the given fouls for Team B.
     */
    public void foulsForTeamB(int foulsB) {
        TextView scoreView = (TextView) findViewById(R.id.foulTextView2);
        scoreView.setText(String.valueOf(foulsB));
    }

}
