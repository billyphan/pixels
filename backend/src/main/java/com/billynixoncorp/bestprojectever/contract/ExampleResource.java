package com.billynixoncorp.bestprojectever.contract;

public class ExampleResource {

    private final long id;
    private final String content;

    public ExampleResource(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
