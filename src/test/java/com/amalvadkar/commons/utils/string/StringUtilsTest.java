package com.amalvadkar.commons.utils.string;

import com.amalvadkar.commons.utils.exceptions.InvalidStringException;
import common.AbstractUnitTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringUtilsTest extends AbstractUnitTest {

    @Test
    void capitalize_should_capitalize_first_letter() {
        assertThat(StringUtils.capitalize("hello")).isEqualTo("Hello");
    }

    @Test
    void capitalize_should_throw_exception_when_input_is_null() {
        assertThatThrownBy(() -> StringUtils.capitalize(null))
                .isInstanceOf(InvalidStringException.class)
                .hasMessage("Input string cannot be null or empty.");
    }

    @Test
    void is_empty_should_return_true_when_string_is_empty() {
        assertThat(StringUtils.isEmpty("")).isTrue();
    }

    @Test
    void is_empty_should_return_false_when_string_is_not_empty() {
        assertThat(StringUtils.isEmpty("test")).isFalse();
    }

    @Test
    void reverse_should_return_reversed_string() {
        assertThat(StringUtils.reverse("hello")).isEqualTo("olleh");
    }

    @Test
    void reverse_should_return_empty_when_input_is_empty() {
        assertThat(StringUtils.reverse("")).isEqualTo("");
    }

    @Test
    void trim_should_remove_leading_and_trailing_spaces() {
        assertThat(StringUtils.trim("  hello  ")).isEqualTo("hello");
    }

    @Test
    void contains_only_letters_should_return_true_when_only_letters() {
        assertThat(StringUtils.containsOnlyLetters("Hello")).isTrue();
    }

    @Test
    void contains_only_letters_should_return_false_when_contains_numbers() {
        assertThat(StringUtils.containsOnlyLetters("Hello123")).isFalse();
    }

}