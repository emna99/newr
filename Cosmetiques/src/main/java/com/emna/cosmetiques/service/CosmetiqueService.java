package com.emna.cosmetiques.service;

import java.util.List;

import com.emna.cosmetiques.entities.Cosmetique;

public interface CosmetiqueService {
	Cosmetique saveProduit(Cosmetique c);
	Cosmetique updateProduit(Cosmetique c);
	void deleteProduit(Cosmetique c);
	void deleteProduitById(Long id);
	Cosmetique getProduit(Long id);
	List<Cosmetique> getAllProduits();
}
