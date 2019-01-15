package org.slowpoke.crawling.pojo.enu;

public enum Series {
    SSC("時時彩"),
    K3("快三"),
    PK10("PK10"),
    YY5("11選5"),
    DD28("蛋蛋28"),
    LHC("六合彩"),
    KL8("快樂8");

    private final String name;

    Series(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
