package com.mpdb.demo.controller;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.mpdb.demo.models.Mpd;
import com.mpdb.demo.repo.MpdRepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    private MpdRepo MpdRepo;
    @Autowired
    MongoTemplate mongoTemplate;
    @GetMapping("/")
    public ResponseEntity<?> getplant(){
        return ResponseEntity.ok(this.MpdRepo.findAll());
    }
    //---------------------------------------------------------------------------------------------//
    //All Search queries begin from here
    @GetMapping("/Search/{Species_Name}")
     public List<Mpd> getPlantname(@PathVariable(value = "Species_Name") String Species_Name){
        Query query = new Query();
        query.addCriteria(Criteria.where("speciesName").is(Species_Name));
        return mongoTemplate.find(query, Mpd.class);
    }

    @GetMapping("/Search/commonName/{Common_Name}")
    public List<Mpd> getCommon_Name(@PathVariable(value = "Common_Name") String Common_Name){
        Query query = new Query();
        query.addCriteria(Criteria.where("Common_Name").is(Common_Name));
        return mongoTemplate.find(query, Mpd.class);
    }

    @GetMapping("/Search/compound/{Name_of_small_molecule_or_Compound}")
    public List<Mpd> getCompoundName(@PathVariable(value = "Name_of_small_molecule_or_Compound")String Name_of_small_molecule_or_Compound){
        Query query = new Query();
        query.addCriteria(Criteria.where("Name_of_small_molecule_or_Compound").is(Name_of_small_molecule_or_Compound));
        return mongoTemplate.find(query,Mpd.class);
    }

    @GetMapping("/Search/targetgene/{Gene_Name}")
    public List <Mpd> getTargetGene(@PathVariable(value = "Gene_Name") String Gene_Name){
        Query query  = new Query();
        query.addCriteria(Criteria.where("Gene_Name").is(Gene_Name));
        return mongoTemplate.find(query,Mpd.class);
    }
    @GetMapping("/Search/targetprotein/{Protein_Name}")
    public List <Mpd> getTargetProtein(@PathVariable(value = "Protein_Name") String Protein_Name){
        Query query  = new Query();
        query.addCriteria(Criteria.where("Protein_Name").is(Protein_Name));
        return mongoTemplate.find(query,Mpd.class);
    }



    //-----------------------------------------------------------------------------------------------------//

    //work on this
    @GetMapping("/error")
    public String error(){
        return "NOT FOUND";
    }
    List<Mpd> speciesName (String speciesName){
        Query query = new Query();
        query.addCriteria(Criteria.where("speciesName").is(speciesName));
        return mongoTemplate.find(query,Mpd.class);
    }
}
