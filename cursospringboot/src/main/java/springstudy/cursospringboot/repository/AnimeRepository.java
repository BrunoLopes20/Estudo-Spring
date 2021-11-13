package springstudy.cursospringboot.repository;

import springstudy.cursospringboot.domain.Anime;
import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
