package org.slowpoke.crawling.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class IssueGenDetail implements Serializable {

	private static final long serialVersionUID = -2661768983485652947L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer lottoId;

	private Integer drawPeriod;

	private Integer saleEndSecond;

	private LocalDateTime firstAwardTime;

	private LocalDateTime lastAwardTime;

	private LocalDateTime createTime;

	private LocalDateTime updateTime;


}
