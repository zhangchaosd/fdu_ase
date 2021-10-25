package com.dibazu.goods.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Goods {
    @Id
    @GeneratedValue
    private Integer id;

    private String name; //商品名
    private String sellername; //卖家用户名
    private String desc; //描述
    private Integer price; //价格

    @Lob 
    @Basic(fetch = FetchType.LAZY) 
    @Column(name="pic", columnDefinition="longblob", nullable=true) 
    private byte[] pic;
}
