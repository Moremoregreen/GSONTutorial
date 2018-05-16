package com.moremoregreen.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        //PART4
        Employee2 employee2 = new Employee2(
                "Andy",
                25,
                "Andy@gamil.com",
                "asdasdasda"

        );
        String jsonResult = gson.toJson(employee2);
        String json ="{\"age\":30,\"firstName\":\"Andy\",\"mail\":\"Andy@gamil.com\",\"password\":\"asdasdasda\"}";
        Employee2 employee22 = gson.fromJson(json, Employee2.class);


//      Address address = new Address("Taiwan", "Taipei");
//        List<FamilyMember> family = new ArrayList<>();
//        family.add(new FamilyMember("Wife", 27));
//        family.add(new FamilyMember("Daughter", 6));
//
//      Employee employee = new Employee("Andy", 30,"Andy@gmail.com",address, family);
//        String json = gson.toJson(family);



//        String json = "{\"address\":{\"city\":\"Taipei\", \"country\":\"TaiwanNo1\"},\"first_name\":\"Andy\", \"age\":30, \"mail\":\"andy@gmail.com\"," +
//                "\"family\":[{\"age\":30, \"role\":\"Wife\"},{\"age\": 6, \"role\":\"Daughter\"}]}";
//        String json2 = "[{\"age\":27,\"role\":\"Wife\"},{\"age\":6,\"role\":\"Daughter\"}]";
////        Employee employee = gson.fromJson(json2, Employee.class);
//
//        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
//        ArrayList<FamilyMember> family = gson.fromJson(json2, familyType);//這邊要加type不然會錯

    }
}
