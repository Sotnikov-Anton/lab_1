package mephi.lab__1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProvider {
    private File file;
    private XSSFWorkbook wb;
    private static ArrayList<String> male_t_surnames;
    private static ArrayList<String> female_t_surnames;
    private static ArrayList<String> male_s_surnames;
    private static ArrayList<String> female_s_surnames;
    private static ArrayList<String> male_names;
    private static ArrayList<String> female_names;
    private static ArrayList<String> male_middlenames;
    private static ArrayList<String> female_middlenames;
    private static ArrayList<String> t_types;
    private static ArrayList<String> t_rus_names;
    private static ArrayList<String> t_eng_names;
    private static ArrayList<String> universities;
    private static ArrayList<String> authors;
    private static ArrayList<String> f_rus_types;
    private static ArrayList<String> f_rus_names;
    private static ArrayList<String> f_eng_types;
    private static ArrayList<String> f_eng_names;
    
    public ExcelProvider()
    {
        init();
    }
    public void init()
    {
        setFile(new File("D:\\Java programs\\lab_1_data_for_generation.xlsx"));
    }
    public void run()
    {
        loadFile();
        readSheets();
        close();
    }
    public File getFile()
    {
        return this.file;
    }
    public void setFile(File file)
    {
        this.file = file;
    }
    public static ArrayList<String> getMale_s_surnames() {
        return male_s_surnames;
    }
    public static ArrayList<String> getMale_t_surnames() {
        return male_t_surnames;
    }
    public static ArrayList<String> getFemale_t_surnames() {
        return female_t_surnames;
    }
    public static ArrayList<String> getFemale_s_surnames() {
        return female_s_surnames;
    }
    public static ArrayList<String> getMale_names() {
        return male_names;
    }
    public static ArrayList<String> getFemale_names() {
        return female_names;
    }
    public static ArrayList<String> getMale_middlenames() {
        return male_middlenames;
    }
    public static ArrayList<String> getFemale_middlenames() {
        return female_middlenames;
    }
    public static ArrayList<String> getT_types() {
        return t_types;
    }
    public static ArrayList<String> getT_rus_names() {
        return t_rus_names;
    }
    public static ArrayList<String> getT_eng_names() {
        return t_eng_names;
    }
    public static ArrayList<String> getUniversities() {
        return universities;
    }
    public static ArrayList<String> getAuthors() {
        return authors;
    }
    public static ArrayList<String> getF_rus_types() {
        return f_rus_types;
    }
    public static ArrayList<String> getF_rus_names() {
        return f_rus_names;
    }
    public static ArrayList<String> getF_eng_types() {
        return f_eng_types;
    }
    public static ArrayList<String> getF_eng_names() {
        return f_eng_names;
    }
    private void readSheets()
    {
        XSSFSheet sheet = wb.getSheet("FIO");
        male_t_surnames = new ArrayList<>();
        female_t_surnames = new ArrayList<>();
        male_s_surnames = new ArrayList<>();
        female_s_surnames = new ArrayList<>();
        male_names = new ArrayList<>();
        female_names = new ArrayList<>();
        male_middlenames = new ArrayList<>();
        female_middlenames = new ArrayList<>();
        for (int i = 0; i < 131; i++) {
            male_t_surnames.add(sheet.getRow(i).getCell(1).getStringCellValue());
        }
        for (int i = 0; i < 48; i++) {
            female_t_surnames.add(sheet.getRow(i).getCell(2).getStringCellValue());
        }
        for (int i = 0; i < 60; i++) {
            male_s_surnames.add(sheet.getRow(i).getCell(7).getStringCellValue());
            female_s_surnames.add(sheet.getRow(i).getCell(8).getStringCellValue());
            male_names.add(sheet.getRow(i).getCell(4).getStringCellValue());
            female_names.add(sheet.getRow(i).getCell(3).getStringCellValue());
            male_middlenames.add(sheet.getRow(i).getCell(6).getStringCellValue());
            female_middlenames.add(sheet.getRow(i).getCell(5).getStringCellValue());
        }
        sheet = wb.getSheet("Literature");
        t_types = new ArrayList<>();
        t_rus_names = new ArrayList<>();
        t_eng_names = new ArrayList<>();
        universities = new ArrayList<>();
        authors = new ArrayList<>();
        f_rus_types = new ArrayList<>();
        f_rus_names = new ArrayList<>();
        f_eng_types = new ArrayList<>();
        f_eng_names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            t_types.add(sheet.getRow(i).getCell(0).getStringCellValue());
            f_rus_types.add(sheet.getRow(i).getCell(5).getStringCellValue());
        }
        for (int i = 0; i < 15; i++) {
            t_rus_names.add(sheet.getRow(i).getCell(1).getStringCellValue());
            t_eng_names.add(sheet.getRow(i).getCell(2).getStringCellValue());
            universities.add(sheet.getRow(i).getCell(3).getStringCellValue());
            authors.add(sheet.getRow(i).getCell(4).getStringCellValue());
        }
        for (int i = 0; i < 8; i++) {
            f_eng_types.add(sheet.getRow(i).getCell(7).getStringCellValue());
        }
        for (int i = 0; i < 50; i++) {
            f_rus_names.add(sheet.getRow(i).getCell(6).getStringCellValue());
            f_eng_names.add(sheet.getRow(i).getCell(8).getStringCellValue());
        }
    }
    private void loadFile() {
        try {
            wb = new XSSFWorkbook(file);
        } catch (IOException ex) {
            Logger.getLogger(ExcelProvider.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(ExcelProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void close() {
        try {
            wb.close();
        } catch (IOException e) {
            Logger.getLogger(ExcelProvider.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}