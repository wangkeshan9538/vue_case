1. job 可以不带@Component ，但却可以用@Resource 来注入Service 且只能这样 ，文档上写的直接通过Setter来注入，并没有实现
2. 通过在job中带一个属性变量v  且每次++ 可以发现 每次都是new job 出的实例， 而不是单例
3. forJob() 方法 只是提取jobKey ，并不和实例有关，
4. pauseJob 暂停job unscheduleJob 停用 trigger
