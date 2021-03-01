package com.cbf4life.adapter;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 这就是我们具体的应用了，比如老板要查所有的20-30的女性信息
 *         配器模式主要是在程序代码写好之后 又遇到了需要使用新对象的情况 新的对象和原来使用的对象 
 *         本质上是一种 但是里面的方法和属性都不相同 所以为了减少代码的修改 就像电源适配器一样 使用不同的对象的一种方法
 *         本例中 IUserInfo是原来老的对象，OuterUserInfo是新的对象，通过OuterUserInfo新对象完成对老对象属性的转换
 */
public class App {

	public static void main(String[] args) {

		// 没有与外系统连接的时候，是这样写的

		// IUserInfo youngGirl = new UserInfo();

		// 老板一想不对呀，兔子不吃窝边草，还是找人力资源的员工好点

		IUserInfo youngGirl = new OuterUserInfo(); // 我们只修改了这一句好

		// 从数据库中查到101个

		for (int i = 0; i < 101; i++) {

			youngGirl.getMobileNumber();

		}

	}

}
