package com.algorithm;

public class Camera {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private volatile static Camera instance;

    private Camera(){

    }

    public static Camera getInstance(){

        if(instance == null){
            synchronized (Camera.class){
                if(instance == null){
                    instance = new Camera();
                }
            }
        }

        return instance;
    }
}
