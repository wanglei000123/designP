package com.cbf4life.singleton1;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来
 *         重要：见https://blog.csdn.net/jason0539/article/details/23297037举例
 */
public class Emperor {

	/*//第一种-懒汉式单例类.在第一次调用的时候实例化自己 
	private static Emperor emperor = null; // 定义一个皇帝放在那里，然后给这个皇帝名字
	private Emperor() {
		// 世俗和道德约束你，目的就是不让你产生第二个皇帝
	}
	public static Emperor getInstance() {
		//在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，这样也是线程安全的，同时避免了每次都同步的性能损耗
		if (emperor == null) { // 如果皇帝还没有定义，那就定一个
			synchronized (Emperor.class) {
				if (emperor == null) { 
					emperor = new Emperor();
				}
			}
		}
		return emperor;
	}*/

	//第二种-利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗,比上面一种好,但这种写法不好
	private static class LazyHolder {    
       private static final Emperor INSTANCE = new Emperor();    
    }    
    private Emperor(){}    
    public static final Emperor getInstance() {    
       return LazyHolder.INSTANCE;    
    }
    
    // 皇帝叫什么名字呀
 	public static void emperorInfo() {
 		System.out.println("我就是皇帝某某某....");
 	}
}