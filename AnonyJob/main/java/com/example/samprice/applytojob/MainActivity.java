package com.example.samprice.applytojob;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RemoteViews;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.samprice.applytojob.R;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{ //implements OnItemSelectedListener {
    private EditText mSearch, mEmployer, mTag, mJob;
    public String job, employer, tags, type, buttonNum;
    public int num;
    public Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
    }
/*
    public void onClickSpinner(View v) {
        spinner1 = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.resume_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);



        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

**/
public void onClickApply(View v){
    setContentView(R.layout.search);
}
    //public void onClickUpload(View v){
    //  setContentView(R.layout.);
    //}

    public void onJobPostStart(View v){
        Intent myIntent = new Intent(MainActivity.this, AddingJob.class);
        startActivity(myIntent);
    }



    public void onClickEmployer(View v) {
        setContentView(R.layout.employer);
    }

    public void onClickJobSeeker(View v) {
        setContentView(R.layout.jobseeker);
    }

    public void onClickActMain(View v){
        setContentView(R.layout.activity_main);
    }

    public void onClickApplyP(View v) {
        job = mSearch.getText().toString();
        setContentView(R.layout.apply);

        final TextView viewing1 = (TextView) findViewById(R.id.textView8);
        viewing1.setText(" " + job);
    }

    public void onClickApplyE(View v) {
        employer = mEmployer.getText().toString();
        setContentView(R.layout.apply_employer);

        final TextView viewing1 = (TextView) findViewById(R.id.textView16);
        viewing1.setText("Job with " + employer + " employer.");

    }
    public void onClickApplyT(View v) {
        tags = mTag.getText().toString();
        setContentView(R.layout.apply_tags);

        final TextView viewing1 = (TextView) findViewById(R.id.textView24);
        viewing1.setText("Job with " + tags + " tags.");
    }



    public void onClickAllResultsP(View v){
        job = mSearch.getText().toString();
        setContentView(R.layout.select);
        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 " + job + " positions.");
        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 for " + job + " position");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 for " + job + " position");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 for " + job + " position");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 for " + job + " position");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 for " + job + " position");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 for " + job + " position");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 for " + job + " position");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 for " + job + " position");

    }
    public void onClickAllResultsE(View v){

        employer = mEmployer.getText().toString();
        setContentView(R.layout.select_employer);
        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 jobs with the " + employer + " company.");
        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + employer );
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + employer );
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + employer );
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + employer );
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + employer  );
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + employer  );
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + employer  );
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + employer);
    }

    public void onClickAllResultsT(View v){
        tags = mTag.getText().toString();
        setContentView(R.layout.select_tags);


        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 positions with " + tags + " tags.");
        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + tags + " tags");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + tags + " tags");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + tags+ " tags");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + tags+ " tags");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + tags+ " tags");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + tags+ " tags");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + tags+ " tags");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + tags+ " tags");
    }

    public void onClickReturntoSearch(View v){
        setContentView(R.layout.search);
    }

    public void onClickByPosition(View v) {
        mSearch = (EditText) findViewById(R.id.editPosition);
        job = mSearch.getText().toString();
        type = "position";
        setContentView(R.layout.select);
        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 " + job + " positions.");
        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 for " + job + " position");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 for " + job + " position");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 for " + job + " position");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 for " + job + " position");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 for " + job + " position");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 for " + job + " position");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 for " + job + " position");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 for " + job + " position");
    }


    public void onClickByEmployer(View v) {
        mEmployer = (EditText) findViewById(R.id.editEmployer);
        employer = mEmployer.getText().toString();
        type = "employer";
        setContentView(R.layout.select_employer);
        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 jobs with the " + employer + " company.");
        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + employer );
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + employer );
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + employer );
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + employer );
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + employer  );
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + employer  );
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + employer  );
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + employer);
    }

    public void onClickByTags(View v) {
        mTag = (EditText) findViewById(R.id.editTags);
        tags = mTag.getText().toString();
        setContentView(R.layout.select_tags);
        type = "tag";
        final TextView viewing1 = (TextView) findViewById(R.id.textView4);
        viewing1.setText("Found 8 positions with " + tags + " tags.");
        final TextView job1 = (TextView) findViewById(R.id.buttonjob1);
        job1.setText("Job1 with " + tags + " tags");
        final TextView job2 = (TextView) findViewById(R.id.buttonjob2);
        job2.setText("Job2 with " + tags + " tags");
        final TextView job3 = (TextView) findViewById(R.id.buttonjob3);
        job3.setText("Job3 with " + tags+ " tags");
        final TextView job4 = (TextView) findViewById(R.id.buttonjob4);
        job4.setText("Job4 with " + tags+ " tags");
        final TextView job5 = (TextView) findViewById(R.id.buttonjob5);
        job5.setText("Job5 with " + tags+ " tags");
        final TextView job6 = (TextView) findViewById(R.id.buttonjob6);
        job6.setText("Job6 with " + tags+ " tags");
        final TextView job7 = (TextView) findViewById(R.id.buttonjob7);
        job7.setText("Job7 with " + tags+ " tags");
        final TextView job8 = (TextView) findViewById(R.id.buttonjob8);
        job8.setText("Job8 with " + tags+ " tags");
    }
    public void onJ1(View v) {
        num = 1;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ2(View v){
        num = 2;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ3(View v){
        num = 3;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ4(View v){
        num = 4;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ5(View v){
        num = 5;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ6(View v){
        num = 6;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ7(View v){
        num = 7;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
    public void onJ8(View v){
        num = 8;
        if (type == "position") {
            onClickApplyP(v);
        } else if (type == "employer") {
            onClickApplyE(v);
        } else { //type = tag
            onClickApplyT(v);
        }
    }
public void onClickCancel(View v){
    if (type == "position") {
        onClickAllResultsP(v);
    } else if (type == "employer") {
        onClickAllResultsE(v);
    } else { //type = tag
        onClickAllResultsT(v);
    }
}

public void onOKAY(View v){
    Context context = getApplicationContext();
    CharSequence text = "Congratulations! You have sucessfully applied to Job"+ num ;
    int duration = Toast.LENGTH_SHORT;

    Toast toast = Toast.makeText(context, text, duration);
    toast.show();

    if (type == "position") {
        onClickAllResultsP(v);
    } else if (type == "employer") {
        onClickAllResultsE(v);
    } else { //type = tag
        onClickAllResultsT(v);
    }
}

    public void onClickResume(View v){
        setContentView(R.layout.resume);
        if (type == "position"){
            final TextView viewing1 = (TextView) findViewById(R.id.textView6);
            viewing1.setText("You are applying to Job" + num + " for " +job + " positon.");

        } else if (type == "employer"){
            final TextView viewing1 = (TextView) findViewById(R.id.textView6);
            viewing1.setText("You are applying to Job" + num+ " with " + employer +".");

        }else{ //type == tag
            final TextView viewing1 = (TextView) findViewById(R.id.textView6);
            viewing1.setText("You are applying to Job" +num + " with " + tags + " tags.");

        }
    }


}

