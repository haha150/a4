/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.repository;

import java.util.List;
import org.a4.domain.Favorite;
import org.springframework.stereotype.Repository;

/**
 *
 * @author davidren
 */
@Repository
public interface  FavoriteCustomRepository {
    List<Favorite> getAllFavorites();
}
