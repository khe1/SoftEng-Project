package com.example.phys_data;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "physdata";
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		/*
		 * Create the employee table and populate it with sample data.
		 * In step 6, we will move these hardcoded statements to an XML document.
		 */
		String sql = "CREATE TABLE IF NOT EXISTS problem (" +
						"_id INTEGER PRIMARY KEY AUTOINCREMENT, " + 
						"question TEXT, " +
						"answer TEXT, " +
						"chapter TEXT)";
		db.execSQL(sql);
		
		ContentValues values = new ContentValues();

		//--------------------------------------------------Data start------------------------------------------------------------
		
		values.put("question", "Two athletes jump straight up. Upon leaving the ground, Adam has half the initial speed of Bob. Compared to Adam, Bob jumps");
		values.put("answer", "four times as high");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "A car is traveling due west at 20.0 m/s. Find the velocity of the car after 3.00 s if its acceleration is 1.0 m/s2 due west. Assume that the acceleration remains constant.");
		values.put("answer", "23.0 m/s west");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "An electron, starting from rest and moving with a constant acceleration, travels 1.0 cm in 2.0 ms. What is the magnitude of this acceleration?");
		values.put("answer", "5.0 km/s^2");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "Which of these statements is (are) true?\n1.An object can have zero acceleration and be at rest.\n2.An object can have nonzero acceleration and be at rest.\n3.An object can have zero acceleration and be in motion.");
		values.put("answer", "1, 2, and 3");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "You drop a rock from a cliff. If air resistance is neglected, which of the following statements is (are) true?\n1.The speed of the rock will increase.\n2.The speed of the rock will decrease.\n3.The acceleration of the rock will increase.\n4.The acceleration of the rock will decrease.");
		values.put("answer", "1");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);
		
		values.put("question", "If the melon in Solved Problem 2.5 is thrown straight up with an initial velocity of 5.00 m/s at the same time that the arrow is shot upward, how long does it take before the collision occurs?");
		values.put("answer", "2.90 s");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "A car travels north at 30.0 m/s for 10.0 min. It then travels south at 40.0 m/s for 20.0 min. What are the total distance the car travels and its displacement?");
		values.put("answer", "distance = 66.0 km; displacement = 33.0 km south");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "Running on a 50-m by 40-m rectangular track, you complete one lap in 100 s. What is your average velocity for the lap?");
		values.put("answer", "0 m/s");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "The position of a particle moving along the x-axis is given by x = 3.0t^2 - 2.0t^3, where x is in meters and t is in seconds. What is the position of the particle when it achieves its maximum speed in the positive x-direction?");
		values.put("answer", "x =0.50 m");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);

		values.put("question", "The position of an object as a function of time is given as x = At3 + Bt2 + Ct + D. The constants are A = 2.10 m/s3, B = 1.00 m/s2, C = ¨C4.10 m/s, and D = 3.00 m.\na) What is the velocity of the object at t = 10.0 s?\nb) At what time(s) is the object at rest?\nc) What is the acceleration of the object at t = 0.50 s?");
		values.put("answer", "a) 646 m/s\nb) -0.981s and 0.663 s\nc) 8.30 m/s/s");
		values.put("chapter", "Motion in a Straight Line");
		db.insert("problem", "question", values);



		
		//-------------------------------------------------Data end--------------------------------------------------
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS problems");
		onCreate(db);
	}
	
}
