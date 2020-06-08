# ShardingDemo
sharding实现数据库分库分表

## 分库配置

sharding.jdbc.datasource.names = sharding_test_00,sharding_test_01,sharding_test_02,sharding_test_03
sharding.jdbc.datasource.sharding_test_00.type = com.alibaba.druid.pool.DruidDataSource
sharding.jdbc.datasource.sharding_test_00.driver-class-name = com.mysql.jdbc.Driver
sharding.jdbc.datasource.sharding_test_00.url = jdbc:mysql://127.0.0.1:3306/sharding_test_00?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useSSL=false
sharding.jdbc.datasource.sharding_test_00.username = root
sharding.jdbc.datasource.sharding_test_00.password = abc123
### sharding_test_01库配置
sharding.jdbc.datasource.sharding_test_01.type = com.alibaba.druid.pool.DruidDataSource
sharding.jdbc.datasource.sharding_test_01.driver-class-name = com.mysql.jdbc.Driver
sharding.jdbc.datasource.sharding_test_01.url = jdbc:mysql://127.0.0.1:3306/sharding_test_01?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useSSL=false
sharding.jdbc.datasource.sharding_test_01.username = root
sharding.jdbc.datasource.sharding_test_01.password = abc123
### sharding_test_02库配置
sharding.jdbc.datasource.sharding_test_02.type = com.alibaba.druid.pool.DruidDataSource
sharding.jdbc.datasource.sharding_test_02.driver-class-name = com.mysql.jdbc.Driver
sharding.jdbc.datasource.sharding_test_02.url = jdbc:mysql://127.0.0.1:3306/sharding_test_02?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useSSL=false
sharding.jdbc.datasource.sharding_test_02.username = root
sharding.jdbc.datasource.sharding_test_02.password = abc123
### sharding_test_03库配置
sharding.jdbc.datasource.sharding_test_03.type = com.alibaba.druid.pool.DruidDataSource
sharding.jdbc.datasource.sharding_test_03.driver-class-name = com.mysql.jdbc.Driver
sharding.jdbc.datasource.sharding_test_03.url = jdbc:mysql://127.0.0.1:3306/sharding_test_03?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useSSL=false
sharding.jdbc.datasource.sharding_test_03.username = root
sharding.jdbc.datasource.sharding_test_03.password = abc123

### 逻辑表ids_user分库规则
sharding.jdbc.config.sharding.tables.ids_user.database-strategy.standard.sharding-column = id
sharding.jdbc.config.sharding.tables.ids_user.database-strategy.standard.precise-algorithm-class-name = com.zt.config.DatabasePreciseShardingAlgorithmImpl
### 逻辑表ids_user的分表规则
sharding.jdbc.config.sharding.tables.ids_user.actual-data-nodes = sharding_test_0$->{0..3}.ids_user_0$->{0..3}
sharding.jdbc.config.sharding.tables.ids_user.table-strategy.standard.sharding-column = id
sharding.jdbc.config.sharding.tables.ids_user.table-strategy.standard.precise-algorithm-class-name = com.zt.config.TablePreciseShardingAlgorithmImpl
