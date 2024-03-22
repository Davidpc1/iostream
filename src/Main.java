package docfile;

import java.io.File;
import java.util.Scanner;

public class indoc {
    public indoc() {
        Scanner n = new Scanner(System.in);
        System.out.println(" NHAP FILE: ");
        String path = n.nextLine();
        File file = new File(path);
        if(file.exists()== true ) {
            System.out.println("true");
            System.out.println("TEN FILE:" +file.getName());
            System.err.println("DO LON LA: " + file.length()+ " byte")	;
        }
        else
            System.out.println("false");


    }
    public static void main(String[] args) {
        new indoc();
    }
}
