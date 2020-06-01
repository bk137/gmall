package com.atguigu.gmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1、如何使用Nacos作为配置中心统一管理配置
 * 引入依赖
 * 1)、<dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 * 2）、创建一个bootstrap.properties
 *      spring.application.name=gmall-coupon
 *      spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3)、需要给配置中心默认添加一个叫数据及（Data.Id）gmall-coupon.properties.默认规则，应用名.properties（或者ymal)
 * 4)、给应用名.properties 添加任何配置
 * 5）、动态或者配置
 *    @RefreshScope:动态获取并刷新配置
 *    @Value("{$xxx.xxx.xxx}")
 *    如果配置中心有优先度用
 *
 * 2、细节
 * 1）、命名空间，配置隔离
 *      默认、public（保留空间）：默认新增的所有配置都在public空间。
 *      1、开发，测试，生产，利用命名空间来做环境隔离。test dev prop
 *      2、每一个微服务单独做环境隔离。做自己的命名空间 gmall-coupon gmall-member
 * 2）、配置集 所有配置的集合
 * 3）、配置集Id
 * 4）、配置分组
 *     默认所有配置都属于 DEFAULT_GROUP
 *     分组1 分组2
 * 项目中微服务创建自己的命名空间，使用配置分组区分环境.dev,test,prop
 * 3、同时加载多个配置集
 * 1)、微服务任何配置信息，任何配置文件都可以放在配置中心中
 * 2）、只需要bootstarp.properties说明加载配置中心中那些配置文件即可
 *     @Value  @ConfigurationProperties
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCouponApplication.class, args);
    }

}
