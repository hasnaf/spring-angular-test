package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer prix;
    private String picture;

    @ManyToOne
    @JsonIgnore // this json resolve the error java.lang.IllegalStateException Cannot call sendError()
    @JoinColumn(name = "ordre_id")
    private Ordre order;


}
