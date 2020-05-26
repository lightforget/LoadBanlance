package top.laicode.round;

import top.laicode.data.IPData;


/**
 * @author jx
 * @date 2020/5/25 22:51
 * 平滑加权轮询
 */
public class RoundV3 {
    private static int i = 0;
    private static int totalWeight = 0;
    static {
        for (IPV2 ipv2 : IPData.IP_LIST_V2) {
            totalWeight += ipv2.getWeight();
        }
    }

    public static String getIp() {
        int max = 0;
        int maxWeight = 0;
        final int n = IPData.IP_LIST_V2.size();
        for(int i=0;i<n;i++){
            IPV2 ipv2 = IPData.IP_LIST_V2.get(i);
            ipv2.setCurr_weight(ipv2.getCurr_weight() + ipv2.getWeight());
            if(ipv2.getCurr_weight() > maxWeight){
                maxWeight = ipv2.getCurr_weight();
                max = i;
            }
        }
        IPV2 ipv2 = IPData.IP_LIST_V2.get(max);
        ipv2.setCurr_weight(ipv2.getCurr_weight()-totalWeight);
        return ipv2.getIp();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getIp());
        }
    }
}
