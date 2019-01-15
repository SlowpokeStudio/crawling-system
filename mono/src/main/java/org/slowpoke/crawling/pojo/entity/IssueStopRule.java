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
public class IssueStopRule implements Serializable {

	private static final long serialVersionUID = 9070685220926021825L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer lottoId;

	private String description;

	private LocalDateTime stopStartTime;

	private LocalDateTime stopEndTime;

	private LocalDateTime createTime;

	private LocalDateTime updateTime;


}
