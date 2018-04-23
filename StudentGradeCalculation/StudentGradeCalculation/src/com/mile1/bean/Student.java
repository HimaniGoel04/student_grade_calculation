/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mile1.bean;

/**
 *
 * @author macintoch
 */
public class Student {
    String name;
    int marks[]=new int[3];
    public Student(){}
    public Student(String name,int marks[])
    {
        this.name=name;
        this.marks=marks;
    }
    public void setName(String name)
    {
        this.name=name;
        
    }
    public String getName()
    {
        return this.name;
    }
    public void setMarks(int[] marks)
    {
        this.marks=marks;
    }
    public int[] getMarks()
    {
        return this.marks;
    }
}
