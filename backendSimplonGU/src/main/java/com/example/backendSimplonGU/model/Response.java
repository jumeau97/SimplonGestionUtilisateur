package com.example.backendSimplonGU.model;

public class Response {

    private String status=null;
    private String msg=null;
    private Object object=null;

    public Response() {
    }

    public Response(String status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }

    public Response(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public static Response with(Object object, String msg){return new Response("Ok",msg,object);}
    public static Response success(String msg){ return new Response("OK", msg);}
    public static Response error(String msg){return new Response("KO",msg);}

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
