package com.appleframework.boot.tomcat.spring;

public interface SpringContainerManagerMBean {

	public String getName();

	public void restart();

	public void start();

	public void stop();

	public boolean isRunning();
}
