package com.kerrrusha.netflixelasticsearch.service;

import com.kerrrusha.netflixelasticsearch.domain.NetflixShow;
import com.kerrrusha.netflixelasticsearch.repository.elasticsearch.NetflixShowElasticsearchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NetflixShowSearchServiceImpl implements NetflixShowSearchService {

    private final NetflixShowElasticsearchRepository elasticSearchRepository;

    public Page<NetflixShow> searchByTitle(String title, Pageable pageable) {
        return elasticSearchRepository.findByTitleContaining(title, pageable);
    }
}
