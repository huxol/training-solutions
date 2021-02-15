package gyakorlás.hilfe.fájlkezelés;

public class FájlokOlvasása {

    /*
    import java.io.File;  // Import the File class
    import java.io.FileNotFoundException;  // Import this class to handle errors
    import java.util.Scanner; // Import the Scanner class to read text files

    public class ReadFile {
      public static void main(String[] args) {
        try {
          File myObj = new File("filename.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
    }
---------

    Fájlinformációk:

    import java.io.File;  // Import the File class

    public class GetFileInfo {
          public static void main(String[] args) {
            File myObj = new File("filename.txt");
            if (myObj.exists()) {
              System.out.println("File name: " + myObj.getName());
              System.out.println("Absolute path: " + myObj.getAbsolutePath());
              System.out.println("Writeable: " + myObj.canWrite());
              System.out.println("Readable " + myObj.canRead());
              System.out.println("File size in bytes " + myObj.length());
            } else {
              System.out.println("The file does not exist.");
            }
          }
    }

---------------------

    Szöveges fájl beolvasása soronként:

    public class FileReader {

        public List<String> readLines(BufferedReader reader) throws IOException {
            String line;
            while ((line = reader.readLine())  != null) {
                System.out.println(line);
            }
        }

        public static void main(String[] args) {
            try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
                new FileReader().readLines(reader);
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
        }
    }
    Ugyanez classpathról:

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(FileReader.class.getResourceAsStream("data.csv")))) {
        new FileReader().readLines(reader);
    } catch (IOException ioe) {
        throw new IllegalStateException("Can not read file", ioe);
}

---------

 */
}
