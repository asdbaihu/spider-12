package org.zechac.spider.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/24.
 */
@Data
@Entity
@Table(name = "l_history")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    private String url;
}
