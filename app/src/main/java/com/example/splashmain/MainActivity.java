package com.example.splashmain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase fireBD;
        DatabaseReference refenceBD;
        FirebaseApp.initializeApp(this);
/*        fireBD = FirebaseDatabase.getInstance();   */
       /* refenceBD = fireBD.getReference();*/


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        RecyclerView recyclerView = findViewById(R.id.rv_lidt);
        List<item> mlist = new ArrayList<>();
        mlist.add(new item(R.drawable.burrito,"Almuerzo", R.drawable.splash,25));
        mlist.add(new item(R.drawable.carnita,"Almuerzo", R.drawable.splash,12));
        mlist.add(new item(R.drawable.comidita,"Almuerzo", R.drawable.splash,6));
        mlist.add(new item(R.drawable.pastita,"Almuerzo", R.drawable.splash,9));
        mlist.add(new item(R.drawable.pescadito,"Almuerzo", R.drawable.splash,18));
        mlist.add(new item(R.drawable.hamburgesita,"Almuerzo", R.drawable.splash,22));
        mlist.add(new item(R.drawable.hamburguesitax2,"Almuerzo", R.drawable.splash,13));
        adapter Adapter = new adapter(this,mlist);
        recyclerView.setAdapter(Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       /* //Mensaje para la base de datos(firebase)
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");
        //---------------------------------------

        //Leer desde la base de datos
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("Failed to read value.", error.toException());
            }
        });*/
    }

}
