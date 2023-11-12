package com.knu.hackerthon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.knu.hackerthon.BoardRepository;
import com.knu.hackerthon.BoardService;

import java.util.List;

@Controller

public class FlashlightController {
    private final BoardRepository boardRepository;

    public FlashlightController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
    @GetMapping("/index")
    public String index() {
        return "index.html";
    }

    @GetMapping("/info")
    public String info() {
        return "info.html";
    }

    @GetMapping("/party")
    public String party() {
        return "party.html";
    }

    @GetMapping("/polls")
    public String polls() {
        return "polls.html";
    }

    @GetMapping("/poti")
    public String poti() {
        return "poti.html";
    }

    @GetMapping("/roadmap")
    public String roadmap() {
        return "roadmap_main.html";
    }

    @GetMapping("/pledge")
    public String pledge() {
        return "pledge.html";
    }

    @GetMapping("/pledge/economy")
    public String redirectToEconomyPage() {
        return "economy.html";
    }

    @GetMapping("/roadmap/roadmap_1")
    public String roadmap1() {
        return "roadmap_1.html";
    }
    @GetMapping("/roadmap/roadmap_2")
    public String roadmap2() {
        return "roadmap_2.html";
    }
    @GetMapping("/party/party_1")
    public String party_1(Model model) {
        List<Board> lists = boardRepository.findAll();
        model.addAttribute("lists", lists);
        return "party_1.html";
    }

}
