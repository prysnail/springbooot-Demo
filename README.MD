
# Spring Boot 整合

1. 示例数据库使用MySQL官方示例`sakila`,下载地址[sakila_db](https://dev.mysql.com/doc/index-other.html)

## 整合Mybatis

`pom.xml`引入相关依赖：

- web依赖：spring-boot-starter-web
- mybatis依赖：mybatis-spring-boot-starter
- MySQL依赖：mysql-connector-java

配置mapper扫描包路径：`@MapperScan`

