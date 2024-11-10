package com.kerrrusha.netflixelasticsearch;

import com.kerrrusha.netflixelasticsearch.service.NetflixShowIndexingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class StartupDataIndexer {

    private final NetflixShowIndexingService indexingService;

    @EventListener(ApplicationReadyEvent.class)
    public void indexDataOnStartup() {
        log.info("SQL to ElasticSearch data indexing is starting...");
        indexingService.indexAllNetflixShows();
        log.info("SQL to ElasticSearch data indexing finished successfully.");
    }
}
