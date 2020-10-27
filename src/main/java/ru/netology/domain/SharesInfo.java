package ru.netology.domain;

public class SharesInfo {
    private boolean canShare;
    private String personShare;
    private String typeOfShare;
    private String urlPost;
    private int count;

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public String getPersonShare() {
        return personShare;
    }

    public void setPersonShare(String personShare) {
        this.personShare = personShare;
    }

    public String getTypeOfShare() {
        return typeOfShare;
    }

    public void setTypeOfShare(String typeOfShare) {
        this.typeOfShare = typeOfShare;
    }

    public String getUrlPost() {
        return urlPost;
    }

    public void setUrlPost(String urlPost) {
        this.urlPost = urlPost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
