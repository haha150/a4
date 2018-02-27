/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.service;


import java.util.List;
import org.a4.domain.Favorite;
import org.a4.domain.Post;
import org.a4.repository.FavoriteCustomRepository;
import org.a4.repository.FavoriteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author davidren
 */

@Transactional
@Service
public class FavoriteServiceImpl implements FavoriteService{
        @Autowired
	FavoriteRepository favoriteRepo;
	
	@Autowired
	FavoriteCustomRepository favoriteCustomRepo;

	@Override
	public List<Favorite> getAllFavorites() {
		return favoriteCustomRepo.getAllFavorites();
	}
        
        @Override
	public void deleteFavoriteById(Long id) {
		favoriteRepo.delete(id);
	}
        
        @Override
	public Favorite addFavorite(Favorite favorite) {
		return favoriteRepo.save(favorite);
	}
}
