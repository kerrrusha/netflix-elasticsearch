package com.kerrrusha.netflixelasticsearch.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "netflix_shows")
@Document(indexName = "netflix_shows")
public class NetflixShow {

    @Id
    @Column(name = "show_id", nullable = false)
    private String id;

    private String type;
    private String title;
    private String director;
    private String castMembers;
    private String country;
    private String dateAdded;
    private Integer releaseYear;
    private String rating;
    private String duration;
    private String listedIn;
    private String description;
}
