package com.argo.qpush.core.entity;

import org.msgpack.annotation.MessagePackMessage;

/**
 * Created by user on 1/29/15.
 */
@MessagePackMessage
public class PushError {

    public static final int Offline  = 1;

    public static final int WriterError = 2;

    public static final int NoConnections = 3;

    public static final int ChannelClosed = 4;

    public static final int UnKnown = 5;

    public static final int NoDevivceToken = 6;

    public static final int iOSPushError = 7;

    private int code;
    private String msg;

    public PushError(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}