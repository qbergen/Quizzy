package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by queenabergen on 10/3/16.
 */

public class CheatActivity extends QuizActivity {
private Question currentQuestion;
    private Question[] copyofQuestions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = (Button) findViewById(R.id.cheat_button);
        copyofQuestions = super.questionBank;

        button.setVisibility(View.GONE);
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);

        Intent intent = getIntent();
        int myIndex = intent.getExtras().getInt("CURRENT INDEX");
        currentQuestion = copyofQuestions[myIndex];
        boolean myAnswer = intent.getExtras().getBoolean("CURRENT ANSWER");
        questionTV.setText(currentQuestion.getTextResId());
        questionTV.append(" " + currentQuestion.isAnswerTrue());
    }
}
