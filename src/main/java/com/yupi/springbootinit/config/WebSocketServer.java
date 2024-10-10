package com.yupi.springbootinit.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint("/websocket/{userId}")
@Slf4j
public class WebSocketServer {



    private static ConcurrentHashMap<String, Session> sessions = new ConcurrentHashMap<>();
    private String userId;

    @OnOpen
    public void onOpen(Session session, @PathParam("userId") String userId) {
        log.info("连接来自："+userId);
        this.userId = userId;
        this.sessions.put(userId,session);
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("收到来自窗口"+this.userId+message);

    }
    @OnClose
    public void onClose(Session session) {
        log.info("连接断开："+session.getId());
    }
    @OnError
    public void onError(Session session, Throwable error) {
        log.error(error.getMessage());
    }

    public static void sendMessageToClient(String userId,String message) {
        Session session = sessions.get(userId);
        if(session != null) {
            session.getAsyncRemote().sendText(message);
        }
    }
}
