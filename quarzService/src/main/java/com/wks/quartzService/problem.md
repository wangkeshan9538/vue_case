1. job 可以不带@Component ，但却可以用@Resource 来注入Service 且只能这样 ，文档上写的直接通过Setter来注入，并没有实现
2. 通过在job中带一个属性变量v  且每次++ 可以发现 每次都是new job 出的实例， 而不是单例
3. forJob() 方法 只是提取jobKey ，并不和实例有关，
4. pauseJob 暂停job unscheduleJob 停用 trigger

5. quartz 在 初始化 脚本执行的时候 如果不指定 comment-prefix 那么脚本会执行错误 ，
 ```apple js
spring.quartz.jdbc.comment-prefix=#
```

6. 把 quartz中执行 sql 脚本的代码抽出来
