package com.seif.produits.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seif.produits.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
