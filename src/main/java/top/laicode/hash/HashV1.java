package top.laicode.hash;

import top.laicode.data.IP;
import top.laicode.data.IPData;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author jx
 * @date 2020/5/26 12:47
 * 普通哈希环
 */
public class HashV1 {
    private static TreeMap<Integer, String> treeMap = new TreeMap<>();
    private final static int VIRTUAL_NODES = 160;
    static {
        List<IP> ipList = IPData.IP_LIST;
        for (IP ip : ipList) {
            for (int i=0;i<VIRTUAL_NODES;i++){
                treeMap.put(getHash(ip.getIp() + "VM" + i), ip.getIp());
            }
        }
    }

    public static String getIp(String ip){
        Integer hash = getHash(ip);
        SortedMap<Integer, String> tailMap = treeMap.tailMap(hash);
        if(tailMap == null){
            return treeMap.get(treeMap.firstKey());
        }

        return tailMap.get(tailMap.firstKey());
    }

    private static Integer getHash(String ip){
        final int p = 1677619;
        int hash = (int)2166136261L;
        for(int i=0;i<ip.length();i++){
            hash = (hash ^ ip.charAt(i)) * p;
        }
        hash += hash << 13;
        hash += hash >> 7;
        hash += hash << 3;
        hash += hash >> 17;
        hash += hash << 5;
        if(hash < 0){
            hash = Math.abs(hash);
        }
        return hash;
    }

    public static void main(String[] args) {
        for (int i = 0; i < IPData.IPS.size(); i++) {
            System.out.println(getIp(IPData.IPS.get(i)));
        }
    }
}
