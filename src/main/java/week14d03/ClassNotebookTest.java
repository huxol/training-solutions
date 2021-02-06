package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassNotebookTest {

    @Test
    public void sortNotebookTest() {
        ClassNotebook csn = new ClassNotebook(new ArrayList<>(List.of(new Student("John"),new Student("Jane"),new Student("Bill"),new Student("Jack"))));

        List<Student> result = csn.sortNotebook();

        assertEquals("John",csn.getStudents().get(0).getName());

        assertEquals("Bill", result.get(0).getName());
        assertEquals("Bill", result.get(3).getName());
    }
}
