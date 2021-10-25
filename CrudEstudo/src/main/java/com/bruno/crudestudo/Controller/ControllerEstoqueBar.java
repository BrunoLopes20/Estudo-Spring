package com.bruno.crudestudo.Controller;

import com.bruno.crudestudo.Model.ModelEstoqueBar;
import com.bruno.crudestudo.Service.ServiceEstoque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estoque")
public class ControllerEstoqueBar {

@Autowired
    ServiceEstoque serviceEstoque;

    @GetMapping
    public ResponseEntity<List<ModelEstoqueBar>> getAllEstoque(){
        return ResponseEntity.ok().body(serviceEstoque.getAllEstoque());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModelEstoqueBar> getEstoqueById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(serviceEstoque.getEstoqueById(id));
    }

    @PutMapping("/{id}")
    public ModelEstoqueBar updateEstoque(@PathVariable("id") Long id,
                                         @RequestBody ModelEstoqueBar qtdEstoque){
        return serviceEstoque.updateEstoque(id,qtdEstoque);
    }

    @PostMapping
    public ModelEstoqueBar saveEstoque(@RequestBody ModelEstoqueBar estoque){
        return serviceEstoque.saveEstoque(estoque);
    }

    @DeleteMapping("/{id}")
    public void deleteEstoqueByID(@PathVariable Long id){
        serviceEstoque.deleteEstoqueByID(id);
    }



}
