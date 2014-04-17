package com.example.adhdmyway;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionalProfileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_optional_profile);
		initEatingHabitsButton();
		initPersonalHygieneButton();
		initStressLevelsButton();
		initPhysicalFitnessButton();
		initComorbidButton();
	}

	private void initEatingHabitsButton() {
        Button restaurant = (Button) findViewById(R.id.buttonEatingHabits);
        restaurant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
    			Intent intent = new Intent(OptionalProfileActivity.this, EatingHabitsActivity.class);
    			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			startActivity(intent);
            }
        });
	}
	
	private void initPersonalHygieneButton() {
        Button restaurant = (Button) findViewById(R.id.buttonPersonalHygiene);
        restaurant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
    			Intent intent = new Intent(OptionalProfileActivity.this, PersonalHygieneActivity.class);
    			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			startActivity(intent);
            }
        });
	}
	
	private void initStressLevelsButton() {
        Button restaurant = (Button) findViewById(R.id.buttonStressLevels);
        restaurant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
    			Intent intent = new Intent(OptionalProfileActivity.this, StressLevelsActivity.class);
    			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			startActivity(intent);
            }
        });
	}
	
	private void initPhysicalFitnessButton() {
        Button restaurant = (Button) findViewById(R.id.buttonPhysicalFitness);
        restaurant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
    			Intent intent = new Intent(OptionalProfileActivity.this, PhysicalFitnessActivity.class);
    			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			startActivity(intent);
            }
        });
	}
	
	private void initComorbidButton() {
        Button restaurant = (Button) findViewById(R.id.buttonComorbidConditions);
        restaurant.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
    			Intent intent = new Intent(OptionalProfileActivity.this, ComorbidActivity.class);
    			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    			startActivity(intent);
            }
        });
	}
}
