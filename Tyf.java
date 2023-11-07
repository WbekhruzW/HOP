public class Tyf {
    public static void main(String[] args) {
        int [] a = {1, -3,  2, 0, -1, -1, 2, 1, 0,0 };
        int nol = 0;
        int musbat = 0;
        int manfi = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 ) {
                musbat++;
            }
            if (a[i] == 0 ) {
                nol++;
            }
            if (a[i] < 0 ) {
                manfi++;
            }
        }
    }
}
