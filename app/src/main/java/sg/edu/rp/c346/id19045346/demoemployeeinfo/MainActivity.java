package sg.edu.rp.c346.id19045346.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    ListView lvname;
    ListView lvjob;

    ArrayList<EmployeeList> empList;
    ArrayAdapter<EmployeeList> adaptername;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvname = findViewById(R.id.ListViewNames);
        lvjob = findViewById(R.id.ListViewJob);

        empList = new ArrayList<>();

        EmployeeList emp1 = new EmployeeList("John","Software Technical Leader",3400);
        EmployeeList emp2 = new EmployeeList("May","Programmer",2200);

        empList.addAll(Arrays.asList(emp1,emp2));

        adaptername = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,empList);

        adapter = new CustomAdapter(this,R.layout.row,empList);
        lvjob.setAdapter(adapter);
        lvname.setAdapter(adaptername);





    }
}
