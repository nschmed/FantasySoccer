package com.example.schmedake.fantasysoccer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Printer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Hashtable;

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

    // Create buttons inside scrollBar
    Button geckoButton;
    Button snakeButton;
    Button catButton;
    Button dogButton;
    Button horseButton;
    Button elephantButton;
    Button phoneButton;
    Button projectorButton;
    Button computerButton;
    Button printerButton;
    Button tabletButton;
    Button videoGameButton;


    // Create imageView variables
    protected ImageView teamLogo;
    protected ImageView playerPic;

    protected String allTeamString;
    protected ArrayList<String> teamList;
    protected ArrayAdapter<String> teamListAdapter;

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

        // Create teams and place them in ArrayList and HashTable
        Hashtable<String,SoccerTeam> teamTable= new Hashtable<String,SoccerTeam>();
        allTeamString = "SELECT TEAM: All Teams";
        teamList = new ArrayList<String>();
        teamList.add(allTeamString);
        teamList.add("Animals");
        teamList.add("Electronics");

        // Create all current soccer players
        SoccerPlayer Gecko = new SoccerPlayer();
        SoccerPlayer Snake = new SoccerPlayer();
        SoccerPlayer Dog = new SoccerPlayer();
        SoccerPlayer Cat = new SoccerPlayer();
        SoccerPlayer Horse = new SoccerPlayer();
        SoccerPlayer Elephant = new SoccerPlayer();
        SoccerPlayer Phone = new SoccerPlayer();
        SoccerPlayer Computer = new SoccerPlayer();
        SoccerPlayer Tablet = new SoccerPlayer();
        SoccerPlayer VideoGame = new SoccerPlayer();
        SoccerPlayer Projector = new SoccerPlayer();
        SoccerPlayer Printer = new SoccerPlayer();

        //Update stats of all soccer players
        Gecko.goals = 5;
        Gecko.assists = 6;
        Gecko.number = 17;
        Gecko.saves = 0;
        Gecko.playerName = "Gecko";
        Gecko.skill = 94;
        Gecko.position = "Forward";
        Gecko.tackles = 2;
        Gecko.team = "Animals";
        Gecko.reds = 0;
        Gecko.yellows = 2;

        Snake.goals = 1;
        Snake.assists = 8;
        Snake.number = 1;
        Snake.saves = 1;
        Snake.playerName = "Snake";
        Snake.skill = 82;
        Snake.position = "Midfielder";
        Snake.tackles = 8;
        Snake.team = "Animals";
        Snake.reds = 1;
        Snake.yellows = 4;

        Dog.goals = 4;
        Dog.assists = 2;
        Dog.number = 2;
        Dog.saves = 0;
        Dog.playerName = "Dog";
        Dog.skill = 87;
        Dog.position = "Midfielder";
        Dog.tackles = 2;
        Dog.team = "Animals";
        Dog.reds = 0;
        Dog.yellows = 1;

        Cat.goals = 1;
        Cat.assists = 2;
        Cat.number = 3;
        Cat.saves = 2;
        Cat.playerName = "Cat";
        Cat.skill = 71;
        Cat.position = "Defender";
        Cat.tackles = 10;
        Cat.team = "Animals";
        Cat.reds = 2;
        Cat.yellows = 2;

        Horse.goals = 0;
        Horse.assists = 1;
        Horse.number = 4;
        Horse.saves = 3;
        Horse.playerName = "Horse";
        Horse.skill = 68;
        Horse.position = "Defender";
        Horse.tackles = 14;
        Horse.team = "Animals";
        Horse.reds = 1;
        Horse.yellows = 5;

        Elephant.goals = 0;
        Elephant.assists = 0;
        Elephant.number = 0;
        Elephant.saves = 21;
        Elephant.playerName = "Elephant";
        Elephant.skill = 80;
        Elephant.position = "Goalkeeper";
        Elephant.tackles = 4;
        Elephant.team = "Animals";
        Elephant.reds = 0;
        Elephant.yellows = 1;

        Phone.goals = 4;
        Phone.assists = 2;
        Phone.number = 10;
        Phone.saves = 0;
        Phone.playerName = "Phone";
        Phone.skill = 75;
        Phone.position = "Forward";
        Phone.tackles = 1;
        Phone.team = "Electronics";
        Phone.reds = 1;
        Phone.yellows = 2;

        Computer.goals = 6;
        Computer.assists = 2;
        Computer.number = 1;
        Computer.saves = 0;
        Computer.playerName = "Computer";
        Computer.skill = 89;
        Computer.position = "Midfielder";
        Computer.tackles = 8;
        Computer.team = "Electronics";
        Computer.reds = 0;
        Computer.yellows = 4;

        Tablet.goals = 2;
        Tablet.assists = 2;
        Tablet.number = 2;
        Tablet.saves = 0;
        Tablet.playerName = "Tablet";
        Tablet.skill = 78;
        Tablet.position = "Midfielder";
        Tablet.tackles = 12;
        Tablet.team = "Electronics";
        Tablet.reds = 1;
        Tablet.yellows = 0;

        VideoGame.goals = 2;
        VideoGame.assists = 6;
        VideoGame.number = 3;
        VideoGame.saves = 0;
        VideoGame.playerName = "XBox";
        VideoGame.skill = 63;
        VideoGame.position = "MidFielder";
        VideoGame.tackles = 8;
        VideoGame.team = "Electronics";
        VideoGame.reds = 0;
        VideoGame.yellows = 0;

        Projector.goals = 0;
        Projector.assists = 1;
        Projector.number = 4;
        Projector.saves = 4;
        Projector.playerName = "Projector";
        Projector.skill = 80;
        Projector.position = "Defender";
        Projector.tackles = 20;
        Projector.team = "Electronics";
        Projector.reds = 2;
        Projector.yellows = 1;

        Printer.goals = 0;
        Printer.assists = 1;
        Printer.number = 0;
        Printer.saves = 14;
        Printer.playerName = "Printer";
        Printer.skill = 65;
        Printer.position = "Goalkeeper";
        Printer.tackles = 5;
        Printer.team = "Electronics";
        Printer.reds = 1;
        Printer.yellows = 0;


        // Create animal soccer team
        SoccerTeam Animals = new SoccerTeam();
        Animals.name = "Animals";
        Animals.draws = 0;
        Animals.wins = 10;
        Animals.losses = 8;
        Animals.playerList.put(Gecko.playerName, Gecko);
        Animals.playerList.put(Snake.playerName, Snake);
        Animals.playerList.put(Cat.playerName, Cat);
        Animals.playerList.put(Dog.playerName, Dog);
        Animals.playerList.put(Horse.playerName, Horse);
        Animals.playerList.put(Elephant.playerName, Elephant);
        Animals.numberOfPlayers = Animals.playerList.size();
        teamTable.put(Animals.name, Animals);

        // Create Electronics soccer team
        SoccerTeam Electronics = new SoccerTeam();
        Electronics.name = "Electronics";
        Electronics.draws = 2;
        Electronics.wins = 7;
        Electronics.losses = 9;
        Electronics.playerList.put(Phone.playerName, Phone);
        Electronics.playerList.put(Projector.playerName, Projector);
        Electronics.playerList.put(Printer.playerName, Printer);
        Electronics.playerList.put(Computer.playerName, Computer);
        Electronics.playerList.put(Tablet.playerName, Tablet);
        Electronics.playerList.put(VideoGame.playerName, VideoGame);
        Electronics.numberOfPlayers = Electronics.playerList.size();
        teamTable.put(Electronics.name, Electronics);


        //Initialize variables for spinner, and update it
        teamListAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, teamList.toArray(new String[0]));
        teamListAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        teamSelector.setAdapter(teamListAdapter);

    // Create a LinearLayout element for the player scrollview
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // Add Buttons for each player, enable them, and change background color to light green
        geckoButton = (Button)findViewById(R.id.scrollButton1);
        geckoButton.setText(Gecko.playerName);
        geckoButton.setBackgroundColor(0xFF00FF00);
        snakeButton = (Button)findViewById(R.id.scrollButton2);
        snakeButton.setText(Snake.playerName);
        snakeButton.setBackgroundColor(0xFF00FF00);
        catButton = (Button)findViewById(R.id.scrollButton3);
        catButton.setText(Cat.playerName);
        catButton.setBackgroundColor(0xFF00FF00);
        dogButton = (Button)findViewById(R.id.scrollButton4);
        dogButton.setText(Dog.playerName);
        dogButton.setBackgroundColor(0xFF00FF00);
        horseButton = (Button)findViewById(R.id.scrollButton5);
        horseButton.setText(Horse.playerName);
        horseButton.setBackgroundColor(0xFF00FF00);
        elephantButton =(Button)findViewById(R.id.scrollButton6);
        elephantButton.setText(Elephant.playerName);
        elephantButton.setBackgroundColor(0xFF00FF00);
        phoneButton = (Button)findViewById(R.id.scrollButton7);
        phoneButton.setText(Phone.playerName);
        phoneButton.setBackgroundColor(0xFF00FF00);
        printerButton = (Button)findViewById(R.id.scrollButton8);
        printerButton.setText(Printer.playerName);
        printerButton.setBackgroundColor(0xFF00FF00);
        projectorButton = (Button)findViewById(R.id.scrollButton9);
        projectorButton.setText(Projector.playerName);
        projectorButton.setBackgroundColor(0xFF00FF00);
        computerButton = (Button)findViewById(R.id.scrollButton10);
        computerButton.setText(Computer.playerName);
        computerButton.setBackgroundColor(0xFF00FF00);
        tabletButton = (Button)findViewById(R.id.scrollButton11);
        tabletButton.setText(Tablet.playerName);
        tabletButton.setBackgroundColor(0xFF00FF00);
        videoGameButton = (Button)findViewById(R.id.scrollButton12);
        videoGameButton.setText(VideoGame.playerName);
        videoGameButton.setBackgroundColor(0xFF00FF00);

        //enable all used buttons

    }

    

    public void goToEdit(View view)
    {
        startActivity(new Intent(MainActivity.this, PlayerEditActivity.class));
    }

    public void goToPlay(View view)
    {
        startActivity(new Intent(MainActivity.this, GameActivity.class));
    }
}
