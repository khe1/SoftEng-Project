package com.example.phys_data;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class MainActivity extends Activity {
	
	protected EditText searchText;
	protected SQLiteDatabase db;
	protected Cursor cursor;
	protected ListAdapter adapter;
	protected ListView questionList;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        db = (new DatabaseHelper(this)).getWritableDatabase();
        searchText = (EditText) findViewById (R.id.searchText);
        questionList = (ListView) findViewById (R.id.list);
    }
    

	public void search(View view) {
    	// || is the concatenation operation in SQLite
		cursor = db.rawQuery("SELECT _id, question, chapter, answer FROM problem WHERE question || ' ' || chapter LIKE ?", 
						new String[]{"%" + searchText.getText().toString() + "%"});
		adapter = new SimpleCursorAdapter(
				this, 
				R.layout.question_list_item, 
				cursor, 
				new String[] {"question", "answer", "chapter"}, 
				new int[] {R.id.question, R.id.answer, R.id.chapter});
		questionList.setAdapter(adapter);
    }
    
}