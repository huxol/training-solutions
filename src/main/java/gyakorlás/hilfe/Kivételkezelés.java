package gyakorlás.hilfe;

public class Kivételkezelés {

    /*
    public class Main {
      public static void main(String[] args) {
        try {
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
        } catch (Exception e) {
          System.out.println("Something went wrong.");
        } finally {
          System.out.println("The 'try catch' is finished.");
        }
      }

   -----
   throw

   public class Main {
      static void checkAge(int age) {
        if (age < 18) {
          throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
          System.out.println("Access granted - You are old enough!");
        }
      }

      public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
      }

  -----

  Több kivétel elkapása egyszerre (multi-catch):

   catch (MyExceptionA | MyExceptionB e)
   -----

   public class TrainerParser {

        public static final String SEPARATOR =";";

        public Trainer parse(String line) {
          try {
            String[] fields =  line.split(SEPARATOR);
            Trainer trainer = new Trainer(fields[0], Integer.parseInt(field[1]));
          } catch (NullPointerException | IllegalArgumentException | IndexOutOfBoundsException e) {
             throw new ParseException("Invalid line = " + line, 0);
          }
    }

    -------

    Példa a Try-With-Resources szerkezetre:

    try (BufferedReader reader = new BufferedReader(new StringReader(values))) {
        while ((line = reader.readLine()) != null) {
            Trainer trainer = parseLine(line);
            trainers.add(trainer);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Error by parsing, general io", ioe);
        }
    }
}
  */
}
