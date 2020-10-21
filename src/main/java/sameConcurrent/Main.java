package sameconcurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import sameconcurrent.pembaConsumer.ConsumerPoison;
import sameconcurrent.pembaConsumer.ProducerPoison;

public class Main {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);

        Integer poison = -1;
        new Thread(new ProducerPoison(queue, poison)).start();
        new Thread(new ProducerPoison(queue, poison)).start();

        new Thread(new ConsumerPoison(queue, poison)).start();
        new Thread(new ConsumerPoison(queue, poison)).start();

    }

}
