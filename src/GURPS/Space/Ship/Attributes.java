package GURPS.Space.Ship;

public class Attributes<A1, A2, A3, A4, A5> {
    long cost;
    A1 a1;
    A2 a2;
    A3 a3;
    A4 a4;
    A5 a5;

    public Attributes(long cost, A1 a1) {
        this.cost=cost;
        this.a1=a1;
    }

    public Attributes(long cost, A1 a1, A2 a2) {
        this.cost = cost;
        this.a1 = a1;
        this.a2 = a2;
    }

    public Attributes(long cost, A1 a1, A2 a2, A3 a3) {
        this.cost = cost;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Attributes(long cost, A1 a1, A2 a2, A3 a3, A4 a4) {
        this.cost = cost;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public Attributes(long cost, A1 a1, A2 a2, A3 a3, A4 a4, A5 a5) {
        this.cost = cost;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public A1 getVal1() {
        return a1;
    }

    public void setVal1(A1 a1) {
        this.a1 = a1;
    }

    public A2 getVal2() {
        return a2;
    }

    public void setVal2(A2 a2) {
        this.a2 = a2;
    }

    public A3 getVal3() {
        return a3;
    }

    public void setVal3(A3 a3) {
        this.a3 = a3;
    }

    public A4 getVal4() {
        return a4;
    }

    public void setVal4(A4 a4) {
        this.a4 = a4;
    }

    public A5 getVal5() {
        return a5;
    }

    public void setVal5(A5 a5) {
        this.a5 = a5;
    }
}

