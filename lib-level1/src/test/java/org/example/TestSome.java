package org.example;

import com.fasterxml.jackson.core.JsonToken;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestSome {

    @Test
    public void test() {
        assertThat("JSON format", Library1.getSomePretty().startsWith(JsonToken.START_OBJECT.asString()));
    }
}