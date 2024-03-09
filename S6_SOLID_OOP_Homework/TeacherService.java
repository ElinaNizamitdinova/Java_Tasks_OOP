package javaTasks.S6_SOLID_OOP_Homework;
/** Single Responsibility Principle - принцип единственной ответственности.
 * Каждый класс должен иметь только одну зону ответственности.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService {
    public List<Teacher> teacherList;

    public TeacherService(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getSortedTeacherList(){
        List<Teacher> result = new ArrayList<Teacher>(teacherList);
        Collections.sort(result);
        return result;


    }
    public void soutList(List<Teacher> teacherList){
        for (Teacher s:teacherList){
            System.out.println(s);
        }
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> result = new ArrayList<>(teacherList);
        result.sort(new UserComparator<Teacher>());
        return result;
    }
}
