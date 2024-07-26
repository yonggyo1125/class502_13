package org.choongang.statistic.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class MemberStatisticService {

    @Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
    public void makeData() {
        log.info("실행!!!!");
    }
}
