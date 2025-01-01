public class bitMan {

    public static int getBit(int n, int pos) {
        int mask = 1 << pos;
        int finalNum = n & mask;

        if(finalNum == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int pos) {
        int mask = 1 << pos;
        int finalNum = n | mask;

        return finalNum;
    }

    public static int clearBit(int n, int pos) {
        int mask = 1 << pos;
        int finalNum = n & (~mask);

        return finalNum;
    }

    public static int updateBit(int n, int pos, int val) {
        if(val == 0) {
            return clearBit(n, pos);
        } else {
            return setBit(n, pos);
        }

    }

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int val = 0;

        System.out.println("getBit : " + getBit(n, pos));
        System.out.println("setBit : " + setBit(n, pos));
        System.out.println("clearBit : " + clearBit(n, pos));
        System.out.println("updateBit : " + updateBit(n, pos, val));
    }
}
