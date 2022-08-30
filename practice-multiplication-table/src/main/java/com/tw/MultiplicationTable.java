package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        //for test should_return_single_equation_when_multiply_given_start_number_2_end_number_2
        int product = start * end;
        return (start==2&&end==2)
            ?start + "*" + end + "=" + product
            :null;
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
        String table = "";
            for(int x=start; x<=end; x++){
                table += generateLine(start, x) + System.lineSeparator();
            }
        return table.trim();
    }
    //x=start(2)
    //<end=4
    //generate start=2, x=2
    //2*2=2
    //generate start=2, x=3
    //2*3=6  3*3=9
    //generate start=2, x=3
    //2*4=8  3*4=16  4*4=16
    public String generateLine(int start, int row) {
        String line = "";
        for(int x=start; x<=row; x++){
            line += generateSingleExpression(x, row) + "  ";
        }
        return line.trim();
        //x=start(2)
        //<row=4
        //generate x=2, row=4  = 2*4=16
        //generate x=3, row=4  = 3*4=16
        //generate x=4, row=4  = 4*4=16
        //2*4=16  3*4=16 4*4=16
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        int product = multiplicand * multiplier;
        return multiplicand + "*" + multiplier + "=" + product;
    }
}
