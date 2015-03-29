package com.example.yura.geoquiz;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Yura on 28.03.2015.
 */
public class CheatActivity extends ActionBarActivity {

    public static final String EXTRA_ANSWER_IS_TRUE =
            "com.example.yura.geoquiz.answer_is_true";

    private boolean mAnswerIsTrue;
    private TextView mAnswerTextView;


    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
        mAnswerTextView = (TextView)findViewById(R.id.answerTextView);
    }

    public void showAnswerButtonOnClick(View v) {
        if(mAnswerIsTrue) {
            mAnswerTextView.setText(R.string.true_button);
        } else {
            mAnswerTextView.setText(R.string.false_button);
        }
    }
}
