package Oop.Service;

import java.util.ArrayList;
import java.util.List;

import Oop.Model.BlackCat;
import Oop.Model.Cat;
import Oop.Model.EnglishCat;
import Oop.Model.PersianCat;
import Oop.MyUtil.Util;

public class CatService {
    private List<Cat> catList = new ArrayList<>();

    public void addACat() {
        System.out.println("Which type of cat you want to add? ");
        System.out.println("1/ Black Cat");
        System.out.println("2/ English Cat");
        System.out.println("3/ Persian Cat");
        Cat in = null;
        int choice = Util.getInt("Input an integer from 1 to 3", "Wrong type!");
        switch (choice) {
            case 1:
                in = new BlackCat();
                break;
            case 2:
                in = new EnglishCat();
                break;
            case 3:
                in = new PersianCat();
                break;
            default:
                break;
        }
        if (in != null) {
            catList.add(in);
            System.out.println("Add a cat successfully!");
        } else
            System.out.println("Fail to add");

    }

    public void deleteACatById() {
        int id = Util.getInt("Input ID: ", "Wrong type");
        for (Cat cat : catList) {
            if (cat.getId() == id) {
                catList.remove(cat);
                System.out.println("Remove successfully");
                return;
            }
        }
        System.out.println("ID is not valid");
    }

    public void showAllCats() {
        if (catList.isEmpty())
            System.out.println("The list of cats is empty!");
        else
            for (Cat cat : catList) {
                System.out.println(cat);
            }
    }

    public void showCatsById() {
        int id = Util.getInt("Input ID: ", "Wrong type");
        for (Cat cat : catList) {
            if (cat.getId() == id) {
                System.out.println(cat);
                return;
            }
        }
        System.out.println("ID is not valid");
    }

    public void setVoiceById() {
        int id = Util.getInt("Input ID: ", "Wrong type");
        String newVoice = Util.getString("Input new voice: ");
        for (Cat cat : catList) {
            if (cat.getId() == id) {
                cat.setVoice(newVoice);
                System.out.println(cat);
                return;
            }
        }
        System.out.println("ID is not valid");
    }

}
