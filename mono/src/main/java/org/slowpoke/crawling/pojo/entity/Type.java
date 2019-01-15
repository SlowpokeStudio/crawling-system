package org.slowpoke.crawling.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slowpoke.crawling.pojo.enu.Series;
import org.slowpoke.crawling.pojo.enu.Status;
import org.slowpoke.crawling.pojo.enu.Types;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Type implements Serializable {

    private static final long serialVersionUID = -3388198209010094394L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String alias;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Series series;

    @Enumerated(EnumType.STRING)
    private Types types;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}