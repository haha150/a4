/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.a4.repository;

import org.a4.domain.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author davidren
 */

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    Favorite findById(Long id);   
}
