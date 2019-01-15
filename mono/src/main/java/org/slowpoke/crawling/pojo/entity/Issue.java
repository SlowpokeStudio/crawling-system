package org.slowpoke.crawling.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slowpoke.crawling.pojo.enu.IssueStatus;

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
public class Issue implements Serializable {

    private static final long serialVersionUID = 2210831814571136688L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer lottoId;

    private Long issueCode;

    private String webIssueCode;

    private LocalDateTime saleStartTime;

    private LocalDateTime saleEndTime;

    private LocalDateTime openDrawTime;

    @Enumerated(EnumType.STRING)
    private IssueStatus status;

    private String numberRecord;

    private LocalDateTime numberUpdateTime;

    private Long lastIssueCode;

    private Integer issueSequence;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
