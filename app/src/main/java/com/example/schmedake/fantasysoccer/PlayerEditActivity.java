package com.example.schmedake.fantasysoccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Hashtable;

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

    // Create buttons inside scrollBar
    Button geckoButton2;
    Button snakeButton2;
    Button catButton2;
    Button dogButton2;
    Button horseButton2;
    Button elephantButton2;
    Button phoneButton2;
    Button projectorButton2;
    Button computerButton2;
    Button printerButton2;
    Button tabletButton2;
    Button videoGameButton2;
    Button newPlayerButton1_2;
    Button newPlayerButton2_2;
    Button newPlayerButton3_2;
    Button newPlayerButton4_2;
    Button newPlayerButton5_2;
    Button newPlayerButton6_2;
    Button newPlayerButton7_2;
    Button newPlayerButton8_2;
    Button newPlayerButton9_2;
    Button newPlayerButton10_2;
    Button newPlayerButton11_2;
    Button newPlayerButton12_2;

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
        homeButton = (Button)findViewById(R.id.homeButton);
        teamSelector2 = (Spinner)findViewById(R.id.teamSelector2);
        playerSelector2 = (ScrollView)findViewById(R.id.scrollPlayers);
        teamLogo2 = (ImageView)findViewById(R.id.teamLogo2);
        playerPic2 = (ImageView)findViewById(R.id.playerPic2);

        //create listeners for buttons
        editTeamButton2.setOnClickListener(new editTeamButton2Listener());
        addTeamButton.setOnClickListener(new addTeamButtonListener());
        addPlayerButton.setOnClickListener(new addPlayerButtonListener());
        editPlayerButton.setOnClickListener(new editPlayerButtonListener());

        //create all scrollbar buttons and set them as necessary, starting with hard coded buttons
        geckoButton2 = (Button)findViewById(R.id.button);
        playerButtonHash.put(geckoButton2, playerButtonHash.get(geckoButton));
        geckoButton2.setText(playerButtonHash.get(geckoButton2).playerName);
        geckoButton2.setBackgroundColor(0xFF00FF00);
        geckoButton2.setEnabled(true);
        snakeButton2 = (Button)findViewById(R.id.button2);
        playerButtonHash.put(snakeButton2, playerButtonHash.get(snakeButton));
        snakeButton2.setText(playerButtonHash.get(snakeButton2).playerName);
        snakeButton2.setBackgroundColor(0xFF00FF00);
        snakeButton2.setEnabled(true);
        catButton2 = (Button)findViewById(R.id.button3);
        playerButtonHash.put(catButton2, playerButtonHash.get(catButton));
        catButton2.setText(playerButtonHash.get(catButton2).playerName);
        catButton2.setBackgroundColor(0xFF00FF00);
        catButton2.setEnabled(true);
        dogButton2 = (Button)findViewById(R.id.button4);
        playerButtonHash.put(dogButton2, playerButtonHash.get(dogButton));
        dogButton2.setText(playerButtonHash.get(dogButton2).playerName);
        dogButton2.setBackgroundColor(0xFF00FF00);
        dogButton2.setEnabled(true);
        horseButton2 = (Button)findViewById(R.id.button5);
        playerButtonHash.put(horseButton2, playerButtonHash.get(horseButton));
        horseButton2.setText(playerButtonHash.get(horseButton2).playerName);
        horseButton2.setBackgroundColor(0xFF00FF00);
        horseButton2.setEnabled(true);
        elephantButton2 = (Button)findViewById(R.id.button6);
        playerButtonHash.put(elephantButton2, playerButtonHash.get(elephantButton));
        elephantButton2.setText(playerButtonHash.get(elephantButton2).playerName);
        elephantButton2.setBackgroundColor(0xFF00FF00);
        elephantButton2.setEnabled(true);
        phoneButton2 = (Button)findViewById(R.id.button7);
        playerButtonHash.put(phoneButton2, playerButtonHash.get(phoneButton));
        phoneButton2.setText(playerButtonHash.get(phoneButton2).playerName);
        phoneButton2.setBackgroundColor(0xFF00FF00);
        phoneButton2.setEnabled(true);
        printerButton2 = (Button)findViewById(R.id.button8);
        playerButtonHash.put(printerButton2, playerButtonHash.get(printerButton));
        printerButton2.setText(playerButtonHash.get(printerButton2).playerName);
        printerButton2.setBackgroundColor(0xFF00FF00);
        printerButton2.setEnabled(true);
        projectorButton2 = (Button)findViewById(R.id.button9);
        playerButtonHash.put(projectorButton2, playerButtonHash.get(projectorButton));
        projectorButton2.setText(playerButtonHash.get(projectorButton2).playerName);
        projectorButton2.setBackgroundColor(0xFF00FF00);
        projectorButton2.setEnabled(true);
        computerButton2 = (Button)findViewById(R.id.button10);
        playerButtonHash.put(computerButton2, playerButtonHash.get(computerButton));
        computerButton2.setText(playerButtonHash.get(computerButton2).playerName);
        computerButton2.setBackgroundColor(0xFF00FF00);
        computerButton2.setEnabled(true);
        tabletButton2 = (Button)findViewById(R.id.button11);
        playerButtonHash.put(tabletButton2, playerButtonHash.get(tabletButton));
        tabletButton2.setText(playerButtonHash.get(tabletButton2).playerName);
        tabletButton2.setBackgroundColor(0xFF00FF00);
        tabletButton2.setEnabled(true);
        videoGameButton2 = (Button)findViewById(R.id.button12);
        playerButtonHash.put(videoGameButton2, playerButtonHash.get(videoGameButton));
        videoGameButton2.setText(playerButtonHash.get(videoGameButton2).playerName);
        videoGameButton2.setBackgroundColor(0xFF00FF00);
        videoGameButton2.setEnabled(true);

        //now set variable buttons that are changed after players are made
        Button newPlayerButton1_2 = (Button)findViewById(R.id.button13);
        Button newPlayerButton2_2 = (Button)findViewById(R.id.button14);
        Button newPlayerButton3_2 = (Button)findViewById(R.id.button15);
        Button newPlayerButton4_2 = (Button)findViewById(R.id.button16);
        Button newPlayerButton5_2 = (Button)findViewById(R.id.button17);
        Button newPlayerButton6_2 = (Button)findViewById(R.id.button18);
        Button newPlayerButton7_2 = (Button)findViewById(R.id.button19);
        Button newPlayerButton8_2 = (Button)findViewById(R.id.button20);
        Button newPlayerButton9_2 = (Button)findViewById(R.id.button21);
        Button newPlayerButton10_2 = (Button)findViewById(R.id.button22);
        Button newPlayerButton11_2 = (Button)findViewById(R.id.button23);
        Button newPlayerButton12_2 = (Button)findViewById(R.id.button24);

        //if the main activity button has not been utilized, the edit activity will not
        //be utilized either
        if(newPlayerButton1.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton1_2.setEnabled(true);
            newPlayerButton1_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton1_2, playerButtonHash.get(newPlayerButton1));
            newPlayerButton1_2.setText(playerButtonHash.get(newPlayerButton1_2).playerName);
        }
        if(newPlayerButton2.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton2_2.setEnabled(true);
            newPlayerButton2_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton2_2,playerButtonHash.get(newPlayerButton2));
            newPlayerButton2_2.setText(playerButtonHash.get(newPlayerButton2_2).playerName);
        }
        if(newPlayerButton3.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton3_2.setEnabled(true);
            newPlayerButton3_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton3_2,playerButtonHash.get(newPlayerButton3));
            newPlayerButton3_2.setText(playerButtonHash.get(newPlayerButton3_2).playerName);
        }
        if(newPlayerButton4.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton4_2.setEnabled(true);
            newPlayerButton4_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton4_2,playerButtonHash.get(newPlayerButton4));
            newPlayerButton4_2.setText(playerButtonHash.get(newPlayerButton4_2).playerName);
        }
        if(newPlayerButton5.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton5_2.setEnabled(true);
            newPlayerButton5_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton5_2,playerButtonHash.get(newPlayerButton5));
            newPlayerButton5_2.setText(playerButtonHash.get(newPlayerButton5_2).playerName);
        }
        if(newPlayerButton6.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton6_2.setEnabled(true);
            newPlayerButton6_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton6_2,playerButtonHash.get(newPlayerButton6));
            newPlayerButton6_2.setText(playerButtonHash.get(newPlayerButton6_2).playerName);
        }
        if(newPlayerButton7.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton7_2.setEnabled(true);
            newPlayerButton7_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton7_2,playerButtonHash.get(newPlayerButton7));
            newPlayerButton7_2.setText(playerButtonHash.get(newPlayerButton7_2).playerName);
        }
        if(newPlayerButton8.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton8_2.setEnabled(true);
            newPlayerButton8_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton8_2,playerButtonHash.get(newPlayerButton8));
            newPlayerButton8_2.setText(playerButtonHash.get(newPlayerButton8_2).playerName);
        }
        if(newPlayerButton9.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton9_2.setEnabled(true);
            newPlayerButton9_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton9_2,playerButtonHash.get(newPlayerButton9));
            newPlayerButton9_2.setText(playerButtonHash.get(newPlayerButton9_2).playerName);
        }
        if(newPlayerButton10.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton10_2.setEnabled(true);
            newPlayerButton10_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton10_2,playerButtonHash.get(newPlayerButton10));
            newPlayerButton10_2.setText(playerButtonHash.get(newPlayerButton10_2).playerName);
        }
        if(newPlayerButton11.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton11_2.setEnabled(true);
            newPlayerButton11_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton11_2,playerButtonHash.get(newPlayerButton11));
            newPlayerButton11_2.setText(playerButtonHash.get(newPlayerButton11_2).playerName);
        }
        if(newPlayerButton12.getText().equals("Please Add New Player") == false)
        {
            newPlayerButton12_2.setEnabled(true);
            newPlayerButton12_2.setBackgroundColor(0xFF00FF00);
            playerButtonHash.put(newPlayerButton12_2,playerButtonHash.get(newPlayerButton12));
            newPlayerButton12_2.setText(playerButtonHash.get(newPlayerButton12_2).playerName);
        }



    }

    public void goHome(View view)
    {
        this.finish();
    }

    private class editTeamButton2Listener implements View.OnClickListener {
        public void onClick(View view)
        {

        }
    }

    private class addTeamButtonListener implements View.OnClickListener {
        public void onClick(View view)
        {

        }
    }

    private class addPlayerButtonListener implements View.OnClickListener {
        public void onClick(View view)
        {

        }
    }

    private class editPlayerButtonListener implements View.OnClickListener {
        public void onClick(View view)
        {

        }
    }

}
