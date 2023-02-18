package Oop.View;

import java.util.Scanner;

import Oop.Service.CatService;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    private CatService catService = new CatService();

    private void menu() {

        System.out.println("1/ Add a cat.");
        System.out.println("2/ Delete a cat by ID");
        System.out.println("3/ Show all cats");
        System.out.println("4/ Show a cat by ID");
        System.out.println("5/ Change cat's voice by ID");
        System.out.println("6/ Quit program!");
    }

    public void runProgram() {
        int n = 0;
        do {
            System.out.println("Welcome to Cat Management by Musk's mother!");
            menu();
            System.out.println("Your choice is(1-6): ");
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    catService.addACat();
                    break;
                case 2:
                    catService.deleteACatById();
                    break;
                case 3:
                    catService.showAllCats();
                    break;
                case 4:
                    catService.showCatsById();
                    break;
                case 5:
                    catService.setVoiceById();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (n != 6);
    }

}
