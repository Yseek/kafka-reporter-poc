package com.async.report.consumer.service;

import com.async.report.ReportDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "report-topic", groupId = "report-group")
    public void consume(ReportDto reportDto) throws InterruptedException {
        log.info("### 메시지 수신: {}", reportDto);

        // 실제로는 DB 저장, 외부 API 호출 등의 무거운 작업이 이뤄지는 부분
        // PoC 에서는 5초간 대기하여 오래 걸리는 작업을 시뮬레이션 합니다.
        log.info("### 데이터 처리 시작...");
        Thread.sleep(5000); // 5초 대기
        log.info("### 데이터 치리 완료");
    }
}
