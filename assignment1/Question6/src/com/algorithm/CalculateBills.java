package com.algorithm;

public class CalculateBills {
    private int calls;

    private double bills;

    public CalculateBills() {

    }

    public int getCalls() {
        return calls;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    public void setBills(int bills) {
        this.bills = bills;
    }



    public void calculateBills (int calls) {
        this.setCalls(calls);
        int number = 0;

        if(getCalls() < 0) {
            System.out.println("Invalid Input");
            return;
        }

        if(getCalls() <= 100) {
            number = 1;
        }
        else if (100 < getCalls() && getCalls() <= 150) {
            number = 2;
        }
        else if (150 < getCalls() && getCalls() <= 200) {
            number = 3;
        }
        else if (200 < getCalls()) {
            number = 4;
        }

        switch (number) {
            case 1:
                bills = 200;
                System.out.println("Bill of current month is $" + bills);
                break;
            case 2:
                bills = 200 + (0.60 * (getCalls() - 100));
                System.out.println("Bill of current month is $" + bills);
                break;
            case 3:
                bills = 200 + 50 * 0.60 + (0.50 * (getCalls() - 150));
                System.out.println("Bill of current month is $" + bills);
                break;
            case 4:
                bills = 200 + 50 * 0.60 + 50 * 0.50 +(0.40 * (getCalls() - 200));
                System.out.println("Bill of current month is $" + bills);
                break;
        }



    }
}
