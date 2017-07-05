package com.treehouse.android.interactivestory.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.treehouse.android.interactivestory.R;

public class MainActivity extends AppCompatActivity
{
    private EditText nameField;
    private Button startButton;

    @Override  //this method is overriding the onCreate method of the parent class
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (EditText) findViewById(R.id.nameEditText);
        startButton = (Button) findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String name = nameField.getText().toString();  //need to change an editable string to a regular string
                startStory(name);
            }
        });

    }

    //this well ensure that the text is erased when we hit the back button
    @Override
    protected void onResume()
    {
        super.onResume();
        nameField.setText("");
    }

    private void startStory(String name)
    {
        Intent intent = new Intent(this, StoryActivity.class);
        Resources resources = getResources();
        String key = resources.getString(R.string.key_name);
        intent.putExtra(key, name);
        startActivity(intent); //this will start the new story activity after a name is entered.
    }
}
