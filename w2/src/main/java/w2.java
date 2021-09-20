public class w2 {
    /**
     *
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     *
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     *
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double Bmi = weight / (height * height);
        if ((double) Math.round(Bmi * 10) / 10 <= 18.5) {
            return "Thiếu cân";
        }

        else if ((double) Math.round(Bmi * 10) / 10 > 18.5 && (double) Math.round(Bmi * 10) / 10 <= 22.9) {
            return "Bình thường";
        }

        else if ((double) Math.round(Bmi * 10) / 10 >= 23 && (double) Math.round(Bmi * 10) / 10 <= 24.9) {
            return "Thừa cân";
        }
        return "Béo phì";
    }
}
