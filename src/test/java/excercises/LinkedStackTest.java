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
    void shouldPopItems() {
        //given
        Stack<String > stack = new LinkedStack<>();
        stack.push("Warsaw");
        stack.push("Madrid");
        stack.push("London");

        //when
        String pop = stack.pop();

        //then
        assertThat(pop).isEqualTo("London");
        assertThat(stack.size()).isEqualTo(2);
    }

    @Test
    void shouldPeekItems() {
        //given
        Stack<String > stack = new LinkedStack<>();
        stack.push("Warsaw");
        stack.push("Madrid");
        stack.push("London");

        //when
        String peek1 = stack.peek();
        int size1 = stack.size();
        stack.pop();
        stack.pop();
        String peek2 = stack.peek();
        stack.pop();
        int size2 = stack.size();

        //then
        assertThat(peek1).isEqualTo("London");
        assertThat(size1).isEqualTo(3);
        assertThat(peek2).isEqualTo("Warsaw");
        assertThat(size2).isEqualTo(0);
    }
}