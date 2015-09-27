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

public class MainActivity extends AppCompatActivity {

    // Create team TextView variables
    protected TextView teamNameField;
    protected TextView numPlayersField;
    protected TextView numWinsField;
    protected TextView numLossesField;
    protected TextView numDrawsField;

    // Create player TextView variables
    protected TextView playerNameField;
    protected TextView teamField;
    protected TextView numberField;
    protected TextView goalsField;
    protected TextView assistsField;
    protected TextView savesField;
    protected TextView positionField;
    protected TextView skillField;
    protected TextView yellowField;
    protected TextView redField;
    protected TextView tacklesField;

    // Create button variables
    protected Button editTeamButton;
    protected Button playGameButton;

    // Create spinner variables
    protected Spinner teamSelector;

    // Create scrollbar variable
    protected ScrollView playerSelector;

    // Create imageView variables
    protected ImageView teamLogo;
    protected ImageView playerPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize all variables
        teamNameField = (TextView)findViewById(R.id.teamNameField);
        numPlayersField = (TextView)findViewById(R.id.numPlayersField);
        numWinsField = (TextView)findViewById(R.id.numWinsField);
        numLossesField = (TextView)findViewById(R.id.numLossesField);
        numDrawsField= (TextView)findViewById(R.id.numDrawsField);
        playerNameField = (TextView)findViewById(R.id.NameField);
        teamField = (TextView)findViewById(R.id.TeamField);
        numberField = (TextView)findViewById(R.id.NumberField);
        goalsField = (TextView)findViewById(R.id.GoalField);
        assistsField = (TextView)findViewById(R.id.AssistField);
        savesField = (TextView)findViewById(R.id.SaveField);
        positionField = (TextView)findViewById(R.id.PositionField);
        skillField = (TextView)findViewById(R.id.SkillField);
        yellowField = (TextView)findViewById(R.id.YellowField);
        redField = (TextView)findViewById(R.id.RedField);
        tacklesField = (TextView)findViewById(R.id.TackleField);
        editTeamButton = (Button)findViewById(R.id.editTeamButton);
        playGameButton = (Button)findViewById(R.id.playButton);
        teamSelector = (Spinner)findViewById(R.id.teamSelector);
        playerSelector = (ScrollView)findViewById(R.id.playerSelect);
        teamLogo = (ImageView)findViewById(R.id.teamLogo);
        playerPic = (ImageView)findViewById(R.id.playerPic);

    }

}
