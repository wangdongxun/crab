package redis;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Arrays;
import java.util.List;

public class RedisUtilAliYun {

    public static void main(String[] args) {
        /**常规初始化 host+password*/
//        JedisShardInfo jedisShardInfo = new JedisShardInfo("r-uf6x4oql1e034sk18tpd.redis.rds.aliyuncs.com", 6379);
//        jedisShardInfo.setPassword("Mall-2019");

        /**通过构造函数 初始化 可以设置db */
        JedisShardInfo jedisShardInfo=new JedisShardInfo("reids://:Mall-2019@r-uf6x4oql1e034sk18tpd.redis.rds.aliyuncs.com:6379/3");

        List<JedisShardInfo> shards = Arrays.asList(jedisShardInfo);
        ShardedJedisPool pool = new ShardedJedisPool(new JedisPoolConfig(), shards);

        ShardedJedis one = pool.getResource();
        one.set("foo", "bar");

        System.out.println(one.get("foo"));
    }

}
