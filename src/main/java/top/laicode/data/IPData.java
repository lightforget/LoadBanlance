package top.laicode.data;

import top.laicode.round.IPV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jx
 * @date 2020/5/25 22:33
 * 所使用的到的IP数据
 */
public class IPData {
    public static final List<String> IPS = new ArrayList<>();
    public static final Map<String, Integer> IP_AND_WEIGHT = new HashMap<>();
    public static final List<IP> IP_LIST = new ArrayList<>();
    public static final List<IPV2> IP_LIST_V2 = new ArrayList<>();
    static{
        IPS.add("136.152.162.1");
        IPS.add("136.152.162.2");
        IPS.add("136.152.162.3");
        IPS.add("136.152.162.4");
        IPS.add("136.152.162.5");
        IPS.add("136.152.162.6");
        IPS.add("136.152.162.7");
        IPS.add("136.152.162.8");
        IPS.add("136.152.162.9");
        IPS.add("136.152.162.10");

        IP_AND_WEIGHT.put("A", 5);
        IP_AND_WEIGHT.put("B", 1);
        IP_AND_WEIGHT.put("C", 1);

        IP_LIST.add(new IP("A", 5));
        IP_LIST.add(new IP("B", 1));
        IP_LIST.add(new IP("C", 1));

        IP_LIST_V2.add(new IPV2("A", 5, 0));
        IP_LIST_V2.add(new IPV2("B", 1, 0));
        IP_LIST_V2.add(new IPV2("C", 1, 0));

    }
}
