package Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
    
    public void loadMenuData(){
        try {
            File file = new File("doc/coffees.txt");
            Scanner scan = new Scanner(file);
            
            while(scan.hasNextLine()){
                coffeeMenu.add(scan.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("File not found. Check path and filename");
        }
    }
}
