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
public class Lecturer extends UniPeople implements ITeach
{
    @Override
    public void setCourseWork(String coursework)
    {
        course.setCoursework(coursework);
    }
    
    @Override
    public void teach()
    {
        System.out.print(name + " is teaching " + id + " in room " + course.room + "\n");
    }

    public Lecturer(int id, String name) {
        super(id, name);
    }
    
    
}
