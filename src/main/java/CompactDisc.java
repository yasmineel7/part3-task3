import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class CompactDisc {
    public static void main(String[] args) throws IOException
    {

        Scanner input = new Scanner(new File("src/main/Classics"));

        String title;
        String artist;
// ADD LINES FOR TASK #3 HERE
// Declare an array of Song objects, called cd,
// with a size of 6
        Song cd[]= new Song [6];
        for (int i = 0; i < cd.length; i++) {

            title = input.nextLine();
            artist = input.nextLine();

// ADD LINES FOR TASK #3 HERE
// Fill the array by creating a new song with
// the title and artist and storing it in the
// appropriate position in the array
            cd[i] = new Song (title, artist);
        }
        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++)
        { System.out.print(cd[i]);


// ADD LINES FOR TASK #3 HERE
// Print the contents of the array to the console

        }
    }
}
