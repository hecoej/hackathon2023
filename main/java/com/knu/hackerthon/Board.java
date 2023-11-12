package com.knu.hackerthon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Data

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int num;
    private String pledge;
    private String uname;
    private int tmp;
    private String usubject;
    private String content_line;
    private String contents;

    public Board(int num, String pledge, String uname, int tmp, String usubject, String content_line, String contents) {
        this.num = num;
        this.pledge = pledge;
        this.uname = uname;
        this.tmp = tmp;
        this.usubject = usubject;
        this.content_line = content_line;
        this.contents = contents;
    }

    public Board() {

    }
}
