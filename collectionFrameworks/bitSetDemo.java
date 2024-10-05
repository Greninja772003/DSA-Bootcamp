package collectionFrameworks;

import java.util.BitSet;

public class bitSetDemo {
    public static void main(String[] args) {
        BitSet bs = new BitSet();
        bs.set(0);
        bs.set(2);
        bs.set(4);
        bs.set(6);
        bs.set(8);
        BitSet bs2 = new BitSet();
        bs2.set(0);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        bs2.set(8);
        bs.flip(0,9);
        bs.xor(bs2);
        System.out.println(bs);
    }
}
