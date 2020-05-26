package top.laicode.round;

import top.laicode.data.IP;
import top.laicode.data.IPData;

import java.util.Set;


/**
 * @author jx
 * @date 2020/5/25 22:51
 * 加权轮询
 */
public class RoundV2 {
    private static int i = 0;
    private static int size = 0;

    static {
        for (IP ip : IPData.IP_LIST) {
            size += ip.getWeight();
        }
    }

    public static String getIp() {
        i++;
        if(i > size) i = 0;
        int curr = i;
        for (IP ip : IPData.IP_LIST) {
            if (curr <= ip.getWeight()) return ip.getIp();
            curr -= ip.getWeight();
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getIp());
        }
    }
}
