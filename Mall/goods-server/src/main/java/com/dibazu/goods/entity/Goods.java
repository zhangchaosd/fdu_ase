package com.dibazu.goods.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;


@Entity
public class Goods {
    @Id
    @GeneratedValue
    private Integer id;

    private String name; //商品名
    private String seller; //卖家用户名
    private String desc; //描述
    private Integer price; //价格

    @Lob 
    @Basic(fetch = FetchType.LAZY) 
    @Column(name="pic", columnDefinition="longblob", nullable=true) 
    private byte[] pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public byte[] getPic() {
        //check
        return pic;
    }

    public void setPic(byte[] pic) {
        //check
        this.pic = pic;
    }
}
