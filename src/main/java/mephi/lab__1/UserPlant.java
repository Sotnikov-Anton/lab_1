package mephi.lab__1;

public class UserPlant implements AbstractUserPlant{

    @Override
    public Student createStudent() {
        return new Student();
    }
    @Override
    public Teacher createTeacher() {
        return new Teacher();
    }
}
