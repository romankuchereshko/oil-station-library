package com.simulation.library.producer.impl;

import java.util.Collection;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.simulation.library.domain.Frame;
import com.simulation.library.producer.FrameSender;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class FrameSenderImpl implements FrameSender {

    private final KafkaTemplate<String, Collection<Frame>> kafkaTemplate;

    @Override
    public void send(final Collection<Frame> frames, final String topic) {
        log.info("Going to send frames [{}] to topic [{}]", frames, topic);

        final ListenableFuture<SendResult<String, Collection<Frame>>> future = this.kafkaTemplate
            .send(topic, frames);

        future.addCallback(new ListenableFutureCallback<>() {

            @Override
            public void onSuccess(SendResult<String, Collection<Frame>> result) {
                log.info("Sent message [{}] with offset [{}]",
                    result.getProducerRecord().value(),
                    result.getRecordMetadata().offset());
            }

            @Override
            public void onFailure(@NonNull Throwable ex) {
                log.error("Unable to send message due to : {}", ex.getMessage());
            }
        });
    }

}
