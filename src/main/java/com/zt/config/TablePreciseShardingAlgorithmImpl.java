package com.zt.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;

/**
 * 数据表的分表策略
 */
@Slf4j
public class TablePreciseShardingAlgorithmImpl implements PreciseShardingAlgorithm<String> {
    /**
     * 生成0-3之间的随机数来选择表
     * @param collection
     * @param preciseShardingValue
     * @return
     */
    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        String tabName = preciseShardingValue.getLogicTableName() + "_0" + getRandomNumber(0, 3);
        log.info("写入表：{}", tabName);
        return tabName;
    }

    /**
     * 生成随机数
     * @param min
     * @param max
     * @return
     */
    public int getRandomNumber(int min, int max) {
        return (int) (Math.random() * ((max+1) - min) + min);
    }
}
