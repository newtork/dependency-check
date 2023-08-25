package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Library2 {
    public static String getSome()  {
        try {
            return new ObjectMapper().readTree("{\"foo\" :   \"bar\" \n\r\t}").toPrettyString();
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}