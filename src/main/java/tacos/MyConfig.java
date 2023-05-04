package tacos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class MyConfig {
    //通常采用如下方式，注入H2 datasouce，并配置属性
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
//                .addScript("taco_schema.sql")
//                .addScripts("user_data.sql", "ingredient_data.sql")
                .build();
    }
}
