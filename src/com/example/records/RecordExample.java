package com.example.records;

import java.util.List;

public record RecordExample(int number, String string, List<String> strings) {

    public RecordExample {
        if (number < 0) {
            throw new IllegalArgumentException(String.format("Number must not be negative: %d", number));
        }
    }

    public String multiString() { return string.repeat(number); }
}
