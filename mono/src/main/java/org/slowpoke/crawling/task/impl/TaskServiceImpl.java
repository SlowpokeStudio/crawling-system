package org.slowpoke.crawling.task.impl;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slowpoke.crawling.service.IssueService;
import org.slowpoke.crawling.task.TaskService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Slf4j
@Service
public class TaskServiceImpl implements TaskService {

    @Resource
    private IssueService issueService;

    @Scheduled(cron = "0 0 0 * * *")
    @SchedulerLock(name = "genIssue", lockAtMostForString = "PT30S")
    public void genIssue() {
        issueService.genIssue();
    }

    @Scheduled(cron = "*/10 * * * * *")
    @SchedulerLock(name = "jsk3_CP360", lockAtMostForString = "PT30S")
    public String jsk3_CP360() throws IOException {
        Document doc = Jsoup.connect("https://chart.cp.360.cn/zst/k3js/?r_a=VBNbMf").get();
        Elements trs = doc.select("#data-tab > tr");
        for (Element tr : trs) {
            Elements issueTd = tr.select("td:first-child");
            if ("20190108-76".equals(issueTd.text())) {
                Elements numEle = tr.select("td:nth-child(3) > strong");
                log.info(numEle.text());
                return numEle.text();
            }
        }
        return null;
    }

    @Scheduled(cron = "*/10 * * * * *")
    @SchedulerLock(name = "gsk3_DaCaiJing", lockAtMostForString = "PT30S")
    public String gsk3_DaCaiJing() throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet("https://gsk3.jyuuu.com/lottery2/513/{issue}.json".replace("{issue}", "190115001"));
        HttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
            return "";
        }
        String data = EntityUtils.toString(response.getEntity());
        log.info(data.trim());
        return data.trim();
    }

    public static void main(String[] args) throws IOException {
        log.info(new TaskServiceImpl().jsk3_CP360());
        log.info(new TaskServiceImpl().gsk3_DaCaiJing());
    }

}
