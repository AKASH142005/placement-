class Thirdmax {
    public static void main(String[] args) {
        int[][] a = { {3, 8, 5}, {12, 7, 9}, {6, 14, 10} };

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>max) {
                    thirdMax = secondMax;
                    secondMax = max;
                    max=a[i][j];
                } else if (a[i][j] > secondMax && a[i][j]!=max) {
                    thirdMax = secondMax;
                    secondMax = a[i][j];
                } else if (a[i][j]>thirdMax && a[i][j]!=max&&a[i][j]!=secondMax) {
                    thirdMax=a[i][j];
                }
            }
        }

        System.out.println("Third Max: " + thirdMax);
    }
}