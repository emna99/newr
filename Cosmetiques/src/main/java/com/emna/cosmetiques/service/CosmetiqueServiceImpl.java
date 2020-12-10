package com.emna.cosmetiques.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emna.cosmetiques.entities.Cosmetique;
import com.emna.cosmetiques.repos.CosmetiqueRepository;

@Service
public class CosmetiqueServiceImpl implements CosmetiqueService {

	@Autowired
	CosmetiqueRepository cosmetiqueRepository;
	
	@Override
	public Cosmetique saveProduit(Cosmetique c) {
		return cosmetiqueRepository.save(c);
	}

	@Override
	public Cosmetique updateProduit(Cosmetique c) {
		return cosmetiqueRepository.save(c);
	}

	@Override
	public void deleteProduit(Cosmetique c) {
		cosmetiqueRepository.delete(c);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		cosmetiqueRepository.deleteById(id);
	}

	@Override
	public Cosmetique getProduit(Long id) {
		return cosmetiqueRepository.findById(id).get();
		
	}

	@Override
	public List<Cosmetique> getAllProduits() {

		return cosmetiqueRepository.findAll() ;
	}

}
