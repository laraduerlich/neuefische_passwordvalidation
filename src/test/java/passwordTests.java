import org.example.PasswordChecks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class passwordTests {
    @Test
    void checkLength_ExpectTrue_WhenMin8Letters() {
        // GIVEN
        String password = "password";
        // WHEN
        boolean length = PasswordChecks.checkLength(password);
        // THEN
        Assertions.assertTrue(length);
    }
}
