# Build History
* javac with bash
* Ant
* Maven
* Ant with Ivy
* Gradle
* Cloud, PAAS, IAAS
* Docker, CAAS
-----
* Docker Compose
* Docker Swarm, Kubernates

# Continuous Integration & Delivery
* Build
* Test
* Analysis
* Deploy
* Report
* Notify

# Run Jar
```bash
java -jar crawling-system-mono-1.0-SNAPSHOT.jar
```

# create docker runtime if you need
```bash
docker run --name redis -d -p 6379:6379 -e "TZ=Asia/Taipei" redis:3.2.11
docker run --name mysql -d -p 3306:3306 -e "TZ=Asia/Taipei" -e MYSQL_ROOT_PASSWORD=rootroot mysql:5.7
docker run --name jenkins -d -p 8080:8080 -p 50000:50000 -e "TZ=Asia/Taipei" jenkins/jenkins:lts
```

# reference
* http://www.codedata.com.tw/book/java-basic/index.php?p=ch3-1
* http://www.codedata.com.tw/book/java-basic/index.php?p=ch3-2
* http://www.codedata.com.tw/book/java-basic/index.php?p=ch3-3
* http://www.codedata.com.tw/book/java-basic/index.php?p=ch3-4
* http://www.codedata.com.tw/java/understanding-gradle-1-ant/
* http://www.codedata.com.tw/java/understanding-gradle-2-maven/
* https://dotblogs.com.tw/hatelove/archive/2011/12/25/introducing-continuous-integration.aspx
* https://oomusou.io/docker/jenkins/
* https://docs.spring.io/spring-boot/docs/2.1.2.RELEASE/reference/htmlsingle/#boot-features-task-execution-scheduling

