package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottomButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);


        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1 ||mStoryIndex == 2  ) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                    mStoryIndex = 3;
                    Log.d("info", "story3");
                } else if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T6_End);

                    mStoryIndex = 6;
                    Log.d("info", "story6");
                    removeButton();
                }


            }
        });

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {

                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);

                    mStoryIndex = 2;
                    Log.d("info", "story2");

                } else if (mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T5_End);

                    mStoryIndex = 5;
                    Log.d("info", "story5");
                    removeButton();
                } else if (mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T4_End);

                    mStoryIndex = 4;
                    Log.d("info", "story4");
                    removeButton();
                }

            }
        });


    }

    void removeButton() {
        mTopButton.setVisibility(View.GONE);
        mBottomButton.setVisibility(View.GONE);
    }
}
