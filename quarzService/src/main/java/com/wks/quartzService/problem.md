* job 可以不带@Component ，但却可以用@Resource 来注入Service 且只能这样 ，文档上写的直接通过Setter来注入，并没有实现
* 通过在job中带一个属性变量v  且每次++ 可以发现 每次都是new job 出的实例， 而不是单例
* forJob() 方法 只是提取jobKey ，并不和实例有关，
* pauseJob 暂停job unscheduleJob 停用 trigger

* quartz 在 初始化 脚本执行的时候 如果不指定 comment-prefix 那么脚本会执行错误 ，
```apple js
spring.quartz.jdbc.comment-prefix=#
```
* 把 quartz中执行 sql 脚本的代码抽出来

* 本来是想 每个COntroller都有一个自己的ResponseEnum , 来定义自己的接口的 返回代码 ， 但是问题在于 在CommonReturnMsg 中 无法做到针对不同的ResponseEnum ,都可以调用相同的get方法，
  原因 是Enum 无法继承 ，ResponseReturnMsg 不确定Enum类型，   
  还有一个解决办法是 一个系统 就只有一个ResponseEnum ,这样 也方便 返回代码的管理， 除了接口项目 返回值可能会很多 导致比较臃肿之外 就没啥缺点了

* 如果想加上spring 的校验功能 似乎只有为每一个接口都定义对应的VO入参对象  这似乎及其繁琐的


*  日志系统还不完善，没有测试是否可以按日期拓展
