package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void createStudent() {
        Student s = new Student("John");

        assertEquals("John", s.getName());
        assertEquals(0, s.getNotes().size());
    }

    @Test
    public void addNoteTest() {
        Student s = new Student("John");
        s.addNote("nath", 4);
        assertEquals(1, s.getNotes().size());

        s.addNote("nath", 5);
        assertEquals(1, s.getNotes().size());

        s.addNote("biology", 3);
        assertEquals(1, s.getNotes().size());

        assertEquals(5, s.getNotes().get("math").get(1));
        assertEquals(5, s.getNotes().get("biology").get(0));
    }
}
