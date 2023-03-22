package mephi.lab__1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class Student {
    private String FI = "";

    public Student() {
        Random random = new Random();
        switch(random.nextInt(2)) {
            case 1:
                FI += ExcelProvider.getMale_s_surnames().get(random.nextInt(ExcelProvider.getMale_s_surnames().size()));
                FI += " ";
                FI += ExcelProvider.getMale_names().get(random.nextInt(ExcelProvider.getMale_names().size()));
                break;
            case 0:
                FI += ExcelProvider.getFemale_s_surnames().get(random.nextInt(ExcelProvider.getFemale_s_surnames().size()));
                FI += " ";
                FI += ExcelProvider.getFemale_names().get(random.nextInt(ExcelProvider.getFemale_names().size()));
                break;
        }
    }
    public String getFI() {
        return FI;
    }
    public MutableTreeNode getNode()
    {
        int n;
        ArrayList<Integer> numbers = new ArrayList<>();
        DefaultMutableTreeNode sNode = new DefaultMutableTreeNode(FI);
        Random random = new Random();
        int n_books = random.nextInt(3, 11);
        for (int i = 0; i < n_books; i++) {
            n = random.nextInt(DataManipulation.Books.size());
            if (!numbers.contains(n)) {
                Bookable book = DataManipulation.Books.get(n);
                sNode.add(new DefaultMutableTreeNode(book.getName()));
                numbers.add(n);
            }
        }
        return sNode;
    }
}