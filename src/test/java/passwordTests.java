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

    @Test
    void checkDigits_ExpectTrue_WhenDigits() {
        // GIVEN
        String password = "password123";
        // WHEN
        boolean digits = PasswordChecks.checkDigits(password);
        // THEN
        Assertions.assertTrue(digits);
    }
}
