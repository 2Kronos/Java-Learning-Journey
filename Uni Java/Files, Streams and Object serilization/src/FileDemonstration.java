// Fig. 17.3: FileDemonstration.java
// File class used to obtain file and directory information.

import java.util.Scanner;
import java.io.File;

public class FileDemonstration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file or directory name: ");
        String path = input.nextLine();
        analyzePath(path);
    } // end main

    // Display information about file user specifies
    public static void analyzePath(String path) {
        // Create File object based on user input
        File name = new File(path);

        // If name exists, output information about it
        if (name.exists()) {
            // Display file (or directory) information
            System.out.printf(
                "%s exists\n%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                name.getName(),
                (name.isFile() ? "is a file" : "is not a file"),
                (name.isDirectory() ? "is a directory" : "is not a directory"),
                (name.isAbsolute() ? "is absolute path" : "is not absolute path"),
                "Last modified: ", name.lastModified(),
                "Length: ", name.length(),
                "Path: ", name.getPath(),
                "Absolute path: ", name.getAbsolutePath(),
                "Parent: ", name.getParent()
            );

            if (name.isDirectory()) { // Output directory listing
                String[] directory = name.list();
                System.out.println("\n\nDirectory contents:\n");

                for (String directoryName : directory) {
                    System.out.println(directoryName);
                }
            } // end if
        } else { // Not file or directory, output error message
            System.out.printf("%s does not exist.", path);
        } // end else
    } // end method analyzePath
} // end class FileDemonstration
