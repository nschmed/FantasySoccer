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
    protected Button saveTeamButton;
    protected Button editPlayerButton;
    protected Button addPlayerButton;
    protected Button savePlayerButton;
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

    //create current team/player variables for editing and adding
    SoccerTeam currentTeam;
    SoccerPlayer currentPlayer;

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
        saveTeamButton = (Button)findViewById(R.id.saveTeamButton);
        savePlayerButton = (Button)findViewById(R.id.savePlayerButton);
        teamSelector2 = (Spinner)findViewById(R.id.teamSelector2);
        playerSelector2 = (ScrollView)findViewById(R.id.scrollPlayers);
        teamLogo2 = (ImageView)findViewById(R.id.teamLogo2);
        playerPic2 = (ImageView)findViewById(R.id.playerPic2);

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

    //implement go home button method
    public void goHome(View view)
    {
        this.finish();
    }

    //implement all scroll bar button methods (1-24)
    public void editScroll1(View view)
    {
        SoccerPlayer player = playerButtonHash.get(geckoButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll2(View view)
    {
        SoccerPlayer player = playerButtonHash.get(snakeButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll3(View view)
    {
        SoccerPlayer player = playerButtonHash.get(catButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll4(View view)
    {
        SoccerPlayer player = playerButtonHash.get(dogButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll5(View view)
    {
        SoccerPlayer player = playerButtonHash.get(horseButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll6(View view)
    {
        SoccerPlayer player = playerButtonHash.get(elephantButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll7(View view)
    {
        SoccerPlayer player = playerButtonHash.get(phoneButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll8(View view)
    {
        SoccerPlayer player = playerButtonHash.get(printerButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll9(View view)
    {
        SoccerPlayer player = playerButtonHash.get(projectorButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll10(View view)
    {
        SoccerPlayer player = playerButtonHash.get(computerButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll11(View view)
    {
        SoccerPlayer player = playerButtonHash.get(tabletButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll12(View view)
    {
        SoccerPlayer player = playerButtonHash.get(videoGameButton2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll13(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton1_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll14(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton2_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll15(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton3_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll16(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton4_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }public void editScroll17(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton5_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll18(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton6_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }public void editScroll19(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton7_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll20(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton8_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll21(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton9_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll22(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton10_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll23(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton11_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }
    public void editScroll24(View view)
    {
        SoccerPlayer player = playerButtonHash.get(newPlayerButton12_2);
        playerNameEdit.setText(player.playerName);
        teamEdit.setText(player.team);
        numberEdit.setText(player.number+"");
        positionEdit.setText(player.position);
        skillEdit.setText(player.skill+"");
        goalsEdit.setText(player.goals+"");
        assistsEdit.setText(player.assists+"");
        yellowEdit.setText(player.yellows+"");
        redEdit.setText(player.reds+"");
        savesEdit.setText(player.saves+"");
        tacklesEdit.setText(player.tackles+"");
    }

    //set actions for edit team button click
    public void editTeamButton2Listener(View view) {

        //enable all relevant team stat editable fields
        teamNameEdit.setEnabled(true);
        numPlayersEdit.setEnabled(true);
        numWinsEdit.setEnabled(true);
        numLossesEdit.setEnabled(true);
        numDrawsEdit.setEnabled(true);

        //enable save team button
        saveTeamButton.setEnabled(true);

        //disable all buttons except save team and go home
        geckoButton2.setEnabled(false);
        snakeButton2.setEnabled(false);
        catButton2.setEnabled(false);
        dogButton2.setEnabled(false);
        horseButton2.setEnabled(false);
        elephantButton2.setEnabled(false);
        phoneButton2.setEnabled(false);
        printerButton2.setEnabled(false);
        projectorButton2.setEnabled(false);
        computerButton2.setEnabled(false);
        tabletButton2.setEnabled(false);
        videoGameButton2.setEnabled(false);
        newPlayerButton1_2.setEnabled(false);
        newPlayerButton2_2.setEnabled(false);
        newPlayerButton3_2.setEnabled(false);
        newPlayerButton4_2.setEnabled(false);
        newPlayerButton5_2.setEnabled(false);
        newPlayerButton6_2.setEnabled(false);
        newPlayerButton7_2.setEnabled(false);
        newPlayerButton8_2.setEnabled(false);
        newPlayerButton9_2.setEnabled(false);
        newPlayerButton10_2.setEnabled(false);
        newPlayerButton11_2.setEnabled(false);
        newPlayerButton12_2.setEnabled(false);
        addTeamButton.setEnabled(false);
        editTeamButton2.setEnabled(false);
        editPlayerButton.setEnabled(false);
        addPlayerButton.setEnabled(false);

        }

    //set actions for add team button click
    public void AddTeamButtonListener(View view)
    {
        //enable all relevant team stat editable fields
        teamNameEdit.setEnabled(true);
        numPlayersEdit.setEnabled(true);
        numWinsEdit.setEnabled(true);
        numLossesEdit.setEnabled(true);
        numDrawsEdit.setEnabled(true);

        //enable save team button
        saveTeamButton.setEnabled(true);

        //disable all buttons except save team and go home
        geckoButton2.setEnabled(false);
        snakeButton2.setEnabled(false);
        catButton2.setEnabled(false);
        dogButton2.setEnabled(false);
        horseButton2.setEnabled(false);
        elephantButton2.setEnabled(false);
        phoneButton2.setEnabled(false);
        printerButton2.setEnabled(false);
        projectorButton2.setEnabled(false);
        computerButton2.setEnabled(false);
        tabletButton2.setEnabled(false);
        videoGameButton2.setEnabled(false);
        newPlayerButton1_2.setEnabled(false);
        newPlayerButton2_2.setEnabled(false);
        newPlayerButton3_2.setEnabled(false);
        newPlayerButton4_2.setEnabled(false);
        newPlayerButton5_2.setEnabled(false);
        newPlayerButton6_2.setEnabled(false);
        newPlayerButton7_2.setEnabled(false);
        newPlayerButton8_2.setEnabled(false);
        newPlayerButton9_2.setEnabled(false);
        newPlayerButton10_2.setEnabled(false);
        newPlayerButton11_2.setEnabled(false);
        newPlayerButton12_2.setEnabled(false);
        addTeamButton.setEnabled(false);
        editTeamButton2.setEnabled(false);
        editPlayerButton.setEnabled(false);
        addPlayerButton.setEnabled(false);
    }

    public void saveTeamButtonListener(View view)
    {
        //disable all team stat editable fields
        teamNameEdit.setEnabled(false);
        numPlayersEdit.setEnabled(false);
        numWinsEdit.setEnabled(false);
        numLossesEdit.setEnabled(false);
        numDrawsEdit.setEnabled(false);

        //disable save team button
        saveTeamButton.setEnabled(false);

        //enable all buttons
        geckoButton2.setEnabled(true);
        snakeButton2.setEnabled(true);
        catButton2.setEnabled(true);
        dogButton2.setEnabled(true);
        horseButton2.setEnabled(true);
        elephantButton2.setEnabled(true);
        phoneButton2.setEnabled(true);
        printerButton2.setEnabled(true);
        projectorButton2.setEnabled(true);
        computerButton2.setEnabled(true);
        tabletButton2.setEnabled(true);
        videoGameButton2.setEnabled(true);
        newPlayerButton1_2.setEnabled(true);
        newPlayerButton2_2.setEnabled(true);
        newPlayerButton3_2.setEnabled(true);
        newPlayerButton4_2.setEnabled(true);
        newPlayerButton5_2.setEnabled(true);
        newPlayerButton6_2.setEnabled(true);
        newPlayerButton7_2.setEnabled(true);
        newPlayerButton8_2.setEnabled(true);
        newPlayerButton9_2.setEnabled(true);
        newPlayerButton10_2.setEnabled(true);
        newPlayerButton11_2.setEnabled(true);
        newPlayerButton12_2.setEnabled(true);
        addTeamButton.setEnabled(true);
        editTeamButton2.setEnabled(true);
        editPlayerButton.setEnabled(true);
        addPlayerButton.setEnabled(true);
    }

    //set actions for add player button click
    public void addPlayerButtonListener(View view)
    {
        //enable all relevant player stat editable fields
        playerNameEdit.setEnabled(true);
        teamEdit.setEnabled(true);
        numberEdit.setEnabled(true);
        positionEdit.setEnabled(true);
        skillEdit.setEnabled(true);
        goalsEdit.setEnabled(true);
        assistsEdit.setEnabled(true);
        yellowEdit.setEnabled(true);
        redEdit.setEnabled(true);
        savesEdit.setEnabled(true);
        tacklesEdit.setEnabled(true);

        //enable save team button
        savePlayerButton.setEnabled(true);

        //disable all buttons except save player and go home
        geckoButton2.setEnabled(false);
        snakeButton2.setEnabled(false);
        catButton2.setEnabled(false);
        dogButton2.setEnabled(false);
        horseButton2.setEnabled(false);
        elephantButton2.setEnabled(false);
        phoneButton2.setEnabled(false);
        printerButton2.setEnabled(false);
        projectorButton2.setEnabled(false);
        computerButton2.setEnabled(false);
        tabletButton2.setEnabled(false);
        videoGameButton2.setEnabled(false);
        newPlayerButton1_2.setEnabled(false);
        newPlayerButton2_2.setEnabled(false);
        newPlayerButton3_2.setEnabled(false);
        newPlayerButton4_2.setEnabled(false);
        newPlayerButton5_2.setEnabled(false);
        newPlayerButton6_2.setEnabled(false);
        newPlayerButton7_2.setEnabled(false);
        newPlayerButton8_2.setEnabled(false);
        newPlayerButton9_2.setEnabled(false);
        newPlayerButton10_2.setEnabled(false);
        newPlayerButton11_2.setEnabled(false);
        newPlayerButton12_2.setEnabled(false);
        addTeamButton.setEnabled(false);
        editTeamButton2.setEnabled(false);
        editPlayerButton.setEnabled(false);
        addPlayerButton.setEnabled(false);
    }

    //set actions for edit player button click
    public void editPlayerButtonListener(View view)
    {
        //enable all relevant player stat editable fields
        playerNameEdit.setEnabled(true);
        teamEdit.setEnabled(true);
        numberEdit.setEnabled(true);
        positionEdit.setEnabled(true);
        skillEdit.setEnabled(true);
        goalsEdit.setEnabled(true);
        assistsEdit.setEnabled(true);
        yellowEdit.setEnabled(true);
        redEdit.setEnabled(true);
        savesEdit.setEnabled(true);
        tacklesEdit.setEnabled(true);

        //enable save team button
        savePlayerButton.setEnabled(true);

        //disable all buttons except save player and go home
        geckoButton2.setEnabled(false);
        snakeButton2.setEnabled(false);
        catButton2.setEnabled(false);
        dogButton2.setEnabled(false);
        horseButton2.setEnabled(false);
        elephantButton2.setEnabled(false);
        phoneButton2.setEnabled(false);
        printerButton2.setEnabled(false);
        projectorButton2.setEnabled(false);
        computerButton2.setEnabled(false);
        tabletButton2.setEnabled(false);
        videoGameButton2.setEnabled(false);
        newPlayerButton1_2.setEnabled(false);
        newPlayerButton2_2.setEnabled(false);
        newPlayerButton3_2.setEnabled(false);
        newPlayerButton4_2.setEnabled(false);
        newPlayerButton5_2.setEnabled(false);
        newPlayerButton6_2.setEnabled(false);
        newPlayerButton7_2.setEnabled(false);
        newPlayerButton8_2.setEnabled(false);
        newPlayerButton9_2.setEnabled(false);
        newPlayerButton10_2.setEnabled(false);
        newPlayerButton11_2.setEnabled(false);
        newPlayerButton12_2.setEnabled(false);
        addTeamButton.setEnabled(false);
        editTeamButton2.setEnabled(false);
        editPlayerButton.setEnabled(false);
        addPlayerButton.setEnabled(false);
    }

    //set actions for save player button click
    public void savePlayerButtonListener(View view)
    {
        //enable all relevant player stat editable fields
        playerNameEdit.setEnabled(false);
        teamEdit.setEnabled(false);
        numberEdit.setEnabled(false);
        positionEdit.setEnabled(false);
        skillEdit.setEnabled(false);
        goalsEdit.setEnabled(false);
        assistsEdit.setEnabled(false);
        yellowEdit.setEnabled(false);
        redEdit.setEnabled(false);
        savesEdit.setEnabled(false);
        tacklesEdit.setEnabled(false);

        //disable save team button
        savePlayerButton.setEnabled(false);

        //enable all buttons
        geckoButton2.setEnabled(true);
        snakeButton2.setEnabled(true);
        catButton2.setEnabled(true);
        dogButton2.setEnabled(true);
        horseButton2.setEnabled(true);
        elephantButton2.setEnabled(true);
        phoneButton2.setEnabled(true);
        printerButton2.setEnabled(true);
        projectorButton2.setEnabled(true);
        computerButton2.setEnabled(true);
        tabletButton2.setEnabled(true);
        videoGameButton2.setEnabled(true);
        newPlayerButton1_2.setEnabled(true);
        newPlayerButton2_2.setEnabled(true);
        newPlayerButton3_2.setEnabled(true);
        newPlayerButton4_2.setEnabled(true);
        newPlayerButton5_2.setEnabled(true);
        newPlayerButton6_2.setEnabled(true);
        newPlayerButton7_2.setEnabled(true);
        newPlayerButton8_2.setEnabled(true);
        newPlayerButton9_2.setEnabled(true);
        newPlayerButton10_2.setEnabled(true);
        newPlayerButton11_2.setEnabled(true);
        newPlayerButton12_2.setEnabled(true);
        addTeamButton.setEnabled(true);
        editTeamButton2.setEnabled(true);
        editPlayerButton.setEnabled(true);
        addPlayerButton.setEnabled(true);
    }

}
