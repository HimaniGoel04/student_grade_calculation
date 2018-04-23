/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mile1.service;
import com.mile1.bean.Student;

/**
 *
 * @author macintoch
 */
public class StudentService {
    public int findNumberOfNullMarks(Student data[])
    {
        int count=0;
        if(data!=null)
        {
            for (Student data1 : data) {
                if (data1 != null) {
                    if (data1.getMarks() == null) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public int findNumberOfNullNames(Student data [])
    {
        int count=0;
        if(data!=null)
        {
            for (Student data1 : data) {
                if (data1 != null) {
                    if (data1.getName() == null) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public int findNumberOfNullObjects(Student data [])
    {
        int count=0;
        if(data!=null)
        {
            for (Student data1 : data) {
                if (data1 == null) {
                    count++;
                }
            }
        }
        return count;

    }

}
