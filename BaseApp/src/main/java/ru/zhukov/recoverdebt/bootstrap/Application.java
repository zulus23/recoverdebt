package ru.zhukov.recoverdebt.bootstrap;

import ru.zhukov.recoverdebt.domain.User;

public class Application {
    public static void main(String[] args) {
        User user = new User();

        System.out.println("user = " + user);
    }
}
