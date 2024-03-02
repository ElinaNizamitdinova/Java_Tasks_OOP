package javaTasks.MVS_OOP_S5.Service;

import javaTasks.MVS_OOP_S5.Group;
import javaTasks.MVS_OOP_S5.Model.Student;
import javaTasks.MVS_OOP_S5.Model.Teacher;
import javaTasks.MVS_OOP_S5.Model.Type;
import javaTasks.MVS_OOP_S5.Model.User;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    Group group;

    public void createGroup(Teacher teacher,List<Student> students){
        group = new Group (teacher,students);

    }
    public Group getAllUser(){
        return group;
    }



}
