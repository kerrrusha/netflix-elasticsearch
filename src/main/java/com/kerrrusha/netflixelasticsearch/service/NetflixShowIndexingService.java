package com.kerrrusha.netflixelasticsearch.service;

import com.kerrrusha.netflixelasticsearch.domain.NetflixShow;
import com.kerrrusha.netflixelasticsearch.repository.elasticsearch.NetflixShowElasticsearchRepository;
import com.kerrrusha.netflixelasticsearch.repository.jpa.NetflixShowJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NetflixShowIndexingService {

    private final NetflixShowJpaRepository netflixShowRepository;
    private final NetflixShowElasticsearchRepository netflixShowElasticsearchRepository;

    public void indexAllNetflixShows() {
        List<NetflixShow> shows = netflixShowRepository.findAll();
        netflixShowElasticsearchRepository.saveAll(shows);
    }
}
