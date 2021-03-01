package com.cbf4life.adapter;

/**
 * @author cbf4Life cbf4life@126.com I'm glad to share my knowledge with you
 *         all. 用户信息对象
 *         6、ADAPTER—在朋友聚会上碰到了一个美女Sarah，从香港来的，可我不会说粤语，她不会说普通话，只好求助于我的朋友kent了，他作为我和Sarah之间的Adapter，让我和Sarah可以相互交谈了(也不知道他会不会耍我)
        适配器（变压器）模式：把一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口原因不匹配而无法一起工作的两个类能够一起工作。适配类可以根据参数返还一个合适的实例给客户端。
 */
public interface IUserInfo {

	// 获得用户姓名

	public String getUserName();

	// 获得家庭地址

	public String getHomeAddress();

	// 手机号码，这个太重要，手机泛滥呀

	public String getMobileNumber();

	// 办公电话，一般式座机

	public String getOfficeTelNumber();

	// 这个人的职位是啥

	public String getJobPosition();

	// 获得家庭电话，这个有点缺德，我是不喜欢打家庭电话讨论工作

	public String getHomeTelNumber();
}
