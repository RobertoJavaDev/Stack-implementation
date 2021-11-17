package excercises;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    @Test
    void shouldPushItems() {
        //given
        Stack<String> stack = new LinkedStack<>();

        //when
        stack.push("Warsaw");
        stack.push("Madrid");
        stack.push("London");

        //then
        assertThat(stack.size()).isEqualTo(3);
    }

    @Test
    void peek() {
        //given

        //when

        //then

    }

    @Test
    void size() {
        //given

        //when

        //then

    }
}