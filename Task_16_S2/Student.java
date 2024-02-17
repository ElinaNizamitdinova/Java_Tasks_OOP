package javaTasks.Task_16_S2;

import java.util.List;

public class Student {
    private String surnme;
    private Integer group;
    private Integer grants;
    private List<Integer> grades;

    public Student() {
    }

    public Student(Integer group) {
        this.group = group;
    }

    public Student(String surnme) {
        this.surnme = surnme;
    }

    public Student(String surnme, Integer group, Integer grants, List<Integer> grades) {
        this.surnme = surnme;
        this.group = group;
        this.grants = grants;
        this.grades = grades;
    }

    public String getSurnme() {
        return surnme;
    }

    public void setSurnme(String surnme) {
        this.surnme = surnme;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surnme='" + surnme + '\'' +
                ", group=" + group +
                ", grants=" + grants +
                '}';
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getGrants() {
        return grants;
    }

    public void setGrants(Integer grants) {
        this.grants = grants;
    }

    public boolean evenGrades() {
        Integer sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum % 2 == 0;
    }

}
