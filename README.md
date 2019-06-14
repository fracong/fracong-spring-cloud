学习使用Springcloud框架

模块说明：
fracong-util 作为工具类
fracong-core 依赖fracong-util，存放mybatis的mapper相关类
fracong-manage 依赖fracong-core，作为中间件的消息发起端
fracong-service 依赖fracong-core，作为间件的消息消费端
fracong-html 作为纯HTML页面 【不依赖其他子模块】
fracong-eureka-server 服务注册服务器 【不依赖其他子模块】
fracong-gateway-zuul 使用zuul作为网关框架，使用eureka注册中心进行服务转接 【不依赖其他子模块】
fracong-cloud-gateway 使用SpringCloud Gateway 框架，使用eureka注册中心进行服务转接 【不依赖其他子模块】
fracong-sharding-jdbc 当当网的分库分表中间件框架，集成mybatis、mysql框架，作为单独子模块学习使用 【不依赖其他子模块】

