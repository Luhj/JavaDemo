package Demos;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Luhaijie on 2018/9/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }
}
