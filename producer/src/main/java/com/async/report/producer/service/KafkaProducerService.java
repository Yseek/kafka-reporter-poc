package com.async.report.producer.service;

import com.async.report.producer.dto.ReportDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate<String, ReportDto> kafkaTemplate;

    public void send(ReportDto reportDto) {
        log.info("카프로 메시지 전송: {}", reportDto);
        kafkaTemplate.sendDefault(reportDto);
    }
}
