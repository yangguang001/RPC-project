package feign.demo.client;

/**
 * Created by yz on 2018/3/17.
 */
public interface ServiceInstanceChooser {
    ServiceInstance choose(String serviceId);
}
