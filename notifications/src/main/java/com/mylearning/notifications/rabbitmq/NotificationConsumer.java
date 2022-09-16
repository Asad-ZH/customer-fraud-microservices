package com.mylearning.notifications.rabbitmq;

import com.mylearning.clients.notifications.NotificationRequest;
import com.mylearning.notifications.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Slf4j
@Component
public class NotificationConsumer {

    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consume(NotificationRequest notificationRequest) {

        log.info("Consuming notification request {} form queue", notificationRequest);
        notificationService.send(notificationRequest);
    }
}
