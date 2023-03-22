package mephi.lab__1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;

public class DataManipulation {
    static ArrayList<Bookable> Books = new ArrayList<Bookable>();
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public DataManipulation(){}
    public void generateData()
    {
        BookFactory factory;
        int i = 0;
        while (i < 100)
        {
            int R = i - (int)Math.floor(i / 4) * 4;
            switch (R)
            {
                case 0:
                {
                    factory = new RussianBookFactory();
                    Books.add(factory.createFiction());
                    break;
                }
                case 1:
                {
                    factory = new RussianBookFactory();
                    Books.add(factory.createTextbook());
                    break;
                }
                case 2:
                {
                    factory = new EnglishBookFactory();
                    Books.add(factory.createTextbook());
                    break;
                }
                case 3:
                {
                    factory = new EnglishBookFactory();
                    Books.add(factory.createFiction());
                    break;
                }
            }
            i += 1;
        }
        
        AbstractUserPlant plant = new UserPlant();
        Random random = new Random();
        for (int j = 0; j < 20; j++) {
            switch (random.nextInt(2)) {
                case 0:
                    students.add(plant.createStudent());
                    break;
                case 1:
                    teachers.add(plant.createTeacher());
                    break;
            }
        }
    }

    public DefaultMutableTreeNode buildTree() {
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Library's users");
        DefaultMutableTreeNode studentNode = new DefaultMutableTreeNode("Students");
        DefaultMutableTreeNode teacherNode = new DefaultMutableTreeNode("Teachers");
        for (Student student : students) {
            studentNode.add(student.getNode());
        }
        for (Teacher teacher : teachers) {
            teacherNode.add(teacher.getNode());
        }
        rootNode.add(teacherNode);
        rootNode.add(studentNode);
        return rootNode;
    }
}