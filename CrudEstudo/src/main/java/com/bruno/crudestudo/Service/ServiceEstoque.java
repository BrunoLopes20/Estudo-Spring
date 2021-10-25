package com.bruno.crudestudo.Service;

import com.bruno.crudestudo.Model.ModelEstoqueBar;
import com.bruno.crudestudo.Repository.RepositoryEstoqueBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.el.MethodNotFoundException;
import java.util.List;
import java.util.Optional;

@Component
public class ServiceEstoque {

    @Autowired
    RepositoryEstoqueBar repositoryEstoqueBar;

    //Buscar todos
    public List<ModelEstoqueBar> getAllEstoque(){
        return repositoryEstoqueBar.findAll();
    }

    //Buscar por ID
    public ModelEstoqueBar getEstoqueById(@PathVariable Long id){

        Optional<ModelEstoqueBar> optionalModelEstoqueBar = repositoryEstoqueBar.findById(id);

        if(!optionalModelEstoqueBar.isPresent())
            throw new MethodNotFoundException("Id Estoque não encontrado...");

        return optionalModelEstoqueBar.get();
    }

    //Alterar quantidade do item no estoque
    public ModelEstoqueBar updateEstoque(@PathVariable Long id,
                                         @RequestBody ModelEstoqueBar upEstoque){
        upEstoque.setId(id);

        return repositoryEstoqueBar.save(upEstoque);

    }

    //Salvar novo no estoque
    public ModelEstoqueBar saveEstoque(@RequestBody ModelEstoqueBar estoque){
        return repositoryEstoqueBar.save(estoque);
    }

    //Deletar estoque por ID
    public void deleteEstoqueByID(@PathVariable Long id){
        repositoryEstoqueBar.deleteById(id);
    }


}
