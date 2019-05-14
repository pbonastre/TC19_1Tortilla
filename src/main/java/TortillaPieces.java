import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TortillaPieces {

    private static final String INFILENAME = "C:\\workSpaceTuenti\\TC19Tortilla\\input\\testInputL.txt";
    private static String OUTFILENAME = "C:\\workSpaceTuenti\\TC19Tortilla\\output\\outputChallenge1.txt";
    private static Scanner in;
    private static PrintWriter out;


    public static void main(String[] args) throws FileNotFoundException {
        in = new Scanner(new FileReader(INFILENAME));
        out = new PrintWriter(OUTFILENAME);

        int cases = in.nextInt();

        for (int i = 1; i <= cases; i++) {
            out.print("Case #" + i + ": ");
            optainNumberOfTortillas();
        }
        in.close();
        out.close();
    }

    private static void optainNumberOfTortillas() {
        DecimalFormat df = new DecimalFormat("##0");
        double OnionPieces = in.nextDouble();
        double withoutOnionPieces = in.nextDouble();
        out.println(df.format(Math.ceil((Math.ceil(OnionPieces/2)) + (Math.ceil(withoutOnionPieces/2)))));
    }
}
