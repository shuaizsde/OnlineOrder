package com.laioffer.onlineOrder.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cart")
//serializable 序列化 ？？？
public class Cart implements Serializable {

    private static final long serialVersionUID = 8436097833452420298L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //mappedby 告诉db不需要创建第三张表
    //通过 orderItem里面的foriegnKey cart 来找
    //cascade :级联操作 如果删掉restaurant， 则删掉所有该restaurant相关的menuItem
    //eager: 拿到cart之后 就马上获取其对应的orderitem
    //lazy的话 则表示 可以需要的时候再取
    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<OrderItem> orderItemList;

    private double totalPrice;

    public int getId() {
        return id;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

