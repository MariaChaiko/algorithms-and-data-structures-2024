package ru.mirea.practices0000001.task2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.printf("The client sat on a %s", chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
