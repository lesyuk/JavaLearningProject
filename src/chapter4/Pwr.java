package chapter4;

public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.val = 1; // любое число в степени 0 равно 1
        if(exp==0) return; // если степерь 0 не заходим в цикл
        for ( ; exp > 0; exp--) this.val *= this.b;
    }

    double get_pwr() {
        return this.val;
    }
}
