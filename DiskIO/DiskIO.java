import java.io.*;

public class DiskIO {
    public static void processInputOutputFiles(String[] args) throws IOException {
        File fi = new File(args[0]);
        FileInputStream fip = new FileInputStream(fi);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }

        System.out.println(sb.toString());
        reader.close();
        fip.close();



        File fo = new File(args[1]);
        FileOutputStream fop = new FileOutputStream(fo);

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        writer.append("");

        writer.close();
        fop.close();
    }

    public static void processCLArguments(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Usage: java DiskIO inputFile outputFile");
        } else {
            System.out.println("Input will be read from: " + args[0]);
            System.out.println("Output will be written into: " + args[1]);

            processInputOutputFiles(args);
        }
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(args[0]);

        processCLArguments(args);
    }
}
