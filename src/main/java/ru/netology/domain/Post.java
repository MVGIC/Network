package ru.netology.domain;

public class Post {
    private String urlMainPage;
    private String Id;
    private String ownerId;
    private String fromId;
    private String createdBy;
    private int dateTime;
    private String replyOwnerId;
    private String replyPostId;
    private int friends_only;
    private String postType;
    private Object postSource;
    private String Geo geo;
    private String signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private String Extra extra;
    private String BodyPost bodyPost;
    private int LikesInfo likesInfo;
    private String CommentsInfo commentsInfo;
    private int SharesInfo sharesinfo;
    private int viewersInfo;

    public String getUrlMainPage() {
        return urlMainPage;
    }

    public void setUrlMainPage(String urlMainPage) {
        this.urlMainPage = urlMainPage;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public int getDateTime() {
        return dateTime;
    }

    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }

    public String getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(String replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public String getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(String replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriends_only() {
        return friends_only;
    }

    public void setFriends_only(int friends_only) {
        this.friends_only = friends_only;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Object getPostSource() {
        return postSource;
    }

    public void setPostSource(Object postSource) {
        this.postSource = postSource;
    }

    public String getGeo() {
        return Geo;
    }

    public void setGeo(String geo) {
        Geo = geo;
    }

    public String getSignerId() {
        return signerId;
    }

    public void setSignerId(String signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public String getExtra() {
        return Extra;
    }

    public void setExtra(String extra) {
        Extra = extra;
    }

    public String getBodyPost() {
        return BodyPost;
    }

    public void setBodyPost(String bodyPost) {
        BodyPost = bodyPost;
    }

    public int getLikesInfo() {
        return LikesInfo;
    }

    public void setLikesInfo(int likesInfo) {
        LikesInfo = likesInfo;
    }

    public String getCommentsInfo() {
        return CommentsInfo;
    }

    public void setCommentsInfo(String commentsInfo) {
        CommentsInfo = commentsInfo;
    }

    public int getSharesInfo() {
        return SharesInfo;
    }

    public void setSharesInfo(int sharesInfo) {
        SharesInfo = sharesInfo;
    }

    public int getViewersInfo() {
        return viewersInfo;
    }

    public void setViewersInfo(int viewersInfo) {
        this.viewersInfo = viewersInfo;
    }
}
