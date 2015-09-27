package com.example.schmedake.fantasysoccer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class PlayerEditActivity extends MainActivity{

    // Create team TextView variables
    protected TextView teamNameEdit;
    protected TextView numPlayersEdit;
    protected TextView numWinsEdit;
    protected TextView numLossesEdit;
    protected TextView numDrawsEdit;

    // Create player TextView variables
    protected TextView playerNameEdit;
    protected TextView teamEdit;
    protected TextView numberEdit;
    protected TextView goalsEdit;
    protected TextView assistsEdit;
    protected TextView savesEdit;
    protected TextView positionEdit;
    protected TextView skillEdit;
    protected TextView yellowEdit;
    protected TextView redEdit;
    protected TextView tacklesEdit;

    // Create button variables
    protected Button editTeamButton2;
    protected Button addTeamButton;
    protected Button editPlayerButton;
    protected Button addPlayerButton;
    protected Button homeButton;

    // Create spinner variables
    protected Spinner teamSelector2;

    // Create scrollbar variable
    protected ScrollView playerSelector2;

    // Create imageView variables
    protected ImageView teamLogo2;
    protected ImageView playerPic2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_edit);

        //initialize all variables
        teamNameEdit = (TextView)findViewById(R.id.editTeamName);
        numPlayersEdit= (TextView)findViewById(R.id.editNumPlayers);
        numWinsEdit= (TextView)findViewById(R.id.editWins);
        numLossesEdit = (TextView)findViewById(R.id.editLosses);
        numDrawsEdit= (TextView)findViewById(R.id.editDraws);
        playerNameEdit = (TextView)findViewById(R.id.editPlayerName);
        teamEdit= (TextView)findViewById(R.id.editTeam);
        numberEdit = (TextView)findViewById(R.id.editPlayerNum);
        goalsEdit = (TextView)findViewById(R.id.editGoals);
        assistsEdit = (TextView)findViewById(R.id.editAssists);
        savesEdit = (TextView)findViewById(R.id.editSaves);
        positionEdit = (TextView)findViewById(R.id.editPosition);
        skillEdit = (TextView)findViewById(R.id.editSkill);
        yellowEdit = (TextView)findViewById(R.id.editYellows);
        redEdit = (TextView)findViewById(R.id.editReds);
        tacklesEdit = (TextView)findViewById(R.id.editTackles);
        editTeamButton2 = (Button)findViewById(R.id.editTeamButton2);
        addTeamButton = (Button)findViewById(R.id.addTeamButton);
        editPlayerButton = (Button)findViewById(R.id.editPlayerButton);
        addPlayerButton = (Button)findViewById(R.id.addPlayerButton);
        teamSelector2 = (Spinner)findViewById(R.id.teamSelector2);
        playerSelector2 = (ScrollView)findViewById(R.id.scrollPlayers);
        teamLogo2 = (ImageView)findViewById(R.id.teamLogo2);
        playerPic2 = (ImageView)findViewById(R.id.playerPic2);
    }

}
