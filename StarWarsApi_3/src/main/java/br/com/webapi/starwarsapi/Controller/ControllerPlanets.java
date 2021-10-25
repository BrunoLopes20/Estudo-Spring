package br.com.webapi.starwarsapi.Controller;

import br.com.webapi.starwarsapi.Model.ModelPlanets;
import br.com.webapi.starwarsapi.Service.ServicePlanets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPlanets {

    @Autowired
    private ServicePlanets servicePlanets;

    @GetMapping("/planets/{id}")
    public ResponseEntity<ModelPlanets> getPlanetsById(@PathVariable Long id){

        ModelPlanets modelPlanets = this.servicePlanets.getPlanetsById(id);

        return ResponseEntity.ok(modelPlanets);

    }

    @GetMapping("/planets")
    public ResponseEntity<ModelPlanets> getPlanetsAll(){

        ModelPlanets modelPlanets = this.servicePlanets.getPlanetsAll();

        return ResponseEntity.ok(modelPlanets);

    }
}
