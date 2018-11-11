spingboot建议的目录结构

+com
  +example
    +myproject
      -domain      主要用于实体与数据库访问层
      -service     主要是业务类代码
      -controller  主要页面访问控制

建议 Application.java(MyprojectApplication.java) 放在根目录下，主要做一些框架配置；
最后启动该类中的 main() 方法，此时 java 项目就搭建好了；