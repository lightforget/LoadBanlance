package top.laicode.round;

import top.laicode.data.IPData;


/**
 * @author jx
 * @date 2020/5/25 22:51
 * 普通轮询
 */
public class RoundV1 {
    private static int i = 0;
    final static int SIZE = IPData.IPS.size();

    public static String getIp() {
        i++;
        i %= SIZE;
        return IPData.IPS.get(i);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getIp());
        }
    }
}
