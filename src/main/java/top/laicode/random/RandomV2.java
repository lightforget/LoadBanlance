package top.laicode.random;

import top.laicode.data.IPData;

import java.util.Random;
import java.util.Set;

/**
 * @author jx
 * @date 2020/5/25 22:33
 * 加权随机
 */
public class RandomV2 {

    public static String getIp() {
        int totalWeight = 0;
        Set<String> keys = IPData.IP_AND_WEIGHT.keySet();
        for (String key : keys) {
            totalWeight += IPData.IP_AND_WEIGHT.get(key);
        }
        Random r = new Random();
        int i = r.nextInt(totalWeight);
        for (String key : keys) {
            if(i <= IPData.IP_AND_WEIGHT.get(key)) return key;
            i -= IPData.IP_AND_WEIGHT.get(key);
        }
        return null;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getIp());
        }
    }
}
