/*
 *  100以内的质数
 */
class PrimeNumber {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                if (i != j) {
                    if (i % j == 0) {
                        break;
                    } else {
                        if (j == 100) {
                            System.out.println(i);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

}
