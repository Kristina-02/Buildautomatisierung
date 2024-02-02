package org.campus02.novajkovic;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NotenverteilungTest {

    Notenverteilung nv;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        nv = new Notenverteilung();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Füge einen Studenten hinzu")
    void addStudent() {
        boolean result = nv.addStudent("Max");
    }
}