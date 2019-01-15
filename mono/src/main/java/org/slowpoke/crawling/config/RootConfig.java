package org.slowpoke.crawling.config;

import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.provider.redis.jedis.JedisLockProvider;
import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import redis.clients.jedis.JedisPool;

@Configuration
@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "PT1M")
public class RootConfig {

    /**
     * redis host .
     */
    @Value("${spring.redis.host}")
    private String redisHost;

    /**
     * JedisPool bean .
     *
     * @return jedis pool .
     */
    @Bean
    public JedisPool jedisPool() {
        return new JedisPool(redisHost);
    }

    /*
     * the lock key = String.format("%s:%s:%s", "job-lock", "default", lockName) .
     * you can get key from redis-cli for test .
     * if you can't get it, maybe the job run too fast .
     * just add Thread.sleep() in job for test .
     */

    /**
     * LockProvider bean .
     *
     * @param jedisPool <b>(JedisPool)</b> pass in
     * @return lock provider bean .
     */
    @Bean
    public LockProvider lockProvider(final JedisPool jedisPool) {
        return new JedisLockProvider(jedisPool);
    }

}
