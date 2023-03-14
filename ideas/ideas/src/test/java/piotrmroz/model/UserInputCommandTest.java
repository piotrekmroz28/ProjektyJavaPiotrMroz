package piotrmroz.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import piotrmroz.Action;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

class UserInputCommandTest {

    @Test
    void shouldBuildCorrectUserInputCommand() {
        // given
        String input = "category add CategoryName";

        // when
        UserInputCommand userInputCommand = new UserInputCommand(input);

        // then
        assertEquals("category", userInputCommand.getCommand());
        assertEquals(Action.ADD, userInputCommand.getAction());
        assertLinesMatch(List.of("CategoryName"), userInputCommand.getParam());
    }

    @Test
    void shouldBuildCorrectUserInputCommandWithMultipleParams() {
        // given
        String input = "command add param1 param2 param3";

        // when
        UserInputCommand userInputCommand = new UserInputCommand(input);

        // then
        assertEquals("command", userInputCommand.getCommand());
        assertEquals(Action.ADD, userInputCommand.getAction());
        assertLinesMatch(List.of("param1", "param2", "param3"), userInputCommand.getParam());
    }

    @Test
    void shouldBuildCorrectUserInputCommandWithoutParams() {
        // given
        String input = "command add";

        // when
        UserInputCommand userInputCommand = new UserInputCommand(input);

        // then
        assertEquals("command", userInputCommand.getCommand());
        assertEquals(Action.ADD, userInputCommand.getAction());
        assertEquals(0, userInputCommand.getParam().size());
    }
}