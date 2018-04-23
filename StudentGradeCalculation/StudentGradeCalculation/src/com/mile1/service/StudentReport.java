/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mile1.service;
import com.mile1.bean.Student;
import com.mile1.exception.*;

/**
 *
 * @author macintoch
 */
public class StudentReport {
    public String findGrade(Student studentObject)
    {
        int[] marks=new int[3];
        marks=studentObject.getMarks();
        int sum=0;
        for(int i=0;i<3;i++)
        {
            if(marks[i]<35)
                return "F";
            else
            {
                sum+=marks[i];
                
            }
        }
        if(sum<=150)
            return "D";
        else if(sum>150 && sum<=200)
            return "C";
        else if(sum>200 && sum<=250)
            return "B";
        else if(sum>250 && sum<=300)
            return "A";
        else
            return "Invalid";
    }

    
    public String validate(Student studentObject) throws NullStudentException,NullNameException,NullMarksArrayException
    {
        if(studentObject==null)
        {
            throw new NullStudentException();
        }
        else
        {
            if(studentObject.getName()==null)
                throw new NullNameException();
            else if(studentObject.getMarks()==null)
                throw new NullMarksArrayException();
            else
            {
                String result=this.findGrade(studentObject);
                return result;
            }  
                
        }
    }
    


}
