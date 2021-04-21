package com.atguigu.java1;

interface Playable {
    void play();
}

interface Bounceable {
    void play();
}

interface Rollable extends Playable,
        Bounceable {
    Ball ball = new Ball("PingPang");
}

class Ball implements Rollable {
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    //两个接口的抽象方法同名，实现类视作是一个
    public void play() {
//        ball = new Ball("Football");//ball是常量，不能修改
        System.out.println(ball.getName());
    }
}
