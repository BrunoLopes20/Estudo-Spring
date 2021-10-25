package br.com.webapi.starwarsapi.Service;

import br.com.webapi.starwarsapi.Model.ModelPeople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ServicePeople {

    @Autowired
    public WebClient webClient;

    public ModelPeople getPeopleById(Long id){

        Mono<ModelPeople> monoPeopleId = this.webClient
                .method(HttpMethod.GET)
                .uri("/people/{id}",id)
                .retrieve()
                .bodyToMono(ModelPeople.class);

        ModelPeople people = monoPeopleId.block();

        return people;
    }

    public ModelPeople getPeopleAll(){

        Mono<ModelPeople> monoPeopleAll = this.webClient
                .method(HttpMethod.GET)
                .uri("/people")
                .retrieve()
                .bodyToMono(ModelPeople.class);

        ModelPeople people = monoPeopleAll.block();

        return people;
    }
}
