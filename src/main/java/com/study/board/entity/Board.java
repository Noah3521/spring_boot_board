package com.study.board.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "board_seq_generator")
    @SequenceGenerator(name = "board_seq_generator", sequenceName = "board_seq", allocationSize = 1)
    private Integer id;

    private String title;

    private String content;

    private String fileName;

    private String filePath;

}
