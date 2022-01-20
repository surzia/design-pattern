# README
二十二种设计模式的Java实现

## 单例模式

> 单身狗的寂寞模式，只存在一个实例

文档：[singleton](src/com/github/surzia/singleton/README.md)

实例：
- [单例模式几种实现](src/com/github/surzia/singleton/codec)

## 工厂模式
> 要什么给什么

文档：[factory](src/com/github/surzia/factory/README.md)

实例：
- [画图工厂](src/com/github/surzia/factory/codec/shape)
- [咖啡工厂](src/com/github/surzia/factory/codec/coffee)
- [造车抽象工厂](src/com/github/surzia/factory/codec/car)

## 状态模式
>心情不好，状态不对

文档：[state](src/com/github/surzia/state/README.md)

实例：
- [电视机换台](src/com/github/surzia/state/codec/television)
- [快递物流](src/com/github/surzia/state/codec/goods)

## 建造者模式
>我监工，你干活

文档：[builder](src/com/github/surzia/builder/README.md)

实例：
- [汽车生产线](src/com/github/surzia/builder/codec)

## 原型模式
>造轮子是不可能造轮子的

文档：[prototype](src/com/github/surzia/prototype/README.md)

实例：
- [图画原型](src/com/github/surzia/prototype/codec)

## 代理模式
>老板不干活，小弟跑断腿

文档：[proxy](src/com/github/surzia/proxy/README.md)

实例：
- [网络代理](src/com/github/surzia/proxy/codec/network)
- [图片传输](src/com/github/surzia/proxy/codec/image)

## 模板模式
>我怎么说，你怎么做。什么？具体要怎么做？你自己负责

文档：[template](src/com/github/surzia/template/README.md)

实例：
- [车辆生产线](src/com/github/surzia/template/codec/car)
- [网络爬虫](src/com/github/surzia/template/codec/mall)

## 装饰器模式
>如果你一层一层拨开我的心，你会发现，这裹的是个啥玩意

文档：[decorator](src/com/github/surzia/decorator/README.md)

实例：
- [Pizza](src/com/github/surzia/decorator/codec/pizza)
- [外卖](src/com/github/surzia/decorator/codec/takeaway)

## 外观模式
>不能只看外表，更要注重内在，如果了解了内在，那么你就会觉得......还是只看外表吧

文档：[facade](src/com/github/surzia/facade/README.md)

实例：
- [购物结账](src/com/github/surzia/facade/codec/shop)

## 适配器模式
>想方设法变成你的形状

文档：[adapter](src/com/github/surzia/adapter/README.md)

实例：
- [媒体播放](src/com/github/surzia/adapter/codec/media)

## 桥接模式
>架起沟通的桥梁

文档：[bridge](src/com/github/surzia/bridge/README.md)

实例：
- [画图](src/com/github/surzia/bridge/codec/shape)
- [造车](src/com/github/surzia/bridge/codec/vehicle)

## 组合模式
>螺丝加螺母

文档：[composite](src/com/github/surzia/composite/README.md)

实例：
- [媒体播放](src/com/github/surzia/composite/codec/salary)

## 享元模式
>主要是享受

文档：[flyweight](src/com/github/surzia/flyweight/README.md)

实例：
- [汽车工厂](src/com/github/surzia/flyweight/codec/car)
- [反恐精英](src/com/github/surzia/flyweight/codec/csgame)

## 备忘录模式
>Ctrl S与Ctrl Z

文档：[memento](src/com/github/surzia/memento/README.md)

实例：
- [文章版本](src/com/github/surzia/memento/codec)

## 责任链模式
>击鼓传花

文档：[chain of responsibility](src/com/github/surzia/responsibility/README.md)

实例：
- [简单演示](src/com/github/surzia/responsibility/codec/example)
- [ATM](src/com/github/surzia/responsibility/codec/atm)

## 解释器模式
>你说啥？

文档：[interpreter](src/com/github/surzia/interpreter/README.md)

实例：
- [简单运算判断](src/com/github/surzia/interpreter/codec/operation)
- [SQL](src/com/github/surzia/interpreter/codec/sql)

## 中介者模式
>万能的中介

文档：[mediator](src/com/github/surzia/mediator/README.md)

实例：
- [指挥控制台](src/com/github/surzia/mediator/codec/atc)
- [制冷器](src/com/github/surzia/mediator/codec/cooling)

# 过滤器模式
>筛子

文档：[filter](src/com/github/surzia/filter/README.md)

实例：
- [人员筛选](src/com/github/surzia/filter/codec)

# 命令模式
>收到！

文档：[command](src/com/github/surzia/command/README.md)

实例：
- [自动化控制](src/com/github/surzia/command/codec/automation)
- [买卖股票](src/com/github/surzia/command/codec/stock)
