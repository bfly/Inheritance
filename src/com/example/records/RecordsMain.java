package com.example.records;

import java.util.List;

public class RecordsMain {

private void go() {
    RecordExample strings = new RecordExample(5, "Five",
            List.of("This", "is", "a", "list", "of", "strings."));
    RecordExample2 strings2 = new RecordExample2(5, "Five",
            List.of("This", "is", "a", "list", "of", "strings."));
    RecordSubclass strings3 = new RecordSubclass(5, "Five",
            List.of("This", "is", "a", "list", "of", "strings."));
    assert strings.toString().equals(strings2.toString());
    assert strings.toString().equals(strings3.toString());
    System.out.println(strings);
    System.out.println(strings2);
    System.out.println(strings3);
    System.out.println(strings.multiString());
}

    public static void main(String[] args) {
        new RecordsMain().go();
    }
}
