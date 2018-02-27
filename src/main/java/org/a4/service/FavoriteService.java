/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.service;

import java.util.List;
import org.a4.domain.Favorite;


/**
 *
 * @author davidren
 */
public interface FavoriteService {
    
    List<Favorite> getAllFavorites();
    void deleteFavoriteById(Long id);
    Favorite addFavorite(Favorite favorite);
}
