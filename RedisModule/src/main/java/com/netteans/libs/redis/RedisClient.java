package com.netteans.libs.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.stereotype.Service;

/**
 * Created by Kings on 2015/5/6.
 */
@Service
public class RedisClient {

    @Autowired
    StringRedisConnection stringRedisConnection;

    public void set(String key, String value) {
        stringRedisConnection.set(key, value);
    }

    public String get(String key) {
        return stringRedisConnection.get(key);
    }
}
