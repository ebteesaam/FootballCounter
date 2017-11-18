package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        int scoreTeamA=0;
        int scoreTeamB=0;
        int scoreFaultTeamA=0;
        int scoreFaultTeamB=0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



        }

        /**
         * Displays the given score for Team A.
         */
        public void displayForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
            scoreView.setText(String.valueOf(score));
        }
        /**
         * Displays the given score for Team B.
         */
        public void displayForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
            scoreView.setText(String.valueOf(score));
        }
        /**
         * Displays the given fault for Team A.
         */
        public void displayForFTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_faultA);
            scoreView.setText(String.valueOf(score));
        }
        /**
         * Displays the given fault for Team B.
         */
        public void displayForFTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_faultB);
            scoreView.setText(String.valueOf(score));
        }
        /**
         * Displays Reset the given score .
         */
        public void Reset(View v) {
            scoreTeamA=0;
            scoreTeamB=0;
            int scoreFaultTeamA=0;
            int scoreFaultTeamB=0;
            TextView scoreViewB = (TextView) findViewById(R.id.team_a_scoreB);
            TextView scoreViewA = (TextView) findViewById(R.id.team_a_scoreA);
            TextView scoreViewFA = (TextView) findViewById(R.id.team_a_faultA);
            TextView scoreViewFB = (TextView) findViewById(R.id.team_a_faultB);
            scoreViewA.setText(String.valueOf(0));
            scoreViewB.setText(String.valueOf(0));
            scoreViewFA.setText(String.valueOf(0));
            scoreViewFB.setText(String.valueOf(0));

        }
        public void GoulA(View v){
            scoreTeamA=scoreTeamA+1;
            displayForTeamA(scoreTeamA);

        }
        public void OutA(View v){
            scoreFaultTeamA=scoreFaultTeamA+1;
            displayForFTeamA(scoreFaultTeamA);

        } public void FoulA(View v){
            scoreFaultTeamA=scoreFaultTeamA+1;
            displayForFTeamA(scoreFaultTeamA);

        }
        public void GoulB(View v){
            scoreTeamB=scoreTeamB+1;
            displayForTeamB(scoreTeamB);

        }
        public void OutB(View v){
            scoreFaultTeamB=scoreFaultTeamB+1;
            displayForFTeamB(scoreFaultTeamB);

        } public void FoulB(View v){
            scoreFaultTeamB=scoreFaultTeamB+1;
            displayForFTeamB(scoreFaultTeamB);

        }

    }