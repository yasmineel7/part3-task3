import java.util.Scanner;
import java.io.*;

public class CompactDisc {
    public static void main(String[] args) throws IOException
    {

        Scanner input = new Scanner(new File("src/main/Classics"));

        //variables
        String title;
        String artist;

        //size of arrays
        Song[] cd = new Song [6];
        for (int i = 0; i < cd.length; i++) {
            title = input.nextLine();
            artist = input.nextLine();

            //new Song
            cd[i] = new Song (title, artist);
        }
        //Print the classics file
        System.out.println("Contents of Classics:");
        for (Song song : cd) {
            System.out.print(song);


        }
    }
}
