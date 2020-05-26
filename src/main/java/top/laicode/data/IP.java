package top.laicode.data;

/**
 * @author jx
 * @date 2020/5/25 23:17
 * 加权的IP数据
 */
public class IP {
    private Integer weight;
    private String ip;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public IP(String ip, Integer weight) {
        this.weight = weight;
        this.ip = ip;
    }
}
