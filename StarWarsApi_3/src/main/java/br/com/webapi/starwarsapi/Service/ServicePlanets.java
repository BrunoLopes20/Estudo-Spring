package br.com.webapi.starwarsapi.Service;

import br.com.webapi.starwarsapi.Model.ModelPlanets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServicePlanets {

    @Autowired
    public WebClient webClient;

    public ModelPlanets getPlanetsById(Long id){

        Mono<ModelPlanets> monoPlanetsId = this.webClient
                .method(HttpMethod.GET)
                .uri("/planets/{id}",id)
                .retrieve()
                .bodyToMono(ModelPlanets.class);

        ModelPlanets planets = monoPlanetsId.block();

        return planets;
    }

    public ModelPlanets getPlanetsAll(){

        Mono<ModelPlanets> monoPlanetsAll = this.webClient
                .method(HttpMethod.GET)
                .uri("/planets")
                .retrieve()
                .bodyToMono(ModelPlanets.class);

        ModelPlanets planets = monoPlanetsAll.block();

        return planets;
    }
}
