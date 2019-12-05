package com.example.demo.dao;

import java.util.Date;

public class Operation {
    private Long   id;
    private String identity ; // 操作人账号
    private String clientIp ; // 客户端ip
    private String username ; // 操作人姓名
    private Long   operType ; // 日志类型 
    private String operUrl ; // 操作的url 
    private String operEvent ; // 操作事件
    private String reqParam ; // 请求参数信息
    private String reqType ; // 请求方式：POST或者GET
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getOperType() {
		return operType;
	}
	public void setOperType(Long operType) {
		this.operType = operType;
	}
	public String getOperUrl() {
		return operUrl;
	}
	public void setOperUrl(String operUrl) {
		this.operUrl = operUrl;
	}
	public String getOperEvent() {
		return operEvent;
	}
	public void setOperEvent(String operEvent) {
		this.operEvent = operEvent;
	}
	public String getReqParam() {
		return reqParam;
	}
	public void setReqParam(String reqParam) {
		this.reqParam = reqParam;
	}
	public String getReqType() {
		return reqType;
	}
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}
	public Date getOperTime() {
		return operTime;
	}
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}
	private Date   operTime ; // 操作时间    
}
