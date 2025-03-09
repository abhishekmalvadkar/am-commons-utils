package com.amalvadkar.commons.utils.string;

import com.amalvadkar.commons.utils.constants.StringConstants;
import com.amalvadkar.commons.utils.exceptions.InvalidStringException;

/**
 * Utility class for common string operations.
 */
public final class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Capitalizes the first letter of the input string.
     *
     * @param input The string to capitalize.
     * @return Capitalized string or an empty string if input is null/empty.
     * @throws InvalidStringException if the input is null or empty.
     */
    public static String capitalize(String input) {
        if (isEmpty(input)) {
            throw new InvalidStringException("Input string cannot be null or empty.");
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    /**
     * Checks if a string is null or empty.
     *
     * @param input The string to check.
     * @return True if the string is null or empty, otherwise false.
     */
    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    /**
     * Reverses a given string.
     *
     * @param input The string to reverse.
     * @return The reversed string.
     */
    public static String reverse(String input) {
        if (isEmpty(input)) {
            return StringConstants.EMPTY_STRING;
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Trims spaces from both ends of the string.
     *
     * @param input The string to trim.
     * @return The trimmed string.
     */
    public static String trim(String input) {
        return isEmpty(input) ? StringConstants.EMPTY_STRING : input.trim();
    }

    /**
     * Checks if a string contains only letters.
     *
     * @param input The string to check.
     * @return True if the string contains only letters, otherwise false.
     */
    public static boolean containsOnlyLetters(String input) {
        return !isEmpty(input) && input.matches("[a-zA-Z]+");
    }
}
