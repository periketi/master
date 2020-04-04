package com;
public class Trace {

    public Trace() {
    }

    public void execute() {

        int primes[] = {2, 3, 5, 7};
        int total = 0;

        for (int i = 0; i < primes.length; i++) {
            total += primes[i];
        }

        int output1 = total / primes.length;
        System.out.println(output1);

        double output3 = ((double)total) / primes.length;
        System.out.println(output3);
    }

    public static void main(String[] args) {
        Trace t = new Trace();
        t.execute();
    }
}