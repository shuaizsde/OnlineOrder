package com.laioffer.onlineOrder.entity;


import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Transient// 不会加到table里面
    private String temp;

    @Id
    @Column(name = "item_id")
    private String id;
    private String address;
    private String url;
    private String name;
    @Column(name = "image_url")
    private String imageUrl;
}
