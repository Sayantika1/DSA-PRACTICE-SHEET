class Solution {
    public double myPow(double x, int n) {
        long power = n;

        if (power < 0) {
            power = -power;
        }

        double result = solve(x, power);

        if (n < 0) {
            return 1.0 / result;
        }

        return result;
    }

    public double solve(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = solve(x, n / 2);
        double result = half * half;

        if (n % 2 != 0) {
            result *= x;
        }

        return result;
    }
}