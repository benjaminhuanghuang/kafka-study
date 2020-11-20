package ben.study;

import java.util.Properties;

public class ProducerDemo {
    public static void main(String[] args) {
        String bootstrapServers = "127.0.0.1:9092";
        // Create producer properties
        Properties properties = new Properties();

        properties.setProperty("bootstrap.servers", bootstrapServers);
        properties.setProperty("key.serializer", "");
        properties.setProperty("value.serializer", "");

        // Create producer

        //
    }
}
