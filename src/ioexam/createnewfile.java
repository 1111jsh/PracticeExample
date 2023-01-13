package ioexam;

import java.io.File;
import java.io.IOException;

public class createnewfile {
    public static void main(String[] args) throws IOException {
        File file = new File("./", "newCodestates.txt" );
        file.createNewFile();
    }
}
