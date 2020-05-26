package top.laicode.random;

import top.laicode.data.IPData;

import java.util.Random;

/**
 * @author jx
 * @date 2020/5/25 22:33
 * 普通随机
 */
public class RandomV1 {

    public static String getIp() {
        final int size = IPData.IPS.size();
        Random r = new Random();
        int i = r.nextInt(size);
        return IPData.IPS.get(i);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getIp());
        }
    }
}
