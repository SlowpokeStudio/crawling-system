package org.slowpoke.crawling.pojo.enu;

public enum Types {
    NORMAL("一般"),
    SELF("自主"),
    YX("營銷");

    private final String name;

    Types(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
