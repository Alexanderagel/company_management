import org.example.CloudDeveloper;
import org.example.Website;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CloudDeveloperTest {

    @Test
    public void testFixWebsite() {
        CloudDeveloper cloudDeveloper = new CloudDeveloper("Alice", "Java");
        var website = new Website(false); // working = false
        cloudDeveloper.fixWebsite(website);

        var expetced = true;
        var actual = website.isWorking();

        assertEquals(expetced, actual);
    }
}
