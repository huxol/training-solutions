package gyakorlás.hilfe.fájlkezelés;

public class FájlLétrehozásÉsÍrás {

    /*
    import java.io.File;  // Import the File class
    import java.io.IOException;  // Import the IOException class to handle errors

    public class CreateFile {
      public static void main(String[] args) {
        try {
          File myObj = new File("filename.txt");
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
    }
---------------------

    import java.io.FileWriter;   // Import the FileWriter class
    import java.io.IOException;  // Import the IOException class to handle errors

    public class WriteToFile {
      public static void main(String[] args) {
        try {
          FileWriter myWriter = new FileWriter("filename.txt");
          myWriter.write("Files in Java might be tricky, but it is fun enough!");
          myWriter.close();
          System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
    }

----------------------

    Szöveges állomány kiírása soronként:

    public class FileWriter {

        public void writeLines(List<String> employees, BufferedWriter writer) {
            try {
                for (String employee : employees) {
                    writer.write(employee.getName() + "," + employee.getYearOfBirth());
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
        }

        public static void main(String[] args) {
            try (BufferedWriter writer = Files.newBufferedWriter(Path.of("data.csv"))) {
                new FileWriter().writeLines(writer);
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not write file", ioe);
            }
        }
    }

 */
}
