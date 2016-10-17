package Shuler.Willie.Hurtlocker;

import org.apache.commons.io.IOUtils;

public class Main {
    public Main() {}

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = this.getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception {
        Application application = new Application();

        String output = (new Main()).readRawDataToString();
        System.out.println(output);

        application.run();
    }
}
