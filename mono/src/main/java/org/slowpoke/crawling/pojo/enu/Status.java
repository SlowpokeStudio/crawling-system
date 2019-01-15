package org.slowpoke.crawling.pojo.enu;

public enum Status {
    ENABLE("啟用"), DISABLE("停用");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
