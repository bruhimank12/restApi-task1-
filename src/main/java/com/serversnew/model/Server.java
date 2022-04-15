package com.serversnew.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="server")
public class Server {
	@Id
	private Long serverId;
	
	private String serverName;
	private int serverType;
	public Long getServerId() {
		return serverId;
	}
	public void setServerId(Long serverId) {
		this.serverId = serverId;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public int getServerType() {
		return serverType;
	}
	public void setServerType(int serverType) {
		this.serverType = serverType;
	}
	@Override
	public String toString() {
		return "Server [serverId=" + serverId + ", serverName=" + serverName + ", serverType=" + serverType + "]";
	}
	
	
	
}
