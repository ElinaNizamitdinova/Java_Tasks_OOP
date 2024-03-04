package javaTasks.MVS_OOP_S5.Service;

import javaTasks.MVS_OOP_S5.Model.Group;
import javaTasks.MVS_OOP_S5.Model.Student;
import javaTasks.MVS_OOP_S5.Model.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GroupService {
    Group group;

    public void createGroup(Teacher teacher,List<Student> students){
        group = new Group (teacher,students);

    }
    public Group getStudentGroup() {
        return group;
    }
    public Group getAllUser(){
        return group;
    }
    public Student getStudentFromStudentGroup(String firstName, String secondName){
        Iterator<Student> iterator = group.iterator();;
        List<Student> result = new ArrayList<>();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getSecondName().equalsIgnoreCase(secondName)){
                result.add(student);
            }
        }
        if(result.size() == 0){
            throw new IllegalStateException(
                    String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
            );
        }
        if(result.size() != 1){
            throw new IllegalStateException("Найдено более одного студента с указанными именем и фамилией");
        }
        return result.get(0);
    }


}
