# 5/6
修改下路由用法
A->B->C->D
如果直接跳到B,同时关闭掉C D 页面
The following assertion was thrown while handling a gesture:
'package:flutter/src/widgets/navigator.dart': Failed assertion: line 2119 pos 12: 'route._navigator == this': is not true.

其实现在有什么问题：
对这个研究方向感到很迷茫，不懂为啥要研究这个。

0. 云手机的实现原理
1. 云手机的通讯管理方案研究

结合之前
1. 如何在虚拟机中安装安卓系统(原生，第三方)
2. 在虚拟机外面如何采集虚拟机中的安卓系统的数据(CPU,内存等信息，包括使用率)
3. 如何在虚拟机外面修改虚拟机中安卓系统的IP
4. 如何在虚拟机外面给虚拟机中的安卓系统安装/卸载软件



就像前段时间   如何安装

linmb123
lmb0267

参考文章：
给了我一个特别好开阔眼界的入口--通过读别人的论文思想
http://cprs.patentstar.com.cn/Search/Detail?ANE=9HBB9DHB9IEEBIDA9EGC4EAACICA9HFHAFIA9EEE7ABA9HHF

http://cprs.patentstar.com.cn/Search/ResultList?CurrentQuery=5LiA56eN6L+c56iL5LqR5omL5py65bqU55So5a6J6KOF5pa55rOVL1lZ&type=cn

https://testerhome.com/topics/20866 云测服务 iOS 云真机实现原理
一张图告诉你云手机原理是什么，小白看一眼就懂了
https://www.yunshouji123.com/post/96.html
云测试机：
能装apk,能捕获应用日志

# 云手机的实现原理
> 云手机就是用ARM芯片架构在云端的虚拟手机。
首先搭建基于arm芯片架构的云服务器（介绍下arm芯片，ARM芯片搭建云服务器。），云手机就是这个云服务器上的虚拟出来的一个个虚拟手机（既不是真机，也不是手机模拟器）。
通过云端服务器来负责分发消息，与做一些websocket服务的代理转发，前端则直接对接云端服务器。

arm芯片
应用于网站或游戏的云服务器是X86与X64框架CPU，主要是指PC台式或服务器，而云手机应用的则是ARM构架服务器，主要应用于移动通信设备，说的通俗一点，苹果、三星、华为都在用ARM芯片架构。

难点就是


对应的产品实际例子http://www.yilingsoft.com/home/mobile_service/machine.html


# 云手机的通讯管理方案研究
> 以安装apk文件为例
步骤1：选择文件--根据用户指令选择待上传文件，并获取该待上传文件的文件信息（包括用户编码信息、云手机编码信息、md5值、sha值及云手机所属机房信息）；
步骤2：文件传输到上传服务器---基于该文件信息在数据库中查找是否有相同的文件，若有则关联该云手机
并将该文件自动安装于该云手机上；如无则将该待上传文件分割成多个文件单元依序传送
至上传服务器；
步骤3：上传服务器接收处理过程---上传服务器将接收到的该多个文件单元合并成一个安装文件上传至文件
服务器，然后将该文件信息及安装文件存储于数据库中，并传送至传送服务器；
步骤4：安装文件---传送服务器将接收到的安装文件自动安装于对应的云手机上。





云手机是基于arm架构在云端手机。
搭建基于arm架构的，
通过云服务器进行消息的转发。






今日完成：
看一些云手机相关的文档。
# 云手机的实现原理
> 云手机就是用ARM芯片架构在云端的虚拟手机。
首先搭建基于arm芯片架构的云服务器，云手机就是这个云服务器上的虚拟出来的一个个虚拟手机（既不是真机，也不是手机模拟器）。
通过云端服务器来负责分发消息，与做一些websocket服务的代理转发，前端则直接对接云端服务器。


# 云手机的通讯管理方案研究
> 以安装apk文件为例
步骤1：选择文件--根据用户指令选择待上传文件，并获取该待上传文件的文件信息（包括用户编码信息、云手机编码信息、md5值、sha值及云手机所属机房信息）；
步骤2：文件传输到上传服务器---基于该文件信息在数据库中查找是否有相同的文件，若有则关联该云手机
并将该文件自动安装于该云手机上；如无则将该待上传文件分割成多个文件单元依序传送
至上传服务器；
步骤3：上传服务器接收处理过程---上传服务器将接收到的该多个文件单元合并成一个安装文件上传至文件
服务器，然后将该文件信息及安装文件存储于数据库中，并传送至传送服务器；
步骤4：安装文件---传送服务器将接收到的安装文件自动安装于对应的云手机上。




# 5/6
做的是测试apk 为例子
先是测试了一个java 调用adb命令
测试adb 相关的 命令

找了一个开源的解决方案OpenSTF,OpenSTF（Smartphone Test Farm）一个web端移动设备管理平台
开发语言：前端webangularjs，后端使用nodejs开发。
具备的功能：可以从浏览器端远程调试、远程管理设备。
    1、 在Web上支持管理上百个android设备（真机，或虚拟手机）。
    2、 支持Android多个版本（2.3.3 ~ 8.0），而且不需要root。
    3、 实时屏幕操作和显示。
    4、 支持adb connnect远程连接调试。
    5、 可以从PC机键盘输入到远程的android设备中。
    6、 安装卸载APK。
    7、 android设备信息的展示（如：网络状态、MIME、android版本、手机型号等等）。
    8、 远程开关机、远程开关WIFI、截屏、LogCat等等。


目前的云测试平台基于此来二次开发的。


## 参考文档
https://www.cnblogs.com/yyoba/p/11232406.html
https://www.jianshu.com/p/c5500bd5d5be
跨端
国产https://github.com/macacajs/XCTestWD
Ubuntu Docker 安装  https://www.runoob.com/docker/ubuntu-docker-install.html
docker启动状态为Exited (0)容器 https://blog.csdn.net/xiejunna/article/details/86222859

Open-STF的使用 ！！！ https://www.jianshu.com/p/ba3e4712105f

https://blog.csdn.net/weixin_43164644/article/details/82823176
STF 集成 iOS 之设备连接
https://testerhome.com/topics/18647
STF 集成 iOS 之远程控制
https://testerhome.com/topics/19203

OpenSTF（一）基本介绍
https://www.pianshen.com/article/566468000/

## OpenSTF 平台搭建





docker run -d --name rethinkdb -v /srv/rethinkdb:/data --net host rethinkdb rethinkdb --bind all --cache-size 8192 --http-port 8090
docker run -d --name adbd --privileged -v /dev/bus/usb:/dev/bus/usb --net host sorccu/adb:latest # 启动adb
docker run -d --name stf --net host openstf/stf stf local --public-ip 192.168.163.130 # 启动stf 启动的时配置的IP地址通过ifconfig命令查询到的结果


解决Docker pull镜像速度过慢的问题

删除冲突的daemon
https://blog.csdn.net/u012129607/article/details/79616547
docker ps -a
docker rm fb087642b497(镜像ID) 
docker restart nginx


# ubuntu 知识
查看ubuntu系统的版本信息 https://blog.csdn.net/whbing1471/article/details/52074390?utm_medium=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-5&depth_1-utm_source=distribute.pc_relevant.none-task-blog-BlogCommendFromBaidu-5
cat /proc/version
uname -a
lsb_release -a

ubuntu如何进入local、bin目录
cd /usr/local/bin

## 原理介绍
项目是B/S架构，浏览器端使用的是pug模版引擎，前端使用的是angular1，服务器使用的是nodejs，数据库使用的是对象型数据库rethinkdb，
构建工具使用的是webpack+gulp。如果改动了前端，直接保存运行就好。如果改动的是lib下面的后端代码，需要先gulp clean一下。


## 虚拟机中安装模拟器


## 待解决 
ubuntu 环境老是下载应用失败 （可能是32位
官网下载不了，下载平台
https://dl.iplaysoft.com/files/5254.html


奇怪为啥最新和最低的版本装docker有问题



## vm 激活码
https://blog.csdn.net/wtfsb/article/details/82945299



今日完成：
1 搭建ubuntu虚拟机环境
2 搭建OpenSTF平台
前端angularjs，后端使用nodejs开发,用到协议是websocket。能达到外部对虚拟机的手机控制。
基本能达到的功能：
    1、 在Web上支持管理上百个android设备（真机，或虚拟手机）。
    2、 支持Android多个版本（2.3.3 ~ 8.0），而且不需要root。
    3、 实时屏幕操作和显示。
    4、 支持adb connnect远程连接调试。
    5、 可以从PC机键盘输入到远程的android设备中。
    6、 安装卸载APK。
    7、 android设备信息的展示（如：网络状态、MIME、android版本、手机型号等等）。
    8、 远程开关机、远程开关WIFI、截屏、LogCat等等。

碰到到一些耗时问题就是第一选择ubuntu和虚拟机版本对搭建docker环境的影响问题
docker 环境下载镜像出错问题

明天准备完成：
继续了解openstf原理形成文档 



# 5/8
忽然很有冲动想把这里面的都看完
https://www.runoob.com/




今天继续探索下一些内容
## docker
## openstf原理
## 研究下修改ip的方案
理解一些代理ip的原理。


今日完成
1 研究虚拟机外部修改云手机ip的方案
研究内容：针对市面的修改ip产品，构想它的实现方案。
http://sj.wanbianvps.com/
https://www.tuziip.com/simulatorip.html 
https://zhidao.baidu.com/question/539839138.html?qbl=relate_question_0&word=%CD%C3%D7%D3ip%D4%AD%C0%ED
明天准备完成：
研究通过代码修改云手机ip代码兼容性可行性


获取代理ip数据，
然后怎么生效修改公网ip（TODO）https://github.com/lshAndroid/AppBlogIp

目标 http://sj.wanbianvps.com/
已解决的产品 https://www.tuziip.com/simulatorip.html           http://www.wanbiandaili.com/
一般的代理IP软件的工作原理是什么？https://zhidao.baidu.com/question/539839138.html?qbl=relate_question_0&word=%CD%C3%D7%D3ip%D4%AD%C0%ED
用兔子IP和云手机切换IP地址多开手游防封教程 http://chanye.uuu9.com/biz/NewsDetail.htm?param=118044

代理IP的那些事儿（理论基础） https://zhuanlan.zhihu.com/p/46823908

今天的任务，在linux环境下搭建模拟器，研究openstf流程，研究下修改ip的方案
结合openstf 学习下node.js argular2


linmb123
linmb123456


比较好奇怎么拿github上面的openstf来二次开发的。-----


花两天陆陆续续写下文档。
内容：
云手机平台搭建探索
云手机的原理
云手机的平台


模拟器：
https://www.ganbey.com/linux-%E5%AE%89%E5%8D%93%E6%A8%A1%E6%8B%9F%E5%99%A8%E6%8E%A8%E8%8D%90-624
adb 常用的命令
https://zhuanlan.zhihu.com/p/96108688

E: Could not get lock /var/lib/dpkg/lock-frontend - open (11: Resource temporarly unavailable)
E: Unable to acquire the dpkg frontend lock (/var/lib/dpkg/lock-frontend), is an other process using it?

删除锁定文件，行了

sudo rm /var/lib/dpkg/lock-frontend       
sudo rm /var/lib/dpkg/lock



















每天
## 01 二维数组的查找
如果该数字大于要查找的数字，剔除这个数字所在的列：如果该数字小于要查找的 数字，剔除这个数字所在的行。？？
int rows = matrix.length; // 数组的行数 
int cols = matrix[1].length; // 数组行的列数 
int row = 0; // 起始开始的行号 
int col = cols - 1; // 起始开始的列号
## 02 替换空格
为啥要从判断是否空间是否充足角度出发？
通过指针来移动替换
## 03 从尾到头打印链表
## 04 重建二叉树
需要有遍历的思路
## 05 两个占实现队列
