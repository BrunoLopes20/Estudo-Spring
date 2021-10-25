package br.com.webapi.starwarsapi.Controller;

import br.com.webapi.starwarsapi.Model.ModelPeople;
import br.com.webapi.starwarsapi.Service.ServicePeople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPeople {

    @Autowired
    private ServicePeople servicePeople;

    @GetMapping("/people/{id}")
    public ResponseEntity<ModelPeople> getPeopleById(@PathVariable Long id){

        ModelPeople modelPeople = this.servicePeople.getPeopleById(id);

        return ResponseEntity.ok(modelPeople);

    }

    @GetMapping("/people")
    public ResponseEntity<ModelPeople> getPeopleAll(){

        ModelPeople modelPeople = this.servicePeople.getPeopleAll();

        return ResponseEntity.ok(modelPeople);

    }
}
