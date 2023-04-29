package edu.birzit.classapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.classapp.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView l;
    Button b;
    ListView Lview;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.lbl1);
        b=(Button) findViewById(R.id.btn1);
        spin=findViewById(R.id.spinner);
        Lview=findViewById(R.id.lview);

    }

    public void ShowMag(View view) {
        ArrayList<Book> bookArrayList = new ArrayList<>();

        bookArrayList.add(new Book(450,70 ,"Java","Coding"));
        bookArrayList.add(new Book(500,200 ,"Data Structure","Coding"));
        bookArrayList.add(new Book(320,120,"Introduction to Algorithm","Coding"));
        bookArrayList.add(new Book(250,340 ,"Introduction to Cyber Security","Coding"));

        String [] datalist=new String[bookArrayList.size()];
        for (int i = 0; i < bookArrayList.size(); i++) {
            datalist[i]=bookArrayList.get(i).title;
        }
        ArrayAdapter<String> ad = new ArrayAdapter<>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,datalist);

        spin.setAdapter(ad);
        Lview.setAdapter(ad);

        String gender= spin.getSelectedItem().toString();
        l.setText(gender);
    }
}