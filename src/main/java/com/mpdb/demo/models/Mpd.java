package com.mpdb.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "plant")
public class Mpd {
    @Id
    private String ID;
    private String molfile;
    private String Molfile;
    private String Origin;
    private String Common_Name;
    private String Introduction;
    private String Synonym;
    private String Species_Name ;
    private String Plant_part ;
    private String Name_of_small_molecule_or_Compound ;
    private String SMILES ;
    private String PubChem_Id ;
    private String PubChem_link;
    private String DrugBank_Id;
    private String Drugbank_link;
    private String PubMed_Id_for_disease_reference;
    private String PubMed_link;
    private String Symptoms;
    private String Disease_Name;
    private String Pathway_KEGG_link_or_PubMed_Link;
    private String Pathway_url;
    private String MoA;
    private String Gene_Name;
    private String Target_gene_NCBI_Link;
    private String Gene_link;
    private String Protein_Name;
    private String Target_Protein_Uniprot_Link;
    private String Protein_link;
    private String Protein_3D_Structure_PDB_link_with_visualization_and_download_option;
    private String Protein_Structure_link;
    private String Protein_Function;
    private String Target_amino_acid_sequence;
    private String Target_Protein_Interaction_STRING_Link_and_network_visualization;
    private String String_link;
    private String Route_of_administration;
    private String ADME;
    private String Biological_Assay;
    private String Side_Effects_or_Toxicity;
    private String Similar_Compounds;
    private String Genome_Sequence_Link;
    private String Picture_of_plant;

    public Mpd() {
    }

    public Mpd(String ID, String origin, String common_Name, String introduction, String synonym, String species_Name, String plant_part, String name_of_small_molecule_or_Compound, String SMILES, String pubChem_Id, String pubChem_link, String drugBank_Id, String drugbank_link, String pubMed_Id_for_disease_reference, String pubMed_link, String symptoms, String disease_Name, String pathway_KEGG_link_or_PubMed_Link, String pathway_url, String moA, String gene_Name, String target_gene_NCBI_Link, String gene_link, String protein_Name, String target_Protein_Uniprot_Link, String protein_link, String protein_3D_Structure_PDB_link_with_visualization_and_download_option, String protein_Structure_link, String protein_Function, String target_amino_acid_sequence, String target_Protein_Interaction_STRING_Link_and_network_visualization, String string_link, String route_of_administration, String ADME, String biological_Assay, String side_Effects_or_Toxicity, String similar_Compounds, String genome_Sequence_Link) {
        this.ID = ID;
        Origin = origin;
        Common_Name = common_Name;
        Introduction = introduction;
        Synonym = synonym;
        Species_Name = species_Name;
        Plant_part = plant_part;
        Name_of_small_molecule_or_Compound = name_of_small_molecule_or_Compound;
        this.SMILES = SMILES;
        PubChem_Id = pubChem_Id;
        PubChem_link = pubChem_link;
        DrugBank_Id = drugBank_Id;
        Drugbank_link = drugbank_link;
        PubMed_Id_for_disease_reference = pubMed_Id_for_disease_reference;
        PubMed_link = pubMed_link;
        Symptoms = symptoms;
        Disease_Name = disease_Name;
        Pathway_KEGG_link_or_PubMed_Link = pathway_KEGG_link_or_PubMed_Link;
        Pathway_url = pathway_url;
        MoA = moA;
        Gene_Name = gene_Name;
        Target_gene_NCBI_Link = target_gene_NCBI_Link;
        Gene_link = gene_link;
        Protein_Name = protein_Name;
        Target_Protein_Uniprot_Link = target_Protein_Uniprot_Link;
        Protein_link = protein_link;
        Protein_3D_Structure_PDB_link_with_visualization_and_download_option = protein_3D_Structure_PDB_link_with_visualization_and_download_option;
        Protein_Structure_link = protein_Structure_link;
        Protein_Function = protein_Function;
        Target_amino_acid_sequence = target_amino_acid_sequence;
        Target_Protein_Interaction_STRING_Link_and_network_visualization = target_Protein_Interaction_STRING_Link_and_network_visualization;
        String_link = string_link;
        Route_of_administration = route_of_administration;
        this.ADME = ADME;
        Biological_Assay = biological_Assay;
        Side_Effects_or_Toxicity = side_Effects_or_Toxicity;
        Similar_Compounds = similar_Compounds;
        Genome_Sequence_Link = genome_Sequence_Link;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getCommon_Name() {
        return Common_Name;
    }

    public void setCommon_Name(String common_Name) {
        Common_Name = common_Name;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }

    public String getSynonym() {
        return Synonym;
    }

    public void setSynonym(String synonym) {
        Synonym = synonym;
    }

    public String getSpecies_Name() {
        return Species_Name;
    }

    public void setSpecies_Name(String species_Name) {
        Species_Name = species_Name;
    }

    public String getPlant_part() {
        return Plant_part;
    }

    public void setPlant_part(String plant_part) {
        Plant_part = plant_part;
    }

    public String getName_of_small_molecule_or_Compound() {
        return Name_of_small_molecule_or_Compound;
    }

    public void setName_of_small_molecule_or_Compound(String name_of_small_molecule_or_Compound) {
        Name_of_small_molecule_or_Compound = name_of_small_molecule_or_Compound;
    }

    public String getSMILES() {
        return SMILES;
    }

    public void setSMILES(String SMILES) {
        this.SMILES = SMILES;
    }

    public String getPubChem_Id() {
        return PubChem_Id;
    }

    public void setPubChem_Id(String pubChem_Id) {
        PubChem_Id = pubChem_Id;
    }

    public String getPubChem_link() {
        return PubChem_link;
    }

    public void setPubChem_link(String pubChem_link) {
        PubChem_link = pubChem_link;
    }

    public String getDrugBank_Id() {
        return DrugBank_Id;
    }

    public void setDrugBank_Id(String drugBank_Id) {
        DrugBank_Id = drugBank_Id;
    }

    public String getDrugbank_link() {
        return Drugbank_link;
    }

    public void setDrugbank_link(String drugbank_link) {
        Drugbank_link = drugbank_link;
    }

    public String getPubMed_Id_for_disease_reference() {
        return PubMed_Id_for_disease_reference;
    }

    public void setPubMed_Id_for_disease_reference(String pubMed_Id_for_disease_reference) {
        PubMed_Id_for_disease_reference = pubMed_Id_for_disease_reference;
    }

    public String getPubMed_link() {
        return PubMed_link;
    }

    public void setPubMed_link(String pubMed_link) {
        PubMed_link = pubMed_link;
    }

    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String symptoms) {
        Symptoms = symptoms;
    }

    public String getDisease_Name() {
        return Disease_Name;
    }

    public void setDisease_Name(String disease_Name) {
        Disease_Name = disease_Name;
    }

    public String getPathway_KEGG_link_or_PubMed_Link() {
        return Pathway_KEGG_link_or_PubMed_Link;
    }

    public void setPathway_KEGG_link_or_PubMed_Link(String pathway_KEGG_link_or_PubMed_Link) {
        Pathway_KEGG_link_or_PubMed_Link = pathway_KEGG_link_or_PubMed_Link;
    }

    public String getPathway_url() {
        return Pathway_url;
    }

    public void setPathway_url(String pathway_url) {
        Pathway_url = pathway_url;
    }

    public String getMoA() {
        return MoA;
    }

    public void setMoA(String moA) {
        MoA = moA;
    }

    public String getGene_Name() {
        return Gene_Name;
    }

    public void setGene_Name(String gene_Name) {
        Gene_Name = gene_Name;
    }

    public String getTarget_gene_NCBI_Link() {
        return Target_gene_NCBI_Link;
    }

    public void setTarget_gene_NCBI_Link(String target_gene_NCBI_Link) {
        Target_gene_NCBI_Link = target_gene_NCBI_Link;
    }

    public String getGene_link() {
        return Gene_link;
    }

    public void setGene_link(String gene_link) {
        Gene_link = gene_link;
    }

    public String getProtein_Name() {
        return Protein_Name;
    }

    public void setProtein_Name(String protein_Name) {
        Protein_Name = protein_Name;
    }

    public String getTarget_Protein_Uniprot_Link() {
        return Target_Protein_Uniprot_Link;
    }

    public void setTarget_Protein_Uniprot_Link(String target_Protein_Uniprot_Link) {
        Target_Protein_Uniprot_Link = target_Protein_Uniprot_Link;
    }

    public String getProtein_link() {
        return Protein_link;
    }

    public void setProtein_link(String protein_link) {
        Protein_link = protein_link;
    }

    public String getProtein_3D_Structure_PDB_link_with_visualization_and_download_option() {
        return Protein_3D_Structure_PDB_link_with_visualization_and_download_option;
    }

    public void setProtein_3D_Structure_PDB_link_with_visualization_and_download_option(String protein_3D_Structure_PDB_link_with_visualization_and_download_option) {
        Protein_3D_Structure_PDB_link_with_visualization_and_download_option = protein_3D_Structure_PDB_link_with_visualization_and_download_option;
    }

    public String getProtein_Structure_link() {
        return Protein_Structure_link;
    }

    public void setProtein_Structure_link(String protein_Structure_link) {
        Protein_Structure_link = protein_Structure_link;
    }

    public String getProtein_Function() {
        return Protein_Function;
    }

    public void setProtein_Function(String protein_Function) {
        Protein_Function = protein_Function;
    }

    public String getTarget_amino_acid_sequence() {
        return Target_amino_acid_sequence;
    }

    public void setTarget_amino_acid_sequence(String target_amino_acid_sequence) {
        Target_amino_acid_sequence = target_amino_acid_sequence;
    }

    public String getTarget_Protein_Interaction_STRING_Link_and_network_visualization() {
        return Target_Protein_Interaction_STRING_Link_and_network_visualization;
    }

    public void setTarget_Protein_Interaction_STRING_Link_and_network_visualization(String target_Protein_Interaction_STRING_Link_and_network_visualization) {
        Target_Protein_Interaction_STRING_Link_and_network_visualization = target_Protein_Interaction_STRING_Link_and_network_visualization;
    }

    public String getString_link() {
        return String_link;
    }

    public void setString_link(String string_link) {
        String_link = string_link;
    }

    public String getRoute_of_administration() {
        return Route_of_administration;
    }

    public void setRoute_of_administration(String route_of_administration) {
        Route_of_administration = route_of_administration;
    }

    public String getADME() {
        return ADME;
    }

    public void setADME(String ADME) {
        this.ADME = ADME;
    }

    public String getBiological_Assay() {
        return Biological_Assay;
    }

    public void setBiological_Assay(String biological_Assay) {
        Biological_Assay = biological_Assay;
    }

    public String getSide_Effects_or_Toxicity() {
        return Side_Effects_or_Toxicity;
    }

    public void setSide_Effects_or_Toxicity(String side_Effects_or_Toxicity) {
        Side_Effects_or_Toxicity = side_Effects_or_Toxicity;
    }

    public String getSimilar_Compounds() {
        return Similar_Compounds;
    }

    public void setSimilar_Compounds(String similar_Compounds) {
        Similar_Compounds = similar_Compounds;
    }

    public String getGenome_Sequence_Link() {
        return Genome_Sequence_Link;
    }

    public void setGenome_Sequence_Link(String genome_Sequence_Link) {
        Genome_Sequence_Link = genome_Sequence_Link;
    }

    public Mpd(String ID, String molfile, String origin, String common_Name, String introduction, String synonym, String species_Name, String plant_part, String name_of_small_molecule_or_Compound, String SMILES, String pubChem_Id, String pubChem_link, String drugBank_Id, String drugbank_link, String pubMed_Id_for_disease_reference, String pubMed_link, String symptoms, String disease_Name, String pathway_KEGG_link_or_PubMed_Link, String pathway_url, String moA, String gene_Name, String target_gene_NCBI_Link, String gene_link, String protein_Name, String target_Protein_Uniprot_Link, String protein_link, String protein_3D_Structure_PDB_link_with_visualization_and_download_option, String protein_Structure_link, String protein_Function, String target_amino_acid_sequence, String target_Protein_Interaction_STRING_Link_and_network_visualization, String string_link, String route_of_administration, String ADME, String biological_Assay, String side_Effects_or_Toxicity, String similar_Compounds, String genome_Sequence_Link) {
        this.ID = ID;
        this.molfile = molfile;
        Origin = origin;
        Common_Name = common_Name;
        Introduction = introduction;
        Synonym = synonym;
        Species_Name = species_Name;
        Plant_part = plant_part;
        Name_of_small_molecule_or_Compound = name_of_small_molecule_or_Compound;
        this.SMILES = SMILES;
        PubChem_Id = pubChem_Id;
        PubChem_link = pubChem_link;
        DrugBank_Id = drugBank_Id;
        Drugbank_link = drugbank_link;
        PubMed_Id_for_disease_reference = pubMed_Id_for_disease_reference;
        PubMed_link = pubMed_link;
        Symptoms = symptoms;
        Disease_Name = disease_Name;
        Pathway_KEGG_link_or_PubMed_Link = pathway_KEGG_link_or_PubMed_Link;
        Pathway_url = pathway_url;
        MoA = moA;
        Gene_Name = gene_Name;
        Target_gene_NCBI_Link = target_gene_NCBI_Link;
        Gene_link = gene_link;
        Protein_Name = protein_Name;
        Target_Protein_Uniprot_Link = target_Protein_Uniprot_Link;
        Protein_link = protein_link;
        Protein_3D_Structure_PDB_link_with_visualization_and_download_option = protein_3D_Structure_PDB_link_with_visualization_and_download_option;
        Protein_Structure_link = protein_Structure_link;
        Protein_Function = protein_Function;
        Target_amino_acid_sequence = target_amino_acid_sequence;
        Target_Protein_Interaction_STRING_Link_and_network_visualization = target_Protein_Interaction_STRING_Link_and_network_visualization;
        String_link = string_link;
        Route_of_administration = route_of_administration;
        this.ADME = ADME;
        Biological_Assay = biological_Assay;
        Side_Effects_or_Toxicity = side_Effects_or_Toxicity;
        Similar_Compounds = similar_Compounds;
        Genome_Sequence_Link = genome_Sequence_Link;
    }

    public Mpd(String molfile) {
        Molfile = molfile;
    }

    public String getMolfile() {
        return Molfile;
    }

    public void setMolfile(String molfile) {
        Molfile = molfile;
    }

    public Mpd(String ID, String molfile, String molfile1, String origin, String common_Name, String introduction, String synonym, String species_Name, String plant_part, String name_of_small_molecule_or_Compound, String SMILES, String pubChem_Id, String pubChem_link, String drugBank_Id, String drugbank_link, String pubMed_Id_for_disease_reference, String pubMed_link, String symptoms, String disease_Name, String pathway_KEGG_link_or_PubMed_Link, String pathway_url, String moA, String gene_Name, String target_gene_NCBI_Link, String gene_link, String protein_Name, String target_Protein_Uniprot_Link, String protein_link, String protein_3D_Structure_PDB_link_with_visualization_and_download_option, String protein_Structure_link, String protein_Function, String target_amino_acid_sequence, String target_Protein_Interaction_STRING_Link_and_network_visualization, String string_link, String route_of_administration, String ADME, String biological_Assay, String side_Effects_or_Toxicity, String similar_Compounds, String genome_Sequence_Link) {
        this.ID = ID;
        this.molfile = molfile;
        Molfile = molfile1;
        Origin = origin;
        Common_Name = common_Name;
        Introduction = introduction;
        Synonym = synonym;
        Species_Name = species_Name;
        Plant_part = plant_part;
        Name_of_small_molecule_or_Compound = name_of_small_molecule_or_Compound;
        this.SMILES = SMILES;
        PubChem_Id = pubChem_Id;
        PubChem_link = pubChem_link;
        DrugBank_Id = drugBank_Id;
        Drugbank_link = drugbank_link;
        PubMed_Id_for_disease_reference = pubMed_Id_for_disease_reference;
        PubMed_link = pubMed_link;
        Symptoms = symptoms;
        Disease_Name = disease_Name;
        Pathway_KEGG_link_or_PubMed_Link = pathway_KEGG_link_or_PubMed_Link;
        Pathway_url = pathway_url;
        MoA = moA;
        Gene_Name = gene_Name;
        Target_gene_NCBI_Link = target_gene_NCBI_Link;
        Gene_link = gene_link;
        Protein_Name = protein_Name;
        Target_Protein_Uniprot_Link = target_Protein_Uniprot_Link;
        Protein_link = protein_link;
        Protein_3D_Structure_PDB_link_with_visualization_and_download_option = protein_3D_Structure_PDB_link_with_visualization_and_download_option;
        Protein_Structure_link = protein_Structure_link;
        Protein_Function = protein_Function;
        Target_amino_acid_sequence = target_amino_acid_sequence;
        Target_Protein_Interaction_STRING_Link_and_network_visualization = target_Protein_Interaction_STRING_Link_and_network_visualization;
        String_link = string_link;
        Route_of_administration = route_of_administration;
        this.ADME = ADME;
        Biological_Assay = biological_Assay;
        Side_Effects_or_Toxicity = side_Effects_or_Toxicity;
        Similar_Compounds = similar_Compounds;
        Genome_Sequence_Link = genome_Sequence_Link;
    }

    public Mpd(String ID, String molfile, String molfile1, String origin, String common_Name, String introduction, String synonym, String species_Name, String plant_part, String name_of_small_molecule_or_Compound, String SMILES, String pubChem_Id, String pubChem_link, String drugBank_Id, String drugbank_link, String pubMed_Id_for_disease_reference, String pubMed_link, String symptoms, String disease_Name, String pathway_KEGG_link_or_PubMed_Link, String pathway_url, String moA, String gene_Name, String target_gene_NCBI_Link, String gene_link, String protein_Name, String target_Protein_Uniprot_Link, String protein_link, String protein_3D_Structure_PDB_link_with_visualization_and_download_option, String protein_Structure_link, String protein_Function, String target_amino_acid_sequence, String target_Protein_Interaction_STRING_Link_and_network_visualization, String string_link, String route_of_administration, String ADME, String biological_Assay, String side_Effects_or_Toxicity, String similar_Compounds, String genome_Sequence_Link, String picture_of_plant) {
        this.ID = ID;
        this.molfile = molfile;
        Molfile = molfile1;
        Origin = origin;
        Common_Name = common_Name;
        Introduction = introduction;
        Synonym = synonym;
        Species_Name = species_Name;
        Plant_part = plant_part;
        Name_of_small_molecule_or_Compound = name_of_small_molecule_or_Compound;
        this.SMILES = SMILES;
        PubChem_Id = pubChem_Id;
        PubChem_link = pubChem_link;
        DrugBank_Id = drugBank_Id;
        Drugbank_link = drugbank_link;
        PubMed_Id_for_disease_reference = pubMed_Id_for_disease_reference;
        PubMed_link = pubMed_link;
        Symptoms = symptoms;
        Disease_Name = disease_Name;
        Pathway_KEGG_link_or_PubMed_Link = pathway_KEGG_link_or_PubMed_Link;
        Pathway_url = pathway_url;
        MoA = moA;
        Gene_Name = gene_Name;
        Target_gene_NCBI_Link = target_gene_NCBI_Link;
        Gene_link = gene_link;
        Protein_Name = protein_Name;
        Target_Protein_Uniprot_Link = target_Protein_Uniprot_Link;
        Protein_link = protein_link;
        Protein_3D_Structure_PDB_link_with_visualization_and_download_option = protein_3D_Structure_PDB_link_with_visualization_and_download_option;
        Protein_Structure_link = protein_Structure_link;
        Protein_Function = protein_Function;
        Target_amino_acid_sequence = target_amino_acid_sequence;
        Target_Protein_Interaction_STRING_Link_and_network_visualization = target_Protein_Interaction_STRING_Link_and_network_visualization;
        String_link = string_link;
        Route_of_administration = route_of_administration;
        this.ADME = ADME;
        Biological_Assay = biological_Assay;
        Side_Effects_or_Toxicity = side_Effects_or_Toxicity;
        Similar_Compounds = similar_Compounds;
        Genome_Sequence_Link = genome_Sequence_Link;
        Picture_of_plant = picture_of_plant;
    }

    public String getPicture_of_plant() {
        return Picture_of_plant;
    }

    public void setPicture_of_plant(String picture_of_plant) {
        Picture_of_plant = picture_of_plant;
    }

    @Override
    public String toString() {
        return "Mpd{" +
                "ID='" + ID + '\'' +
                ", molfile='" + molfile + '\'' +
                ", Molfile='" + Molfile + '\'' +
                ", Origin='" + Origin + '\'' +
                ", Common_Name='" + Common_Name + '\'' +
                ", Introduction='" + Introduction + '\'' +
                ", Synonym='" + Synonym + '\'' +
                ", Species_Name='" + Species_Name + '\'' +
                ", Plant_part='" + Plant_part + '\'' +
                ", Name_of_small_molecule_or_Compound='" + Name_of_small_molecule_or_Compound + '\'' +
                ", SMILES='" + SMILES + '\'' +
                ", PubChem_Id='" + PubChem_Id + '\'' +
                ", PubChem_link='" + PubChem_link + '\'' +
                ", DrugBank_Id='" + DrugBank_Id + '\'' +
                ", Drugbank_link='" + Drugbank_link + '\'' +
                ", PubMed_Id_for_disease_reference='" + PubMed_Id_for_disease_reference + '\'' +
                ", PubMed_link='" + PubMed_link + '\'' +
                ", Symptoms='" + Symptoms + '\'' +
                ", Disease_Name='" + Disease_Name + '\'' +
                ", Pathway_KEGG_link_or_PubMed_Link='" + Pathway_KEGG_link_or_PubMed_Link + '\'' +
                ", Pathway_url='" + Pathway_url + '\'' +
                ", MoA='" + MoA + '\'' +
                ", Gene_Name='" + Gene_Name + '\'' +
                ", Target_gene_NCBI_Link='" + Target_gene_NCBI_Link + '\'' +
                ", Gene_link='" + Gene_link + '\'' +
                ", Protein_Name='" + Protein_Name + '\'' +
                ", Target_Protein_Uniprot_Link='" + Target_Protein_Uniprot_Link + '\'' +
                ", Protein_link='" + Protein_link + '\'' +
                ", Protein_3D_Structure_PDB_link_with_visualization_and_download_option='" + Protein_3D_Structure_PDB_link_with_visualization_and_download_option + '\'' +
                ", Protein_Structure_link='" + Protein_Structure_link + '\'' +
                ", Protein_Function='" + Protein_Function + '\'' +
                ", Target_amino_acid_sequence='" + Target_amino_acid_sequence + '\'' +
                ", Target_Protein_Interaction_STRING_Link_and_network_visualization='" + Target_Protein_Interaction_STRING_Link_and_network_visualization + '\'' +
                ", String_link='" + String_link + '\'' +
                ", Route_of_administration='" + Route_of_administration + '\'' +
                ", ADME='" + ADME + '\'' +
                ", Biological_Assay='" + Biological_Assay + '\'' +
                ", Side_Effects_or_Toxicity='" + Side_Effects_or_Toxicity + '\'' +
                ", Similar_Compounds='" + Similar_Compounds + '\'' +
                ", Genome_Sequence_Link='" + Genome_Sequence_Link + '\'' +
                ", Picture_of_plant='" + Picture_of_plant + '\'' +
                '}';
    }

}


