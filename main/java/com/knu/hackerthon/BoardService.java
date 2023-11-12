package com.knu.hackerthon;

import com.knu.hackerthon.Board;
import com.knu.hackerthon.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public List<Board> boardList(){
        return boardRepository.findAll();
    }
}