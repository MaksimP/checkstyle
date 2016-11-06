package com.puppycrawl.tools.checkstyle.checks.whitespace;

public class InputWhitespaceAfter {

    boolean condition() {
        return false;
    }

    void testIfElse() {
        //Valid
        if (condition()) {
            testIfElse();
        } else {
            testIfElse();
        }

        //Invalid
        if(condition()) {                  //violation
            testIfElse();
        } else {
            testIfElse();
        }

        //Invalid
        if (condition()) {
            testIfElse();
        } else{                            //violation
            testIfElse();
        }
    }

    void testWhile() {
        //Valid
        while (condition()) {
            testWhile();
        }

        //Invalid
        while(condition()) {               //violation
            testWhile();
        }
    }

    void testFor() {
        //Valid
        for (int i = 0; i < 5; i++) {
            testFor();
        }

        //Invalid
        for(int i = 0; i < 5; i++) {      //violation
            testFor();
        }
    }
}
