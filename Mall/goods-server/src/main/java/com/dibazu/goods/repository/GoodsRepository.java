package com.dibazu.goods.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dibazu.goods.entity.Goods;

import java.util.List;
import java.util.Optional;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer> {
    List<Goods> findGoodsBySeller(String seller);
    List<Goods> findByNameContaining(String name);
    //Optional<Goods> findById(Integer id);
}
