package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String edit = getIntent().getStringExtra("text");

        EditText etNewItem = (EditText) findViewById(R.id.etEditItem);
        etNewItem.setText(edit);

    }

    public void onSave(View v) {
        EditText etNewItem = (EditText) findViewById(R.id.etEditItem);
        String text = etNewItem.getText().toString();
        Intent data = new Intent();
        data.putExtra("text", text);
        setResult(200, data);
        finish();
    }

}
