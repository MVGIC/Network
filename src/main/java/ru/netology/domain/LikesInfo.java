package ru.netology.domain;

public class LikesInfo {
    private int canPublish;
    private boolean canLike;
    private String personLike;
    private int count;


    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public String getPersonLike() {
        return personLike;
    }

    public void setPersonLike(String personLike) {
        this.personLike = personLike;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
