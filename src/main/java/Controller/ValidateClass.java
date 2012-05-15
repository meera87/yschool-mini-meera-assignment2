/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Student.StudentDetails;

/**
 *
 * @author Meer
 */
public class ValidateClass {
    public boolean checkFields(String subject,String marks){
        if("".equals(subject.trim()) || subject==null || "".equals(marks.trim()) || marks==null)
            return false;
        return true;
    }
    public boolean checkMarks(int marks){
        if(marks<0 || marks >100)
            return false;
        return true;
    }
    public boolean is_int(String marks){
        for(int i=0;i<marks.length();i++){
            if((marks.charAt(i)<48 )|| (marks.charAt(i)>57))
                return false;
        }
        return true;       
    }
    public StudentDetails setDetails(String sname,String grade,String subject,int marks){
        StudentDetails sd=new StudentDetails();
        sd.setSname(sname);
        sd.setGrade(grade);
        sd.setSubject(subject);
        sd.setMarks(marks);
        return sd;
    }
}
