package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_CARD;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.HintCommand;

/**
 * As we are only doing white-box testing, our test cases do not cover path variations
 * outside of the PractiseCommand code. For example, inputs "1" and "1 abc" take the
 * same path through the PractiseCommand, and therefore we test only one of them.
 * The path variation for those two cases occur inside the ParserUtil, and
 * therefore should be covered by the ParserUtilTest.
 */
public class HintCommandParserTest {

    private final HintCommandParser parser = new HintCommandParser();

    @Test
    public void parse_validArgs_returnsHintCommand() {
        assertParseSuccess(parser, "1", new HintCommand(INDEX_FIRST_CARD));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT, HintCommand.MESSAGE_USAGE));
    }
}
