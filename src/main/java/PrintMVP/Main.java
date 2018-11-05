package PrintMVP;

import javax.print.*;

public class Main {

    public void main(String args[]) throws PrintException {
        String filename;
        if (args.length < 1) {
            filename = "file.pdf";
        } else {
            filename = args[0];
        }
        ScanPrint.print(filename);
    }
}
