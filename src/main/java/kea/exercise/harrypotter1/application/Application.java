package kea.exercise.harrypotter1.application;

import kea.exercise.harrypotter1.data.InitData;

public class Application {

    public static void main(String[] args) {
        new Application().start();
    }

    public void start() {
        printAppStarted();
        initData();
    }

    private void initData() {
        try {
            InitData.initData();
        } catch (Exception e) {
            System.out.println("Error initializing data: " + e.getMessage());
        }
    }

    private void printAppStarted() {
        System.out.println("///// App started /////");
    }
}
