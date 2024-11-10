package com.kerrrusha.netflixelasticsearch.repository.elasticsearch;

import com.kerrrusha.netflixelasticsearch.domain.NetflixShow;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface NetflixShowElasticsearchRepository extends ElasticsearchRepository<NetflixShow, String> {
    Page<NetflixShow> findByTitleContaining(String title, Pageable pageable);
}
