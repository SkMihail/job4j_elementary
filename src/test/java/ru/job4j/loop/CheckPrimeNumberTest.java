package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    public void when881() {
        int number = 881;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    public void when882() {
        int number = 882;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    public void when162123683() {
        int number = 162123683;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    public void when1073741789() {
        int number = 1073741789;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }
}