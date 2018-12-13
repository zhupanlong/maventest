package com.chatRobot.model;

public class ResearchItem {
    private String tablename;

    private String columnname;

    private String description;

    private String comments;

    private String researchflag;

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getResearchflag() {
        return researchflag;
    }

    public void setResearchflag(String researchflag) {
        this.researchflag = researchflag == null ? null : researchflag.trim();
    }
}