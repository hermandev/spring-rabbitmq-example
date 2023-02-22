package id.codecorn.springrabbitmqapp.listener;

import com.rabbitmq.client.Channel;
import id.codecorn.springrabbitmqapp.config.MQConfig;
import id.codecorn.springrabbitmqapp.dto.CustomMessage;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void messageListener(CustomMessage message) throws IOException {
        System.out.println(message);
    }
}
