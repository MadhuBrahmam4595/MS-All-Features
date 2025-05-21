package com.notification_service.listener;

import com.notification_service.model.OrderRequest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener {

    @RabbitListener(queues = "order.queue")
    public void handleOrderNotification(OrderRequest orderRequest){
        System.out.println("Notification sent to: "+orderRequest.getCustomerEmail()+" for Order ID: "+orderRequest.getOrderId());
    }
}
