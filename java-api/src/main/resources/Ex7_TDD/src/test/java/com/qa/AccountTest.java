package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account act;
    @BeforeEach
    void setUp() {
        act = new Account (new String[]{"Link","Visa"}, "10_10_22", "11223344", "1234");

    }

    @Test
    @DisplayName("Matched Accounts")
    void compareTo() {
        Account inputObject = new Account(new String[]{"Link"}, "10_10_22", "11223344", "1234");

        assertEquals(0, act.compareTo(inputObject),"Login Failed" );
    }
}