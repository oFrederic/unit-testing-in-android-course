package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned() {
        String result = SUT.duplicate("");
        assertThat(result, is(""));
    }

    @Test
    public void duplicate_singleCharacter_sameStringReturned() {
        String result = SUT.duplicate("a ");
        assertThat(result, is("a a "));
    }

    @Test
    public void duplicate_longString_reversedStringReturned() {
        String result = SUT.duplicate("Frederic Wojcikowski ");
        assertThat(result, is("Frederic Wojcikowski Frederic Wojcikowski "));
    }
}