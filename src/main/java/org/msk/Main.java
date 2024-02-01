package org.msk;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        try (StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration())) {

            for(int j=0; j<100; j++){
                env.fromElements(1, 2, 3, 4, 5, 6, 7,8,9, 10)
                        .map(i -> 2 * i)
                        .print();

                env.execute("My flink job "+j);
            }

        }
    }
}