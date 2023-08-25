package org.example;

import com.fasterxml.jackson.core.JsonToken;
import org.junit.Test;

public class TestSome {

    @Test
    public void test() {
        assert Library1.getSomePretty().startsWith(JsonToken.START_OBJECT.asString());
        System.out.println("ok");
    }
}