package piotrmroz.handlers;

import piotrmroz.QuiteIdeasApplicationException;
import piotrmroz.model.UserInputCommand;

public class QuiteCommandHandler extends BaseCommandHandler {

    public static final String COMMAND_NAME = "quite";

    @Override
    public void handle(UserInputCommand command) {
        throw new QuiteIdeasApplicationException();
    }

    @Override
    protected String getCommandName() {
        return COMMAND_NAME;
    }
}
