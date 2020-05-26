package top.laicode.round;

/**
 * @author jx
 * @date 2020/5/25 23:21
 * 平滑轮询所使用的IP数据
 */
public class IPV2 {
    private String ip;
    private Integer weight;
    private Integer curr_weight;

    public IPV2(String ip, Integer weight, Integer curr_weight) {
        this.ip = ip;
        this.weight = weight;
        this.curr_weight = curr_weight;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCurr_weight() {
        return curr_weight;
    }

    public void setCurr_weight(Integer curr_weight) {
        this.curr_weight = curr_weight;
    }

    @Override
    public String toString() {
        return "IPV2{" +
                "ip='" + ip + '\'' +
                ", weight=" + weight +
                ", curr_weight=" + curr_weight +
                '}';
    }
}
