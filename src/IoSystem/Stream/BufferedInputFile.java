package IoSystem.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Luhaijie on 2018/9/17.
 */
public class BufferedInputFile {
    public static String read(String fileName) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        return "";
    }
}
