package com.fracong.manage.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.fracong.util.date.DateType;
import com.fracong.util.date.DateUtil;

@Configuration
@EnableScheduling
public class TestScheduling {
	
	@Scheduled(fixedDelay=3000)//300s执行1次此方法;
    public void sendType1() throws Exception{
		System.err.println("sendType1---->"+DateUtil.getNowDateStringByType(DateType.TYPE_1));
	}
	
	@Scheduled(fixedDelayString="${schedule.test.time}")//将执行的时间写在配置文件中
    public void sendType2() throws Exception{
		System.err.println("sendType2---->"+DateUtil.getNowDateStringByType(DateType.TYPE_1));
	}
	
	@Scheduled(fixedRate=3000)//说明：上一次执行在预定的时间内，会按改时间执行，如果超过执行时间，则上一次执行完成，立即执行
    public void sendType23() throws Exception{
		System.err.println("sendType3---->"+DateUtil.getNowDateStringByType(DateType.TYPE_1));
	}
	
	@Scheduled(cron="*/30  * * * * ?")//表达式执行
    public void sendType4() throws Exception{
		System.err.println("sendType4---->"+DateUtil.getNowDateStringByType(DateType.TYPE_1));
	}
}
