package com.joker.richtexteditor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TestRichEditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rich_editor_test);
        startActivity(new Intent(this, com.joker.richeditor.RichEditorActivity.class));

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestRichEditorActivity.this, com.joker.richeditor.RichEditorActivity.class));

            }
        });
    }
}
