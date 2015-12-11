package com.example.fx50j.lesson2;

/**
 * Created by FX50J on 2015/12/7.
 */
public class Student {
    private String name;
    private int  grade;
    private int imageId;

    public Student(String name,int imageId){
        this.name = name ;
//        this.grade = grade;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getImageId(){
        return imageId;
    }

}
