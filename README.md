﻿ JavaHomeWork4
类、对象基础知识（二）
===============
任务与整体解决方案：
------
* 定义一个类实现银行帐户的概念，其属性有“帐号”和“存款余额”，方法有“存款”、“取款”、“查询余额”和“显示帐号”。再定义主类，创建帐户类的对象，并完成相应操作。
* 设计一个日期类，其中包括年月日属性和必要的构造方法，以及根据年判断是否是闰年、打印日期等成员方法。需编写测试类显示结果。
### 定义一个类实现银行帐户的概念，其属性有“帐号”和“存款余额”，方法有“存款”、“取款”、“查询余额”和“显示帐号”。再定义主类，创建帐户类的对象，并完成相应操作。

很简单

### 设计一个日期类，其中包括年月日属性和必要的构造方法，以及根据年判断是否是闰年、打印日期等成员方法。需编写测试类显示结果。

也很简单。测试类稍微注意一下命名等问题就行了<br>

领悟：
------
#### 这次命名、导入包的时候拼错了
其余的很轻松<br>
## 推至github时出现新问题
```
fatal:'origin' does not appear to be a git repository 
fatal:Could not read from remote repository
```
这个就是本地分支与远程分支断开了，输入
```
git remote –v
```
若啥反应都没有，就是这个问题了。<br>
使用
```
git remote add origin https://github.com*****************.git
```
加关联即可，随后再remote看一下是否成功<br>
之后的就搞定了，[具体可以参考这里](https://blog.csdn.net/huanhuaqian/article/details/81986064)
