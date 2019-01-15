package org.slowpoke.crawling.service.impl;

import org.slowpoke.crawling.service.IssueService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class IssueServiceImpl implements IssueService {

    @Override
    public void genIssue() {
//        try {
//            lottoTypeRepository.findByStatus(Status.ENABLE).forEach(l -> {
//                // 找出產獎期的規則
//                lottoIssueGenRuleRepository.findByLottoIdAndStatus(l.getId(), Status.ENABLE).ifPresent(r -> {
//                    int genDayCount = 0;
//                    LocalDate issueDate = LocalDate.now();
//                    while (genDayCount < r.getMaxGenDay()) {
//                        // 檢查今天是否要產獎期
//                        if (r.getGenWeekDay().contains(String.valueOf(issueDate.getDayOfWeek().getValue()))) {
//                            //  檢查獎期是否已產出
//                            if (lottoIssueMapper.findDateIssues(l.getId(), issueDate).isEmpty()) {
//                                lottoIssueGenService.genOneDayIssues(l.getId(),
//                                        issueDate, Optional.ofNullable(r.getWebIssueSeqBit()).orElse(4), r.getIsSnWebIssue());
//                                log.info("gen new issue lottoId:{},  issueDate:{}", l.getId(), issueDate);
//                            }
//                            genDayCount++;
//                        }
//                        issueDate = issueDate.plusDays(1);
//                    }
//                });
//            });
//        } catch (Exception ex) {
//            throw new LottoGenIssueException(ErrorCode.ISS_001);
//        }
    }

}
