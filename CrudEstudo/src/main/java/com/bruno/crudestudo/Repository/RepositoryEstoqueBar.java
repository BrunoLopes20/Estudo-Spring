package com.bruno.crudestudo.Repository;

import com.bruno.crudestudo.Model.ModelEstoqueBar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEstoqueBar extends JpaRepository<ModelEstoqueBar, Long> {
}
