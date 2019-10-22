/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author bapperley
 */
public class UniDemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Lecturer L = new Lecturer(01, "Bob");
        Student S = new Student(02, "Bill");
        Course SOFT252 = new Course("SOFT252", "SMB104");
        
        Admin.getDetails(S);
        
        Admin.assignCourse(L, SOFT252);
        Admin.assignCourse(S, SOFT252);
        
        L.teach();
        S.attendClass();
        
        S.doCoursework();
        
        L.setCourseWork("Project");
        
        S.doCoursework();
        
        Admin.getDetails(L);
    }
    
}
