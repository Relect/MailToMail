package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdIn implements in {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<String> ask(String question) {
        System.out.println(question);
        List<String> scannerList = new ArrayList<>();
        String str;
        while ( scanner.hasNextLine() && (str = scanner.nextLine()) != "") {
            scannerList.add(str);
        }
        return scannerList;
    }

    @Override
    public String answer(String answer) {
        return null;
    }
}
