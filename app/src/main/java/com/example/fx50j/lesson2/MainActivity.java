package com.example.fx50j.lesson2;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private String Student[] = {"张三   1","李四   2","C        4","D        2","E       2","F       1"};
////    private String Grade[] = {"1","5","4","5","2","1","4"};

    private List<Student> studentList = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initStudents();
        StudentAdapter adapater = new StudentAdapter(MainActivity.this,R.layout.text,studentList);
        ListView listView = (ListView)findViewById(R.id.Lv);
        listView.setAdapter(adapater);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = studentList.get(position);
                if (student.getName() == "姓名：小A    2015级") {
                    Intent intentA = new Intent(MainActivity.this, AActivity.class);
                    startActivity(intentA);
                }
                if (student.getName() == "姓名：小B     2014级") {
                    Intent intentB = new Intent(MainActivity.this, BActivity.class);
                    startActivity(intentB);
                }
                if (student.getName() == "姓名：小C    2015级") {
                    Intent intentC = new Intent(MainActivity.this, CActivity.class);
                    startActivity(intentC);
                }
                if (student.getName() == "姓名：小D    2013级") {
                    Intent intentD = new Intent(MainActivity.this, DActivity.class);
                    startActivity(intentD);
                }
                if (student.getName() == "姓名：小E    2014级") {
                    Intent intentE = new Intent(MainActivity.this, EActivity.class);
                    startActivity(intentE);
                }
                if (student.getName() == "姓名：小F    2015级") {
                    Intent intentF = new Intent(MainActivity.this, FActivity.class);
                    startActivity(intentF);
                }
//                Toast.makeText(MainActivity.this,student.getName(),Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, AActivity.class);//怎样把参数传给Actvity
//                startActivity(intent);
            }
        });

        ImageView iv1 = (ImageView)findViewById(R.id.Iv1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
/*        ImageView iv2 = (ImageView)findViewById(R.id.Iv2);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"you will add a new student",Toast.LENGTH_SHORT).show();
            }
        });*/
//        ArrayAdapter<String> student = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,Student);
////        ArrayAdapter<String> grade = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,Grade);
//        ListView listView = (ListView)findViewById(R.id.lv1);
//        listView.setAdapter(student);
//
//
////        ListView listView1 = (ListView)findViewById(R.id.lv1);
////        listView.setAdapter(grade);

    }
    private void initStudents(){
        Student A = new Student ("姓名：小A    2015级",R.drawable.xiaoming);
        studentList.add(A);

//        ListView listViewA = (ListView)findViewById(R.id.A);
//        listViewA.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentA = new Intent(MainActivity.this, AActivity.class);
//                startActivity(intentA);
//            }
//        });

        Student B = new Student("姓名：小B     2014级",R.drawable.xiaohong);
        studentList.add(B);
        Student C = new Student("姓名：小C    2015级",R.drawable.xiaogang);
        studentList.add(C);
        Student D = new Student ("姓名：小D    2013级",R.drawable.xiaozuo);
        studentList.add(D);
        Student E = new Student ("姓名：小E    2014级",R.drawable.xiaoyou);
        studentList.add(E);
        Student F = new Student ("姓名：小F    2015级",R.drawable.xiaozhi);
        studentList.add(F);

//        ListView listViewB =(ListView)findViewById(R.id.B);
//        listViewB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentB = new Intent(MainActivity.this,BAcitvity.class);
//                startActivity(intentB);
//            }
//        });
    }
//    public void back() {
//        finish();
//    }
//    public void add(){
//        Toast.makeText(MainActivity.this, "you choose add a new student", Toast.LENGTH_SHORT).show();
//    }
}
