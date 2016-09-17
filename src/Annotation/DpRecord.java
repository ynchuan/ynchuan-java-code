package Annotation;
/**
 * 23中设计模式
 * 工厂--简单工厂(生产一件产品) —— 抽象工厂(生产一组产品)
 * 命令模式  —— 桥接模式 --- 采用内聚的方式 
 * 策略模式 --添加比较策略
 * 动态代理模式
 * 链式模式
 * 遍历器模式
 * 
 * 观察者模式
 * 适配器模式
 * 
 * @author Administrator
 *
 */
public @interface DpRecord {
	public int getINum() default 1;

}
