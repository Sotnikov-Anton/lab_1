package mephi.lab__1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class Teacher {
    private String FIO = "";

    public Teacher() {
        Random random = new Random();
        switch (random.nextInt(2)) {
            case 1:
                FIO += ExcelProvider.getMale_t_surnames().get(random.nextInt(ExcelProvider.getMale_t_surnames().size()));
                FIO += " ";
                FIO += ExcelProvider.getMale_names().get(random.nextInt(ExcelProvider.getMale_names().size()));
                FIO += " ";
                FIO += ExcelProvider.getMale_middlenames().get(random.nextInt(ExcelProvider.getMale_middlenames().size()));
                break;
            case 0:
                FIO += ExcelProvider.getFemale_t_surnames().get(random.nextInt(ExcelProvider.getFemale_t_surnames().size()));
                FIO += " ";
                FIO += ExcelProvider.getFemale_names().get(random.nextInt(ExcelProvider.getFemale_names().size()));
                FIO += " ";
                FIO += ExcelProvider.getFemale_middlenames().get(random.nextInt(ExcelProvider.getFemale_middlenames().size()));
                break;
        }
    }
    public String getFIO() {
        return FIO;
    }
    public MutableTreeNode getNode() {
        int n;
        ArrayList<Integer> numbers = new ArrayList<>();
        DefaultMutableTreeNode tNode = new DefaultMutableTreeNode(FIO);
        Random random = new Random();
        int n_books = random.nextInt(3, 11);
        for (int i = 0; i < n_books; i++) {
            n = random.nextInt(DataManipulation.Books.size());
            if (!numbers.contains(n)) {
                Bookable book = DataManipulation.Books.get(n);
                tNode.add(new DefaultMutableTreeNode(book.getName()));
                numbers.add(n);
            }
        }
        return tNode;
    }
}