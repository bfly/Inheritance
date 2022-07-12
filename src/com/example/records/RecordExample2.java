package com.example.records;

import java.util.List;
import java.util.Objects;

public class RecordExample2 {
    private final int number;
    private final String string;
    private final List<String> strings;

    public RecordExample2(int number, String string, List<String> strings) {
        this.number = number;
        this.string = string;
        this.strings = strings;
    }

    public int number() {
        return number;
    }

    public String string() {
        return string;
    }

    public List<String> strings() {
        return strings;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (RecordExample2) obj;
        return this.number == that.number &&
                Objects.equals(this.string, that.string) &&
                Objects.equals(this.strings, that.strings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, string, strings);
    }

    @Override
    public String toString() {
        return "RecordExample2[" +
                "number=" + number + ", " +
                "string=" + string + ", " +
                "strings=" + strings + ']';
    }

}
