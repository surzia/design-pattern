# 装饰器模式
> 装饰器模式动态地将附加职责附加到对象。装饰器为子类提供了灵活替代方案，以扩展功能。

## 图示
![](./img/uml.jpg)

- 每个组件可以单独使用，也可以由装饰器包装
- 每个装饰器都有一个实例变量，该变量保存对其装饰的组件的引用
- ConcreteComponent是我们将要动态装饰的对象

## 优缺点

优点
- 装饰器模式可用于在运行时扩展（装饰）某个对象的功能。
- 装饰器模式是子类的替代方法。子类化会在编译时添加行为，并且更改会影响原始类的所有实例；装饰可以在运行时为单个对象提供新的行为。
- 装饰器提供按需付费的方式来添加功能。可以尝试定义一个简单的类并使用Decorator对象增量添加功能，而不必尝试在复杂的可定制类中支持所有可预见的功能。

缺点 
- 装饰器会使实例化组件的过程变得复杂，因为不仅必须实例化组件，而且还需要将其包装在许多装饰器中。 
- 让装饰器跟踪其他装饰器可能会很复杂。

## 实例
一个简单的Pizza实例可以参考这个[教程](https://www.geeksforgeeks.org/decorator-pattern-set-3-coding-the-design/)

接下来看另一个例子，在我们点外卖时，真正付款价格往往不同于外卖本身的价格，还需要加上配送费，或许还有满减等一系列优惠活动。

以上场景就可以使用装饰器来实现，在外卖对象的基础上分别构建配送费装饰器和优惠劵装饰器，最终计算价格。

首先创建外卖的抽象类，内部定义一个属性，表示是否由优惠券，再定义方法返回价格。
```java
public abstract class Foods {

    public boolean hasDiscount = false;

    public abstract double getCost();
}
```
再定义配送费装饰器，伪造一个计费规则，500米内免配送费，超过500米的部分按0.04收费；配送时间在中午11点到1点之间收取高峰配送费5元。
```java
public class Delivery extends Foods {

    protected Foods foods;
    protected int distance;
    protected double time;

    public Delivery(Foods foods, int distance, double time) {
        this.foods = foods;
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double getCost() {
        double distanceCost, timeCost;
        if (distance < 500) distanceCost = 0;
        else distanceCost = (distance - 500) * 0.04;
        if (time < 13 && time > 11) timeCost = 5;
        else timeCost = 0;
        return foods.getCost() + distanceCost + timeCost;
    }
}
```
优惠劵装饰器定义如下，如果外卖存在优惠券，就打8折。
```java
public class Discount extends Foods {

    protected Foods foods;

    public Discount(Foods foods) {
        this.foods = foods;
    }

    @Override
    public double getCost() {
        double discount = 1;
        if (foods.hasDiscount) discount = 0.8;
        return foods.getCost() * discount;
    }
}
```
假如点了个汉堡套餐，原件30元。
```java
public class Hamburger extends Foods {

    private double price = 30.0;

    @Override
    public double getCost() {
        return price;
    }
}
```
那么装饰器模式下计费过程如下：
```java
public class Main {

    public static void main(String[] args) {
        Foods hamburger = new Hamburger();
        System.out.println("外卖原价: " + hamburger.getCost());
        hamburger = new Delivery(hamburger, 600, 12.5);
        System.out.println("加上配送费: " + hamburger.getCost());
        hamburger.hasDiscount = true;
        hamburger = new Discount(hamburger);
        System.out.println("打折之后: " + hamburger.getCost());
    }
}
```
输出结果为：
```
外卖原价: 30.0
加上配送费: 39.0
打折之后: 31.200000000000003
```

## 结论
装饰器模式其实和重写父类方法类似，在某些时候需要按需选择，并不一定是某一个就是最好。

源代码见[github](https://github.com/surzia/design-pattern)