/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.service.*;
import com.mile1.exception.*;

/**
 *
 * @author macintoch
 */
public class StudentMain {
static	Student data[] = new Student[4];
   static{
	for (int i = 0; i < data.length; i++) 	
            data [i]= new Student(); 	
              
data [0] = new Student("Sekar", new int[]{35,35,35});
data [1] = new Student(null, new int[]{11,22,33});
data [2] = null;
data [3] = new Student("Manoj", null);


}
 
    public static void main(String[] args) {
        StudentReport report=new StudentReport();
        StudentService service=new StudentService();
        for(Student data1:data)
        {
        try
        {
            
                System.out.print("GRADE=");
                String result=report.validate(data1);
                System.out.println(result);
            
        }
        catch(NullStudentException msg)
        {
            System.out.println(msg);
        }
        catch(NullNameException msg)
        {
            System.out.println(msg);
        }
        catch(NullMarksArrayException msg)
        {
            System.out.println(msg);
        }
        }
        
    System.out.println("Number of Objects with Marks array as null ="+service.findNumberOfNullMarks(data));			
    System.out.println("Number of Objects with Name as null="+service.findNumberOfNullNames(data));
    System.out.println("Number of Objects that are entirely null="+service.findNumberOfNullObjects(data));

    }
    
}
