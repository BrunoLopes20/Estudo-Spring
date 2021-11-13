package springstudy.cursospringboot.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springstudy.cursospringboot.domain.Anime;
import springstudy.cursospringboot.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/anime")
@Log4j2
public class AnimeController {

    @Autowired
    DateUtil dateUtil;

    @GetMapping("/list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocaleDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Boku no Hero"),new Anime("Bersek"));
    }
    
}