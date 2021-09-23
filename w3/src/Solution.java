public class Solution {
    private int numerator;
    private int denominator = 1;

    /**
     * constructor.
     * @param numerator is the numerator
     * @param denominator is the denominator
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = (denominator == 0) ? this.denominator : denominator;
    }

    /**
     * set Numerator.
     * @param numerator is the numerator
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    /**
     * set denominator.
     * @param denominator í the denominator
     */
    public void setDenominator(int denominator) {
        this.denominator = (denominator == 0) ? this.denominator : denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * find the gcd of (a, b).
     * @param a is the 1th number
     * @param b is the 2th number
     * @return gcd
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return Math.abs(gcd(b, a % b));
    }

    /**
     * Reduce.
     *
     * @return this object
     */
    public Solution reduce() {
        int red = gcd(this.numerator, this.denominator);
        numerator = numerator / red;
        denominator = denominator / red;
        return this;
    }

    /**
     * add with other object.
     * @param other is the other object
     * @return this solution
     */
    public Solution add(Solution other) {
        numerator = numerator * other.getDenominator() + denominator * other.getNumerator();
        denominator *= other.getDenominator();
        return this;
    }

    /**
     * sub with other object.
     * @param other is the other object
     * @return this solution
     */
    public Solution subtract(Solution other) {
        numerator = numerator * other.getDenominator() - denominator * other.getNumerator();
        denominator *= other.getDenominator();
        return this;
    }

    /**
     * multiply with other object.
     * @param other is the other object
     * @return this solution
     */
    public Solution multiply(Solution other) {
        numerator *= other.getNumerator();
        denominator *= other.getDenominator();
        return this;
    }

    /**
     * divide the other object.
     * @param other is the other object
     * @return this solution
     */
    public Solution divide(Solution other) {
        numerator *= other.getDenominator();
        denominator *= other.getNumerator();
        return this;
    }

    /**
     * compare with other object.
     * @param object is the other object
     * @return true or false
     */
    public boolean equals(Object object) {
        if (object instanceof Solution) {
            Solution other = (Solution) object;
            int n = numerator * other.getDenominator() - denominator * other.getNumerator();
            if (n == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution(10,20);
        Solution s2 = new Solution(-1,2);
        Solution s3 = new Solution(5 , 10);
        Solution s4 = new Solution(-1, -2);

        System.out.println(s1.equals(s4));
    }
}
