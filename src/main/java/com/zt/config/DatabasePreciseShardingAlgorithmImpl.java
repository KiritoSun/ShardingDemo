package com.zt.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;

/**
 * 数据库的分库策略
 */
@Slf4j
public class DatabasePreciseShardingAlgorithmImpl implements PreciseShardingAlgorithm<Long> {
    /**
     * 对id字段进行取余操作均匀分布每一个库
     * @param collection
     * @param preciseShardingValue
     * @return
     */
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        // 获取id字段
        Long id = preciseShardingValue.getValue();
        // 对id字段进行取余操作
        String str = String.valueOf((id-1) % 4);
        // 遍历所有的库
        for (String databasesName : collection) {
            if (databasesName.endsWith(str)) {
                log.info("当前写入数据库：{}", databasesName);
                return databasesName;
            }
        }
        throw new IllegalArgumentException();
    }
}
