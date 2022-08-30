package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        //for test should_return_single_equation_when_multiply_given_start_number_2_end_number_2
        return null;

    }

    public Boolean isValid(int start, int end) {
        return start<=end;
    }

    public Boolean isInRange(int number) {
        return number>=1 && number<=1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {
        return null;

    }

    public String generateLine(int start, int row) {
        return null;

    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int product = multiplicand * multiplier;
        return multiplicand + "*" + multiplier + "=" + product;
    }
}
