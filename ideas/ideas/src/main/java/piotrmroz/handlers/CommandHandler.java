package piotrmroz.handlers;

import piotrmroz.model.UserInputCommand;

public interface CommandHandler {

    void handle(UserInputCommand command);

    boolean supports(String name);
}
