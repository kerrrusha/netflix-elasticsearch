package com.kerrrusha.netflixelasticsearch.controller;

import com.kerrrusha.netflixelasticsearch.domain.NetflixShow;
import com.kerrrusha.netflixelasticsearch.service.NetflixShowSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/search/by")
public class SearchController {

    private final NetflixShowSearchService searchService;

    @GetMapping("/title/{value}")
    public PagedModel<NetflixShow> searchByTitle(@PathVariable String value,
                                                 @RequestParam(defaultValue = "0", required = false) int page,
                                                 @RequestParam(defaultValue = "48", required = false) int size) {
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return new PagedModel<>(searchService.searchByTitle(value, pageable));
    }
}
