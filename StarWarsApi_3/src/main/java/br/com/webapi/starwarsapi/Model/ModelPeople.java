package br.com.webapi.starwarsapi.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelPeople {

    public String birth_year;
    public String eye_color;
    public List<String> films;
    public String gender;
    public String hair_color;
    public String height;
    public String homeworld;
    public String mass;
    public String name;
    public String skin_color;
    public Date created;
    public Date edited;
    public List<String> species;
    public List<String> starships;
    public String url;
    public List<String> vehicles;
}

