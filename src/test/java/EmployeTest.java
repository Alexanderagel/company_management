import org.example.Employe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeTest {

    @Test
    public void testConstructorSetName(){
        var empolye = new Employe("Linus");

        var expected = "Linus";
        var actual = empolye.getName();
assertEquals(expected, actual );
    }



    @Test

    public void  testGetSound(){

        var empolye = new Employe("linus");

        var expetced = "Aaow!";
        var actual = empolye.getSound();


        assertEquals(expetced, actual);



    }


    @Test
    void testEatFood() {

        var empolye = new Employe("linus");

        var expetced = "Nom Nom Nom!";
        var actual = empolye.eatFood();


        assertEquals(expetced, actual);
    }
}
