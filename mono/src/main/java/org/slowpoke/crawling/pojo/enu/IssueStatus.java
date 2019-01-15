package org.slowpoke.crawling.pojo.enu;

public enum IssueStatus {

    WAIT_SALE("待销售"),
    SELLING("销售中"),
    WAIT_RESULT("等待號碼"),
    FINISHED("结束");

    private final String name;

    IssueStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
