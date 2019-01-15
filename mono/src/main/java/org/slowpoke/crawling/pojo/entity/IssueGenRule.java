package org.slowpoke.crawling.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slowpoke.crawling.pojo.enu.Status;

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
public class IssueGenRule implements Serializable {

    private static final long serialVersionUID = -6387821395928333163L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer lottoId;

    private String genWeekDay;

    private Integer maxGenDay;

    private Integer webIssueSeqBit;

    private String isSnWebIssue;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
