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
public class Student extends UniPeople
{
    public void attendClass()
    {
        System.out.print(name + " is attending " + course.code + " in room " + course.room + "\n");
    }
    
    public void doCoursework()
    {
        System.out.print(name + " is doing coursework " + course.coursework + "\n");
    }

    public Student(int id, String name) {
        super(id, name);
    }
    
}
