package com.example.schmedake.fantasysoccer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
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

    // Create

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
