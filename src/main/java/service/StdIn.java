package service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdIn implements in {

    @Override
    public List<String> ask(InputStream source) {
        Scanner scanner = new Scanner(source);
        List<String> scannerList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            scannerList.add(scanner.nextLine());
        }
        return scannerList;
    }
}
