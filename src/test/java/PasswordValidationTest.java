import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void isPasswordValid_true() {
        assertTrue(PasswordValidation.isPasswordValid("Abcdefgh1"));
    }

    @Test
    void isPasswordValid_short_false() {
        assertFalse(PasswordValidation.isPasswordValid("abcdefg"));
    }

    @Test
    void isPasswordValid_noDigit_false() {
        assertFalse(PasswordValidation.isPasswordValid("abcdefghij"));
    }


    @Test
    void hasDigit_true() {
        assertTrue(PasswordValidation.hasDigit("abc1defge"));
    }

    @Test
    void hasDigit_false() {
        assertFalse(PasswordValidation.hasDigit("abcdefge"));
    }

    @Test
    void proveLength_length8_isValid() {
        assertTrue(PasswordValidation.proveLength("abcdefgh"));
    }

    @Test
    void proveLength_length7_isFalse() {
        assertFalse(PasswordValidation.proveLength("abcdefg"));
    }

    @Test
    void hasSmallAndUpperLetters_True() {
        assertTrue(PasswordValidation.hasSmallAndUpperLetters("Abc1456"));
    }

    @Test
    void hasSmallAndUpperLetters_noUpper_False() {
        assertFalse(PasswordValidation.hasSmallAndUpperLetters("abc1 456"));
    }

    @Test
    void hasSmallAndUpperLetters_noSmall_False() {
        assertFalse(PasswordValidation.hasSmallAndUpperLetters("AB1 C456"));
    }

    @Test
    void checkPasswordQuality_Treffer_false() {
        assertFalse(PasswordValidation.checkPasswordQuality("Passwort"));
    }

    @Test
    void checkPasswordQuality_keinTreffer_false() {
        assertTrue(PasswordValidation.checkPasswordQuality("abc"));
    }


}