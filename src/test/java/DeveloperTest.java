import org.example.Developer;
import org.example.Employe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTest {


    private String programmingLanguage;

    @Test

    public void testGetSound() {

        var developer = new Developer("Linus", "Java");

        var expetced = "Woop Woop!";
        var actual = developer.getSound();


        assertEquals(expetced, actual);
    }

    @Test
    public void testProgrammingLangugage() {

        var developer = new Developer("Linus", "Java");

        var expetced = "Java";
        var actual = developer.getProgrammingLanguage();

        assertEquals(expetced, actual);
    }

}