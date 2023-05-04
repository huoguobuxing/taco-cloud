package tacos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TacoCloudApplication {

    private final OrderProps orderProps;

    public TacoCloudApplication(OrderProps orderProps) {
        this.orderProps = orderProps;
        log.info(String.valueOf(this.orderProps.getPageSize()));
    }

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);

    }

}
